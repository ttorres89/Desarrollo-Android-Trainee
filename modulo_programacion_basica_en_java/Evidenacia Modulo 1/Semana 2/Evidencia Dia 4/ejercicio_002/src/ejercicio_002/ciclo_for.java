package ejercicio_002;

import java.util.Scanner;

public class ciclo_for {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese un numero: ");
		int numero  = lector.nextInt();
		int contador_par=0;
		
		for (int i=1; i<=numero;i++) {
			if(i%2==0) {
				if(i>=2) {
					contador_par++;
				}			
			}
		}
		
		System.out.println("La cantidad de numeros pares entre 2 y "+ numero + " es: "+contador_par);

	}

}
