package Geschwindigkeit;

public class MainGeschwindigkeit {
    public static void main(String[] args) {

        System.out.println("Die Geschwindigkeit der Autos wird gemessen. ");
        Polizist polizist1 = new Polizist();

        float geschw = polizist1.GeschwMessen();

        Justiz justiz1 = new Justiz();

        justiz1.StrafeErrechnen(geschw);




    }
}
