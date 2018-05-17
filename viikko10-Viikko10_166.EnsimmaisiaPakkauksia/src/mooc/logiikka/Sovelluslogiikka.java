/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mooc.logiikka;

import mooc.ui.Kayttoliittyma;
import mooc.ui.Tekstikayttoliittyma;

/**
 *
 * @author vellu
 */
public class Sovelluslogiikka {

    private Kayttoliittyma muuttuja;

    public Sovelluslogiikka(Kayttoliittyma kayttoliittyma) {
        this.muuttuja = kayttoliittyma;
    }

    public void suorita(int montaKertaa) {
        for (int i = 0; i < montaKertaa; i++) {
            System.out.println("Sovelluslogiikka toimii");
            muuttuja.paivita();
        }
    }
}
