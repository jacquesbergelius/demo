import javax.swing.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Opiskelija extends Ihminen {
    private int    pisteet;

    public Opiskelija(String nimi) {
        super(nimi);
        this.pisteet = 0;
    }

    public int suorituksia() {
        return pisteet;
    }

    public void suoritus(int pisteita) {
        pisteet += pisteita;
    }

    public String toString() {
        return "Opiskelija: " + super.toString() + ", pisteet: " + pisteet;
    }

    public static void main(String[] args) {
        List<Ihminen> opiskelijaLista = new ArrayList<>();

        opiskelijaLista.add(new Opiskelija("Isaskar Keturi"));
        opiskelijaLista.add(new Opiskelija("Enzio Benzino"));
        opiskelijaLista.add(new Opettaja("Alfredo Garcia"));

        Opiskelija op = new Opiskelija("Gabriel Romppanen");
        opiskelijaLista.add(op);

        /*for (int i = 0; i < 30; i++)
            opettaja1.vanhene();

        for (Opiskelija opiskelija : opiskelijaLista) {
            for (int i = 0; i < 18; i++)
                opiskelija.vanhene();
        }*/

        for (Ihminen ihminen : opiskelijaLista) {
            for (int i = 0; i < 4; i++) {
                ihminen.vanhene();
            }
        }

        for (Ihminen ihminen : opiskelijaLista)
            System.out.println(ihminen);
    }
}

