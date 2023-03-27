import java.util.Scanner;

public class Hund {

    String name;
    int alter;
    String rasse;
    String farbe;
    int bellenCounter =0;



    public void hatGebellt() {
        bellenCounter++;
        System.out.println("Der Hund" + name +" bellt wuffwuff");
    }

    public void gibMirInfo () {
        System.out.println(" Der hund " + name + " ist ein " + rasse + " und ist " + alter + " Jahre alt und seine Farbe ist " + farbe);

    }

public boolean bringtStock () {
    System.out.println("Kann " + name + "Stock bringen? Bitte J oder N eingeben: ");
    Scanner scanner = new Scanner(System.in);
    if (scanner.next().equals ("J" )) {
        System.out.println(name+ " kann Stöckchen bringen ");
        return true;
    } else {
        System.out.println(name + " kann nicht Stöckchen bringen");
        return false;

    }
}
}
