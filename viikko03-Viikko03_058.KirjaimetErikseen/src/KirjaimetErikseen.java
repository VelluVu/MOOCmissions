
import java.util.Scanner;

public class KirjaimetErikseen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna nimi: ");
        String nimi = lukija.nextLine();
        int nimePituus = nimi.length();
        for (int i = 0; nimePituus > i ; i++) {
            char kirjain = nimi.charAt(i);
            System.out.println(i+1 + ". kirjain: " + kirjain);
        }
    }
}
