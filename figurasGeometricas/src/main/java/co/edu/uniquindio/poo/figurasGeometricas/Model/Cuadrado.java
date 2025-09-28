package co.edu.uniquindio.poo.figurasGeometricas.Model;

public class Cuadrado extends Figura {
	
	public double lado;

	public Cuadrado(double lado) {
		
		this.lado = lado;
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double calcularArea() {
		return lado*lado;
		
	}
	
	@Override
	public double calcularPerimetro() {
		return lado*4;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + ", getLado()=" + getLado() + ", calcularArea()=" + calcularArea()
				+ ", calcularPerimetro()=" + calcularPerimetro() + "]";
	}

	
	
}
