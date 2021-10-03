package com.example.heartproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

public class ActivityMyLifeHygiene extends AppCompatActivity {

    public static final String TAG = "Heart_ActivityMyLifeHygiene";
    Person myUser;
    Spinner sp1;
    Spinner sp2;
    Spinner sp3;
    Spinner sp4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_life_hygiene);
        getData();
        sp1 = findViewById(R.id.spinner5);
        sp2 = findViewById(R.id.spinner6);
        sp3 = findViewById(R.id.spinner24);
        sp4 = findViewById(R.id.spinner25);
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
        if(sp1.getSelectedItem().toString().matches("") || sp2.getSelectedItem().toString().matches("") || sp3.getSelectedItem().toString().matches("") || sp4.getSelectedItem().toString().matches(""))
        {
            Log.d(TAG, "action_next_step: le champ name est vide");
            Toast.makeText(this.getBaseContext(),"You forgot a field",Toast.LENGTH_LONG).show();
            Log.d(TAG, "action_next_step: toast");
        }
        else {
            Log.d(TAG, "action_next_step: " + sp1.getSelectedItem() + " " + myUser.getName());
            myUser.setAlcool(sp1.getSelectedItem().toString());
            Log.d(TAG, "action_next_step: " + sp2.getSelectedItem() + " " + myUser.getName());
            myUser.setEnergisant(sp2.getSelectedItem().toString());
            Log.d(TAG, "action_next_step: " + sp3.getSelectedItem() + " " + myUser.getName());
            myUser.setDormir(sp3.getSelectedItem().toString());
            Log.d(TAG, "action_next_step: " + sp4.getSelectedItem() + " " + myUser.getName());
            myUser.setTroubleSommeil(sp4.getSelectedItem().toString());
            Log.d(TAG, "action_next_step: " + myUser.getName() + " " + myUser.getAlcool() + " " + myUser.getEnergisant() + " " + myUser.getDormir() + " " + myUser.getTroubleSommeil());
            Intent intent2 = new Intent(this, ActivityDrug.class);
            intent2.putExtra(KEY_USER, myUser);
            startActivity(intent2);
        }
    }

    public void action_previous_step (View v){
        Log.d(TAG, "action_start: previous step");
        finish();
    }

    private static final String KEY_USER = "user";
}