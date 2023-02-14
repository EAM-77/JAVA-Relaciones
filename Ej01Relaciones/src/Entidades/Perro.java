package Entidades;

public class Perro {
    
    private String nombre;
    private String raza;
    private Integer edad;
    private String tamanio;

    public Perro() {
    }

    public Perro(String nombre, String raza, Integer edad, String tamanio) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.tamanio = tamanio;
    }

    public String getPerro() {
        return nombre;
    }

    public void setPerro(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Perro{" + "perro=" + nombre + ", raza=" + raza + ", edad=" + edad + ", tamanio=" + tamanio + '}';
    }
    
}
