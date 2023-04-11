package Postuebung;

import java.util.Arrays;

public class Filialpost {


   private PaketID[] pakete;
   private int anzahlPakete;
   private String filialname;


  // = new PaketID(1, "Teresa Egger, St. Georgen-Gasse2/28, 8020 Graz");

   // Konstruktor erstellen inklusive Anzahl
   public Filialpost (int maxAnzahlPakete, String name){
     this.filialname = name;
      pakete = new PaketID[maxAnzahlPakete];
      anzahlPakete =0;
      System.out.println("Frischerstelltes Array für Filiale " + name + "hat so viele  Pakete" + Arrays.toString(pakete) ) ;

   }

   public void pakektHinzufuegen(PaketID paket) {
      if (anzahlPakete <pakete.length) {
         pakete[anzahlPakete] = paket;
         anzahlPakete ++;
      } else {
         System.out.println("Die Filiale hat bereits die maximale Anzahl Pakete erreicht");
      }
   }

   public void paketEntfernen(int paketID) {
      for (int i = 0; i <anzahlPakete; i++) {
         if (pakete[i].getPaketID() == paketID) {
            for (int j = i;  j<anzahlPakete -1; j++) {
               pakete[j] = pakete[j+1];
            }
            pakete[anzahlPakete-1] = null;
            anzahlPakete --;
            return;
         }
      }
      System.out.println("Paket mit ID " + paketID + "konnte nicht gefunden werden");

   }

   public void paketAnzeigen(int idNeu) {

   }




}
