public class Ihminen {
    private String nimi;
    private int    ika;

    public Ihminen(String nimi) {
        this.nimi = nimi;
        this.ika = 0;
    }

    public String nimeni() {
        return nimi;
    }

    public void vanhene() {
        ika++;
    }

    public int ika() {
        return ika;
    }

    public String toString() {
        return "Nimi: " + nimi + ", ikä " + ika;
    }
}
