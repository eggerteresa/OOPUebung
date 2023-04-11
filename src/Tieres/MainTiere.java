package Tieres;

public class MainTiere {

    public static void main(String[] args) {
        //erstellen des objektes

        Hund hund1 = new Hund ();
        hund1.name= "Strolchi";
        hund1.alter = 3;
        hund1.farbe = "Bunt";
        hund1.rasse = "Mischling";

        hund1.hatGebellt();
        System.out.println(hund1.name + " hat " + hund1.bellenCounter + " mal gebellt. ");

        hund1.bringtStock();


//        System.out.println(" Kann er Stock bringen? " + hund1.bringtStock());

    hund1.gibMirInfo();

        System.out.println("-------------------------------");
        System.out.println("Es gibt auch Katzen");


//    Tieres.Katze k1 = new Tieres.Katze();
//    k1.name = "Minki";
//        k1.alter = 2;
//        k1.farbe = "weiß";
//        k1.art = "Streuner";
    Katze k2 = new Katze ("pezi", 3, "perser", "grau");

//    k1.katzeknurrt();
//    k1.kannTrick();
//    k1.gibInfo();
    k2.gibInfo();

k2.name = "Susi";
        k2.gibInfo();


    }
}
