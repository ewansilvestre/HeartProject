package com.example.heartproject;

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

    @Override
    protected void onPostExecute(Void aVoid) {
        super.onPostExecute(aVoid);
        Log.d(context.TAG, "onPostExecute: User: " + myUser.getName() + " / " + myUser.getAge() + " / " + myUser.getGenre());
        context.name.setText(myUser.getName());
        context.age.setText(String.valueOf(myUser.getAge()));
        context.gender.setText(myUser.getGenre());
        Toast.makeText(context, "Requete terminee", Toast.LENGTH_SHORT).show();
    }
}
