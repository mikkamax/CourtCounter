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

    public void Plus3TeamA(View v) {
        lastInputA = 3;
        scoreTeamA += lastInputA;
        displayForTeamA();
    }

    public void Plus2TeamA(View v) {
        lastInputA = 2;
        scoreTeamA += lastInputA;
        displayForTeamA();
    }

    public void Plus1TeamA(View v) {
        lastInputA = 1;
        scoreTeamA += lastInputA;
        displayForTeamA();
    }

    public void UndoLastA(View v) {
        scoreTeamA -= lastInputA;
        lastInputA = 0;
        displayForTeamA();
    }

    public void displayForTeamA() {
        TextView scoreTeamAView = findViewById(R.id.team_a_score);
        scoreTeamAView.setText(String.valueOf(scoreTeamA));
    }

    public void Plus3TeamB(View v) {
        lastInputB = 3;
        scoreTeamB += lastInputB;
        displayForTeamB();
    }

    public void Plus2TeamB(View v) {
        lastInputB = 2;
        scoreTeamB += lastInputB;
        displayForTeamB();
    }

    public void Plus1TeamB(View v) {
        lastInputB = 1;
        scoreTeamB += lastInputB;
        displayForTeamB();
    }

    public void UndoLastB(View v) {
        scoreTeamB -= lastInputB;
        lastInputB = 0;
        displayForTeamB();
    }

    public void displayForTeamB() {
        TextView scoreTeamAView = findViewById(R.id.team_b_score);
        scoreTeamAView.setText(String.valueOf(scoreTeamB));
    }
}
