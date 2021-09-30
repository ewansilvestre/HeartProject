package com.example.heartproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityMyStressManagment extends AppCompatActivity {

    public static final String TAG = "Heart_ActivityMyStressManagment";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_stress_managment);
    }

    public void action_previous_step (View v){
        Log.d(TAG, "action_start: previous step");
        finish();
    }

    private static final String KEY_NAME = "test";
}