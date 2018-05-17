import java.util.Scanner;

public class Palindromi {

    public static boolean palindromi(String merkkijono) {
        // kirjoita koodia tähän
        String alkuperainen = merkkijono;
        String kaannetty = merkkijono;
        kaannetty = kaanna(kaannetty);
        if (alkuperainen.equals(kaannetty)) {
            return true;
        }
        
        return false;
    }

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.println("Anna merkkijono: ");
        String merkkijono = lukija.nextLine();    
        if (palindromi(merkkijono)) {
            System.out.println("Merkkijono on palindromi!");
        } else {
            System.out.println("Merkkijono ei ole palindromi!");
        }
    }
    public static String kaanna(String merkkijono) {
        // Kirjoita koodia tähän.
        // Metodin on siis palautettava käännetty merkkijono returnilla!
        char[] mrijono = merkkijono.toCharArray();
        String merkit = merkkijono;
        int ala = 0;
        int yla = mrijono.length - 1;
        String kaannos = "";
        while (ala < yla) {
            mrijono[ala] = (char) (mrijono[ala] ^ mrijono[yla]);
            mrijono[yla] = (char) (mrijono[ala] ^ mrijono[yla]);
            mrijono[ala] = (char) (mrijono[ala] ^ mrijono[yla]);
            ala++;
            yla--;
        }
        for (int i = 0; i < mrijono.length; i++) {
            kaannos += mrijono[i];
        }
        return kaannos;
    }
}
