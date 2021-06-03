package com.example.basketballscorecounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int score_A = 0, score_B = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(score_A);
        displayForTeamB(score_B);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score1);
        scoreView.setText(String.valueOf(score));
    }

    public void increment_1(View view) {
        score_A = score_A + 1;
        displayForTeamA(score_A);
        //displayPrice(quantity * price_of_each );
    }
    public void increment_2(View view) {
        score_A = score_A + 2;
        displayForTeamA(score_A);
        //displayPrice(quantity * price_of_each );
    }
    public void increment_3(View view) {
        score_A = score_A + 3;
        displayForTeamA(score_A);
        //displayPrice(quantity * price_of_each );
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score2);
        scoreView.setText(String.valueOf(score));
    }

    public void increment_1_b(View view) {
        score_B = score_B + 1;
        displayForTeamB(score_B);
        //displayPrice(quantity * price_of_each );
    }
    public void increment_2_b(View view) {
        score_B = score_B + 2;
        displayForTeamB(score_B);
        //displayPrice(quantity * price_of_each );
    }
    public void increment_3_b(View view) {
        score_B = score_B + 3;
        displayForTeamB(score_B);
        //displayPrice(quantity * price_of_each );
    }
    public void reset(View view) {
        score_A = 0;
        score_B = 0;
        displayForTeamA(score_A);
        displayForTeamB(score_B);
        //displayPrice(quantity * price_of_each );
    }
}