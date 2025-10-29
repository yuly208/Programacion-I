package co.edu.uniquindio.poo.cuentaBancaria.Model;
import javax.swing.*;

public class CuentaCorriente extends CuentaBancaria {
	
	protected float sobreGiro = 0;  
	protected boolean esActiva= true;
	
	public CuentaCorriente(float saldo,int consignaciones,int retiros,float tasaAnual,float comisionMensual,float sobreGiro,boolean esActiva) {
		super(saldo,consignaciones,retiros,tasaAnual,comisionMensual);
		this.sobreGiro=sobreGiro;
		this.esActiva=esActiva;
	}

	@Override
	public float retirarDinero() {
		float retiro = Float.parseFloat(JOptionPane.showInputDialog(null,"¿Cuánto desea retirar?"));
		
		if (retiro <= saldo) {
			
			saldo = saldo - retiro;
		} else {
			
			float faltante = retiro - saldo;
			saldo = 0;
			sobreGiro = sobreGiro - faltante;
		}
		return saldo + sobreGiro;
	}
	
	@Override
	public float consignarDinero() {
		float consignacion = Float.parseFloat(JOptionPane.showInputDialog(null,"¿Cuánto desea consignar?"));
		
		if (sobreGiro < 0) {
			
			if (consignacion + sobreGiro >= 0) {
				
				float sobrante = consignacion + sobreGiro; 
				sobreGiro = 0;
				saldo = saldo + sobrante;
			} else {
				
				sobreGiro = sobreGiro + consignacion;
			}
		} else {
			
			saldo = saldo + consignacion;
		}
		return saldo + sobreGiro;
	}

	@Override
	public float calcularInteresMensual() {
		return 0;
	}

	@Override
	public void extractoMensual() {
		
	}

	@Override
	public String toString() {
		String texto=  "CuentaCorriente [sobreGiro=" + sobreGiro +
				", esActiva=" + esActiva +
				", saldo=" + saldo
				+ ", consignaciones=" + consignaciones
				+ ", retiros=" + retiros +
				", tasaAnual=" + tasaAnual
				+ ", comisionMensual=" + comisionMensual + "]";
		
		JOptionPane.showMessageDialog(null, texto);
		return texto;
	}
}
