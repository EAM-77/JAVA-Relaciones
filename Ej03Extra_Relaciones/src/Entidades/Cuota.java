package Entidades;

import java.util.Date;

public class Cuota {
    
    private Poliza numPoliza;
    private int numCuota;
    private int montoTotalCuota;
    private boolean pago;
    private Date vencimiento;
    private String fpago;

    public Cuota() {
    }

    public Cuota(Poliza numPoliza, int numCuota, int montoTotalCuota, boolean pago, Date vencimiento, String fpago) {
        this.numPoliza = numPoliza;
        this.numCuota = numCuota;
        this.montoTotalCuota = montoTotalCuota;
        this.pago = pago;
        this.vencimiento = vencimiento;
        this.fpago = fpago;
    }

    public Poliza getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(Poliza numPoliza) {
        this.numPoliza = numPoliza;
    }

    public int getNumCuota() {
        return numCuota;
    }

    public void setNumCuota(int numCuota) {
        this.numCuota = numCuota;
    }

    public int getMontoTotalCuota() {
        return montoTotalCuota;
    }

    public void setMontoTotalCuota(int montoTotalCuota) {
        this.montoTotalCuota = montoTotalCuota;
    }

    public boolean isPago() {
        return pago;
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public Date getVencimiento() {
        return vencimiento;
    }

    public void setVencimiento(Date vencimiento) {
        this.vencimiento = vencimiento;
    }

    public String getFpago() {
        return fpago;
    }

    public void setFpago(String fpago) {
        this.fpago = fpago;
    }

    @Override
    public String toString() {
        return "Cuota{" + "numPoliza=" + numPoliza + ", numCuota=" + numCuota + ", montoTotalCuota=" + montoTotalCuota + ", pago=" + pago + ", vencimiento=" + vencimiento + ", fpago=" + fpago + '}';
    }    
}
