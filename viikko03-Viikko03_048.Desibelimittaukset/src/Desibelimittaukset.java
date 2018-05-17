
import java.util.Locale;
import java.util.Scanner;

public class Desibelimittaukset {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta tänne ohjelma, joka laskee desibelimittausten keskiarvoja
        // Huomaa että ohjelmassa ei ole paikallisia testejä, vaan ohjelman
        // toiminta tarkastetaan palvelimella
        System.out.println("Anna desibelilukuja, lopeta luvulla 9999.");
        int summa = 0;
        int desibeli = 0;
        int lukumaara = 0;
        while (true) {
            System.out.print("Anna desibeliluku ");
            int syöttö = Integer.parseInt(lukija.nextLine());
            desibeli = syöttö;
            if (desibeli != 9999 && desibeli >= 0) {
                summa += desibeli;
                lukumaara++;
            }
            if (desibeli == 9999 && lukumaara >= 1) {
                System.out.println("Desibelilukujen keskiarvo on " + keskiarvo(summa, lukumaara));
                break;
            } else if (desibeli == 9999 && lukumaara < 1) {
                System.out.println("Yhtään desibelilukua ei syötetty.");
                break;
            }
            System.out.println(desibeli);
        }
    }

    public static double keskiarvo(int summa, int lukumaara) {
        double sum = summa;
        double jakaja = lukumaara;
        double vastaus = sum / jakaja;
        return vastaus;
    }
}
