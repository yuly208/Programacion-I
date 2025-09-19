/**
 * Clase para prohar el funcionamiento del codigo
 * Area de Programacion 1 01D UQ
 * 2025-08
 * Licencia GNUGPL v3.0
 */
package co.edu.uniquindio.poo.demo.app;

import co.edu.uniquindio.poo.demo.model.*;

public class Aplicacion {

	public static void main(String[] args) {
		
		var curso = new Curso("POO", "001", "Curso de programación", 4, "2025-2");
		
		var estudiante1= new Estudiante("123456789", "pepe", "lopez", 19, "1arrobaestudiante", "321628999", null);
		var estudiante2= new Estudiante("4321948", "luca", "castillo", 18, "2arrobaestudiante", "321938973", null);
		var estudiante3= new Estudiante("467865433", "juan", "rivera", 19, "3arrobaestudiante", "32467644455", null);
		var estudiante4= new Estudiante("187428847", "luis", "castillo", 17, "4arrobaestudiante", "1131452525", null);
		var estudiante5= new Estudiante("129328038", "esteban", "castro", 20, "5arrobaestudiante", "3189381393", null);
	
	
	
	// Registrar estudiantes en el curso
		
	System.out.println(curso.registrarEstudiante(estudiante1));
	System.out.println(curso.registrarEstudiante(estudiante2));
	System.out.println(curso.registrarEstudiante(estudiante3));
	System.out.println(curso.registrarEstudiante(estudiante4));
    System.out.println(curso.registrarEstudiante(estudiante5));
	
 // Asignar notas (5 cada uno)
 		estudiante1.registrarNota(3.5);
 		estudiante1.registrarNota(4.0);
 		estudiante1.registrarNota(2.8);
 		estudiante1.registrarNota(3.9);
 		estudiante1.registrarNota(4.2);
 		
 		estudiante2.registrarNota(4.5);
		estudiante2.registrarNota(4.7);
		estudiante2.registrarNota(4.0);
		estudiante2.registrarNota(3.8);
		estudiante2.registrarNota(4.9);
	
		estudiante3.registrarNota(2.5);
		estudiante3.registrarNota(3.0);
		estudiante3.registrarNota(2.8);
		estudiante3.registrarNota(3.2);
		estudiante3.registrarNota(3.5);
		
		estudiante4.registrarNota(5.0);
		estudiante4.registrarNota(4.8);
		estudiante4.registrarNota(4.9);
		estudiante4.registrarNota(4.7);
		estudiante4.registrarNota(5.0);
		
		estudiante5.registrarNota(3.0);
		estudiante5.registrarNota(3.2);
		estudiante5.registrarNota(2.9);
		estudiante5.registrarNota(3.1);
		estudiante5.registrarNota(3.0);
		
		// Mostrar promedios
				System.out.println("Promedio estudiante1: " + estudiante1.calcularPromedio());
				System.out.println("Promedio estudiante2: " + estudiante2.calcularPromedio());
				System.out.println("Promedio estudiante3: " + estudiante3.calcularPromedio());
				System.out.println("Promedio estudiante4: " + estudiante4.calcularPromedio());
				System.out.println("Promedio estudiante5: " + estudiante5.calcularPromedio());
				
				// Promedio general del curso
				System.out.println("Promedio general del curso: " + curso.calcularPromedioGeneral());
				
				System.out.print("\n LISTADO DE ESTUDIANTES: \n");
				for (Estudiante estudiante : curso.getListaEstudiantes()) {
					System.out.println(estudiante.toString());
				}
	}

}

JOptionPane.showMessageDialog




