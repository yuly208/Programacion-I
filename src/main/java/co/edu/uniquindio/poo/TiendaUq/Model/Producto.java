package co.edu.uniquindio.poo.TiendaUq.Model;

import java.util.ArrayList;
import java.util.List;

public class Producto {

    private String codigo;
    private String nombre;
    private double precioUnitario;
    private int cantidad;
    private List<DetalleFactura> listaDetalles;

    public Producto(String codigo, String nombre, double precioUnitario, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.listaDetalles = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public List<DetalleFactura> getListaDetalles() {
        return listaDetalles;
    }

    @Override
    public String toString() {
        return "Producto [codigo=" + codigo + ", nombre=" + nombre + ", precioUnitario=" + precioUnitario
                + ", cantidad=" + cantidad + "]";
    }
}
