package Main;

import Modell.Växt;
import Växter.Kaktus;
import Växter.KöttätandeVäxt;
import Växter.Palm;

import javax.swing.*;
import java.util.ArrayList;



public class Huvudprogram {
    Huvudprogram() {
        // Skapa en arraylist för att lagra växtobjekt av olika typer (polymorfism)
        ArrayList<Växt> växter = new ArrayList<>();

        växter.add(new Kaktus("Igge", 0.2));
        växter.add(new Palm("Laura", 5));
        växter.add(new KöttätandeVäxt("Meatloaf", 0.7));
        växter.add(new Palm("Olof", 1));

        while (true) {
            String växtNamn = JOptionPane.showInputDialog("Vilken växt ska få vätska?");
            if (växtNamn == null || växtNamn.equalsIgnoreCase("Avsluta")) {
                break;
            }

            boolean växtHittad = false;

            // For-loop för att iterera över alla växtobjekt i listan
            for (Växt växt : växter) {
                if (växt.getNamn().equalsIgnoreCase(växtNamn)) {
                   växtHittad = true;

                    // Använder interface för att beräkna vätskemängd och vätskans typ
                    double vätskaMängd = växt.beräknaVätskaMängd(); // Polymorfism används här
                    String vätskaTyp = växt.getVätskaTyp(); // Polymorfism används här

                    if (vätskaTyp.equalsIgnoreCase("mineralvatten")) {
                        JOptionPane.showMessageDialog(null, "Ge " + växt.getNamn() + " " + vätskaMängd + " cl " + vätskaTyp);
                    } else {
                        JOptionPane.showMessageDialog(null,
                                "Ge " + växt.getNamn() + " " + vätskaMängd + " liter " + vätskaTyp);
                    }
                    break;
                }
            }
                // Felmeddelande om växten inte hittades
                if (!växtHittad) {
                    JOptionPane.showMessageDialog(null, "Okänd växt. Försök igen!");
                }
            }

            JOptionPane.showMessageDialog(null, "Tack för att du använt Greenest växthotell!");
        }



        public static void main (String[]args){

            // Skapar en instans av Huvudprogram-klassen för att köra programmet
            Huvudprogram h = new Huvudprogram();
        }
    }
