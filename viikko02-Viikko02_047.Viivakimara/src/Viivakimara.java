
import robotti.Ohjain;

public class Viivakimara {

    public static void main(String[] args) {
        Ohjain.kaynnista();
        // testaa metodejasi täällä
        viivakimara(10);

        Ohjain.sammuta();
    }

    // toteuta metodisi tänne
    public static void liikuMonta(int montakoAskelta) {
        int i = 0;
        int askeleet = montakoAskelta;
        while (askeleet > i) {
            Ohjain.liiku();
            askeleet--;
        }
    }

    public static void piirraNelio(int sivunPituus) {
        int i = 0;
        int askellus = sivunPituus;
        int nelio = askellus * 4;
        while (nelio > i) {
            liikuMonta(askellus);
            Ohjain.oikea();
            nelio -= askellus;
        }
    }

    public static void sisakkaisetNeliot(int montako) {
        int i = 0;
        int maara = montako;
        int koko = 1;
        while (maara > 0) {
            piirraNelio(koko);
            koko++;
            maara--;
        }
    }

    public static void rajatutSisakkaisetNeliot(int suurin, int pienin) {
        int i = 1;
        int suurempi = suurin;
        int pienempi = pienin;
        int alaRaja = pienin;
        int ylaRaja = suurin;
        piirraNelio(pienempi);
        while (alaRaja < ylaRaja) {
            piirraNelio(pienempi+i);
            pienempi++;
            alaRaja++;
        }
    }
    public static void viivakimara(int koko) {
        int i = 0;
        int size = koko;
        int puoli = size / 2;
        while (size > i) {
            sisakkaisetNeliot(puoli);
            liikuMonta(puoli);
            piirraNelio(puoli);
            liikuMonta(puoli);
            Ohjain.oikea();
            
            size--;
        }
    }
}
