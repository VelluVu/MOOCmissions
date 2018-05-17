
public class Tulostelua {

    public static void tulostaTahtia(int maara) {
        // 44.1
        while (maara > 0) {
            System.out.print("*");
            maara--;
        }
        System.out.println("");
    }

    public static void tulostaNelio(int sivunpituus) {
        // 44.2
        int nelio = 0;
        nelio += sivunpituus;
        while (sivunpituus > 0) {
            tulostaTahtia(nelio);
            sivunpituus--;
        }
        System.out.println("");
    }

    public static void tulostaSuorakulmio(int leveys, int korkeus) {
        // 44.3
        while (korkeus > 0) {
            tulostaTahtia(leveys);
            korkeus--;
        }
        System.out.println("");
    }

    public static void tulostaKolmio(int koko) {
        // 44.4
        int luku = 1;
        while (luku <= koko) {
            tulostaTahtia(luku);
            luku++;
        }
        System.out.println("");
    }

    public static void main(String[] args) {

        // Testit eivät katso main-metodia, voit muutella tätä vapaasti.
        // HUOM: jos testit eivät meinaa mennä läpi, kokeile pääohjelmaa ajamalla,
        // että metodit toimivat niinkuin niiden on tarkoitus toimia!
        tulostaTahtia(5);
        tulostaTahtia(3);
        tulostaTahtia(9);
        System.out.println("\n---");  // tulostetaan kuvioiden välille ---
        tulostaNelio(3);
        System.out.println("\n---");
        tulostaSuorakulmio(5, 6);
        System.out.println("\n---");
        tulostaKolmio(4);
        System.out.println("\n---");
    }

}
