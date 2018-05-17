
import java.util.Scanner;

public class TaysiIkaisyys {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);

        // Toteuta ohjelmasi tähän. 
        System.out.print("Kuinka vanha olet? ");
        int ika = Integer.parseInt(lukija.nextLine());
        
        if (ika >= 18) {
            System.out.println("Olet jo täysi-ikäinen!");
        } else if (ika < 18) {
            System.out.println("Et ole vielä täysi-ikäinen!");
        }
    }
}
