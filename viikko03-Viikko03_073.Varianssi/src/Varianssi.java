import java.util.ArrayList;

public class Varianssi {
    // Kopioi tänne tehtävän 70 metodi summa
    public static int summa(ArrayList<Integer> lista) {
        int summa = 0;
        for (int i : lista) {
            summa += i;
        }
        return summa;
    }
    
    // Kopioi tänne tehtävän 71 metodi keskiarvo
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

    public static double varianssi(ArrayList<Integer> lista) {
        // kirjoita koodia tähän
        double arvo1 = 0;
        double luvut = 0;
        int lukuMaara = 0;
        double keskiarv = keskiarvo(lista);
        for (int i : lista) {
            luvut += Math.pow((i-keskiarv), 2);
            lukuMaara++;
        }
        arvo1 = luvut / (lukuMaara -1);
        return arvo1;
    }
    
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("Varianssi: " + varianssi(lista));
    }

}
