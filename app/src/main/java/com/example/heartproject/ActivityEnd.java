package com.example.heartproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class ActivityEnd extends AppCompatActivity {

    public static final String TAG = "Heart_ActivityMyDiet";
    Person myUser;
    private TextView name;
    private TextView age;
    private TextView gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d(TAG, "oncreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        getData();
        name = findViewById(R.id.textView40);
        age = findViewById(R.id.textView42);
        gender = findViewById(R.id.textView44);
        name.setText(myUser.getName());
        age.setText(myUser.getAge());
        gender.setText(myUser.getGenre());
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

    //public void action_close_app (View v){
    //    Log.d(TAG, "action_close_app: Fermeture de l'application");
    //    super.onDestroy();
    //    System.runFinalizersOnExit(true);
    //    System.exit(0);
    //}

    private static final String KEY_USER = "user";
}