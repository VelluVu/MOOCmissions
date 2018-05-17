
import java.util.Scanner;

public class RajatunLukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int sickMa = 0;
        System.out.print("Ensimmäinen: ");
        int alkuLuku = Integer.parseInt(lukija.nextLine());
        System.out.print("Viimeinen: ");
        int loppuLuku = Integer.parseInt(lukija.nextLine());
        while (alkuLuku <= loppuLuku) {
            sickMa += alkuLuku;
            alkuLuku++;
        }
        System.out.println("Summa on " + sickMa);
    }
}
