/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package siirrettava;

import java.util.ArrayList;

/**
 *
 * @author vellu
 */
public class Lauma implements Siirrettava {

    private ArrayList<Siirrettava> lauma;
    
    public Lauma() {
        this.lauma = new ArrayList<>(); 
    }

    public String toString() {
        String sijainti = "";
        sijainti = this.lauma.stream().map((elio) -> elio + "\n").reduce(sijainti, String::concat);
        return sijainti;
    }

    public void lisaaLaumaan(Siirrettava siirrettava) {
        this.lauma.add(siirrettava);
    }

    public void siirra(int dx, int dy) {
        for (Siirrettava lauma1 : this.lauma) {
            lauma1.siirra(dx, dy);
        }
    }
}
