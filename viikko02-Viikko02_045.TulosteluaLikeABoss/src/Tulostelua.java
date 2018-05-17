
public class Tulostelua {

    public static void tulostaTahtia(int maara) {
        // 40.1
        while (maara > 0) {
            System.out.print("*");
            maara--;
        }
        System.out.println("");
    }

    public static void tulostaTyhjaa(int maara) {
        // 40.1
        while (maara > 0) {
            System.out.print(" ");
            maara--;
        }
    }

    public static void tulostaKolmio(int koko) {
        // 40.2
        int i = 1;
        int k = koko;
        while (i <= koko) {
            tulostaTyhjaa(k - 1);
            tulostaTahtia(i);
            k--;
            i++;
        }
    }

    public static void jouluKuusi(int korkeus) {
        // 40.3
        int i = 1;
        int k = korkeus;
        int j = korkeus;
        int aKateetti = k / 2;

        while (i <= korkeus) {
            tulostaTyhjaa(k - 1);
            tulostaTahtia(2 * i - 1);
            k--;
            i++;
           
        }
        i = 2;
        while (--i >= 0) {
            tulostaTyhjaa(j - 2);
            tulostaTahtia(3);
        }
    }

    public static void main(String[] args) {
        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.

        tulostaKolmio(5);
        System.out.println("---");
        jouluKuusi(4);
        System.out.println("---");
        jouluKuusi(7);
    }
}
