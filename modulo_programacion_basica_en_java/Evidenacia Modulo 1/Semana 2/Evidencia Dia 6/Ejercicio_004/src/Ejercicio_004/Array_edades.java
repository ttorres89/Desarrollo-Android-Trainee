package Ejercicio_004;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Array_edades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner lector = new Scanner(System.in);
		
		List<Integer> lista_mayores_edades = new ArrayList<Integer>(10);
		int numero;
		int contador = 0;
		

		do {
			System.out.println("Ingrese una edad: ");
			numero = lector.nextInt();			
			if(numero>=18) {
				lista_mayores_edades.add(numero);
				contador++;
			}
			
		} while (contador<10);
		
		
		Collections.sort(lista_mayores_edades);
		System.out.println("--------------------------------------------------");
		System.out.println("Lista de las edades ingresada mayores de edad: " + lista_mayores_edades);
		System.out.println("--------------------------------------------------");
		
		
		
	}

}
