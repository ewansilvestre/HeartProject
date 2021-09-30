package com.example.heartproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;

public class ActivityMyHearth extends AppCompatActivity {

    public static final String TAG = "Heart_ActivityMyHearth";
    private Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_hearth);
        spinner = findViewById(R.id.spinner);
    }

    public void action_next_step (View v){
        Log.d(TAG, "action_start: next step");
        Intent intent = new Intent(this, ActivityMyHeartTracking.class);
        startActivity(intent);
    }

    public void action_previous_step (View v){
        Log.d(TAG, "action_start: previous step");
        finish();
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY_NAME, spinner.getSelectedItem().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if(savedInstanceState.containsKey(KEY_NAME)) {
            String item = savedInstanceState.getString(KEY_NAME);
            spinner.set;
        }
    }

    private static final String KEY_NAME = "test";
}