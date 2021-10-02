package com.example.heartproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Spinner;
import android.widget.Toast;

public class ActivityMyDiet extends AppCompatActivity {

    public static final String TAG = "Heart_ActivityMyDiet";
    Person myUser;
    Spinner sp1;
    Spinner sp2;
    Spinner sp3;
    Spinner sp4;
    Spinner sp5;
    Spinner sp6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_diet);
        getData();
        sp1 = findViewById(R.id.spinner10);
        sp2 = findViewById(R.id.spinner11);
        sp3 = findViewById(R.id.spinner12);
        sp4 = findViewById(R.id.spinner13);
        sp5 = findViewById(R.id.spinner14);
        sp6 = findViewById(R.id.spinner15);
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
        if(sp1.getSelectedItem().toString().matches("") || sp2.getSelectedItem().toString().matches("") || sp3.getSelectedItem().toString().matches("") || sp4.getSelectedItem().toString().matches("") || sp5.getSelectedItem().toString().matches("") || sp6.getSelectedItem().toString().matches(""))
        {
            Log.d(TAG, "action_next_step: le champ name est vide");
            Toast.makeText(this.getBaseContext(),"You forgot a field",Toast.LENGTH_LONG).show();
            Log.d(TAG, "action_next_step: toast");
        }
        else
        {
            Log.d(TAG, "action_next_step: "+ sp1.getSelectedItem()+" "+myUser.getName());
            myUser.setDej(sp1.getSelectedItem().toString());
            Log.d(TAG, "action_next_step: "+ sp2.getSelectedItem()+" "+myUser.getName());
            myUser.setFruit(sp2.getSelectedItem().toString());
            Log.d(TAG, "action_next_step: "+ sp3.getSelectedItem()+" "+myUser.getName());
            myUser.setRepasMaison(sp3.getSelectedItem().toString());
            Log.d(TAG, "action_next_step: "+ sp4.getSelectedItem()+" "+myUser.getName());
            myUser.setPlatCuisiner(sp4.getSelectedItem().toString());
            Log.d(TAG, "action_next_step: "+ sp5.getSelectedItem()+" "+myUser.getName());
            myUser.setCharcuterie(sp5.getSelectedItem().toString());
            Log.d(TAG, "action_next_step: "+ sp6.getSelectedItem()+" "+myUser.getName());
            myUser.setNutriScore(sp6.getSelectedItem().toString());
            Log.d(TAG, "action_next_step: "+ myUser.getPtMedecin()+" "+myUser.getName());
            Intent intent2 = new Intent(this, ActivityMyPhysicalActivity.class);
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