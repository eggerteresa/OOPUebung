package PostNEU;

import java.util.Arrays;

public class FilialPost {
    private String filialname;
    private Paket[] pakete;
    private int anzahlPakete = 0;

    // Konstruktor, aber mit neu hinzugefügt maxanzahl der Pakete
    public FilialPost(String filialname, int maxanzahlPakete) {
        this.filialname = filialname;
        pakete = new Paket[maxanzahlPakete]; // maxanzahl der Pakete wird für die Filiale festgelegt
    }

    // Methode um ein Paket zum Array der Klasse hinzufügen
    // ein Paket-Objekt im Parameter, von der aufgerufenen Klasse uebergeben

    public void paketHinzufuegen(Paket paket) {
// prüfen ob das Array pakete schon voll ist

        if (anzahlPakete < pakete.length) {
            pakete[anzahlPakete] = paket;
            anzahlPakete++;

        } else {
            System.out.println("Das ist eine Fehlermeldung! die maximale Anzahl von Paketen ist erreicht.");
        }
    }



    public void paketEntfernen(int paketID) {

        for (int i = 0; i<anzahlPakete; i++) {
            if (pakete[i].getId() == paketID) {
                pakete[i] = null; // dieses Paket aus dem Array löschen
                System.out.println(" Paket mit ID " + paketID + " an der Stelle " + i + "im Array wurde geloescht");
                return;
            }
        }
        // Kein Treffer:
        System.out.println("Paket mit ID " + paketID + "konnte nicht gefunden werden");

    }

    public void paketeAnzeigen() {
        System.out.println(" die " + filialname + " hat folgende Pakete bei sich: "+ Arrays.toString(pakete));
    }

    // Paketdetails anzeigen lassen:
    public void paketDetails(int paketStelleImArray) {
        System.out.println("Das Paket mit der übergebenen Paket ID " + pakete[paketStelleImArray].getId() + " muss an die Adresse "+ pakete[paketStelleImArray].getAdresse());
    }




}
