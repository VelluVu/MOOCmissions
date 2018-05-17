import java.util.Scanner;

public class EnsimmainenKirjain {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna nimi: ");
        String nimi = lukija.nextLine();
        ensimmainenKirjain(nimi);
        System.out.println("Ensimmäinen kirjain: " + ensimmainenKirjain(nimi));
        
    }
    public static char ensimmainenKirjain(String merkkijono) {
        char viimonen = merkkijono.charAt(0);
        return viimonen;
    }
}
