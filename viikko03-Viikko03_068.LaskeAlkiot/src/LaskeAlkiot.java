
import java.util.ArrayList;

public class LaskeAlkiot {

    // lisää tähän metodi laskeAlkiot ja toteuta se!
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Moi");
        lista.add("Ciao");
        lista.add("Hello");
        System.out.println("Listalla on alkioita:");
        // Voit ottaa kommenttimerkit alta pois kun olet lisännyt metodin laskeAlkiot
        System.out.println(laskeAlkiot(lista));
    }

    public static int laskeAlkiot(ArrayList<String> lista) {
        int alkiot = 0;
        for (String sana : lista) {
            alkiot++;
        }
        return alkiot;
    }
}