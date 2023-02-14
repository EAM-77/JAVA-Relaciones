package Entidades;

public class Poliza {
  
       private Double nPoliza;
       private Cliente cliente;
       private Auto auto;
       private String fInicio;
       private String fFin;
       private double cantidadCuotas;
       private String fPago;
       private double montoAsegurado;
       private String granizo;
       private double montoGranizo;
       private String tCobertura;

    public Poliza() {
    }

    public Poliza(Double nPoliza, Cliente cliente, Auto auto, String fInicio, String fFin, double cantidadCuotas, String fPago, double montoAsegurado, String granizo, double montoGranizo, String tCobertura) {
        this.nPoliza = nPoliza;
        this.cliente = cliente;
        this.auto = auto;
        this.fInicio = fInicio;
        this.fFin = fFin;
        this.cantidadCuotas = cantidadCuotas;
        this.fPago = fPago;
        this.montoAsegurado = montoAsegurado;
        this.granizo = granizo;
        this.montoGranizo = montoGranizo;
        this.tCobertura = tCobertura;
    }

    public Double getnPoliza() {
        return nPoliza;
    }

    public void setnPoliza(Double nPoliza) {
        this.nPoliza = nPoliza;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Auto getAuto() {
        return auto;
    }

    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    public String getfInicio() {
        return fInicio;
    }

    public void setfInicio(String fInicio) {
        this.fInicio = fInicio;
    }

    public String getfFin() {
        return fFin;
    }

    public void setfFin(String fFin) {
        this.fFin = fFin;
    }

    public double getCantidadCuotas() {
        return cantidadCuotas;
    }

    public void setCantidadCuotas(double cantidadCuotas) {
        this.cantidadCuotas = cantidadCuotas;
    }

    public String getfPago() {
        return fPago;
    }

    public void setfPago(String fPago) {
        this.fPago = fPago;
    }

    public double getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(double montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public String isGranizo() {
        return granizo;
    }

    public void setGranizo(String granizo) {
        this.granizo = granizo;
    }

    public double getMontoGranizo() {
        return montoGranizo;
    }

    public void setMontoGranizo(double montoGranizo) {
        this.montoGranizo = montoGranizo;
    }

    public String gettCobertura() {
        return tCobertura;
    }

    public void settCobertura(String tCobertura) {
        this.tCobertura = tCobertura;
    }

    @Override
    public String toString() {
        return "Poliza{" + "nPoliza=" + nPoliza + ", cliente=" + cliente + ", auto=" + auto + ", fInicio=" + fInicio + ", fFin=" + fFin + ", cantidadCuotas=" + cantidadCuotas + ", fPago=" + fPago + ", montoAsegurado=" + montoAsegurado + ", granizo=" + granizo + ", montoGranizo=" + montoGranizo + ", tCobertura=" + tCobertura + '}';
    }

}