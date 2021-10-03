package com.example.heartproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

public class ActivityDrug extends AppCompatActivity {

    public static final String TAG = "Heart_ActivityMyHeartTracking";
    Person myUser;
    Spinner sp1;
    Spinner sp2;
    Spinner sp3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drug);
        getData();
        sp1 = findViewById(R.id.spinner26);
        sp2 = findViewById(R.id.spinner27);
        sp3 = findViewById(R.id.spinner28);
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
        if(sp1.getSelectedItem().toString().matches("") || sp2.getSelectedItem().toString().matches("") || sp3.getSelectedItem().toString().matches(""))
        {
            Log.d(TAG, "action_next_step: le champ name est vide");
            Toast.makeText(this.getBaseContext(),"You forgot a field",Toast.LENGTH_LONG).show();
            Log.d(TAG, "action_next_step: toast");
        }
        else
        {
            Log.d(TAG, "action_next_step: "+ sp1.getSelectedItem()+" "+myUser.getName());
            myUser.setTraitment(sp1.getSelectedItem().toString());
            Log.d(TAG, "action_next_step: "+ sp2.getSelectedItem()+" "+myUser.getName());
            myUser.setGenetic(sp2.getSelectedItem().toString());
            Log.d(TAG, "action_next_step: "+ sp3.getSelectedItem()+" "+myUser.getName());
            myUser.setDrug(sp3.getSelectedItem().toString());
            Log.d(TAG, "action_next_step: " + myUser.getName() + " " + myUser.getTraitment() + " " + myUser.getGenetic() + " " + myUser.getDrug());
            Intent intent2 = new Intent(this, ActivityEnd.class);
            intent2.putExtra(KEY_USER,myUser);
            startActivity(intent2);
        }
    }

    public void action_previous_step (View v){
        Log.d(TAG, "action_start: previous step");
        finish();
    }

    private static final String KEY_USER = "user";
}