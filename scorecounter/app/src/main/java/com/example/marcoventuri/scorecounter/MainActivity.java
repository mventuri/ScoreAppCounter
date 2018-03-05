package com.example.marcoventuri.scorecounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    String quarter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Increase the score for Home Team by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;

        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Away Team by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Home Team by 2 points.
     */
    public void addTwoForTeamA(View v) {
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Away Team by 2 points.
     */
    public void addTwoForTeamB(View v) {
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the score for Home Team by 3 points.
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the score for Away Team by 3 points.
     */
    public void addThreeForTeamB(View v) {
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Reset both scores to 0
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        quarter = "Qrt: N/A";
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayQuarter(quarter);
    }

    /**
     * Move to Quarter 1.
     */
    public void addQuarter1(View v) {
        quarter = new String("Qrt:1");

        displayQuarter(quarter);
    }

    /**
     * Move to Quarter 2.
     */
    public void addQuarter2(View v) {
        quarter = new String("Qrt:2");

        displayQuarter(quarter);
    }

    /**
     * Move to Quarter 3.
     */
    public void addQuarter3(View v) {
        quarter = new String("Qrt:3");

        displayQuarter(quarter);
    }

    /**
     * Move to Quarter 4.
     */
    public void addQuarter4(View v) {
        quarter = new String("Qrt:4");

        displayQuarter(quarter);
    }

    /**
     * Move to OT.
     */
    public void addOt(View v) {
        quarter = new String("Qrt:OT");

        displayQuarter(quarter);
    }

    /**
     * Displays the given score for Home Team.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Away Team.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays current Quarter.
     */
    public void displayQuarter(String quarter) {
        TextView scoreView = (TextView) findViewById(R.id.quarter1);
        scoreView.setText(String.valueOf(quarter));
    }
}
