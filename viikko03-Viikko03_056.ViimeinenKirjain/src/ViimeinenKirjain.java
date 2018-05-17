
import java.util.Scanner;

public class ViimeinenKirjain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna nimi: ");
        String sana = lukija.nextLine();
        viimeinenKirjain(sana);
        System.out.println("Viimeinen kirjain: " + viimeinenKirjain(sana));
    }

    public static char viimeinenKirjain(String sana) {
        char vika = sana.charAt(sana.length() - 1);
        return vika;
    }
}
