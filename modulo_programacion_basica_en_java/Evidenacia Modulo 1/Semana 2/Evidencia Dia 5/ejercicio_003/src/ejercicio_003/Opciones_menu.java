package ejercicio_003;

import java.util.Iterator;
import java.util.Scanner;

public class Opciones_menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese un número: ");
		int numero  = lector.nextInt();
		int opcion;
		int contador_primos =0;
		int contador2=0;

		do {
			System.out.println("----------------------------------------------------------------");
			System.out.println("Ingrese una opcion del 1 al 4: ");
			System.out.println("1.- Validar si un número es impar: ");
			System.out.println("2.- Validar si un número es primo: ");
			System.out.println("3.- Contar cantidad de primos entre 2 y el numero ingresado: ");
			System.out.println("4.- Salir: ");
			System.out.println("----------------------------------------------------------------");
			opcion = lector.nextInt();
			
		} while (opcion>4 || opcion<1);
		

		switch (opcion) {
		case 1:
			// String mensaje = n%2==0?"El número es par":"El numero es impar";
			if (numero%2!=0) {
				System.out.println("El número " + numero + " es impar");	
			}else {
				System.out.println("El número " + numero + " no es impar");	
			}
			break;
		case 2:
			
			int contador=0;
			
			for(int i = 1; i <= numero; i++)
	        {
	            if((numero % i) == 0)
	            {
	                contador++;
	            }
	        }
			
			if(contador <= 2)
	        {
				System.out.println("El número " + numero + " es primo");
	        }else{
	        	System.out.println("El número " + numero + " no es primo");
	        }
			break;
			
		case 3:
			int contador_primo=0;
			for (int i =2; i<=numero; i++) {
				boolean primo=true;
				for(int j=2; j<i;j++) {
					if(j!=i && i%j==0) {
						primo=false;
						break;
					}
				}
				if(primo)contador_primo++;
				
			}
			
			System.out.println("Cantidad números primos:" + contador_primo);
			break;
			
		case 4:
			System.out.println("Usted a elegido salir, nos vemos!");
			break;
					
		}

	}

}
