package com.example.heartproject;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.heartproject.Person;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "Heart_MainActivity";
    private EditText editName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName = findViewById(R.id.textName);
    }

    public void action_start (View v){
        if(editName.getText().toString().matches(""))
        {
            Log.d(TAG, "action_start: le champ name est vide");
            Toast.makeText(MainActivity.this, "You did not enter your name", Toast.LENGTH_SHORT).show();
            return;
        }
        else
        {
            Log.d(TAG, "action_start: "+ editName.getText());
            Person user = new Person(editName.getText().toString());
            Log.d(TAG, "action_start: "+ user.getName());
            Intent intent = new Intent(this, ActivityWhoIAm.class);
            intent.putExtra(KEY_NAME,editName.getText().toString());
            startActivity(intent);
        }
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