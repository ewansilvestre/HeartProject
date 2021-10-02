package com.example.heartproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

import com.google.android.material.chip.Chip;

public class ActivityMyHearth extends AppCompatActivity {

    public static final String TAG = "Heart_ActivityMyHearth";
    Person myUser;
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
        getData();
        Log.d(TAG, "on_create: "+myUser.getName()+" "+myUser.getAge());
        swi = findViewById(R.id.switch1);
        swi2 = findViewById(R.id.switch2);
        swi3 = findViewById(R.id.switch3);
        swi4 = findViewById(R.id.switch4);
        swi5 = findViewById(R.id.switch5);
        swi6 = findViewById(R.id.switch6);

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

    public void action_next_step (View v){
        if(swi.getText().toString().matches(" "))
        {
            Log.d(TAG, "action_start: le champ name est vide");
            Toast.makeText(this.getBaseContext(),"You forgot a field",Toast.LENGTH_LONG).show();
            Log.d(TAG, "action_start: toast");
        }
        else
        {
            Intent intent2 = new Intent(this, ActivityMyHeartTracking.class);
            intent2.putExtra(KEY_USER,myUser);
            startActivity(intent2);
            Log.d(TAG, "action_next_step:");
        }
    }

    public void action_previous_step (View v){
        Log.d(TAG, "action_start: previous step");
        finish();
    }

    private static final String KEY_USER = "user";
}