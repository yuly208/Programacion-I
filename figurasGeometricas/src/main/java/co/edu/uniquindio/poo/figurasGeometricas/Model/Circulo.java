package co.edu.uniquindio.poo.figurasGeometricas.Model;

public class Circulo extends Figura {

	private double radio;
	
	public Circulo(double radio) {
		this.radio=radio;
	}

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}
	
	@Override
	public double calcularArea() {
		return Math.PI*radio*radio;
		
	}
	@Override
	public double calcularPerimetro() {
		return 2*Math.PI*radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + ", calcularArea()=" + calcularArea() + ", calcularPerimetro()="
				+ calcularPerimetro() + "]";
	}
	
	
}
