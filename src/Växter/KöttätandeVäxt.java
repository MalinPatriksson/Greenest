package Växter;
import Modell.Växt;

public class KöttätandeVäxt extends Växt {
    public KöttätandeVäxt(String namn, double höjd) {
        super(namn, höjd);
    }

    double proteindryck = 0.1+(0.2*getHöjd());

    @Override
    public double beräknaVätskaMängd() {
        return proteindryck;
    }

    @Override
    public String getVätskaTyp() {
        return "proteindryck";
    }

}
