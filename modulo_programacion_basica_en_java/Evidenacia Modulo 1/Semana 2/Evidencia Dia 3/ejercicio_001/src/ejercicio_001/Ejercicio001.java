package ejercicio_001;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio001 {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
		System.out.println("Ingrese el primer número: ");	
		int numero1=lector.nextInt();
		System.out.println("Ingrese el segundo número: ");	
		int numero2=lector.nextInt();;
		System.out.println("Ingrese el tercer número: ");	
		int numero3=lector.nextInt();;
		//Integer [] lista_numero  = {numero1,numero2,numero3};
		//Arrays.sort(lista_numero);
		//System.out.println("La lista de numero ordenadas de menor a mayor es: " + Arrays.toString(lista_numero));
		//Arrays.sort(lista_numero, Collections.reverseOrder());
		//System.out.println("La lista de numero ordenadas de mayor a menor es: " + Arrays.toString(lista_numero));
		lector.close();
		System.out.println("------------------------------------");
		System.out.println("Sus numeros en forma desendente son:");
		System.out.println("------------------------------------");
		if(numero1>numero2 && numero2>numero3) {
			System.out.println(numero1+ ", " + numero2 + ", "+ numero3);
		}else if(numero1>numero3 && numero3>numero2) {
			System.out.println(numero1+", "+ numero3+ ", " + numero2);
		}else if(numero2>numero1 && numero1>numero3) {
			System.out.println(numero2+", "+ numero1+ ", " + numero3);
		}else if(numero2>numero3 && numero3>numero1) {
			System.out.println(numero2+", "+ numero3+ ", " + numero1);
		}else if(numero3>numero1 && numero1>numero2) {
			System.out.println(numero3+", "+ numero1+ ", " + numero2);
		}else {
			System.out.println(numero3+", "+ numero2+ ", " + numero1);
		}
		System.out.println("------------------------------------");
		System.out.println("Sus numeros en forma acendente son:");
		System.out.println("------------------------------------");
		if(numero1<numero2 && numero2<numero3) {
			System.out.println(numero1+ ", " + numero2 + ", "+ numero3);
		}else if(numero1<numero3 && numero3<numero2) {
			System.out.println(numero1+", "+ numero3+ ", " + numero2);
		}else if(numero2<numero1 && numero1<numero3) {
			System.out.println(numero2+", "+ numero1+ ", " + numero3);
		}else if(numero2<numero3 && numero3<numero1) {
			System.out.println(numero2+", "+ numero3+ ", " + numero1);
		}else if(numero3<numero1 && numero1<numero2) {
			System.out.println(numero3+", "+ numero1+ ", " + numero2);
		}else{
			System.out.println(numero3+", "+ numero2+ ", " + numero1);
		}
		
		
	}

}
