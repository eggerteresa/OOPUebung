package Geschwindigkeit;

import java.util.Scanner;

public class Polizist {

    public float GeschwMessen() {
        System.out.println("Geben Sie die gemessene Geschwindigkeit ein: ");
        Scanner scanner = new Scanner (System.in);
        float geschw = scanner.nextFloat();

        return geschw;


    }



}
