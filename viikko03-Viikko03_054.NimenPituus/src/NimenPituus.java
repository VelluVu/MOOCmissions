
import java.util.Scanner;

public class NimenPituus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // kutsu täältä metodiasi
        System.out.print("Anna nimi: ");
        String merkkijono = lukija.next();
        laskeKirjaimet(merkkijono);
        System.out.println("Kirjain määrä: " + laskeKirjaimet(merkkijono));
    }

    public static int laskeKirjaimet(String merkkijono) {
        
        int i = 0;
        while (i <= merkkijono.length()) {
            i++;
        }
        return i-1;
        
        // tee tänne metodi 
        // public static int laskeKirjaimet(String merkkijono)
    }
}
