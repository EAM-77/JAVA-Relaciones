package ej03relaciones;

import Entidades.Carta;
import Servicios.CartaService;
import java.util.ArrayList;

public class Ej03Relaciones {

    public static void main(String[] args) {
      
        CartaService sc = new CartaService ();
        ArrayList<Carta> b1 = sc.crearBaraja();
        sc.nJuego(b1);
        }
}
