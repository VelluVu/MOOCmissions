
import java.util.Scanner;

public class PotenssienSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int tulos = 0;
        int i = 0;
        System.out.print("Anna luku: ");
        int potenssi = Integer.parseInt(lukija.nextLine());
        int luku = 2;
        while (i <= potenssi) {
            tulos += (int) Math.pow(luku, potenssi);
            potenssi--;
        }
        System.out.println("Tulos on " + tulos);
    }
}
