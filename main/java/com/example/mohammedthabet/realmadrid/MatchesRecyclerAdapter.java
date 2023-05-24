package com.example.mohammedthabet.realmadrid;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.HashMap;

public class MatchesRecyclerAdapter extends RecyclerView.Adapter<MatchesRecyclerAdapter.MatchesViewHolder> {

    //A new ArrayList of Match objects is declared
    ArrayList<Match> list = new ArrayList<Match>();
    //New Binary tree is created.
    Node.BinaryTree btree;
    //A new ArrayList of Match objects is declared for the binary tree.
    ArrayList<Match> btArray = new ArrayList<>();

    //A new hashmap is created.
    HashMap<String, Integer> map = new HashMap<String, Integer>();

    //The ArrayList of matches is passed in to the MatchesRecyclerAdapter constructor.
    public MatchesRecyclerAdapter(ArrayList<Match> listFromActivity) {
        this.list = listFromActivity;

        //the new HashMap is initialized.
        map = Utilities.initializeHashMap();


    }

    //The binary tree is passed in to the MatchesRecyclerAdapter constructor.
    public MatchesRecyclerAdapter(Node.BinaryTree binarytreeFromActivity) {
        this.btree = binarytreeFromActivity;

        //the new HashMap is initialized.
        map = Utilities.initializeHashMap();
    }

    @NonNull
    @Override
    //A ViewHolder is created for the match items. Each time a new match is created, a new ViewHolder is created for it.
    public MatchesViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        //The ViewHolder uses the activity_schedule_item_layout as the layout for a match item.
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_schedule_item_layout, viewGroup, false);
        return new MatchesViewHolder(view);
    }

    @Override
    //Method updates the content of the RecyclerView to reflect the item at the given position.
    public void onBindViewHolder(@NonNull MatchesViewHolder matchesViewHolder, int i) {
        //The item in the list at index i is assigned to currentMatch.
        Match currentMatch = list.get(i);

        //The following data from the matches are populated in the item layout.
        matchesViewHolder.competitionTextView.setText(currentMatch.competitionName);
        matchesViewHolder.stageTextView.setText(Utilities.formatMatchTypeString(currentMatch.stageName));
        matchesViewHolder.awayTeamTextView.setText(currentMatch.awayTeamName);
        matchesViewHolder.homeTeamTextView.setText(currentMatch.homeTeamName);

        //dateConversion function converts date from the API format to the normal format.
        String matchDate = Utilities.dateConversion(currentMatch.date);
        matchesViewHolder.matchDate.setText(matchDate);

        //timeConversion function converts time from the API format to the normal format.
        String matchTime = Utilities.timeConversion(currentMatch.utcTime);
        matchesViewHolder.matchTime.setText(matchTime);

        //Team badges are also populated in the item layout using the Hashmap.
        //In case badge is not found in the folder or in the Hashmap, a football icon will be used.
        Glide.with(matchesViewHolder.homeTeamBadge)
                .load(map.get(currentMatch.homeTeamName))
                .error(R.drawable.football)
                .into(matchesViewHolder.homeTeamBadge);

        Glide.with(matchesViewHolder.awayTeamBadge)
                .load(map.get(currentMatch.awayTeamName))
                .error(R.drawable.football)
                .into(matchesViewHolder.awayTeamBadge);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    //References for the match data extracted from the JSON response.
    class MatchesViewHolder extends RecyclerView.ViewHolder {
        TextView homeTeamTextView;
        TextView awayTeamTextView;
        TextView stageTextView;
        TextView competitionTextView;
        TextView matchDate;
        ImageView homeTeamBadge;
        ImageView awayTeamBadge;
        TextView matchTime;

        //The genie is used to connect the references with the real objects using the ids.
        public MatchesViewHolder(@NonNull View itemView) {
            super(itemView);
            homeTeamTextView = itemView.findViewById(R.id.tv_home_team_name);
            awayTeamTextView = itemView.findViewById(R.id.tv_away_team_name);
            stageTextView = itemView.findViewById(R.id.tv_match_stage);
            competitionTextView = itemView.findViewById(R.id.tv_competition);
            matchDate = itemView.findViewById(R.id.tv_match_date);
            homeTeamBadge = itemView.findViewById(R.id.iv_home_team_badge);
            awayTeamBadge = itemView.findViewById(R.id.iv_away_team_badge);
            matchTime = itemView.findViewById(R.id.tv_match_time);

        }

    }

    //Function copies matches from binary tree array to binary tree.
    public void treeToList() {

        btree.getInorder(btree.root, btArray);
        list = btArray;

    }
}