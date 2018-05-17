
public class Lukutilasto {

    private int lukujenMaara;
    private int summa;

    public Lukutilasto() {
        this.lukujenMaara = 0;
        this.summa = 0;
    }

    public void lisaaLuku(int luku) {
        this.summa += luku;
        this.lukujenMaara += 1;
    }

    public int haeLukujenMaara() {
        return this.lukujenMaara;
    }

    public int summa() {
        return this.summa;
    }

    public double keskiarvo() {
        double keskiarv = 0;
        keskiarv = this.lukujenMaara;
        if (this.lukujenMaara == 0) {
            this.lukujenMaara = 1;
        }
        keskiarv = (double) this.summa / this.lukujenMaara;
        return keskiarv;
    }
}
