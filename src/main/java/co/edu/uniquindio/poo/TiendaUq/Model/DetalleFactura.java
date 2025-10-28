package co.edu.uniquindio.poo.TiendaUq.Model;

public class DetalleFactura {

    private int cantidadComprada;
    private double subtotal;
    private Producto producto;

    public DetalleFactura(int cantidadComprada, Producto producto) {
        this.cantidadComprada = cantidadComprada;
        this.producto = producto;
        this.subtotal = cantidadComprada * producto.getPrecioUnitario();
    }

    public int getCantidadComprada() {
        return cantidadComprada;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public Producto getProducto() {
        return producto;
    }

    @Override
    public String toString() {
        return "DetalleFactura [cantidadComprada=" + cantidadComprada + ", subtotal=" + subtotal + ", producto="
                + producto.getNombre() + "]";
    }
}
