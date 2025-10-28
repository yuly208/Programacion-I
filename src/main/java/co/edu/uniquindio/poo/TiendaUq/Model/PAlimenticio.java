package co.edu.uniquindio.poo.TiendaUq.Model;

import java.time.LocalDate;

public class PAlimenticio extends Producto {

    private LocalDate fechaVencimiento;

    public PAlimenticio(String codigo, String nombre, double precioUnitario, int cantidad, LocalDate fechaVencimiento) {
        super(codigo, nombre, precioUnitario, cantidad);
        this.fechaVencimiento = fechaVencimiento;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    @Override
    public String toString() {
        return "PAlimenticio [fechaVencimiento=" + fechaVencimiento + ", " + super.toString() + "]";
    }
}
