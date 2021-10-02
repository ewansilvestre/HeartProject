package com.example.heartproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class ActivityMyLifeHygiene extends AppCompatActivity {

    public static final String TAG = "Heart_ActivityMyLifeHygiene";
    Person myUser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_life_hygiene);
        getData();
    }

    private void getData() {
        Intent intent = getIntent();
        if(intent != null){
            Person transferredPerson = intent.getParcelableExtra(KEY_USER);
            if(transferredPerson != null){
                this.myUser = transferredPerson;
            }
            else{
                Log.d(TAG, "Aucune personne trouvé après transfert de MainActivity");
            }
        }
        else{
            Log.d(TAG, "Erreur de transfert depuis MainActivity");
        }
    }

    public void action_previous_step (View v){
        Log.d(TAG, "action_start: previous step");
        finish();
    }

    private static final String KEY_USER = "user";
}