package Autouebung;

public class AutoMain {
    public static void main(String[] args) {
        Auto a1 = new Auto("BMW", "G30", 220);
        System.out.println("Die Marke des Objektes ist: " + a1.getMarke());

        Auto a2 = new Auto("Mini", "Cooper", 0);
        Auto a3 = new Auto();
        Auto a4 = new Auto("Audi", null, 0);


        a3.setMarke("VW");
        a3.setTyp("Golf");
        a3.setPs(60);
a3.autoInformationen();

    }
}
