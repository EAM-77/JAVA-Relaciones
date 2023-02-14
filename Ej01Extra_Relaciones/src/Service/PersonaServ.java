package Service;

import Entity.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonaServ {
    Scanner sRead = new Scanner(System.in);
    
    public ArrayList<Persona> crearPersona (){
        String op;
        ArrayList<Persona> listaPersonas = new ArrayList();
        do {
            Persona p = new Persona();
            System.out.println("Ingrese nombre:");
            p.setNombre(sRead.nextLine());
            System.out.println("Ingrese apellido:");
            p.setApellido(sRead.nextLine());
            System.out.println("Ingrese la edad:");
            p.setEdad(sRead.nextInt());
            System.out.println("Ingerse documento: ");
            p.setDni(sRead.nextInt());
//            System.out.println("Ingrese su perro: ");
//            p.setDog();
//            p.getDog().setNameD(sRead.next());
            listaPersonas.add(p);

            System.out.println("¿Desea agregar otro registro?");
            op = sRead.next();
        } while (!op.equalsIgnoreCase("n"));
        System.out.println("Registro crado...");
        return listaPersonas;
    }
    public void muestra (ArrayList<Persona> listaPersonas){
        System.out.println(listaPersonas);
    }
}
