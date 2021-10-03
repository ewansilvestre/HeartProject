package com.example.heartproject;

import static android.graphics.Color.GREEN;
import static android.graphics.Color.RED;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

public class CalculateData extends AsyncTask<Void,Integer,Void> {

    private Person myUser;
    private ActivityEnd context;

    public CalculateData(Person myUser, ActivityEnd context) {
        this.context = context;
        this.myUser = myUser;
    }

    @Override
    protected Void doInBackground(Void... voids) {
        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }

    private Boolean calculateHeart(Person p){
        int cont = 0;
        if(p.getPbCardiaque() == true){
            cont = cont + 1;
        }
        if(p.getCholesterol() == true){
            cont = cont + 1;
        }
        if(p.getDiabete() == true){
            cont = cont + 1;
        }
        if(p.getHypertension() == true){
            cont = cont + 1;
        }
        if(p.getPbCardiaqueFamille() == true){
            cont = cont + 1;
        }
        if(p.getImc() == true){
            cont = cont + 1;
        }
        if(cont > 3){
            return true;
        }
        else{
            return  false;
        }
    }

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        Log.d(context.TAG, "onPostExecute: User: " + myUser.getName() + " / " + myUser.getAge() + " / " + myUser.getGenre());
        context.name.setText(myUser.getName());
        context.age.setText(String.valueOf(myUser.getAge()));
        context.gender.setText(myUser.getGenre());
        if(calculateHeart(myUser) == true){
            context.heart.setTextColor(GREEN);
        }
        else{
            context.heart.setTextColor(RED);
        }
        Toast.makeText(context, "Requete terminee", Toast.LENGTH_SHORT).show();
    }
}
