
import robotti.Ohjain;

public class Paaohjelma {

    public static void main(String[] args) {

        Ohjain.kaynnista();

        // ohjelmoi liikkeet tänne
        // Huom! Älä luota testeihin -- kokeile, että ohjelma toimii
        // oikein ohjelmaa ajamalla.
        int xMax = 13;
        int counter = 14;
        int yMax = 1;
        int total = 7;
        int robotinX = 0;
        int robotinY = 0;
        while (total > 0) {
            for (int y = 0; y < yMax; y++) {
                System.out.println(y);
                for (int x = 0; x < xMax; x++) {
                    System.out.println(x);
                    robotinX = Ohjain.robottiX();
                    Ohjain.liiku();
                    robotinX = robotinX % 2;
                    if (robotinX == 1) {
                        Ohjain.nosta();
                    }
                    robotinX = 0;
                }
                Ohjain.vasen();
                Ohjain.liiku();
                Ohjain.vasen();
            }
            for (int y = 0; y < yMax; y++) {
                System.out.println(y);
                for (int x = 0; x < xMax; x++) {
                    System.out.println(x);
                    robotinX = Ohjain.robottiX();
                    Ohjain.liiku();
                    robotinX = robotinX % 2;
                    if (robotinX == 0) {
                        Ohjain.nosta();
                    }
                    robotinX = 0;
                }
                Ohjain.oikea();
                Ohjain.liiku();
                Ohjain.oikea();

                total--;
            }
        }

        Ohjain.sammuta();

    }

    public static void liike() {
    }
}
