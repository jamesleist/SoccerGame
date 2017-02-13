package com.example.james.soccer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void PlayNow(View view) {
        Intent myIntent = new Intent(this,PlayNowActivity.class);
        startActivity(myIntent);
    }

    public void Tournament(View view) {
        Intent myIntent = new Intent(this,TournamentActivity.class);
        startActivity(myIntent);
    }

    public void Season(View view) {
        Intent myIntent = new Intent(this,SeasonActivity.class);
        startActivity(myIntent);
    }

    public void Bluetooth(View view) {
        Intent myIntent = new Intent(this,PvP_BluetoothActivity.class);
        startActivity(myIntent);
    }
}
