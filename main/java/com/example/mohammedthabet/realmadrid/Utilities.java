package com.example.mohammedthabet.realmadrid;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;


public class Utilities {

    //HashMap is used to match the names of the clubs with their badges in the drawable folder.
    public static HashMap<String, Integer> initializeHashMap() {
        HashMap<String, Integer> teamImageHashmap = new HashMap<>();
        teamImageHashmap.put("Real Madrid CF", R.drawable.realmadrid);
        teamImageHashmap.put("Sevilla FC", R.drawable.sevilla);
        teamImageHashmap.put("Club Atlético de Madrid", R.drawable.atleticomadrid);
        teamImageHashmap.put("FC Barcelona", R.drawable.barcelona);
        teamImageHashmap.put("Athletic Club", R.drawable.bilbao);
        teamImageHashmap.put("SD Eibar", R.drawable.eibar);
        teamImageHashmap.put("Real Betis Balompié", R.drawable.betis);
        teamImageHashmap.put("RCD Mallorca", R.drawable.mallorca);
        teamImageHashmap.put("CD Leganés", R.drawable.leganes);
        teamImageHashmap.put("Levante UD", R.drawable.levante);
        teamImageHashmap.put("Granada CF", R.drawable.granada);
        teamImageHashmap.put("Getafe CF", R.drawable.getafe);
        teamImageHashmap.put("RC Celta de Vigo", R.drawable.celta);
        teamImageHashmap.put("Villarreal CF", R.drawable.villarreal);
        teamImageHashmap.put("CA Osasuna", R.drawable.osasuna);
        teamImageHashmap.put("RCD Espanyol de Barcelona", R.drawable.espanyol);
        teamImageHashmap.put("Real Valladolid CF", R.drawable.valladolid);
        teamImageHashmap.put("Real Sociedad de Fútbol", R.drawable.sociedad);
        teamImageHashmap.put("Valencia CF", R.drawable.valencia);
        teamImageHashmap.put("Deportivo Alavés", R.drawable.alaves);

        return teamImageHashmap;
    }

    //Function converts match date format from the API to the normal date format.
    public static String dateConversion(String dateFromMatch){

        SimpleDateFormat incomingFormat = new SimpleDateFormat("yyyy-dd-mm");
        SimpleDateFormat outgoingFormat = new SimpleDateFormat("mm-dd-yyyy");

        try{
        Date matchDate =  incomingFormat.parse(dateFromMatch);
        return outgoingFormat.format(matchDate);
        } catch (ParseException e) {
            e.printStackTrace();
            return "";
        }
    }

    //Function converts match time format from the API to the normal time format.
    public static String timeConversion(String oldTime){

        if(oldTime.length()>16){
            String newTime = oldTime.substring(11,16);
            return newTime;
        } else {
            return "Time not available";
        }

    }

    /* Function changes the name of the competitions fetched from the API to more popular names of
       the same competitions.
     */
    public static String formatMatchTypeString(String type) {

        if (type.equals("REGULAR_SEASON")) {
            return "Regular Season";
        } else if (type.equals("GROUP_STAGE")) {
            return "Group Stage";
        } else {
            return "Competition";
        }

    }
}
