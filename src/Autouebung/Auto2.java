package Autouebung;

public class Auto2 {
    private String marke;
    private String typ;
    private int ps;


    public Auto2(String marke, String typ, int ps) {
        this.marke = marke;
        this.typ = typ;
        this.ps = ps;
    }

    public String getMarke() {
        return marke;
    }

    public String getTyp() {
        return typ;
    }

    public int getPs() {
        return ps;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }
}
