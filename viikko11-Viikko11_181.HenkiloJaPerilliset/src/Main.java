
import henkilot.Henkilo;
import henkilot.Opiskelija;
import henkilot.Opettaja;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // tee tänne testikoodia
        List<Henkilo> henkilot = new ArrayList<Henkilo>();
        henkilot.add(new Opettaja("Ada Lovelace", "Korsontie 1 03100 Vantaa", 1200));
        henkilot.add(new Opettaja("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400));
        tulostaLaitoksenHenkilot(henkilot);

        Opiskelija olli = new Opiskelija("Olli", "Ida Albergintie 1 00400 Helsinki");
        for (int i = 0; i < 25; i++) {
            olli.opiskele();
        }
        System.out.println(olli);
        
        Opettaja ata = new Opettaja ("Ata Hesus", "OutoTie 2", 2000);
        System.out.println(ata);

    }

    public static void tulostaLaitoksenHenkilot(List<Henkilo> henkilot) {
        for (Henkilo tiedot : henkilot) {
            System.out.println(tiedot);
        }
    }
}
