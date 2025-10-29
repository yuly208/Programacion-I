package App;


import java.util.Arrays;

public class Aplicacion {
    public static void main(String[] args) {
        int[] numeros = {5, 2, 9, 1, 3};

        System.out.println("Antes de ordenar: " + Arrays.toString(numeros));
        ordenarBurbuja(numeros);
        System.out.println("Después de ordenar: " + Arrays.toString(numeros));
    }

    //metodo burbuja
    
    public static void ordenarBurbuja(int[] numeros) {
    	int cantidad = numeros.length;   //definir el tamaño del arreglo
    	
    	for(int i = 0 ; i < cantidad - 1; i++) {  //hacer las iteraciones del arreglo , -1 porque con cuatro pasadas ya queda ordenado
    		for(int j = 0; j < cantidad - 1; j++ ) { // hacer las comparaciones entre cada posicion del arreglo
    			if (numeros[j]>numeros[j+1]) {  //si estan incorrectas intercambiar 
    				int guardarN = numeros[j];
    				numeros[j] = numeros[j+1];  
    				numeros[j+1]=guardarN;
    			}
    			
    		}
    		
    		
    	}
    }
    
    
    
    
    
    
}