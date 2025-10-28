package co.edu.uniquindio.poo.TiendaUq.Model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Factura {

    private String codigo;
    private LocalDate fecha;
    private double total;
    private List<DetalleFactura> listaDetalles;

    public Factura(String codigo, LocalDate fecha) {
        this.codigo = codigo;
        this.fecha = fecha;
        this.listaDetalles = new ArrayList<>();
        this.total = 0;
    }

    public void agregarDetalle(DetalleFactura detalle) {
        listaDetalles.add(detalle);
    }

    public void calcularTotal() {
        total = 0;
        for (DetalleFactura d : listaDetalles) {
            total += d.getSubtotal();
        }
    }

    public String getCodigo() {
        return codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getTotal() {
        return total;
    }

    public List<DetalleFactura> getListaDetalles() {
        return listaDetalles;
    }

    @Override
    public String toString() {
        return "Factura [codigo=" + codigo + ", fecha=" + fecha + ", total=" + total + "]";
    }
}
