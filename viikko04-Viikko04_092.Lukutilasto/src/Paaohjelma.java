
import java.util.Scanner;

public class Paaohjelma {
    
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        // voit tehdä testikoodia tänne
        // poista kaikki ylimääräinen koodi kuitenkin tehtäviä 90.3 ja 90.4 tehdessäsi

        // Jotta testi toimisi, on oliot luotava pääohjelmassa oikeassa järjestyksessä 
        //  eli ensin kaikkien summan laskeva olio, toisena parillisten summan laskeva 
        //  ja viimeisenä parittomien summan laskeva olio)!
        Lukutilasto tilasto = new Lukutilasto();
        Lukutilasto tilasto2 = new Lukutilasto();
        Lukutilasto tilasto3 = new Lukutilasto();
        
        int vertaa = 0;
        while (true) {
            System.out.print("Anna lukuja: ");
            vertaa = Integer.parseInt(lukija.nextLine());
            if (vertaa == -1) {
                break;
            } else if (vertaa != -1 && vertaa % 2 == 0) {
                tilasto.lisaaLuku(vertaa);
                tilasto2.lisaaLuku(vertaa);
            } else if (vertaa != -1 && vertaa % 2 == 1) {
                tilasto.lisaaLuku(vertaa);
                tilasto3.lisaaLuku(vertaa);
            } else {
                tilasto.lisaaLuku(vertaa);
            }
            
        }
        System.out.println("Summa: " + tilasto.summa());
        System.out.println("Parillisten Summa: " + tilasto2.summa());
        System.out.println("Parittomien Summa: " + tilasto3.summa());
    }
}
