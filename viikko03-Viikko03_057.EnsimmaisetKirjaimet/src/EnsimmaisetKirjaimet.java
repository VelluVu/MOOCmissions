
import java.util.Scanner;

public class EnsimmaisetKirjaimet {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna nimi: ");
        String nimi = lukija.nextLine();
        int kirjainLuku = nimi.length();
        if (kirjainLuku > 3) {
            for (int i = 0; i < 3; i++) {
                char kirjain = nimi.charAt(i);
                System.out.println(i + 1 + ". kirjain: " + kirjain);
            }
        }
    }
}
