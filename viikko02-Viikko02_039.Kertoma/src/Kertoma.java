
import java.util.Scanner;

public class Kertoma {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        int sickMou = 1;
        int i = 1;
        System.out.print("Anna luku ");
        int luku = Integer.parseInt(lukija.nextLine());
        while (i <= luku) {
            sickMou *= i;
            i++;
        }
        System.out.println("Kertoma on " + sickMou);
    }
}
