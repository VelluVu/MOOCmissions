
import java.util.Scanner;

public class LukusarjanSumma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int sigma = 0;
        int toistot = 0;
        System.out.print("Mihin asti? ");
        int luku = Integer.parseInt(lukija.nextLine());
        while (toistot <= luku) {
            sigma += toistot;
            toistot++;
        }
        System.out.println("Summa on " + sigma);
    }
}
