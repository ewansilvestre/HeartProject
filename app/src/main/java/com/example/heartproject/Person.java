package com.example.heartproject;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
//import com.example.heartproject.*;

public class Person implements Parcelable {

    private String name;
    private String genre;
    private int age;
    private Boolean pbCardiaque;
    private Boolean cholesterol;
    private Boolean diabete;
    private Boolean hypertension;
    private Boolean pbCardiaqueFamille;
    private Boolean imc;
    private String ptMedecin;
    private String bilanCardiaque;
    private String consulteCardio;
    private String dej;
    private String fruit;
    private String repasMaison;
    private String platCuisiner;
    private String charcuterie;
    private String nutriScore;
    private String marche;
    private String actParJour;
    private String freqCardiaque;
    private String profilSportif;
    private String weAct;
    private String fumeur;
    private String acienFumeur;
    private String fumeurDomicile;
    private String stress;
    private String colere;
    private String medicament;
    private String gestionFamille;
    private String alcool;
    private String energisant;
    private String dormir;
    private String troubleSommeil;

    protected Person(Parcel in) {
        name = in.readString();
        genre = in.readString();
        age = in.readInt();
        byte tmpPbCardiaque = in.readByte();
        pbCardiaque = tmpPbCardiaque == 0 ? null : tmpPbCardiaque == 1;
        byte tmpCholesterol = in.readByte();
        cholesterol = tmpCholesterol == 0 ? null : tmpCholesterol == 1;
        byte tmpDiabete = in.readByte();
        diabete = tmpDiabete == 0 ? null : tmpDiabete == 1;
        byte tmpHypertension = in.readByte();
        hypertension = tmpHypertension == 0 ? null : tmpHypertension == 1;
        byte tmpPbCardiaqueFamille = in.readByte();
        pbCardiaqueFamille = tmpPbCardiaqueFamille == 0 ? null : tmpPbCardiaqueFamille == 1;
        byte tmpImc = in.readByte();
        imc = tmpImc == 0 ? null : tmpImc == 1;
        ptMedecin = in.readString();
        bilanCardiaque = in.readString();
        consulteCardio = in.readString();
        dej = in.readString();
        fruit = in.readString();
        repasMaison = in.readString();
        platCuisiner = in.readString();
        charcuterie = in.readString();
        nutriScore = in.readString();
        marche = in.readString();
        actParJour = in.readString();
        freqCardiaque = in.readString();
        profilSportif = in.readString();
        weAct = in.readString();
        fumeur = in.readString();
        acienFumeur = in.readString();
        fumeurDomicile = in.readString();
        stress = in.readString();
        colere = in.readString();
        medicament = in.readString();
        gestionFamille = in.readString();
        alcool = in.readString();
        energisant = in.readString();
        dormir = in.readString();
        troubleSommeil = in.readString();
    }

