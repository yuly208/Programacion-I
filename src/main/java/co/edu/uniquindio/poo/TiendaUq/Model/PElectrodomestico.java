package co.edu.uniquindio.poo.TiendaUq.Model;

public class PElectrodomestico extends Producto {

    private int garantia;

    public PElectrodomestico(String codigo, String nombre, double precioUnitario, int cantidad, int garantia) {
        super(codigo, nombre, precioUnitario, cantidad);
        this.garantia = garantia;
    }

    public int getGarantia() {
        return garantia;
    }

    public void setGarantia(int garantia) {
        this.garantia = garantia;
    }

    @Override
    public String toString() {
        return "PElectrodomestico [garantia=" + garantia + " meses, " + super.toString() + "]";
    }
}
