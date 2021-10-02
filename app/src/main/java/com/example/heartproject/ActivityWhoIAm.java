package com.example.heartproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ActivityWhoIAm extends AppCompatActivity {

    public static final String TAG = "Heart_ActivityWhoIAm";
    private Person person;
    private TextView nom_recup;


    // This method (whose name is abritrary) is called by onCreate().

    private void processIntentData() {
        Intent intent = getIntent();
        if(intent != null) {
// intent may store different data. To get the one matching the Person class,
// we need the key "FromActivity1ToActivity2" which was used for transfer
// No need to calls "new()" for allocating memory to transferredPerson
            Person transferredPerson = intent.getParcelableExtra("FromActivity1ToActivity2");
            if (transferredPerson != null) {
                this.person = transferredPerson;
                this.person.print();
                nom_recup = findViewById(R.id.textView34);
                //nom_recup = this.person.setName();
            }
            else {
                Log.d(TAG, "No Person found after transfer from Activity1");
            }
        }
        else {
            Log.d(TAG, "Error when transferring from Activity1");
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_who_iam);
        processIntentData();
    }

    public void action_next_step (View v){
        Log.d(TAG, "action_start: next step");
        Intent intent = new Intent(this, ActivityMyHearth.class);
        startActivity(intent);
    }

    private static final String KEY_NAME = "test";
}