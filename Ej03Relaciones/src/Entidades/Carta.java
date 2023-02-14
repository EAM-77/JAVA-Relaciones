package Entidades;

public class Carta {
    private int numCarta;
    private String paloCarta;

    public Carta() {
    }

    public Carta(int numCarta, String paloCarta) {
        this.numCarta = numCarta;
        this.paloCarta = paloCarta;
    }

    public int getNumCarta() {
        return numCarta;
    }

    public void setNumCarta(int numCarta) {
        this.numCarta = numCarta;
    }

    public String getPaloCarta() {
        return paloCarta;
    }

    public void setPaloCarta(String paloCarta) {
        this.paloCarta = paloCarta;
    }

    @Override
    public String toString() {
        return "numCarta=" + numCarta + " paloCarta=" + paloCarta + "\n";
    }
}
