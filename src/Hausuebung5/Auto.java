package Hausuebung5;

public class Auto {

    String marke;
    String modell;
    int jahr;
    double geschwindigkeit;


    public Auto(String marke, String modell, int jahr, double geschwindigkeit) {
        this.marke = marke;
        this.modell = modell;
        this.jahr = jahr;
        this.geschwindigkeit = geschwindigkeit;
    }

    public Auto(String marke, String modell, int jahr) {
        this.marke = marke;
        this.modell = modell;
        this.jahr = jahr;
        this.geschwindigkeit = 0;
    }

    public Auto(String marke, String modell) {
        this.marke = marke;
        this.modell = modell;
        this.jahr =  0;
        this.geschwindigkeit = 0;
    }

    public Auto(String marke) {
        this.marke = marke;
        this.modell = "Dummy";
        this.jahr = 0;
        this.geschwindigkeit = 0;
    }

    public Auto() {
        this.marke = "Dummy";
        this.modell = "Dummy";
        this.jahr = 0;
        this.geschwindigkeit = 0;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getJahr() {
        return jahr;
    }

    public void setJahr(int jahr) {
        this.jahr = jahr;
    }

    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }


    public double gasGeben (double geschw) {



        geschwindigkeit = geschwindigkeit+geschw;

        System.out.println("Die neue Geschwindigkeit nach Beschleunigung ist " + geschwindigkeit);


        return geschwindigkeit;
    }

    public double bremsen (double geschw) {


         geschwindigkeit = geschwindigkeit-geschw;
        System.out.println("Die neue Geschwindigkeit nach bremsen ist " +geschwindigkeit);

        return geschwindigkeit;
    }

    public String toString () {

       String toString = "Marke: " + marke + " Modell: " + modell + " Jahr: "+ jahr+ " Geschwindigkeit " + geschwindigkeit;
        System.out.println(toString);

    return toString;
    }



}
