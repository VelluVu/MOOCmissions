
import java.util.ArrayList;

public class LukujenKeskiarvo {

    // Kopioi tänne edellisen tehtävän metodi summa
    public static int summa(ArrayList<Integer> lista) {
        int summa = 0;
        for (int i : lista) {
            summa += i;
        }
        return summa;
    }
    

    public static double keskiarvo(ArrayList<Integer> lista) {
        // kirjoita koodia tähän
        double arvo = 0;
        int summa = summa(lista);
        int jakaja = 0;
        for (int i : lista) {
            System.out.println(i);
            jakaja++;
        }
        System.out.println(jakaja);
        arvo = (double) summa / jakaja;
        return arvo;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);

        System.out.println("Keskiarvo: " + keskiarvo(lista));
    }
}
