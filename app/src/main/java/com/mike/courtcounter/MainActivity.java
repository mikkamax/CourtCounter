package com.mike.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA, scoreTeamB;
    int lastInputA, lastInputB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void plus3TeamA(View v) {
        lastInputA = 3;
        scoreTeamA += lastInputA;
        displayForTeamA();
    }

    public void plus2TeamA(View v) {
        lastInputA = 2;
        scoreTeamA += lastInputA;
        displayForTeamA();
    }

    public void plus1TeamA(View v) {
        lastInputA = 1;
        scoreTeamA += lastInputA;
        displayForTeamA();
    }

    public void undoLastA(View v) {
        scoreTeamA -= lastInputA;
        lastInputA = 0;
        displayForTeamA();
    }

    public void displayForTeamA() {
        TextView scoreTeamAView = findViewById(R.id.team_a_score);
        scoreTeamAView.setText(String.valueOf(scoreTeamA));
    }

    public void plus3TeamB(View v) {
        lastInputB = 3;
        scoreTeamB += lastInputB;
        displayForTeamB();
    }

    public void plus2TeamB(View v) {
        lastInputB = 2;
        scoreTeamB += lastInputB;
        displayForTeamB();
    }

    public void plus1TeamB(View v) {
        lastInputB = 1;
        scoreTeamB += lastInputB;
        displayForTeamB();
    }

    public void undoLastB(View v) {
        scoreTeamB -= lastInputB;
        lastInputB = 0;
        displayForTeamB();
    }

    public void displayForTeamB() {
        TextView scoreTeamAView = findViewById(R.id.team_b_score);
        scoreTeamAView.setText(String.valueOf(scoreTeamB));
    }

    public void reset(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        lastInputA = 0;
        lastInputB = 0;
        displayForTeamA();
        displayForTeamB();
    }
}
