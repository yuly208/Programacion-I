package co.edu.uniquindio.poo.TiendaUq.Model;

public class CCorporativo extends Cliente {

    private String nit;
    private double descuentoEspecial;

    public CCorporativo(String nombre, String cedula, String direccion, String nit, double descuentoEspecial) {
        super(nombre, cedula, direccion);
        this.nit = nit;
        this.descuentoEspecial = descuentoEspecial;
    }

    @Override
    public double calcularBeneficio() {
        return descuentoEspecial;
    }

    public String getNit() {
        return nit;
    }

    public double getDescuentoEspecial() {
        return descuentoEspecial;
    }

    @Override
    public String toString() {
        return "CCorporativo [nit=" + nit + ", descuentoEspecial=" + descuentoEspecial + ", " + super.toString() + "]";
    }
}
