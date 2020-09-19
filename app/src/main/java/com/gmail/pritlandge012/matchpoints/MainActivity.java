package com.gmail.pritlandge012.matchpoints;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA( int scoreA ) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(scoreA));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int scoreB) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(scoreB));
    }
    public void plusThreeForA(View view) {
      scoreA +=3;
      displayForTeamA(scoreA);
    }

    public void plusTwoForA(View view) {
        scoreA +=2;
        displayForTeamA(scoreA);
    }

    public void plusOneForA(View view) {
        scoreA +=1;
        displayForTeamA(scoreA);
    }

    public void minusOneForA(View view) {
        if(scoreA >0) {scoreA -=1;}
        displayForTeamA(scoreA);
    }
    public void plusThreeForB(View view) {
        scoreB +=3;
        displayForTeamB(scoreB);
    }

    public void plusTwoForB(View view) {
        scoreB +=2;
        displayForTeamB(scoreB);
    }

    public void plusOneForB(View view) {
        scoreB +=1;
        displayForTeamB(scoreB);
    }

    public void minusOneForB(View view) {
       if(scoreB >0) {scoreB -=1;}
        displayForTeamB(scoreB);
    }
    public void resetScore(View view) {
        scoreA = 0 ;
        scoreB = 0 ;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }
}