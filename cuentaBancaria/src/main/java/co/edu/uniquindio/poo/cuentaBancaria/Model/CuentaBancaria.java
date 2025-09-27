package co.edu.uniquindio.poo.cuentaBancaria.Model;

public abstract class CuentaBancaria {

	protected float saldo;
	protected int consignaciones;
	protected int retiros;
	protected float tasaAnual;
	protected float comisionMensual;
	
	
	public CuentaBancaria (float saldo,int consignaciones,int retiros,float tasaAnual,float comisionMensual) {
		
		this.saldo=saldo;
		this.consignaciones=consignaciones;
		this.retiros=retiros;
		this.tasaAnual=tasaAnual;
		this.comisionMensual=comisionMensual; 
		
	}


	public float getSaldo() {
		return saldo;
	}


	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}


	public int getConsignaciones() {
		return consignaciones;
	}


	public void setConsignaciones(int consignaciones) {
		this.consignaciones = consignaciones;
	}


	public int getRetiros() {
		return retiros;
	}


	public void setRetiros(int retiros) {
		this.retiros = retiros;
	}


	public float getTasaAnual() {
		return tasaAnual;
	}


	public void setTasaAnual(float tasaAnual) {
		this.tasaAnual = tasaAnual;
	}


	public float getComisionMensual() {
		return comisionMensual;
	}


	public void setComisionMensual(float comisionMensual) {
		this.comisionMensual = comisionMensual;
	}
	
	
	//metodos
	
	public abstract float consignarDinero();
	
	public abstract float retirarDinero();
	
	public abstract float calcularInteresMensual ();
	
	public abstract void extractoMensual();


	@Override
	public String toString() {
		return "CuentaBancaria [saldo=" + saldo + ", consignaciones=" + consignaciones + ", retiros=" + retiros
				+ ", tasaAnual=" + tasaAnual + ", comisionMensual=" + comisionMensual + "]";
	}


	
	
	
	
	
}
