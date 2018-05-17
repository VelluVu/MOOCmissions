
public class Paaohjelma {

    public static void main(String[] args) {
        // tee tänne testipääohjelmia
        Maksukortti pekanKortti = new Maksukortti(10);
        
        System.out.println("rahaa" + pekanKortti.saldo());
        boolean onnistuiko = pekanKortti.otaRahaa(8);
        System.out.println("onnistuiko otto: " + onnistuiko);
        System.out.println("rahaa " + pekanKortti.saldo());
        
        onnistuiko = pekanKortti.otaRahaa(4);
        System.out.println("onnistuiko otto: " + onnistuiko);
        System.out.println("rahaa " + pekanKortti.saldo());
        
        System.out.println("");
        
        Kassapaate unicafeExactum2 = new Kassapaate();
        
        double vaihtorahaa = unicafeExactum2.syoEdullisesti(10);
        System.out.println("vaihtorahaa jäi " + vaihtorahaa);
        
        vaihtorahaa = unicafeExactum2.syoEdullisesti(5);
        System.out.println("vaihtorahaa jäi " + vaihtorahaa);
        
        vaihtorahaa = unicafeExactum2.syoMaukkaasti(4.3);
        System.out.println("vaihtorahaa jäi " + vaihtorahaa);
        
        System.out.println(unicafeExactum2);
        
        System.out.println("");
        
        Kassapaate unicafeExactum3 = new Kassapaate();
        
        vaihtorahaa = unicafeExactum3.syoEdullisesti(10);
        System.out.println("vaihtorahaa jäi " + vaihtorahaa);
        
        Maksukortti antinKortti = new Maksukortti (7);
        
        boolean onnistuiko2 = unicafeExactum3.syoMaukkaasti(antinKortti);
        System.out.println("riittikö raha: " + onnistuiko2);
        onnistuiko2 = unicafeExactum3.syoMaukkaasti(antinKortti);
        System.out.println("riittikö raha: " + onnistuiko2);
        onnistuiko2 = unicafeExactum3.syoEdullisesti(antinKortti);
        System.out.println("riittikö raha: " + onnistuiko2);
        
        System.out.println(unicafeExactum3);
        
        System.out.println("");
        
        Kassapaate unicafeExactum4 = new Kassapaate();
        System.out.println(unicafeExactum4);
        
        Maksukortti antinKortti2 = new Maksukortti(2);
        
        System.out.println("kortilla rahaa " + antinKortti2.saldo() + " euroa");
        
        boolean onnistuiko3 = unicafeExactum4.syoMaukkaasti(antinKortti2);
        System.out.println("riittikö raha: " + onnistuiko3);
    
        unicafeExactum4.lataaRahaaKortille(antinKortti2, 100);
        
        onnistuiko3 = unicafeExactum4.syoMaukkaasti(antinKortti2);
        System.out.println("riittikö raha: " + onnistuiko3);
        
        System.out.println("kortilla rahaa " + antinKortti2.saldo() + " euroa");
        
        System.out.println(unicafeExactum4);
    }   
}

