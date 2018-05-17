
public class Kassapaate {

    private double rahaa;  // kassassa olevan käteisen määrä
    private int edulliset; // myytyjen edullisten lounaiden määrä
    private int maukkaat;  // myytyjen maukkaiden lounaiden määrä

    public Kassapaate() {
        this.rahaa = 1000.0; // kassassa on aluksi 1000 euroa rahaa
    }

    public double syoEdullisesti(double maksu) {
        double cheapLunch = 2.50;
        double vaihtoRaha = 0;
        if (cheapLunch <= maksu) {
            vaihtoRaha = maksu - cheapLunch;
            this.edulliset++;
            this.rahaa += cheapLunch;
            return vaihtoRaha;
        } else {
            return maksu;
        }// edullinen lounas maksaa 2.50 euroa.
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan

    }

    public double syoMaukkaasti(double maksu) {
        double tastyLunch = 4.30;
        double vaihtoRaha = 0;
        if (tastyLunch <= maksu) {
            vaihtoRaha = maksu - tastyLunch;
            this.maukkaat++;
            this.rahaa += tastyLunch;
            return vaihtoRaha;
        } else {
            return maksu;
        }
        // edullinen lounas maksaa 4.30 euroa.
        // päivitetään kassan rahamäärää lounaan hinnalla ja palautetaan vaihtorahat
        // jos parametrina annettu maksu ei ole riittävän suuri, ei lounasta myydä ja metodi palauttaa koko summan
    }

    public boolean syoEdullisesti(Maksukortti kortti) {
        double cheapLunch = 2.50;
        if (kortti.saldo() >= cheapLunch) {
            kortti.otaRahaa(cheapLunch);
            this.edulliset++;
            return true;
        } else {
            return false;
        }
    }

    public boolean syoMaukkaasti(Maksukortti kortti) {
        double tastyLunch = 4.30;
        if (kortti.saldo() >= tastyLunch) {
            kortti.otaRahaa(tastyLunch);
            this.maukkaat++;
            return true;
        } else {
            return false;
        }
    }

    public void lataaRahaaKortille(Maksukortti kortti, double summa) {
        if (summa > 0) {
            kortti.lataaRahaa(summa);
            this.rahaa += summa;
        }
    }

    @Override
    public String toString() {
        return "kassassa rahaa " + rahaa + " edullisia lounaita myyty "
                + edulliset + " maukkaita lounaita myyty " + maukkaat;
    }
}
