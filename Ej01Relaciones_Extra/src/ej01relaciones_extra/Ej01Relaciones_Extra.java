package ej01relaciones_extra;

import Entity.Perro;
import Entity.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class Ej01Relaciones_Extra {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        ArrayList<Perro> listPerros = new ArrayList();
        listPerros.add(new Perro("Chano", "Callejero", 2, "Mediano"));
        listPerros.add(new Perro("Luna", "Callejera", 3, "Mediana"));
        listPerros.add(new Perro("Sacho", "Doberman", 3, "Grande"));
        listPerros.add(new Perro("Sandy", "Beagle", 1, "Chico"));
        listPerros.add(new Perro("Spaiky", "Obejero", 1, "Grande"));

        ArrayList<Persona> listPersonas = new ArrayList();
        listPersonas.add(new Persona("Joha", "Sando", 31));
        listPersonas.add(new Persona("Dani", "Sando", 53));
        listPersonas.add(new Persona("Tito", "Marti", 73));
        listPersonas.add(new Persona("Sofi", "Marti", 7));

        System.out.println("Por favor, ingrese su nombre...");
        String opPerson = s.nextLine();
        for (Persona auxPers : listPersonas) {
            if (auxPers.getNombre().equalsIgnoreCase(opPerson)) {
                System.out.println("Perros disponibles para adopción: \n" + listPerros.toString());
                System.out.println("¿Que perro le gustaría adoptar? ");
                String option = s.nextLine();
                for (Perro opDog : listPerros) {
                    if (opDog.getName().equalsIgnoreCase(option)) {
                        System.out.println("Felicitaciones, el perro es tuyo...");
                        auxPers.setDog(opDog);
                        listPerros.remove(opDog);
                        break;
                    }
                }
            }
        }
    }
}
