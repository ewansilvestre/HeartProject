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
        if(p.getPtMedecin().matches("Oui") || p.getPtMedecin().matches("Yes")){
            cont = cont + 1;
        }
        if(p.getBilanCardiaque().matches("Oui") || p.getBilanCardiaque().matches("Yes")){
            cont = cont + 1;
        }
        if(p.getConsulteCardio().matches("Oui") || p.getConsulteCardio().matches("Yes")){
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
        if(p.getDej().matches("Oui") || p.getDej().matches("Yes")){
            cont = cont + 1;
        }
        if(p.getFruit().matches("Oui") || p.getFruit().matches("Yes")){
            cont = cont + 1;
        }
        if(p.getRepasMaison().matches("Des plats cuisinés à la maison") || p.getRepasMaison().matches("Home-cooked meals")){
            cont = cont + 1;
        }
        if(p.getPlatCuisiner().matches("Oui")|| p.getPlatCuisiner().matches("Yes")){
            cont = cont + 1;
        }
        if(p.getCharcuterie().matches("Non") || p.getCharcuterie().matches("No")){
            cont = cont + 1;
        }
        if(p.getNutriScore().matches("Oui") || p.getNutriScore().matches("Yes")){
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
        if(p.getMarche().matches("Oui") || p.getMarche().matches("Yes")){
            cont = cont + 1;
        }
        if(p.getActParJour().matches("1")){
            cont = cont + 1;
        }
        else if(p.getActParJour().matches("2")){
            cont = cont + 2;
        }
        else if(p.getActParJour().matches("3 et +") || p.getActParJour().matches("3 and +")){
            cont = cont + 3;
        }
        if(p.getFreqCardiaque().matches("Oui") || p.getFreqCardiaque().matches("Yes")){
            cont = cont + 1;
        }
        if(p.getProfilSportif().matches("Vous faites réguliérement de sport") || p.getProfilSportif().matches("You do sport regularly")){
            cont = cont + 1;
        }
        if(p.getWeAct().matches("Vous promener") || p.getWeAct().matches("Faire du sport") || p.getWeAct().matches("Walk around") || p.getWeAct().matches("Do sports")){
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
        if(p.getFumeur().matches("Non") || p.getFumeur().matches("No")){
            cont = cont + 1;
        }
        if(p.getAcienFumeur().matches("Non") || p.getAcienFumeur().matches("No")){
            cont = cont + 1;
        }
        if(p.getFumeurDomicile().matches("Non") || p.getFumeur().matches("No")){
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
        if(p.getStress().matches("Jamais") || p.getStress().matches("Parfois") || p.getStress().matches("Never") || p.getStress().matches("Sometime")){
            cont = cont + 1;
        }
        if(p.getColere().matches("Jamais") || p.getColere().matches("Peu") || p.getColere().matches("Little") || p.getColere().matches("Never")){
            cont = cont + 1;
        }
        if(p.getMedicament().matches("Non") || p.getMedicament().matches("No")){
            cont = cont + 1;
        }
        if(p.getGestionFamille().matches("Oui") || p.getGestionFamille().matches("Yes")){
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
        if(p.getAlcool().matches("Non") || p.getAlcool().matches("No")){
            cont = cont + 1;
        }
        if(p.getEnergisant().matches("Non") || p.getEnergisant().matches("No")){
            cont = cont + 1;
        }
        if(p.getDormir().matches("Oui") || p.getDormir().matches("Yes")){
            cont = cont + 1;
        }
        if(p.getTroubleSommeil().matches("Non") || p.getTroubleSommeil().matches("No")){
            cont = cont + 1;
        }
        if(cont > 2){
            return true;
        }
        else{
            return  false;
        }
    }

    private Boolean calculateDrug(Person p){
        int cont = 0;
        if(p.getTraitment().matches("Non") || p.getTraitment().matches("No")){
            cont = cont + 1;
        }
        if(p.getGenetic().matches("Non") || p.getGenetic().matches("No")){
            cont = cont + 1;
        }
        if(p.getDrug().matches("Non") || p.getDrug().matches("No")){
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
        if(calculateDrug(myUser) == true){
            context.drug.setTextColor(GREEN);
        }
        else{
            context.drug.setTextColor(RED);
        }
    }
}
