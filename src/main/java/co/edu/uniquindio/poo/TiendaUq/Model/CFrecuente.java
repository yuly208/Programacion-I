package co.edu.uniquindio.poo.TiendaUq.Model;

public class CFrecuente extends Cliente {

    private double puntosFidelidad;

    public CFrecuente(String nombre, String cedula, String direccion, double puntosFidelidad) {
        super(nombre, cedula, direccion);
        this.puntosFidelidad = puntosFidelidad;
    }

    @Override
    public double calcularBeneficio() {
        return puntosFidelidad * 0.05; 
    }

    public double getPuntosFidelidad() {
        return puntosFidelidad;
    }

    public void setPuntosFidelidad(double puntosFidelidad) {
        this.puntosFidelidad = puntosFidelidad;
    }

    @Override
    public String toString() {
        return "CFrecuente [puntosFidelidad=" + puntosFidelidad + ", " + super.toString() + "]";
    }
}
