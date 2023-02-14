package Entidades;

public class Auto {
    private String marca;
    private String modelo;
    private Integer anio;
    private String nMotor;
    private String nChasis;
    private String color;
    private String tipo;

    public Auto() {
    }

    public Auto(String marca, String modelo, Integer anio, String nMotor, String nChasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.nMotor = nMotor;
        this.nChasis = nChasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getnMotor() {
        return nMotor;
    }

    public void setnMotor(String nMotor) {
        this.nMotor = nMotor;
    }

    public String getnChasis() {
        return nChasis;
    }

    public void setnChasis(String nChasis) {
        this.nChasis = nChasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Autos{" + "marca: " + marca + ", modelo: " + modelo + ", anio: " + anio + ", nMotor. " + nMotor + ", Chasis: " + nChasis + ", color: " + color + ", tipo: " + tipo + '}';
    }
}
