
package ej01relaciones;

import Entidades.Perro;
import Entidades.Persona;

public class Ej01Relaciones {

    public static void main(String[] args) {
        
        Persona p1 = new Persona ();
        p1.setNombre("Joha");
        p1.setApellido("Sandoval");
        p1.setDNI(4566945);
        p1.setEdad(31);
        
        Persona p2 = new Persona ();
        p2.setNombre("Sofi");
        p2.setApellido("Sandoval");
        p2.setDNI(31231231);
        p2.setEdad(7);
        
        Perro dog1 = new Perro ();
        dog1.setPerro("Chano");
        dog1.setEdad(11);
        dog1.setRaza("Callejero");
        dog1.setTamanio("Mediano");
        
        Perro dog2 = new Perro ();
        dog2.setPerro("Nina");
        dog2.setEdad(2);
        dog2.setRaza("Obejero Belga");
        dog2.setTamanio("Grande");
        
        p1.setPerro(dog2);
        p2.setPerro(dog1);
        
        System.out.print(p1.toString()+"\n");
        System.out.print(dog2.toString()+"\n");
        System.out.println(" + + + + ");
        
        System.out.print(p2.toString() +"\n");
        System.out.print(dog1.toString()+"\n");
        System.out.println("");        
    }
}
