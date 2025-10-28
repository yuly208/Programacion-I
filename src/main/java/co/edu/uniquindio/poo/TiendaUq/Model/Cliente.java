package co.edu.uniquindio.poo.TiendaUq.Model;

import java.util.ArrayList;
import java.util.List;

public abstract class Cliente {

    private String nombre;
    private String cedula;
    private String direccion;
    private List<Factura> listaFacturas;

    public Cliente(String nombre, String cedula, String direccion) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.direccion = direccion;
        this.listaFacturas = new ArrayList<>();
    }

    public abstract double calcularBeneficio();

    public void agregarFactura(Factura factura) {
        listaFacturas.add(factura);
    }

    public List<Factura> getListaFacturas() {
        return listaFacturas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", cedula=" + cedula + ", direccion=" + direccion + "]";
    }
}
