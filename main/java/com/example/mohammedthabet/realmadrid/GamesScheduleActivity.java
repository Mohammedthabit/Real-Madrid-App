package com.example.mohammedthabet.realmadrid;

import android.app.LoaderManager;
import android.content.Loader;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.mohammedthabet.realmadrid.MatchesResponse.MatchesItem;
import com.example.mohammedthabet.realmadrid.MatchesResponse.Response;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* In order to use the DataDownloader class, you have to tell Android that this Activity implements
the loader callbacks. Look to the codelab to see how to do it.
 */

public class GamesScheduleActivity extends AppCompatActivity implements LoaderManager.LoaderCallbacks<String> {

    // A new ArrayList is created.
    ArrayList<Match> matchList = new ArrayList<Match>();
    // A MatchesRecyclerAdapterAdapter is declared.
    MatchesRecyclerAdapter adapter;
    // Reference for the real sort button in the schedule_layout.
    Button button;
    //A new binary tree is created using the node class.
    Node.BinaryTree bt;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // schedule_layout is populated when the activity is launched.
        setContentView(R.layout.schedule_layout);

        //These following functions will be called whenever the Activity starts.
        startLoader();

        //Genie is used to connect reference to real button object.
        button = findViewById(R.id.btnSortButton);
        //Set up onClickListener for the sort button.
        //When the button is pressed, the following function and method will run.
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                adapter.treeToList();
                adapter.notifyDataSetChanged();
            }

        });
    }

        //startLoader is initiated
        public void startLoader() {
        //LoaderManager manages all the Loaders implemented.
        LoaderManager manager = getLoaderManager();
        manager.initLoader(1, null, this);
    }

    @Override
    //Called when app needs new loader to be created to fetch data from API.
    public Loader<String> onCreateLoader(int id, Bundle args) {
        //The url below is passed into the new DataDownloader object.
        String url = "https://api.football-data.org/v2/teams/86/matches";
        //new DataDownloader object is created.
        return new DataDownloader(this, url);
    }

    //Called when the loader finishes loading data in background.
    public void onLoadFinished(Loader<String> loader, String data) {
        //New Gson object is created.
        Gson gson = new Gson();
        //Gson converts JSON string to java object.
        Response response = gson.fromJson(data, Response.class);

        //Matches fetched are put into a list called matchItems
        List<MatchesItem> matchItems = response.getMatches();

        //for loop to loop through the list of matches
        for (int i = 0; i < matchItems.size() ;i++){
            //The following data from the matches fetched are extracted.
            String homeTeamName = matchItems.get(i).getHomeTeam().getName();
            String awayTeamName = matchItems.get(i).getAwayTeam().getName();
            String utcDate = matchItems.get(i).getUtcDate();
            String competitionName = matchItems.get(i).getCompetition().getName();
            String venue = matchItems.get(i).getStage();
            String time = matchItems.get(i).getUtcDate();

            //New match object is created with parameters of the data extracted.
            Match match = new Match(competitionName, homeTeamName, awayTeamName, utcDate, venue, time);
            //the match objects are added to the matchList array.
            matchList.add(match);
        }
        //setUpAdapter function is called
        setupAdapater();
    }

    @Override
    //Called to reset data whenever activity is closed.
    public void onLoaderReset(Loader<String> loader) {
    }

    public void setupAdapater() {
        //new MatchesRecyclerAdapter object is created with the matchList as a parameter.
        adapter = new MatchesRecyclerAdapter(matchList);
        //The genie is used to assign the RecyclerView with its layout called "recyclerview"
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.hasFixedSize();
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter.btree = bt;
        //The adapter is passed into the RecyclerView
        recyclerView.setAdapter(adapter);
    }

    @Override
    //A drop down menu is created.
    public boolean onCreateOptionsMenu(Menu menu) {
        //Genie connects the menu with its layout called "menu_sort_matches".
        getMenuInflater().inflate(R.menu.menu_sort_matches, menu);
        return true;
    }

    @Override
    //Function runs when an item from the menu is selected.
    public boolean onOptionsItemSelected(MenuItem item) {
        //Switch is used to sort based on which option is selected.
        //Genie is used to match each sorting function with the sorting option on the menu.
        switch (item.getItemId()) {
            case R.id.sort_by_homeTeamName:
                sortByHomeTeam();
                break;

            case R.id.sort_by_competitionName:
                sortByCompetitionName();
                break;

            default:
                System.out.println("Error");

        }
        return true;
    }

    //Function sorts by home team
    private void sortByHomeTeam() {

        Collections.sort(adapter.list, Match.HomeTeamComparator);
        adapter.notifyDataSetChanged();

    }

    //Function sorts by competition Name
    private void sortByCompetitionName() {

        Collections.sort(adapter.list, Match.CompetitionNameComparator);
        adapter.notifyDataSetChanged();

    }

}