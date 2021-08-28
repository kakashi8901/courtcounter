package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int score_a;
    int score_b;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**

     This method is called when the +3 button is clicked.
     */
    public void a_threepoints(View view) {
         score_a = score_a + 3;
        displayForTeamA(score_a);
    }
    /**

     This method is called when the +2 button is clicked.
     */
    public void a_twopoints(View view) {
        score_a = score_a + 2;
        displayForTeamA(score_a);
    }
    /**

     This method is called when the freethrow button is clicked.
     */
    public void a_onepoint(View view) {
        score_a = score_a + 1;
        displayForTeamA(score_a);
    }

    /**

     This method is called when the +3 button is clicked.
     */
    public void b_threepoints(View view) {
        score_b = score_b + 3;
        displayForTeamB(score_b);
    }
    /**

     This method is called when the +2 button is clicked.
     */
    public void b_twopoints(View view) {
        score_b = score_b + 2;
        displayForTeamB(score_b);
    }
    /**

     This method is called when the freethrow button is clicked.
     */
    public void b_onepoint(View view) {
        score_b = score_b + 1;
        displayForTeamB(score_b);
    }
    /**

     This method is called when the freethrow button is clicked.
     */
    public void reset(View view) {

        score_b = 0;
        score_a = 0;
        displayForTeamB(score_b);
        displayForTeamA(score_a);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    
}
