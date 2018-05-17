
import java.util.Scanner;

public class Lampotiloja {

    public static void main(String[] args) {

        Scanner lukija = new Scanner(System.in);
        // Toteuta lämpötilaohjelma tähän.
        while (true) {
            System.out.print("");
            double lampotila = Double.parseDouble(lukija.nextLine());
            if (lampotila >= -30 && lampotila <= 40) {
                Kuvaaja.lisaaNumero(lampotila);
            } else if (lampotila < -1000) {
                break;
            }
        }
    }
}
