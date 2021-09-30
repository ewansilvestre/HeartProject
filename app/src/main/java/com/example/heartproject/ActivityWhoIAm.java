package com.example.heartproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityWhoIAm extends AppCompatActivity {

    public static final String TAG = "Heart_ActivityWhoIAm";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who_iam);
    }

    public void action_next_step (View v){
        Log.d(TAG, "action_start: next step");
        Intent intent = new Intent(this, ActivityMyHearth.class);
        startActivity(intent);
    }

    private static final String KEY_NAME = "test";
}