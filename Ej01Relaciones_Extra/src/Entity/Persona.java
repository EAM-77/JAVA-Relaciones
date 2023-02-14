package Entity;

public class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    private double dni;
    private Perro dog;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, double dni, Perro dog) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.dni = dni;
        this.dog = dog;
    }

    public Persona(String nombre, String apellido, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDni() {
        return dni;
    }

    public void setDni(double dni) {
        this.dni = dni;
    }

    public Perro getDog() {
        return dog;
    }

    public void setDog(Perro dog) {
        this.dog = dog;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", dni=" + dni + ", dog=" + dog + '}';
    }
    
}
