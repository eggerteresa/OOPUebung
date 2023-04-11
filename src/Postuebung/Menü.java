package Postuebung;

import java.util.Scanner;

public class Menü {
    public static void main(String[] args) {

        int auswahl = 0;
        Scanner input = new Scanner(System.in);



        do {



            System.out.println("0 =Pakethinzufuegen");
            System.out.println("1 =Paketentfernen");
            System.out.println("2= Exit");

            System.out.println("Geben Sie eine positive ganze Zahl ein:");
            auswahl= input.nextInt();

            switch (auswahl) {
                case 0:
                    System.out.println("Paket wird hinzugefügt");
                    break;
                case 1:
                    System.out.println("Paket wird entfert");
                    break;
                case 2:
                    System.out.println("Exit");
                    break;
            }


        } while (auswahl != 2);

    }


}
