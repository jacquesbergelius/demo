public class Opettaja extends Ihminen {
    private int    palkka;

    public Opettaja(String nimi) {
        super(nimi);
        palkka = 0;
    }

    public int palkka() {
        return palkka;
    }

    public void vanhene() {
        super.vanhene();
        System.out.println("Ikä tuo kokemusta");
    }

    public void palkankorotus(int uusipalkka) {
        palkka = uusipalkka;
    }

    public String toString() {
        return "Opettaja: " + super.toString() + ", palkka: " + palkka;
    }
}
