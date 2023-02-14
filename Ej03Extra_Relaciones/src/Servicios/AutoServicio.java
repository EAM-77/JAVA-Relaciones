package Servicios;

import Entidades.Auto;
import java.util.ArrayList;
import java.util.Scanner;

public class AutoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList<Auto> creaAuto (){
        ArrayList<Auto> a = new ArrayList();
        String option;
        
        System.out.println("+++ Bienvienido al registro de Vehiculos +++ ");
        do {
            Auto car = new Auto ();
            System.out.println("Ingrese la Marca: ");
            car.setMarca(leer.nextLine());
            System.out.println("Ingrese el Modelo: ");
            car.setModelo(leer.nextLine());
            System.out.println("Ingrese Año: ");
            car.setAnio(leer.nextInt());
            System.out.println("Ingrese número de motor: ");
            car.setnMotor(leer.nextLine());
            System.out.println("Ingrese número de chasis: ");
            car.setnChasis(leer.nextLine());
            System.out.println("Ingrese color: ");
            car.setColor(leer.nextLine());
            System.out.println("Ingrese tipo de vehiculo: ");
            car.setTipo(leer.nextLine());
            a.add(car);
            
            System.out.println(" + Registro completo + ");
            System.out.println("¿Desea ingresar otro vehículo? S/N: ");
            option = leer.nextLine();
            
        } while (!option.equalsIgnoreCase("N"));
        
        System.out.println("Gracias!");
        return a;
    }
    public void listadoAutos(ArrayList<Auto> a){
        System.out.println(a.toString() + "\n");
    }
}
