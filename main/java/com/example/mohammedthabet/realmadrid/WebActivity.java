package com.example.mohammedthabet.realmadrid;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;

public class WebActivity extends AppCompatActivity {

    //Reference for the WebView being used in this activity.
    private WebView webView;
    // A variable called "url" is created.
    String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //The activity_web_view layout is populated when then the WebActivity is launched.
        setContentView(R.layout.activity_web_view);

        //The genie is used to connect the reference with the real object in the xml code.
        webView = findViewById(R.id.web_view);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        webView.setOverScrollMode(WebView.OVER_SCROLL_NEVER);
        //Get url from Intent
        Intent intent = getIntent();
        url = intent.getStringExtra("url");
        // Url is passed in. Url passed in depends on which clickable Image is clicked.
        webView.loadUrl(url);
    }
}