    public static final Creator<Person> CREATOR = new Creator<Person>() {
        @Override
        public Person createFromParcel(Parcel in) {
            return new Person(in);
        }

        @Override
        public Person[] newArray(int size) {
            return new Person[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(genre);
        parcel.writeInt(age);
        parcel.writeByte((byte) (pbCardiaque == null ? 0 : pbCardiaque ? 1 : 2));
        parcel.writeByte((byte) (cholesterol == null ? 0 : cholesterol ? 1 : 2));
        parcel.writeByte((byte) (diabete == null ? 0 : diabete ? 1 : 2));
        parcel.writeByte((byte) (hypertension == null ? 0 : hypertension ? 1 : 2));
        parcel.writeByte((byte) (pbCardiaqueFamille == null ? 0 : pbCardiaqueFamille ? 1 : 2));
        parcel.writeByte((byte) (imc == null ? 0 : imc ? 1 : 2));
        parcel.writeString(ptMedecin);
        parcel.writeString(bilanCardiaque);
        parcel.writeString(consulteCardio);
        parcel.writeString(dej);
        parcel.writeString(fruit);
        parcel.writeString(repasMaison);
        parcel.writeString(platCuisiner);
        parcel.writeString(charcuterie);
        parcel.writeString(nutriScore);
        parcel.writeString(marche);
        parcel.writeString(actParJour);
        parcel.writeString(freqCardiaque);
        parcel.writeString(profilSportif);
        parcel.writeString(weAct);
        parcel.writeString(fumeur);
        parcel.writeString(acienFumeur);
        parcel.writeString(fumeurDomicile);
        parcel.writeString(stress);
        parcel.writeString(colere);
        parcel.writeString(medicament);
        parcel.writeString(gestionFamille);
        parcel.writeString(alcool);
        parcel.writeString(energisant);
        parcel.writeString(dormir);
        parcel.writeString(troubleSommeil);
    }

    public Person() {
        name = "Unknow";
        genre = "Unknow";
        age = 0;
        pbCardiaque = false;
        cholesterol = false;
        diabete = false;
        hypertension = false;
        pbCardiaqueFamille = false;
        imc = false;
        ptMedecin = "Unknow";
        bilanCardiaque = "Unknow";
        consulteCardio = "Unknow";
        dej = "Unknow";
        fruit = "Unknow";
        repasMaison = "Unknow";
        platCuisiner = "Unknow";
        charcuterie = "Unknow";
        nutriScore = "Unknow";
        marche = "Unknow";
        actParJour = "Unknow";
        freqCardiaque = "Unknow";
        profilSportif = "Unknow";
        weAct = "Unknow";
        fumeur = "Unknow";
        acienFumeur = "Unknow";
        fumeurDomicile = "Unknow";
        stress = "Unknow";
        colere = "Unknow";
        medicament = "Unknow";
        gestionFamille = "Unknow";
        alcool = "Unknow";
        energisant = "Unknow";
        dormir = "Unknow";
        troubleSommeil = "Unknow";
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String aGenre) {
        genre = aGenre;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int aAge) {
        age = aAge;
    }

    public Boolean getPbCardiaque() {
        return pbCardiaque;
    }

    public void setPbCardiaque(Boolean aPbCardiaque) {
        pbCardiaque = aPbCardiaque;
    }

    public Boolean getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(Boolean aCholesterol) {
        cholesterol = aCholesterol;
    }

    public Boolean getDiabete() {
        return diabete;
    }

    public void setDiabete(Boolean aDiabete) {
        diabete = aDiabete;
    }

    public Boolean getHypertension() {
        return hypertension;
    }

    public void setHypertension(Boolean aHypertension) {
        hypertension = aHypertension;
    }

    public Boolean getPbCardiaqueFamille() {
        return pbCardiaqueFamille;
    }

    public void setPbCardiaqueFamille(Boolean aPbCardiaqueFamille) {
        pbCardiaqueFamille = aPbCardiaqueFamille;
    }

    public Boolean getImc() {
        return imc;
    }

    public void setImc(Boolean imc) {
        this.imc = imc;
    }

    public String getPtMedecin() {
        return ptMedecin;
    }

    public void setPtMedecin(String aPtMedecin) {
        ptMedecin = aPtMedecin;
    }

    public String getBilanCardiaque() {
        return bilanCardiaque;
    }

    public void setBilanCardiaque(String bilanCardiaque) {
        this.bilanCardiaque = bilanCardiaque;
    }

    public String getConsulteCardio() {
        return consulteCardio;
    }

    public void setConsulteCardio(String consulteCardio) {
        this.consulteCardio = consulteCardio;
    }

    public String getDej() {
        return dej;
    }

    public void setDej(String dej) {
        this.dej = dej;
    }

    public String getFruit() {
        return fruit;
    }

    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    public String getRepasMaison() {
        return repasMaison;
    }

    public void setRepasMaison(String repasMaison) {
        this.repasMaison = repasMaison;
    }

    public String getPlatCuisiner() {
        return platCuisiner;
    }

    public void setPlatCuisiner(String platCuisiner) {
        this.platCuisiner = platCuisiner;
    }

    public String getCharcuterie() {
        return charcuterie;
    }

    public void setCharcuterie(String charcuterie) {
        this.charcuterie = charcuterie;
    }

    public String getNutriScore() {
        return nutriScore;
    }

    public void setNutriScore(String nutriScore) {
        this.nutriScore = nutriScore;
    }

    public String getMarche() {
        return marche;
    }

    public void setMarche(String marche) {
        this.marche = marche;
    }

    public String getActParJour() {
        return actParJour;
    }

    public void setActParJour(String actParJour) {
        this.actParJour = actParJour;
    }

    public String getFreqCardiaque() {
        return freqCardiaque;
    }

    public void setFreqCardiaque(String freqCardiaque) {
        this.freqCardiaque = freqCardiaque;
    }

    public String getProfilSportif() {
        return profilSportif;
    }

    public void setProfilSportif(String profilSportif) {
        this.profilSportif = profilSportif;
    }

    public String getWeAct() {
        return weAct;
    }

    public void setWeAct(String weAct) {
        this.weAct = weAct;
    }

    public String getFumeur() {
        return fumeur;
    }

    public void setFumeur(String fumeur) {
        this.fumeur = fumeur;
    }

    public String getAcienFumeur() {
        return acienFumeur;
    }

    public void setAcienFumeur(String acienFumeur) {
        this.acienFumeur = acienFumeur;
    }

    public String getFumeurDomicile() {
        return fumeurDomicile;
    }

    public void setFumeurDomicile(String fumeurDomicile) {
        this.fumeurDomicile = fumeurDomicile;
    }

    public String getStress() {
        return stress;
    }

    public void setStress(String stress) {
        this.stress = stress;
    }

    public String getColere() {
        return colere;
    }

    public void setColere(String colere) {
        this.colere = colere;
    }

    public String getMedicament() {
        return medicament;
    }

    public void setMedicament(String medicament) {
        this.medicament = medicament;
    }

    public String getGestionFamille() {
        return gestionFamille;
    }

    public void setGestionFamille(String gestionFamille) {
        this.gestionFamille = gestionFamille;
    }

    public String getAlcool() {
        return alcool;
    }

    public void setAlcool(String alcool) {
        this.alcool = alcool;
    }

    public String getEnergisant() {
        return energisant;
    }

    public void setEnergisant(String energisant) {
        this.energisant = energisant;
    }

    public String getDormir() {
        return dormir;
    }

    public void setDormir(String dormir) {
        this.dormir = dormir;
    }

    public String getTroubleSommeil() {
        return troubleSommeil;
    }

    public void setTroubleSommeil(String troubleSommeil) {
        this.troubleSommeil = troubleSommeil;
    }
}
