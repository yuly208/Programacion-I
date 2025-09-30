package co.edu.uniquindio.poo.ruletaMatriz.App;

import java.util.Scanner;




public class Aplicacion {

	public static void main(String[] args) {
		
		
		int filas = ingresarEntero("Ingrese el numero de filas: ");
		int columnas = ingresarEntero("Ingrese el numero de columnas: ");
		
		int[][] matriz = new int[filas][columnas];
		matriz = matrizLlena(matriz);
		mostrarMensaje(matriz);
		int giros = ingresarEntero("Ingrese la cantidad de giros: ");
		int[][] matrizGirada = girarMatriz(matriz, giros);
	

		mostrarMensaje(matrizGirada);
	}
	public static int ingresarEntero(String mensaje) {
		Scanner sacnner = new Scanner (System.in);
		System.out.println(mensaje);
		return sacnner.nextInt();
	}
	
	public static int[][] matrizLlena (int[][]matriz){
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = ingresarEntero("Ingrese el valor de la fila: (" + i + ")" + "(" + j + ")");
			}
		}
		return matriz;
	}
	
	public static int [][] girarMatriz (int[][] matriz, int giros){
		int[][] resultado = matriz;
		
		
		
		while(giros > 0) {
			int filas = resultado.length;
			int columnas = resultado[0].length;
			//para resultado[0] mira la fila y saca la cantidad columnas de esa fila
			
			int[][] nuevaMatriz = new int[columnas][filas];
			for(int i = 0; i < filas; i++) {
				for(int j = 0; j < columnas; j++) {
					nuevaMatriz[j][filas - 1 - i] = resultado[i][j];
					//aca para encontrar la fila y girarla a la derecha debemos buscar la posicion final e ingresar su resultado
				}
				
			}
			resultado = nuevaMatriz;
			giros--;
		}
		
		
		return resultado;
	}
	
	public static void mostrarMensaje(int[][] matriz) {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]);			//aca para encontrar la fila y girarla a la derecha debemos buscar la posicion final e ingresar su resultado
			}
			System.out.print("\n");		
		}
	}
	
}