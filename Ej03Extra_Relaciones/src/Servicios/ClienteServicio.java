package Servicios;

import Entidades.Cliente;
import java.util.ArrayList;
import java.util.Scanner;

public class ClienteServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList<Cliente> crearCliente (){
        ArrayList<Cliente> c = new ArrayList();
        String option;
        System.out.println("+++ Bienvenido al registro de clientes +++");
        
        do{
            // creamos el objeto "Cliente" y seteamos sus atributos
            Cliente customer = new Cliente ();
            System.out.println("Ingrese el nombre: ");
            customer.setNombre(leer.nextLine());
            System.out.println("Ingrese el apellido: ");
            customer.setApellido(leer.nextLine());
            System.out.println("Ingrese nro de documento: ");
            customer.setDni(leer.nextLine());    
            System.out.println("Ingrese un mail: ");
            customer.setMail(leer.nextLine());
            System.out.println("Ingrese un domicilio: ");
            customer.setDomicilio(leer.nextLine());
            System.out.println("Ingrese teléfono: ");
            customer.setCel(leer.nextLine());
            // agregamos el objeto "Cliente" al ArrayList
            c.add(customer);
            
            System.out.println("Se registró al cliente satisfactoriamente...");
            System.out.println("¿Desea registrar otro cliente? S/N: ");
            option = leer.next();
        } while (!option.equalsIgnoreCase("N"));
        
        System.out.println("Registro completo, Gracias!");
        // retornamos ArrayList mediante su nombre
        return c;
    }
    public void listadoClientes(ArrayList<Cliente> c){
        // Imprime el listado de clientes actualizado
        System.out.println(c.toString() + "\n");
    }
}
