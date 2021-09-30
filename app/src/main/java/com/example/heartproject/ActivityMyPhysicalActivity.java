package com.example.heartproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityMyPhysicalActivity extends AppCompatActivity {

    public static final String TAG = "Heart_ActivityMyPhysicalActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_physical);
    }

    public void action_next_step (View v){
        Log.d(TAG, "action_start: next step");
        Intent intent = new Intent(this, ActivityMyTobaccoConsumption.class);
        startActivity(intent);
    }

    public void action_previous_step (View v){
        Log.d(TAG, "action_start: previous step");
        finish();
    }

    private static final String KEY_NAME = "test";
}