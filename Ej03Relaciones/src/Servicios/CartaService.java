package Servicios;

import Entidades.Carta;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class CartaService {

    Scanner s = new Scanner(System.in);
    ArrayList <Carta> baraja = new ArrayList();

    public ArrayList<Carta> crearBaraja() {

        String[] palos = {"Espadas", "Oro", "Bastos", "Copas"};
        for (int j = 0; j < 4; j++) {
            for (int i = 1; i <= 12; i++) {
                if (i != 8 && i != 9) {
                    Carta c = new Carta();
                    c.setNumCarta(i); // setea el nro de carta.
                    c.setPaloCarta(palos[j]); // setea el palo.
                    baraja.add(c);
                }
            }
        }
        return baraja;
    }
    public void barajar(ArrayList<Carta> baraja){
       Collections.shuffle(baraja);
       baraja.forEach((carta) -> {
           System.out.println(carta.toString());
        });
    }
    /*
    siguienteCarta(): devuelve la siguiente carta que está en la baraja, 
    cuando no haya más o se haya llegado al final;
    se i
    ndica al usuario que no hay más cartas.
    */
    
    public int siguienteCarta(ArrayList<Carta> baraja,int posicion){
        if (posicion < baraja.size()) {
            System.out.println(baraja.get(posicion));
        }else System.out.println("No hay más"); 
        return posicion++;
    }
    public int darCartas(ArrayList<Carta> baraja,int posicion){
        System.out.println("cuanta carta quere?");
        int quere = s.nextInt();
        for (int i = posicion; i < (posicion + quere); i++) {
            System.out.println(baraja.get(i));
        }
        return posicion + quere;
    }

    public void cartasDisponibles(ArrayList<Carta> baraja, int posicion) {
        System.out.println("La cantidad de cartas disonibles es: " + (baraja.size() - posicion));
    }

    public void cartasMonton(ArrayList<Carta> baraja, int posicion) {
        if (posicion == 0) {
            System.out.println("No se repartieron cartas...");
        } else {
            System.out.println("Las cartas que salieron son: ");
            for (int i = 0; i < posicion; i++) {
                System.out.println(baraja.get(i));
            }
        }
    }
    public void mostrarBaraja(ArrayList<Carta> baraja, int posicion){
        System.out.println("Las cartas disponibles en baraja son: ");
        System.out.println(" ");
        for (int i = posicion; i < baraja.size(); i++) {
                System.out.println(baraja.get(i));
        }
    }
    public void nJuego(ArrayList<Carta> baraja){
        int posicion=0;
        int xo;
        
        do {
        System.out.println("...MENU PRINCIPAL...\n");
        System.out.println("1 - Barajar...");
        System.out.println("2 - Dar cartas...");
        System.out.println("3 - Siguiente carta...");
        System.out.println("4 - Cartas disponibles...");
        System.out.println("5 - Cartas del monton...");
        System.out.println("6 - Mostrar baraja...");
        System.out.println("7 - Salir...");
        xo = s.nextInt();
        
        switch (xo){
            case 1: 
                barajar(baraja);
                break;
            case 2:
                posicion = darCartas(baraja, posicion);
                break;
            case 3:
                posicion = siguienteCarta(baraja, posicion);
                break;
            case 4:
                cartasDisponibles(baraja, posicion);
                break;
            case 5:
                cartasMonton(baraja, posicion);
                break;
            case 6:
                mostrarBaraja(baraja, posicion);
                break;
            default:
                ;
        }
        }while (xo!=7);
    }
}
