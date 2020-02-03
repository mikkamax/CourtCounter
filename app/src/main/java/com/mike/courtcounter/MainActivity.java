package com.mike.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Plus3TeamA(View v) {
        scoreTeamA += 3;
        displayForTeamA();
    }

    public void Plus2TeamA(View v) {
        scoreTeamA += 2;
        displayForTeamA();
    }

    public void Plus1TeamA(View v) {
        scoreTeamA += 1;
        displayForTeamA();
    }

    public void displayForTeamA() {
        TextView scoreTeamAView = findViewById(R.id.team_a_score);
        scoreTeamAView.setText(String.valueOf(scoreTeamA));
    }
}
