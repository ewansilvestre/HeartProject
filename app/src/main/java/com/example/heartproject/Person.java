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
    private Boolean ptMedecin;
    private Boolean bilanCardiaque;
    private Boolean consulteCardio;
    private Boolean dej;
    private Boolean fruit;
    private String repasMaison;
    private Boolean platCuisiner;
    private Boolean charcuterie;
    private Boolean nutriScore;
    private Boolean marche;
    private String actParJour;
    private Boolean freqCardiaque;
    private String profilSportif;
    private String weAct;
    private Boolean fumeur;
    private Boolean acienFumeur;
    private Boolean fumeurDomicile;
    private String stress;
    private String colere;
    private Boolean medicament;
    private Boolean gestionFamille;
    private Boolean alcool;
    private Boolean energisant;
    private Boolean dormir;
    private Boolean troubleSommeil;


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
        byte tmpPtMedecin = in.readByte();
        ptMedecin = tmpPtMedecin == 0 ? null : tmpPtMedecin == 1;
        byte tmpBilanCardiaque = in.readByte();
        bilanCardiaque = tmpBilanCardiaque == 0 ? null : tmpBilanCardiaque == 1;
        byte tmpConsulteCardio = in.readByte();
        consulteCardio = tmpConsulteCardio == 0 ? null : tmpConsulteCardio == 1;
        byte tmpDej = in.readByte();
        dej = tmpDej == 0 ? null : tmpDej == 1;
        byte tmpFruit = in.readByte();
        fruit = tmpFruit == 0 ? null : tmpFruit == 1;
        repasMaison = in.readString();
        byte tmpPlatCuisiner = in.readByte();
        platCuisiner = tmpPlatCuisiner == 0 ? null : tmpPlatCuisiner == 1;
        byte tmpCharcuterie = in.readByte();
        charcuterie = tmpCharcuterie == 0 ? null : tmpCharcuterie == 1;
        byte tmpNutriScore = in.readByte();
        nutriScore = tmpNutriScore == 0 ? null : tmpNutriScore == 1;
        byte tmpMarche = in.readByte();
        marche = tmpMarche == 0 ? null : tmpMarche == 1;
        actParJour = in.readString();
        byte tmpFreqCardiaque = in.readByte();
        freqCardiaque = tmpFreqCardiaque == 0 ? null : tmpFreqCardiaque == 1;
        profilSportif = in.readString();
        weAct = in.readString();
        byte tmpFumeur = in.readByte();
        fumeur = tmpFumeur == 0 ? null : tmpFumeur == 1;
        byte tmpAcienFumeur = in.readByte();
        acienFumeur = tmpAcienFumeur == 0 ? null : tmpAcienFumeur == 1;
        byte tmpFumeurDomicile = in.readByte();
        fumeurDomicile = tmpFumeurDomicile == 0 ? null : tmpFumeurDomicile == 1;
        stress = in.readString();
        colere = in.readString();
        byte tmpMedicament = in.readByte();
        medicament = tmpMedicament == 0 ? null : tmpMedicament == 1;
        byte tmpGestionFamille = in.readByte();
        gestionFamille = tmpGestionFamille == 0 ? null : tmpGestionFamille == 1;
        byte tmpAlcool = in.readByte();
        alcool = tmpAlcool == 0 ? null : tmpAlcool == 1;
        byte tmpEnergisant = in.readByte();
        energisant = tmpEnergisant == 0 ? null : tmpEnergisant == 1;
        byte tmpDormir = in.readByte();
        dormir = tmpDormir == 0 ? null : tmpDormir == 1;
        byte tmpTroubleSommeil = in.readByte();
        troubleSommeil = tmpTroubleSommeil == 0 ? null : tmpTroubleSommeil == 1;
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
        ptMedecin = false;
        bilanCardiaque = false;
        consulteCardio = false;
        dej = false;
        fruit = false;
        repasMaison = "Unknow";
        platCuisiner = false;
        charcuterie = false;
        nutriScore = false;
        marche = false;
        actParJour = "Unknow";
        freqCardiaque = false;
        profilSportif = "Unknow";
        weAct = "Unknow";
        fumeur = false;
        acienFumeur = false;
        fumeurDomicile = false;
        stress = "Unknow";
        colere = "Unknow";
        medicament = false;
        gestionFamille = false;
        alcool = false;
        energisant = false;
        dormir = false;
        troubleSommeil = false;
    }

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
        parcel.writeByte((byte) (ptMedecin == null ? 0 : ptMedecin ? 1 : 2));
        parcel.writeByte((byte) (bilanCardiaque == null ? 0 : bilanCardiaque ? 1 : 2));
        parcel.writeByte((byte) (consulteCardio == null ? 0 : consulteCardio ? 1 : 2));
        parcel.writeByte((byte) (dej == null ? 0 : dej ? 1 : 2));
        parcel.writeByte((byte) (fruit == null ? 0 : fruit ? 1 : 2));
        parcel.writeString(repasMaison);
        parcel.writeByte((byte) (platCuisiner == null ? 0 : platCuisiner ? 1 : 2));
        parcel.writeByte((byte) (charcuterie == null ? 0 : charcuterie ? 1 : 2));
        parcel.writeByte((byte) (nutriScore == null ? 0 : nutriScore ? 1 : 2));
        parcel.writeByte((byte) (marche == null ? 0 : marche ? 1 : 2));
        parcel.writeString(actParJour);
        parcel.writeByte((byte) (freqCardiaque == null ? 0 : freqCardiaque ? 1 : 2));
        parcel.writeString(profilSportif);
        parcel.writeString(weAct);
        parcel.writeByte((byte) (fumeur == null ? 0 : fumeur ? 1 : 2));
        parcel.writeByte((byte) (acienFumeur == null ? 0 : acienFumeur ? 1 : 2));
        parcel.writeByte((byte) (fumeurDomicile == null ? 0 : fumeurDomicile ? 1 : 2));
        parcel.writeString(stress);
        parcel.writeString(colere);
        parcel.writeByte((byte) (medicament == null ? 0 : medicament ? 1 : 2));
        parcel.writeByte((byte) (gestionFamille == null ? 0 : gestionFamille ? 1 : 2));
        parcel.writeByte((byte) (alcool == null ? 0 : alcool ? 1 : 2));
        parcel.writeByte((byte) (energisant == null ? 0 : energisant ? 1 : 2));
        parcel.writeByte((byte) (dormir == null ? 0 : dormir ? 1 : 2));
        parcel.writeByte((byte) (troubleSommeil == null ? 0 : troubleSommeil ? 1 : 2));
    }

    public String getName() {
        return name;
    }

    public void setName(String aName) {
        name = aName;
    }

    public void setAge(int aAge) {
        age = aAge;
    }

    public int getAge() {
        return age;
    }
}
