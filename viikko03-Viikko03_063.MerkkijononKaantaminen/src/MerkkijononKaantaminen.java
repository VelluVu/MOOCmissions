
import java.util.Scanner;

public class MerkkijononKaantaminen {

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

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna merkkijono: ");
        String merkkijono = lukija.nextLine();
        System.out.println("Väärinpäin: " + kaanna(merkkijono));
    }
}
