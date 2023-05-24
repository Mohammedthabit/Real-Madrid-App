package com.example.mohammedthabet.realmadrid;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //References for the 4 clickable Images in the home screen
    ImageView schedulesImage;
    ImageView websiteImage;
    ImageView playSong;
    ImageView newsImage;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //The activity_main layout is populated when the app is launched.
        setContentView(R.layout.activity_main);

        //new Media Player is created and the team song raw file is passed in as a parameter.
        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.team_song);

        //Use the genie to connect the reference to the real object.
        schedulesImage = findViewById(R.id.image_Show_GamesSchedule);
        //Set up an onClickListener to launch the GamesScheduleActivity when the icon is clicked.
        schedulesImage.setOnClickListener(new View.OnClickListener() {//Set an onClick listener for the ImageView.
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), GamesScheduleActivity.class);
                startActivity(intent);
            }
        });

        //Use the genie to connect the reference to the real object.
        newsImage = findViewById(R.id.image_Show_News);
        //Set up an onClickListener to launch the WebActivity when the icon is clicked.
        newsImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), WebActivity.class);
                /*The url for the team's news is passed in as a parameter when the WebActivity is
                launched.*/
                intent.putExtra("url", "https://www.newsnow.co.uk/h/Sport/Football/La+Liga/Real+Madrid");
                startActivity(intent);
            }
        });

        //Use the genie to connect the reference to the real object.
        websiteImage = findViewById(R.id.image_Show_Website);
        //Set up an onClickListener to launch the WebActivity when the icon is clicked.
        websiteImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*The url for the team's website is passed in as a parameter when the WebActivity is
                launched.*/
                Intent intent = new Intent(getApplicationContext(), WebActivity.class);
                intent.putExtra("url", "https://www.realmadrid.com/en");
                startActivity(intent);
            }
        });

        //Use the genie to connect the reference to the real object.
        playSong = findViewById(R.id.image_Play_Song);
        //Set up an onClickListener to launch the MediaPlayer when the icon is clicked.
        playSong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //if statement. when icon is clicked, play song. if icon is clicked again. stop playing.
                if(mediaPlayer.isPlaying()){
                    mediaPlayer.stop();
                } else{
                    mediaPlayer.start();
                }
            }
        });
    }
}
