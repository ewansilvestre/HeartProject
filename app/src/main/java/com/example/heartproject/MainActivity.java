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
    private Person myUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Person user = new Person();
        myUser = user;
        editName = findViewById(R.id.textName);
    }
    
    public void action_start (View v){
        if(editName.getText().toString().matches(""))
        {
            Log.d(TAG, "action_start: le champ name est vide");
            Toast.makeText(this.getBaseContext(),"You did not enter your name",Toast.LENGTH_LONG).show();
            Log.d(TAG, "action_start: toast");
        }
        else
        {
            Log.d(TAG, "action_start: "+ editName.getText());
            myUser.setName(editName.getText().toString());
            Log.d(TAG, "action_start: "+ myUser.getName());
            Intent intent = new Intent(this, ActivityWhoIAm.class);
            intent.putExtra(KEY_USER,myUser);
            startActivity(intent);
        }
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(KEY_USER, String.valueOf(myUser));
    }

    @Override
    protected void onRestoreInstanceState(@NonNull Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        if(savedInstanceState.containsKey(KEY_USER)) {
            Person user = savedInstanceState.getParcelable(KEY_USER);
            editName.setText(user.getName());
        }
    }

    private static final String KEY_USER = "user";
}