
import java.util.Scanner;

public class Ylinopeussakko {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. 
        System.out.print("Kerro nopeus: ");
        int nopeus1 = Integer.parseInt(lukija.nextLine());

        if (nopeus1 > 120) {
            System.out.println("Ylinopeussakko!");
        }
    }
}
