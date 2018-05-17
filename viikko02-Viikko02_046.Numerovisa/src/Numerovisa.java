
import java.util.Random;
import java.util.Scanner;

public class Numerovisa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int arvottuLuku = arvoLuku();
        int maara = 0;
        while (true) {
            System.out.print("Arvaa luku: ");
            int arvattuLuku = Integer.parseInt(lukija.nextLine());
            if (arvattuLuku == arvottuLuku) {
                System.out.println("Onneksi olkoon, oikein arvattu!");
                break;
            } else if (arvattuLuku > arvottuLuku) {
                System.out.println("Luku on pienempi, tehtyjä arvauksia: " + maara);
            } else if (arvattuLuku < arvottuLuku) {
                System.out.println("Luku on suurempi, tehtyjä arvauksia: " + maara);
            }
            maara++;
        }
        // OHJELMOI OHJELMASI TÄHÄN, ÄLÄ MUOKKAA YLLÄOLEVIA ASIOITA

    }

    // ÄLÄ MUOKKAA METODIA arvoLuku
    private static int arvoLuku() {
        return new Random().nextInt(101);
    }
}
