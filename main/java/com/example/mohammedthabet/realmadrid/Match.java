package com.example.mohammedthabet.realmadrid;

import java.util.Comparator;

public class Match {

    //References for data extracted from a Match item.
    String awayTeamName;
    String homeTeamName;
    String date;
    String competitionName;
    String stageName;
    String utcTime;

    //Constructor for Match class. No Pre-set parameters.
    public Match() {
    }

    //Constructor for Match class. 6 parameters.
    public Match(String competitionName, String homeTeamName, String awayTeamName, String date, String venue, String time) {
        this.awayTeamName = awayTeamName;
        this.homeTeamName = homeTeamName;
        this.date = date;
        this.competitionName = competitionName;
        this.stageName = venue;
        this.utcTime = time;
    }

    //Comparator compares Home team names to sort alphabetically.
    public static Comparator<Match> HomeTeamComparator = new Comparator<Match>() {
        @Override
        public int compare(Match match1, Match match2) {
            String match1Name = match1.homeTeamName;
            String match2Name = match2.homeTeamName;
            return match1Name.compareToIgnoreCase(match2Name);
        }
    };

    //Comparator compares competition names to sort by competition name.
    public static Comparator<Match> CompetitionNameComparator = new Comparator<Match>() {
        @Override
        public int compare(Match match1, Match match2) {
            String match1Name = match1.competitionName;
            String match2Name = match2.competitionName;
            return match1Name.compareToIgnoreCase(match2Name);

        }
    };

    //Getters and setters for the variables declared above.
    public String getStageName() {
        return stageName;
    }

    public void setStageName(String stageName) {
        this.stageName = stageName;
    }

    public String getAwayTeamName() {
        return awayTeamName;
    }

    public void setAwayTeamName(String awayTeamName) {
        this.awayTeamName = awayTeamName;
    }

    public String getHomeTeamName() {
        return homeTeamName;
    }

    public void setHomeTeamName(String homeTeamName) {
        this.homeTeamName = homeTeamName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCompetitionName() {
        return competitionName;
    }

    public void setCompetitionName(String competitionName) {
        this.competitionName = competitionName;
    }
    public String getUtcTime() {
        return utcTime;
    }

    public void setUtcTime(String utcTime) {
        this.utcTime = utcTime;
    }

}
