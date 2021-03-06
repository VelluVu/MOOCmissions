
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SanatKaanteisesti {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<String> sanat = new ArrayList<>();
        // Tee tänne edellisen tehtävän tapaan ArrayList, johon laitat sanat
        while (true) {
            System.out.print("Anna sana: ");
            String sana = lukija.nextLine();
            if (sana.isEmpty()) {
                System.out.println("Annoit seuraavat sanat: ");
                break;
            } else {
                sanat.add(sana);
            }
        }
        Collections.reverse(sanat);
        for (String sana : sanat) {
            System.out.println(sana);
        }
    }
}
