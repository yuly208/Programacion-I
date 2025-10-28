package co.edu.uniquindio.poo.TiendaUq.App;

import javax.swing.JOptionPane;
import java.time.LocalDate;

import co.edu.uniquindio.poo.TiendaUq.Model.*;

public class Aplicacion {

    public static void main(String[] args) {

      
        TiendaUQ tienda = new TiendaUQ(
                JOptionPane.showInputDialog("Ingrese el nombre de la tienda:"),
                JOptionPane.showInputDialog("Ingrese la dirección de la tienda:"),
                JOptionPane.showInputDialog("Ingrese el NIT de la tienda:")
        );

   
        String nombreCliente = JOptionPane.showInputDialog("Ingrese el nombre del cliente frecuente:");
        String cedulaCliente = JOptionPane.showInputDialog("Ingrese la cédula del cliente:");
        String direccionCliente = JOptionPane.showInputDialog("Ingrese la dirección del cliente:");
        double puntos = Double.parseDouble(JOptionPane.showInputDialog("Ingrese los puntos de fidelidad:"));

        Cliente cliente = new CFrecuente(nombreCliente, cedulaCliente, direccionCliente, puntos);
        tienda.agregarCliente(cliente);

       
        String codigo = JOptionPane.showInputDialog("Ingrese el código del producto:");
        String nombreProd = JOptionPane.showInputDialog("Ingrese el nombre del producto:");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio unitario:"));
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad disponible:"));
        LocalDate fechaVenc = LocalDate.parse(JOptionPane.showInputDialog("Ingrese la fecha de vencimiento (YYYY-MM-DD):"));

        Producto producto = new PAlimenticio(codigo, nombreProd, precio, cantidad, fechaVenc);
        tienda.agregarProducto(producto);

    
        String mensaje = "tienda registrada"
                + tienda + "\n\n"
                + " Cliente registrado:\n" + cliente + "\n\n"
                + "Producto registrado:\n" + producto;

        JOptionPane.showMessageDialog(null, mensaje, "Resumen de Registro", JOptionPane.INFORMATION_MESSAGE);
    }
}
