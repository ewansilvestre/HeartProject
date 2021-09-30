import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
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
    public static final String DEFAULT = "UNDEFINED";

    /**
     * Constructor. All members get default values
     */
    public Person() {
        this.setName(Person.DEFAULT);
        this.setGenre(Person.DEFAULT);
        this.setAge(0);
        this.setPbCardiaque(false);
        this.setCholesterol(false);
        this.setDiabete(false);
        this.setHypertension(false);
        this.setPbCardiaqueFamille(false);
        this.setImc(false);
        this.setPtMedecin(false);
        this.setBilanCardiaque(false);
        this.setConsulteCardio(false);
        this.setDej(false);
        this.setFruit(false);
    }

    /**
     * Display this instance's contents
     */
    public void print() {
        System.out.println("Person's attributes: ");
        System.out.print(this);
        System.out.println();
    }

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
        parcel.writeByte((byte) (ptMedecin == null ? 0 : ptMedecin ? 1 : 2));
        parcel.writeByte((byte) (bilanCardiaque == null ? 0 : bilanCardiaque ? 1 : 2));
        parcel.writeByte((byte) (consulteCardio == null ? 0 : consulteCardio ? 1 : 2));
        parcel.writeByte((byte) (dej == null ? 0 : dej ? 1 : 2));
        parcel.writeByte((byte) (fruit == null ? 0 : fruit ? 1 : 2));
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public int getAge() {
        return age;
    }

    public Boolean getPbCardiaque() {
        return pbCardiaque;
    }

    public Boolean getCholesterol() {
        return cholesterol;
    }

    public Boolean getDiabete() {
        return diabete;
    }

    public Boolean getHypertension() {
        return hypertension;
    }

    public Boolean getPbCardiaqueFamille() {
        return pbCardiaqueFamille;
    }

    public Boolean getImc() {
        return imc;
    }

    public Boolean getPtMedecin() {
        return ptMedecin;
    }

    public Boolean getBilanCardiaque() {
        return bilanCardiaque;
    }

    public Boolean getConsulteCardio() {
        return consulteCardio;
    }

    public Boolean getDej() {
        return dej;
    }

    public Boolean getFruit() {
        return fruit;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPbCardiaque(Boolean pbCardiaque) {
        this.pbCardiaque = pbCardiaque;
    }

    public void setCholesterol(Boolean cholesterol) {
        this.cholesterol = cholesterol;
    }

    public void setDiabete(Boolean diabete) {
        this.diabete = diabete;
    }

    public void setHypertension(Boolean hypertension) {
        this.hypertension = hypertension;
    }

    public void setPbCardiaqueFamille(Boolean pbCardiaqueFamille) {
        this.pbCardiaqueFamille = pbCardiaqueFamille;
    }

    public void setImc(Boolean imc) {
        this.imc = imc;
    }

    public void setPtMedecin(Boolean ptMedecin) {
        this.ptMedecin = ptMedecin;
    }

    public void setBilanCardiaque(Boolean bilanCardiaque) {
        this.bilanCardiaque = bilanCardiaque;
    }

    public void setConsulteCardio(Boolean consulteCardio) {
        this.consulteCardio = consulteCardio;
    }

    public void setDej(Boolean dej) {
        this.dej = dej;
    }

    public void setFruit(Boolean fruit) {
        this.fruit = fruit;
    }



}
