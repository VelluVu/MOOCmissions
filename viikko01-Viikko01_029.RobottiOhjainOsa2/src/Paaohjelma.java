
import java.util.Scanner;
import robotti.Ohjain;

public class Paaohjelma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        Ohjain.asetaLaatikkoSatunnaisesti();
        Ohjain.kaynnista();

        int laatikkoX = 0;
        int laatikkoY = 0;
        int robottiX = 0;
        int robottiY = 0;
        int tavoiteX = 0;
        int tavoiteY = 0;

        laatikkoX = Ohjain.laatikkoX();
        laatikkoY = Ohjain.laatikkoY();
        robottiX = Ohjain.robottiX();
        robottiY = Ohjain.robottiY();
        tavoiteX = Ohjain.tavoiteX();
        tavoiteY = Ohjain.tavoiteY();

        while (true) {
            System.out.print("");
            String komento = lukija.nextLine();
            if (komento.equals("liiku")) {
                Ohjain.liiku();
            } else if (komento.equals("sammuta")) {
                Ohjain.sammuta();
                break;
            } else if (komento.equals("vasen")) {
                Ohjain.vasen();
            } else if (komento.equals("oikea")) {
                Ohjain.oikea();
            } else if (komento.equals("liikuMonta")) {
                System.out.print("Kuinka monta askelta? ");
                int askel = Integer.parseInt(lukija.nextLine());
                Ohjain.liikuMonta(askel);
            } else if (komento.equals("viereen")) {
                while (true) {
                    if (robottiX != laatikkoX && robottiY != laatikkoY) {
                        Ohjain.vasen();
                        int laatikolleY = laatikkoY - robottiY;
                        Ohjain.liikuMonta(laatikolleY);
                        Ohjain.oikea();
                        int laatikolleX = laatikkoX - robottiX - 1;
                        Ohjain.liikuMonta(laatikolleX);
                        break;
                    }
                }
            } else if (komento.equals("ratkaise")) {
                while (true) {
                    if (robottiX != laatikkoX && robottiY != laatikkoY) {
                        Ohjain.vasen();
                        int laatikolleY = laatikkoY - robottiY;
                        Ohjain.liikuMonta(laatikolleY);
                        Ohjain.oikea();
                        int laatikolleX = laatikkoX - robottiX - 1;
                        Ohjain.liikuMonta(laatikolleX);
                    }
                    if (laatikkoX != tavoiteX) {
                        int tavoitteelleX = tavoiteX - laatikkoX;
                        Ohjain.liikuMonta(tavoitteelleX);
                        if (laatikkoY > tavoiteY) {
                            Ohjain.vasen();
                            Ohjain.liiku();
                            Ohjain.oikea();
                            Ohjain.liiku();
                            Ohjain.oikea();
                            robottiY = 0;
                            robottiY = Ohjain.robottiY();
                            int tavoitteelleY = robottiY - tavoiteY;
                            Ohjain.liikuMonta(tavoitteelleY - 1);
                            break;
                        } else {
                            Ohjain.oikea();
                            Ohjain.liiku();
                            Ohjain.vasen();
                            Ohjain.liiku();
                            Ohjain.vasen();
                            robottiY = 0;
                            robottiY = Ohjain.robottiY();
                            int tavoitteelleYpos = robottiY + tavoiteY;
                            Ohjain.liikuMonta(tavoitteelleYpos - 1);
                            break;
                        }
                    }
                }
            }
        }
    }
}
