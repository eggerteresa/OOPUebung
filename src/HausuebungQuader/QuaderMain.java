package HausuebungQuader;

public class QuaderMain {
    public static void main(String[] args) {
        Quader quader = new Quader(2.0, 3.0, 4.0);


        quader.grundflaeche();
        quader.oberflaeche();
        quader.volumen();
        quader.skaliere(2);

        System.out.println("Nach Skalierung betragen die neuen Werte");
        quader.grundflaeche();
        quader.oberflaeche();
        quader.volumen();
    }




}
