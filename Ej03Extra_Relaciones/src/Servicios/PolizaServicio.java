package Servicios;

import Entidades.Poliza;
import java.util.ArrayList;
import java.util.Scanner;

public class PolizaServicio {
    
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public ArrayList<Poliza> creaPoliza(){
        ArrayList<Poliza> listaPolizas = new ArrayList();
        String option;
        
        // Ojo! al crear la póliza debo vincular la misma a un cliente y su auto.
        
        System.out.println("+++ Carga de Poliza +++");
        do {
            Poliza pol = new Poliza();
            pol.setnPoliza(Math.random()*1000000);
                
            // acá debería ingresar el cliente y el auto.
            // ingresar x documento hacer una busqueda en listado sino está crear cliente y auto
            // si está, traer los datos completos y el auto
            
            System.out.println("Ingrese la fecha de emisión: ");
            pol.setfInicio(leer.nextLine());
            System.out.println("La fecha de finalización es: ");
            pol.setfFin(leer.nextLine());
            System.out.println("Ingrese la Suma Total Asegurada: ");
            pol.setMontoAsegurado(leer.nextDouble());
            cuotas(pol);
            formaPago(pol);
            granizo(pol);
            tCobertura(pol);
            
            listaPolizas.add(pol);
            
            System.out.println(" + + + Registro Completo + + +");
            System.out.println("Desea crear otra Póliza?");
            option = leer.nextLine();
            
        } while (!option.equalsIgnoreCase("N"));
        
        System.out.println("Generación de Pólizas finalizada...\n");
        return listaPolizas;
    }
    private void cuotas(Poliza pol){
        System.out.println("Cantidad de cuotas para la póliza:");
        System.out.println("1 - 3 Cuotas.");
        System.out.println("2 - 6 Cuotas.");
        System.out.println("3 - 9 Cuotas.");
        System.out.println("4 - 12 Coutas.");
        switch (leer.nextInt()){
            case 1:
                pol.setCantidadCuotas(3);
                break;
            case 2:
                pol.setCantidadCuotas(6);
                break;
            case 3:
                pol.setCantidadCuotas(9);
                break;
            case 4:
                pol.setCantidadCuotas(12);
                break;
        }
    }
    
    private void formaPago(Poliza pol){
            System.out.println("Eliga la forma de pago:");
            System.out.println("1 - Efectivo");
            System.out.println("2 - Débito Automático");
            switch (leer.nextInt()){
                case 1:
                    pol.setfPago("Efectivo");
                    break;
                case 2:
                    pol.setfPago("Débito Automátio");
                    break;
            }
    }
    private void granizo(Poliza pol){
            System.out.println("Incluye cobertura de granizo?:");
            System.out.println("1 - Sí");
            System.out.println("2 - No");
            int option = leer.nextInt();
            switch (option){
                case 1:
                    pol.setGranizo("Sí");
                    break;
                case 2:
                    pol.setGranizo("No");
                    break;
            }
            /// falta corregir tema de presupuesto y demás variables relacionadas
            if (true) {
            
        }
            
    }
    private void tCobertura(Poliza pol){
            System.out.println("Eliga el Tipo de cobertura:");
            System.out.println("A - Todo Riesgo.");
            System.out.println("B - Terceros Completo.");
            System.out.println("C - Responzabilidad Civil.");
            switch (leer.nextLine()){
                case "A":
                    pol.settCobertura("Todo Riesgo");
                    break;
                case "B":
                    pol.settCobertura("Terceros Completo");
                    break;
                case "C":
                    pol.settCobertura("Responzabilidad Civil");
            }
    }
    public void polizasEmitidas(ArrayList<Poliza> listaPolizas){
        System.out.println(listaPolizas.toString() + "\n");
    }
}
