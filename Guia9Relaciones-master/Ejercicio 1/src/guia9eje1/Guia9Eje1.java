/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package guia9eje1;

import Entidades.Perro;
import Entidades.Persona;

/**
 *
 * @author A288808
 */
public class Guia9Eje1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Perro p1 = new Perro();
        Perro p2 = new Perro();
        
        Persona pe1 = new Persona();
        Persona pe2 = new Persona();
        //Perro1
        p1.setNombre("pepe");
        p1.setRaza("Callejero");
        p1.setEdad(5);
        p1.setTamanio("chico");
        //Perro2
        p2.setNombre("carla");
        p2.setRaza("chiguagua");
        p2.setEdad(7);
        p2.setTamanio("mini");
        //Persona 1
        pe1.setNombre("Juan");
        pe1.setApellido("Perez");
        pe1.setDNi(28939455);
        pe1.setEdad(35);
        pe1.setPerro(p1);
        //Persona 2
        pe2.setNombre("Carlos");
        pe2.setApellido("darcia");
        pe2.setDNi(28939456);
        pe2.setEdad(41);
        pe2.setPerro(p2);
        
        System.out.println("persona 1");
        System.out.println(pe1.toString());
        System.out.println("Persona 2");
        System.out.println(pe2.toString());
        
    }
    
}
