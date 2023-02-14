package ej01extra_relaciones;

import Entity.Persona;
import Service.PersonaServ;
import java.util.ArrayList;

public class Ej01Extra_Relaciones {

    public static void main(String[] args) {
   
        PersonaServ people = new PersonaServ ();
        ArrayList<Persona> listaPersonas = people.crearPersona();
        people.muestra(listaPersonas);
    }
    
}
