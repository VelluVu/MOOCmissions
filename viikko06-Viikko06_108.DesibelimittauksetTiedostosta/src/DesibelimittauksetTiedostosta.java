
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class DesibelimittauksetTiedostosta {

    public static void main(String[] args) {
        // HUOM! Älä luo muita Scanner-olioita koodissa
        Scanner lukija = new Scanner(System.in);

        System.out.println("Minkä niminen tiedosto luetaan? ");
        String tiedosto = lukija.nextLine();

        // toteuta metodi lueLuvut niin, että se lukee parametrina annetusta
        // tiedostosta luvut ja palauttaa ne ArrayList<Integer>-oliossa
        ArrayList<Integer> lista = null;

//      lista = lueLuvut(tiedosto);
        lista = valitseLuvutValilta(lista, 0, Integer.MAX_VALUE);

        if (lista.isEmpty()) {
            System.out.println("Ei lukuja.");
        } else {
            System.out.println("Lukujen keskiarvo: " + keskiarvo(lista));
        }
    }

    // toteuta tänne metodi lueLuvut

    // valmiit metodit
    public static ArrayList<Integer> valitseLuvutValilta(ArrayList<Integer> luvut, int pienin, int suurin) {
        ArrayList<Integer> palautettava = new ArrayList<>();
        for (Integer luku : luvut) {
            if (luku >= pienin && luku <= suurin) {
                palautettava.add(luku);
            }
        }

        return palautettava;
    }

    public static double keskiarvo(ArrayList<Integer> luvut) {
        int summa = 0;

        for (Integer luku : luvut) {
            summa += luku;
        }

        return 1.0 * summa / luvut.size();
    }
}
