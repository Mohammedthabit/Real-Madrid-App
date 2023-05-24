package com.example.mohammedthabet.realmadrid;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class DataDownloader extends AsyncTaskLoader<String> {
    String TAG = "DataDownloader Class";
    String searchUrl = null;

    //Constructor for the class. Accepts API Link as parameter.
    public DataDownloader(Context context, String url) {
        super(context);
        searchUrl = url;
    }

    //Url in constructor is passed into fetchData function.
    //Data will be fetched from the url.
    public String fetchData(String urlString) {
        StringBuilder result = null;
        BufferedReader reader = null;
        InputStream stream = null;
        InputStreamReader streamReader = null;
        //Establish connection with website using the url.
        try {
            URL url = new URL(urlString);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            //The API token is passed in.
            connection.setRequestProperty("X-Auth-Token", getContext().getResources().getString(R.string.api_key));
            connection.connect();

            result = new StringBuilder();
            stream = connection.getInputStream();
            streamReader = new InputStreamReader(stream);
            reader = new BufferedReader(streamReader);

            String line = reader.readLine();
            while (line != null) {
                result.append(line);
                line = reader.readLine();
            }

        } catch (MalformedURLException e) {
            Log.e(TAG, e.toString());
        } catch (IOException e) {
            Log.e(TAG, e.toString());
        } catch (SecurityException e) {
            Log.e(TAG, e.toString());
        }

        return result.toString();
    }

    @Override
    //Loads data fetched from the url.
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    //Loads data fetched in the background so that it doesn't interrupt the UI thread.
    public String loadInBackground() {
        return fetchData(searchUrl);
    }
}