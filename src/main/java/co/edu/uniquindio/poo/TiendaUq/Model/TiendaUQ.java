package co.edu.uniquindio.poo.TiendaUq.Model;

import java.util.ArrayList;
import java.util.List;

public class TiendaUQ {

    private String nombre;
    private String direccion;
    private String nit;
    private List<Cliente> listaClientes;
    private List<Producto> listaProductos;

    public TiendaUQ(String nombre, String direccion, String nit) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.listaClientes = new ArrayList<>();
        this.listaProductos = new ArrayList<>();
    }

    //  CRUD para Productos
    public void agregarProducto(Producto producto) {
        listaProductos.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        listaProductos.remove(producto);
    }

    public Producto buscarProducto(String codigo) {
        for (Producto p : listaProductos) {
            if (p.getCodigo().equals(codigo)) {
                return p;
            }
        }
        return null;
    }

    // CRUD para Clientes
    public void agregarCliente(Cliente cliente) {
        listaClientes.add(cliente);
    }

    public void eliminarCliente(Cliente cliente) {
        listaClientes.remove(cliente);
    }

    public Cliente buscarCliente(String cedula) {
        for (Cliente c : listaClientes) {
            if (c.getCedula().equals(cedula)) {
                return c;
            }
        }
        return null;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public List<Producto> getListaProductos() {
        return listaProductos;
    }

    @Override
    public String toString() {
        return "TiendaUQ [nombre=" + nombre + ", direccion=" + direccion + ", nit=" + nit + "]";
    }
}
