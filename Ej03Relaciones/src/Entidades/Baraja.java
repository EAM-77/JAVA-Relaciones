package Entidades;

import java.util.ArrayList;

public class Baraja {
    ArrayList<Carta> baraja;
    
    public Baraja() {
    }
    public Baraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }
    
    public ArrayList<Carta> getBaraja() {
        return baraja;
    }
    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    @Override
    public String toString() {
        return "Baraja{" + "baraja=" + baraja + '}';
    }   
}
