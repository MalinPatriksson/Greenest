package Modell;

// Grundklass för växter som implementerar interface Näringsvätska
public abstract class Växt implements Näringsvätska {

    // Privata och kan inte nås direkt från andra klasser
    private String namn;
    private double höjd;

    public Växt(String namn, double höjd) {
        this.namn = namn;
        this.höjd = höjd;
    }

    public String getNamn() {
        return namn;
    }
    public double getHöjd() {
        return höjd;
    }
}

