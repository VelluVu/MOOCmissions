public class Pienin {
    public static int pienin(int luku1, int luku2) {
        // kirjoita koodia tähän
        // älä tulosta metodin sisällä mitään
        // lopussa oltava komento return
        int vertaa = 0;
        if (luku1 < luku2) {
            vertaa = luku1;
        } else {
            vertaa = luku2;
        }
        return vertaa;
    }

    public static void main(String[] args) {
        int vastaus = pienin(2, 7);
        System.out.println("Pienin: " + vastaus);
    }
}
