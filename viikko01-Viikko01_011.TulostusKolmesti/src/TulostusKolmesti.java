
import java.util.Scanner;

public class TulostusKolmesti {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        // Toteuta ohjelmasi tähän.
        System.out.print("Mikä tulostetaan?");
        String asia = lukija.nextLine();
        
        System.out.println(asia + asia + asia);

    }
}
