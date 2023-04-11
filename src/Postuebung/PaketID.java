package Postuebung;

public class PaketID {
   private int paketID;
   private String adresse;

    public PaketID(int paketID, String adresse) {
        this.paketID = paketID;
        this.adresse = adresse;
    }

    public int getPaketID() {
        return paketID;
    }

    public void setPaketID(int paketID) {
        this.paketID = paketID;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
