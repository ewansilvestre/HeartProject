package com.example.heartproject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.heartproject.Person;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "Heart_MainActivity";
    private Person person;
    private EditText editName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName = findViewById(R.id.textName);

    }

    public void action_start (View v){
        Log.d(TAG, "action_start: "+ editName.getText());
        Intent intent = new Intent(this, ActivityWhoIAm.class);
        intent.putExtra(KEY_NAME,editName.getText().toString());

        Intent activity2Intent = new Intent(this, ActivityWhoIAm.class);
        activity2Intent.putExtra("FromActivity1ToActivity2", this.person);
        startActivity(intent);


    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY_NAME, editName.getText().toString());
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if(savedInstanceState.containsKey(KEY_NAME)) {
            String name = savedInstanceState.getString(KEY_NAME);
            editName.setText(name);
        }
    }

    private static final String KEY_NAME = "name";
}