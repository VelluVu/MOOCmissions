
import java.util.Scanner;

public class MihinJaMista {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // KIRJOITA OHJELMASI TÄNNE
        System.out.print("Mihin asti? ");
        int viimenenLuku = Integer.parseInt(lukija.nextLine());
        System.out.print("Mistä lähtien? ");
        int ekaLuku = Integer.parseInt(lukija.nextLine());
        while (ekaLuku <= viimenenLuku) {
            ekaLuku++;
            System.out.println(ekaLuku-1);
        }
    }
}
