package Växter;
import Modell.Växt;

// Ärver växt
public class Palm extends Växt {

    public Palm(String namn, double höjd) {
        super(namn, höjd);
    }

    double kranvatten = 0.5 * getHöjd();

    @Override
    public double beräknaVätskaMängd() {
        return kranvatten;
    }

    @Override
    public String getVätskaTyp() {
        return "kranvatten";
    }
}