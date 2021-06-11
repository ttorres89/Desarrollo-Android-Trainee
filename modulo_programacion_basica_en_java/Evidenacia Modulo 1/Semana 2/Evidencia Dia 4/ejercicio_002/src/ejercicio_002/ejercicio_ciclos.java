package ejercicio_002;

import java.util.Scanner;

public class ejercicio_ciclos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int numero = lector.nextInt();
		int contador = 1;
		int factorial =1;
		
		while(contador<=numero) {
			
			factorial = factorial * contador;
			contador++;
		}
		
		System.out.println("El factorial del número ingresado es: " + factorial);
		
	}

}
