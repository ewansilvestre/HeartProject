package com.example.heartproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;
import android.widget.Switch;

import com.google.android.material.chip.Chip;

public class ActivityMyHearth extends AppCompatActivity {

    public static final String TAG = "Heart_ActivityMyHearth";
    private Switch swi;
    private Switch swi2;
    private Switch swi3;
    private Switch swi4;
    private Switch swi5;
    private Switch swi6;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_hearth);
        swi = findViewById(R.id.switch1);
        swi2 = findViewById(R.id.switch2);
        swi3 = findViewById(R.id.switch3);
        swi4 = findViewById(R.id.switch4);
        swi5 = findViewById(R.id.switch5);
        swi6 = findViewById(R.id.switch6);

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

    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if(savedInstanceState.containsKey(KEY_NAME)) {
            String item = savedInstanceState.getString(KEY_NAME);

        }
    }

    private static final String KEY_NAME = "test";
}