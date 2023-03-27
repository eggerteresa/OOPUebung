package Autouebung;

public class Auto {

    private String marke;
    private String typ;
   private int ps;

    Auto(String marke, String typ, int ps) {
        this.marke = marke;
        this.typ = typ;
        this.ps = ps;
    }

    public Auto(String marke, String typ) {
        this.marke = marke;
        this.typ = typ;
        this.ps = 150;
    }

    public Auto() {
        this.marke = "Dummy";
        this.typ = "Dummy";
        this.ps = 0;
    }

    public Auto(String marke) {
        this.marke = marke;
    }





    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getMarke() {
        return marke;
    }


    public void setTyp(String typ) {
    this.typ = typ;
    }
    public String getTyp () {
        return typ;
    }

    public void setPs (int ps) {
        this.ps = ps;

    }
     public int getPs() {
        return ps;
     }


     void autoInformationen () {
         System.out.println("Das Auto hat folgende Daten: " + marke + typ + ps);

     }



}
