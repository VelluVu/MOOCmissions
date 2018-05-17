
import java.util.Scanner;
import robotti.Ohjain;

public class Portaikko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        Ohjain.kaynnista();
        // KIRJOITA OHJELMASI TÄNNE
        while (true) {
            System.out.print("Montako ylös? ");
            int askelUp = Integer.parseInt(lukija.nextLine());
            System.out.print("Montako alas? ");
            int askelDown = Integer.parseInt(lukija.nextLine());
            while (askelUp != 0) {
                Ohjain.vasen();
                Ohjain.liiku();
                Ohjain.oikea();
                Ohjain.liiku();
                askelUp--;
            }
            while (askelDown != 0) {
                Ohjain.oikea();
                Ohjain.liiku();
                Ohjain.vasen();
                Ohjain.liiku();
                askelDown--;
            }
            break;
        }

        Ohjain.sammuta();
    }
}
