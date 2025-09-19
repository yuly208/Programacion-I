package co.edu.uniquindio.poo.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private String nombre;
	private String codigo;
	private String descripcion;
	private int creditos;
	private String semestre;
	private ArrayList<Estudiante> listaEstudiantes;
	
	
	
	public Curso(String nombre,String codigo,String descripcion,int creditos,
			String semestre) {
		this.nombre = nombre;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.creditos = creditos;
		this.listaEstudiantes = new ArrayList<>();
		
		
	}
	
	
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
		
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}



	public int getCreditos() {
		return creditos;
	}



	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}



	public String getSemestre() {
		return semestre;
	}



	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

//get and set of ArrayList

	public ArrayList<Estudiante> getListaEstudiantes() {
		return listaEstudiantes;
	}



	public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
		this.listaEstudiantes = listaEstudiantes;
	}
	
	

	// Metodos de este codigo para estudiantes

	//CREATE
	public String registrarEstudiante(Estudiante nuevoEstudiante) {
		String resultado="";
		
	//buscar el estudiante 	
		
		Estudiante estudianteEncontrado=null;
		
		estudianteEncontrado = buscarEstudiante (nuevoEstudiante.getNumeroIndentificacion());
		
		if (estudianteEncontrado == null) {
			listaEstudiantes.add(nuevoEstudiante);
			resultado= "El estudiante fue registrado";		
		} else {
			resultado= "El estudiante ya exite para el curso";
		}
		return resultado;
	}
		//READ
	public Estudiante buscarEstudiante(String numeroIdentificacion) {
		
		Estudiante resultado=null;
		
		for (int i=0;i<listaEstudiantes.size();i++) {
			
		Estudiante estudianteAux=listaEstudiantes.get(i);
			
		if (estudianteAux.getNumeroIndentificacion().equals(numeroIdentificacion)) {
				
		resultado= estudianteAux;
		
		break;
			}
		
		}
		return resultado;
			
	}
	//UPTADE
	
	/**
	 * 
	 * @param numeroIdentificacion
	 * @param nombres
	 * @param apellidos
	 * @param edad
	 * @param correo
	 * @param telefono
	 * @return
	 */
	public Estudiante actualizarEstudiante(String numeroIdentificacion,String nombres,
			String apellidos,int edad,String correo,String telefono) {
		
		
		
		for (Estudiante estudiante : listaEstudiantes) {
			if (estudiante.getNumeroIndentificacion().equalsIgnoreCase(numeroIdentificacion)){
				
				//actualizar atributos
				
				estudiante.setNombres(nombres);
				estudiante.setApellidos(apellidos);
				estudiante.setEdad(edad);
				estudiante.setCorreo(correo);
				estudiante.setTelefono(telefono);
				
				return estudiante;
			}	
	}
	         return null;
		
	}
	//REMOVE
	
	         public String eliminarEstudiante(String numeroIdentificacion) {
	        	  
	        	 for(int i= 0;i< listaEstudiantes.size();i++) {
	        		 if (listaEstudiantes.get(i).getNumeroIndentificacion().equals(numeroIdentificacion)) {
	        			 listaEstudiantes.remove(i);//elimina por indice
	        			 return "Estudiante identificaddo"+numeroIdentificacion+"fue eliminado exitosamente";
	        			 
	        		 }
	       
	        		 }
	        		return "no se pudo eliminar, estudiante no encontrado";
	        	
	        	 
	        	 
	
	         }
	
	      // promedio del curso
	     	public double calcularPromedioGeneral() {
	     		if (listaEstudiantes.isEmpty()) {
	     			return 0;
	     		}
	     		double suma = 0;
	     		int contador = 0;
	     		for (Estudiante estudiante : listaEstudiantes) {
	     			suma += estudiante.calcularPromedio();
	     			contador++;
	     		}
	     		return suma / contador;
	     	}
	     }

	

	


