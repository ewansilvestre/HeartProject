import android.os.Parcel;
import android.os.Parcelable;

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
}
