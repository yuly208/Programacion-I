package co.edu.uniquindio.poo.figurasGeometricas.Model;

public class Triangulo extends Figura {
	
	private double lado;

	public Triangulo(double lado) {
		
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
		return (Math.pow(lado, 2)* Math.sqrt(3))/4;
	}

	@Override
	public double calcularPerimetro() {
		return lado*3;
	}

	@Override
	public String toString() {
		return "Triangulo [lado=" + lado + ", getLado()=" + getLado() + ", calcularArea()=" + calcularArea()
				+ ", calcularPerimetro()=" + calcularPerimetro() + "]";
	}
	
	
	
	
	
	
}
