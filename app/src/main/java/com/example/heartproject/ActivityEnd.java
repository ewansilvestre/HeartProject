package com.example.heartproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityEnd extends AppCompatActivity {

    public static final String TAG = "Heart_ActivityMyDiet";
    Person myUser;
    public TextView name;
    public TextView age;
    public TextView gender;
    public TextView heart;
    public TextView heartTra;
    public TextView diet;
    public TextView act;
    public TextView tabac;
    public TextView stress;
    public TextView life;
    public TextView n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "oncreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        getData();
        name = findViewById(R.id.textView40);
        age = findViewById(R.id.textView42);
        gender = findViewById(R.id.textView44);
        heart = findViewById(R.id.textView46);
        heartTra = findViewById(R.id.textView47);
        diet = findViewById(R.id.textView48);
        act = findViewById(R.id.textView49);
        tabac = findViewById(R.id.textView50);
        stress = findViewById(R.id.textView51);
        life = findViewById(R.id.textView52);
        n = findViewById(R.id.textView53);
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

    @Override
    protected void onStart() {
        super.onStart();
        CalculateData request = new CalculateData(myUser, this);
        request.execute();
    }

    public void action_site_officiel (View v){
        Log.d(TAG, "action_site_officiel: Vers le site officiel");
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://fedecardio.org/"));
        startActivity(intent);
    }

    public void action_close_app (View v){
        Intent intent = new Intent(getApplicationContext(), ActivityClose.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);
    }

    private static final String KEY_USER = "user";
}