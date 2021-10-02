package com.example.heartproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ActivityWhoIAm extends AppCompatActivity {

    public static final String TAG = "Heart_ActivityWhoIAm";
    private Person myUser;
    private EditText editAge;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getData();
        Log.d(TAG, "action_start: "+myUser.getName());
        setContentView(R.layout.activity_who_iam);
        editAge = findViewById(R.id.age);
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
        if(editAge.getText().toString().matches(""))
        {
            Log.d(TAG, "action_start: le champ name est vide");
            Toast.makeText(this.getBaseContext(),"You did not enter your age",Toast.LENGTH_LONG).show();
            Log.d(TAG, "action_start: toast");
        }
        else
        {
            Log.d(TAG, "action_start: "+ editAge.getText()+" "+myUser.getAge());
            //myUser.setAge(editAge.getText());
            Log.d(TAG, "action_start: "+ myUser.getName()+" "+myUser.getAge());
            Intent intent2 = new Intent(this, ActivityWhoIAm.class);
            intent2.putExtra(KEY_USER,editAge.getText().toString());
            startActivity(intent2);
        }
    }

    private static final String KEY_USER = "user";
}