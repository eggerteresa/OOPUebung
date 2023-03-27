package Drucker;

public class MainDrucker {
    public static void main(String[] args) {

        Drucker drucker = new Drucker();

        drucker.druckt("Hallowelt");
                drucker.druckt(30);
                drucker.druckt(40.60);
                drucker.druckt(true);

    }
}
