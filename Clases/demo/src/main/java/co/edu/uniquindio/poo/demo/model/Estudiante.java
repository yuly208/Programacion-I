//[]
package co.edu.uniquindio.poo.demo.model;

import java.util.ArrayList;
import java.util.Arrays;

public class Estudiante {
	
	//moficador de acceso,"tipo","nombre"
	
	private String numeroIndentificacion;
	private String nombres;
	private String apellidos;
    private int edad;
	private String correo;
	private String telefono;
	private ArrayList<Double> notas;
	
	public Estudiante (String numeroIdentificacion,String nombres,String apellidos,
		int edad,String correo,String telefono,double [] notas) {
		
		this.numeroIndentificacion = numeroIdentificacion;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.edad = edad;
		this.correo = correo;
		this.telefono = telefono;
		this.notas = new ArrayList<>();
	}
	

	public String getNumeroIndentificacion() {
		return numeroIndentificacion;
	}

	public void setNumeroIndentificacion(String numeroIndentificacion) {
		this.numeroIndentificacion = numeroIndentificacion;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	// CREATE
		public void registrarNota(double nota) {
			notas.add(nota);
		}

	//READ
		public Double buscarNota(int indice) {
			if (indice >= 0 && indice < notas.size()) {
				return notas.get(indice);
			}
			return null;
		}
     //UPDATE
		public boolean actualizarNota(int indice, double nuevaNota) {
			if (indice >= 0 && indice < notas.size()) {
				notas.set(indice, nuevaNota);
				return true;
			}
			return false;
		}
      //DELATED
		public boolean eliminarNota(int indice) {
			if (indice >= 0 && indice < notas.size()) {
				notas.remove(indice);
				return true;
			}
			return false;
		}

		//PROMEDIO 
		public double calcularPromedio() {
			if (notas.isEmpty()) {
				return 0;
			}
			double suma = 0;
			for (double nota : notas) {
				suma += nota;
			}
			return suma / notas.size();
		}

	@Override
	public String toString() {
		return "Estudiante [numeroIndentificacion=" + numeroIndentificacion + ", nombres=" + nombres + ", apellidos="
				+ apellidos + ", edad=" + edad + ", correo=" + correo + ", telefono=" + telefono + ", notas=" + notas
				+ "]";
	}


	
	
	}


