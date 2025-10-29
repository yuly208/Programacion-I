package co.edu.uniquindio.poo.cuentaBancaria.Model;
import javax.swing.*;

public class CuentaAhorros extends CuentaBancaria{
	 
	protected boolean esActiva;
	
	public CuentaAhorros(boolean activa,float saldo,int consignaciones,int retiros,float tasaAnual,float comisionMensual){
		
		super(saldo,consignaciones,retiros,tasaAnual,comisionMensual);
		
		this.esActiva=activa;
		
	}

	public boolean isActiva() {
		return esActiva;
	}

	public void setActiva(boolean activa) {
		this.esActiva = activa;
	}
	
	//metodos
	
	public void  cuentaActiva() {
		
		if(saldo>=0) {
			esActiva=true;
		}else {
			esActiva=false;
		}
		
	}
	
	
	
	
	@Override
	public float consignarDinero(){
		float consignacion = Float.parseFloat(JOptionPane.showInputDialog(null,"¿cuanto dinero quieres consignar?"));
		if (esActiva==true){
			saldo+= consignacion;
			
			return saldo;
		}	
		else { System.out.print("transaccion fallida");
		return saldo;
		
		}
	}
	
     @Override
     public float retirarDinero() {
    	 float retiro = Float.parseFloat(JOptionPane.showInputDialog(null,"¿Cuanto dinero quieres retirar?"));
    	 if(esActiva==true) {
    		 if(saldo<retiro) {
    		
    			 System.out.print("el retiro no puede superar el monto de la cuenta");
    			 return saldo;
    		 }
    		 else if (saldo>retiro ) {
    			 saldo = (saldo - retiro)-comisionMensual;
    		 retiros++;
    		 }
    		  
    	 }
    	 return saldo;
    	 
     }
     
     @Override
     public float calcularInteresMensual() {
    	 float interes = 0;
    	 return interes;
    	 
     }
     
     @Override
     public void extractoMensual() {
    	 comisionMensual = 0;
    	if(esActiva==true) {
    		if(retiros>4) {
    			comisionMensual= 1000;
    		}else {
    			comisionMensual = 0;
    		}
    		
    		
    	}
    	 
    	 
    	 
    	 
     }
     
     @Override
     public String toString() {
         String texto = "CuentaAhorros [esActiva=" + esActiva + 
                        ", saldo=" + saldo + 
                        ", consignaciones=" + consignaciones +
                        ", retiros=" + retiros + 
                        ", tasaAnual=" + tasaAnual + 
                        ", comisionMensual=" + comisionMensual + "]";
         JOptionPane.showMessageDialog(null, texto);
         return texto;
     }

     
     
     

}