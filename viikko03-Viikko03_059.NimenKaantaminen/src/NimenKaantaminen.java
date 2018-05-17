
import java.util.Scanner;

public class NimenKaantaminen {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // Tee koodisi tänne
        System.out.print("Anna nimi: ");
        String nimi = lukija.nextLine();
        char kirjaimet[] = nimi.toCharArray();
        int ala = 0;
        int yla = nimi.length() - 1;
        while (ala < yla) {
            kirjaimet[ala] = (char) (kirjaimet[ala] ^ kirjaimet[yla]);
            kirjaimet[yla] = (char) (kirjaimet[ala] ^ kirjaimet[yla]);
            kirjaimet[ala] = (char) (kirjaimet[ala] ^ kirjaimet[yla]);
            ala++;
            yla--;
        }
        System.out.println("Väärinpäin: ");
        for (int i = 0; i < kirjaimet.length; i++) {
            System.out.print(kirjaimet[i]);
        }
    }
}
