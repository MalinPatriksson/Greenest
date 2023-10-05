package Växter;
import Modell.Växt;

// Ärver växt
public class Kaktus extends Växt {

    public Kaktus(String namn, double höjd) {
        super(namn, höjd);
    }
    int mineralvatten = 2;

    @Override
    public double beräknaVätskaMängd() {
        return mineralvatten;
    }

    @Override
    public String getVätskaTyp() {
        return "mineralvatten";
    }
}
