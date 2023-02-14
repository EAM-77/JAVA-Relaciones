/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.logging.Logger;

/**
 *
 * @author A288808
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private Integer edad;
    private Integer DNi;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, Integer edad, Integer DNi, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.DNi = DNi;
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Integer getDNi() {
        return DNi;
    }

    public void setDNi(Integer DNi) {
        this.DNi = DNi;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", DNi=" + DNi + ", perro=" + perro + '}';
    }
   
    
    
    
}
