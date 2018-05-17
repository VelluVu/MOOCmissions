
import java.util.Scanner;

public class OnkoTotta {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        System.out.print("Kirjoita merkkijono: ");
        String syöttö = lukija.nextLine();
        if (!(syöttö.equals("totta"))) {
            System.out.println("Koitappa uudelleen!");
        } else {
            System.out.println("Oikein meni!");
        }
    }
}
