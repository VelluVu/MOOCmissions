
import java.util.Scanner;

public class SanaSanassa {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.print("Anna 1. sana; ");
        String sana1 = lukija.nextLine();
        System.out.print("Anna 2. sana: ");
        String sana2 = lukija.nextLine();
        int luku1 = sana1.indexOf(sana2);
        System.out.println(luku1);
        int luku2 = sana2.indexOf(sana1);
        System.out.println(luku2);
        int vertaa = luku1 + luku2;
        if (luku1 > luku2) {
            System.out.println("Sana: " + "'" + sana2 + "'" + " on sanan " + "'" + sana1 + "'" + " osana.");
        } else {
            System.out.println("Sana: " + "'" + sana2 + "'" + " ei ole sanan " + "'" + sana1 + "'" + " osana.");
        }
    }
}
