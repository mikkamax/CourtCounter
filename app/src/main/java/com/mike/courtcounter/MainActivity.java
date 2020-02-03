package com.mike.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA;
    int lastInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Plus3TeamA(View v) {
        lastInput = 3;
        scoreTeamA += lastInput;
        displayForTeamA();
    }

    public void Plus2TeamA(View v) {
        lastInput = 2;
        scoreTeamA += lastInput;
        displayForTeamA();
    }

    public void Plus1TeamA(View v) {
        lastInput = 1;
        scoreTeamA += lastInput;
        displayForTeamA();
    }

    public void UndoLastA(View v) {
        scoreTeamA -= lastInput;
        lastInput = 0;
        displayForTeamA();
    }

    public void displayForTeamA() {
        TextView scoreTeamAView = findViewById(R.id.team_a_score);
        scoreTeamAView.setText(String.valueOf(scoreTeamA));
    }
}
