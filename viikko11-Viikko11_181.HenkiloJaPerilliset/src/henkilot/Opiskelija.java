package henkilot;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vellu
 */
public class Opiskelija extends Henkilo {
    private int opintoPiste;

    public Opiskelija() {
        super(null, null);
    }
    public Opiskelija(String nimi, String osoite) {
        super(nimi, osoite);
        this.opintoPiste = 0;
    }
    public void opiskele () {
        this.opintoPiste++;
    }
    public int opintopisteita() {
        return this.opintoPiste;
    }
    @Override
    public String toString() {
        return super.toString() + "\n" +  "  opintopisteitä " + this.opintoPiste;
    }
}
