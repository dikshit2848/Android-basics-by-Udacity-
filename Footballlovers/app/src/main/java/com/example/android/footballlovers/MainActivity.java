package com.example.android.footballlovers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int card4 = 0;
    int total = 0;
    int card1 = 0;
    int card2 = 0;
    int score = 0;
    int card3 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add3(View view) {

        total = total + 1;
        displayForTeamA(total);
    }

    public void displayForTeamAred(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_redcard);
        scoreView.setText(String.valueOf(score));
    }

    public void add2(View view) {

        card1 = card1 + 1;
        displayForTeamAred(card1);
    }

    public void displayForTeamAyellow(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_yellowcard);
        scoreView.setText(String.valueOf(score));
    }

    public void add1(View view) {

        card2 = card2 + 1;
        displayForTeamAyellow(card2);
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void add3b(View view) {

        score = score + 1;
        displayForTeamB(score);
    }

    public void displayForTeamBred(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_redcard);
        scoreView.setText(String.valueOf(score));
    }

    public void add2b(View view) {

        card3 = card3 + 1;
        displayForTeamBred(card3);
    }

    public void displayForTeamByellow(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_yellowcard);
        scoreView.setText(String.valueOf(score));
    }

    public void add1b(View view) {

        card4 = card4 + 1;
        displayForTeamByellow(card4);
    }

    public void reset(View view) {
        card4 = 0;
        total = 0;
        card1 = 0;
        card2 = 0;
        score = 0;
        card3 = 0;
        displayForTeamA(total);
        displayForTeamB(score);
        displayForTeamAred(card1);
        displayForTeamAyellow(card2);
        displayForTeamBred(card3);
        displayForTeamByellow(card4);
    }
}
