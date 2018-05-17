
import java.util.Scanner;

public class SilmukatLopetusMuistaminen {

    public static void main(String[] args) {
        // tee tähän projektiin tehtävät 41.1-41.5
        // kyseessä on oikeastaan yksi iso tehtävä jota koko ajan laajennetaan

        // voit myös lähettää osittain tehdyn tehtäväsarjan tarkastettavaksi palvelimelle
        // palvelin valittaa tällöin niistä testeistä joita vastaava koodi ei ole vielä
        // kirjoitettu. jo tehdyt osat kuitenkin kirjautuvat tehdyiksi
        Scanner lukija = new Scanner(System.in);
        int i = 0;
        int summa = 0;
        int lukumaara = 0;
        int onkoPari = 0;
        int parilliset = 0;
        int parittomat = 0;
        double keskiarvo = 0;
        while (true) {
            System.out.print("Syötä luvut: ");
            int luku = Integer.parseInt(lukija.nextLine());
            lukumaara++;
            onkoPari = luku % 2;
            if (onkoPari == 0) {
                parilliset++;
            } else if (onkoPari != 0) {
                parittomat++;
            }
            while (i <= luku) {
                i++;

                summa += luku;
                onkoPari = 0;
                luku = 0;
            }
            if (luku == -1) {
                parittomat -= 1;
                if (i == 1) {
                    lukumaara--;
                } else {
                    lukumaara--;
                }
                keskiarvo = (double) summa / lukumaara;
                System.out.println("Kiitos ja näkemiin!");
                System.out.println("Summa: " + summa);
                System.out.println("Lukuja: " + lukumaara);
                System.out.println("Keskiarvo: " + keskiarvo);
                System.out.println("Parillisia: " + parilliset);
                System.out.println("Parittomia: " + parittomat);
                break;
            }
        }
    }
}
