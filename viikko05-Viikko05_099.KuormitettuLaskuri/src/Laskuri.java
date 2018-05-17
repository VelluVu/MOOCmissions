/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author vellu
 */
public class Laskuri {

    private int luku;
    private boolean tarkistus;

    public Laskuri(int alkuarvo, boolean tarkistus) {
        this.luku = alkuarvo;
        if (tarkistus == true) {
            this.tarkistus = true;
        }
    }

    public Laskuri(int alkuarvo) {
        this.luku = alkuarvo;
        this.tarkistus = false;
    }

    public Laskuri(boolean tarkistus) {
        this.luku = 0;
        if (tarkistus == true) {
            this.tarkistus = true;
        }
    }

    public Laskuri() {
        this.luku = 0;
        this.tarkistus = false;
    }

    public int arvo() {
        return this.luku;
    }

    public void lisaa() {
        this.luku += 1;
    }

    public void vahenna() {
        if (!(tarkistus == true && this.luku <= 0)) {
            this.luku -= 1;
        }
    }

    public void lisaa(int lisays) {
        if (!(lisays < 0)) {
            this.luku += lisays;
        }
    }

    public void vahenna(int vahennys) {
        if (!(vahennys < 0)) {
            this.luku -= vahennys;

            if (tarkistus == true && this.luku < 0) {
                this.luku = 0;
            }
        }
    }
}
