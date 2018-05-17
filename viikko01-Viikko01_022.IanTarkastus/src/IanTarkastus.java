
import java.util.Scanner;

public class IanTarkastus {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        
        System.out.print("Kuinka vanha olet? ");
        int ika1 = Integer.parseInt(lukija.nextLine());
        if (ika1 >= 0 && ika1 <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Mahdotonta!");
        }
    }
}
