package co.edu.uniquindio.poo.figurasGeometricas.App;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import co.edu.uniquindio.poo.figurasGeometricas.Model.*;

public class Aplicacion {
	
    public static void main(String[] args) {
        
        // Crear lista de figuras
        List<Figura> figuras = new ArrayList<>();
        
        // Pedir datos al usuario y añadir figuras
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el radio del círculo:"));
        figuras.add(new Circulo(radio));
        
        double ladoCuadrado = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado del cuadrado:"));
        figuras.add(new Cuadrado(ladoCuadrado));
        
        double ladoTriangulo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado del triángulo equilátero:"));
        figuras.add(new Triangulo(ladoTriangulo));
        
        // Mostrar resultados
        for (Figura figura : figuras) {
            String mensaje = "Figura: " + figura.getClass().getSimpleName()
                    + "\nÁrea: " + figura.calcularArea() + " m²"
                    + "\nPerímetro: " + figura.calcularPerimetro() + " m";
            
            JOptionPane.showMessageDialog(null, mensaje, "Resultado", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}
