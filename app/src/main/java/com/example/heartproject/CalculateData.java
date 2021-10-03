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
        if(p.getPbCardiaque() == false){
            cont = cont + 1;
        }
        if(p.getCholesterol() == false){
            cont = cont + 1;
        }
        if(p.getDiabete() == false){
            cont = cont + 1;
        }
        if(p.getHypertension() == false){
            cont = cont + 1;
        }
        if(p.getPbCardiaqueFamille() == false){
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

    private Boolean calculateHeartTra(Person p){
        int cont = 0;
        if(p.getPtMedecin() == "Oui" || p.getPtMedecin() == "Yes"){
            cont = cont + 1;
        }
        if(p.getBilanCardiaque() == "Oui" || p.getBilanCardiaque() == "Yes"){
            cont = cont + 1;
        }
        if(p.getConsulteCardio() == "Oui" || p.getConsulteCardio() == "Yes"){
            cont = cont + 1;
        }
        if(cont > 2){
            return true;
        }
        else{
            return  false;
        }
    }

    private Boolean calculateDiet(Person p){
        int cont = 0;
        if(p.getDej() == "Oui" || p.getDej() == "Yes"){
            cont = cont + 1;
        }
        if(p.getFruit() == "Oui" || p.getFruit() == "Yes"){
            cont = cont + 1;
        }
        if(p.getRepasMaison() == "Des plats cuisinés à la maison" || p.getRepasMaison() == "Home-cooked meals"){
            cont = cont + 1;
        }
        if(p.getPlatCuisiner() == "Oui" || p.getPlatCuisiner() == "Yes"){
            cont = cont + 1;
        }
        if(p.getCharcuterie() == "Non" || p.getCharcuterie() == "No"){
            cont = cont + 1;
        }
        if(p.getNutriScore() == "Oui" || p.getNutriScore() == "Yes"){
            cont = cont + 1;
        }
        if(cont > 3){
            return true;
        }
        else{
            return  false;
        }
    }

    private Boolean calculateAct(Person p){
        int cont = 0;
        if(p.getMarche() == "Oui" || p.getMarche() == "Yes"){
            cont = cont + 1;
        }
        if(p.getActParJour() == "1"){
            cont = cont + 1;
        }
        else if(p.getActParJour() == "2"){
            cont = cont + 2;
        }
        else if(p.getActParJour() == "3 et +" || p.getActParJour() == "3 and +"){
            cont = cont + 3;
        }
        if(p.getFreqCardiaque() == "Oui" || p.getFreqCardiaque() == "Yes"){
            cont = cont + 1;
        }
        if(p.getProfilSportif() == "Vous faites réguliérement de sport" || p.getProfilSportif() == "You do sport regularly"){
            cont = cont + 1;
        }
        if(p.getWeAct() == "Vous promener" || p.getWeAct() == "Faire du sport" || p.getWeAct() == "Walk around" || p.getWeAct() == "Do sports"){
            cont = cont + 1;
        }
        if(cont > 4){
            return true;
        }
        else{
            return  false;
        }
    }

    private Boolean calculateTabac(Person p){
        int cont = 0;
        if(p.getFumeur() == "Non" || p.getFumeur() == "No"){
            cont = cont + 1;
        }
        if(p.getAcienFumeur() == "Non" || p.getAcienFumeur() == "No"){
            cont = cont + 1;
        }
        if(p.getFumeurDomicile() == "Non" || p.getFumeur() == "No"){
            cont = cont + 1;
        }
        if(cont > 2){
            return true;
        }
        else{
            return  false;
        }
    }

    private Boolean calculateStress(Person p){
        int cont = 0;
        if(p.getStress() == "Jamais" || p.getStress() == "Parfois" || p.getStress() == "Never" || p.getStress() == "Sometime"){
            cont = cont + 1;
        }
        if(p.getColere() == "Jamais" || p.getColere() == "Peu" || p.getColere() == "Little" || p.getColere() == "Never"){
            cont = cont + 1;
        }
        if(p.getMedicament() == "Non" || p.getMedicament() == "No"){
            cont = cont + 1;
        }
        if(p.getGestionFamille() == "Oui" || p.getGestionFamille() == "Yes"){
            cont = cont + 1;
        }
        if(cont > 2){
            return true;
        }
        else{
            return  false;
        }
    }

    private Boolean calculateLife(Person p){
        int cont = 0;
        if(p.getAlcool() == "Non" || p.getAlcool() == "No"){
            cont = cont + 1;
        }
        if(p.getEnergisant() == "Non" || p.getEnergisant() == "No"){
            cont = cont + 1;
        }
        if(p.getDormir() == "Oui" || p.getDormir() == "Yes"){
            cont = cont + 1;
        }
        if(p.getTroubleSommeil() == "Non" || p.getTroubleSommeil() == "No"){
            cont = cont + 1;
        }
        if(cont > 2){
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
        if(calculateHeartTra(myUser) == true){
            context.heartTra.setTextColor(GREEN);
        }
        else{
            context.heartTra.setTextColor(RED);
        }
        if(calculateDiet(myUser) == true){
            context.diet.setTextColor(GREEN);
        }
        else{
            context.diet.setTextColor(RED);
        }
        if(calculateAct(myUser) == true){
            context.act.setTextColor(GREEN);
        }
        else{
            context.act.setTextColor(RED);
        }
        if(calculateTabac(myUser) == true){
            context.tabac.setTextColor(GREEN);
        }
        else{
            context.tabac.setTextColor(RED);
        }
        if(calculateStress(myUser) == true){
            context.stress.setTextColor(GREEN);
        }
        else{
            context.stress.setTextColor(RED);
        }
        if(calculateLife(myUser) == true){
            context.life.setTextColor(GREEN);
        }
        else{
            context.life.setTextColor(RED);
        }
    }
}
