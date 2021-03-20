package javabasics;


import java.util.Scanner;


public class TablaDeMultiplicar {
		
	public static void main(String[] args) {
		int tabla;												//Inicializacion de variables
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese el numero del cual quiere la tabla de multiplicar: ");//Ingreso de datos
		tabla = sc.nextInt();
		
		while (tabla<1) {
			System.out.println("Ingrese un numero mayor a 0: ");
			tabla = sc.nextInt();
		}
		
		
		
			for(int i = 1; i < 11; i++) { 									//Ciclo de multiplicacion y resultado
				System.out.println(tabla + " * " + i +  " = " + (tabla*i));
			
		}
		
		sc.close();
	}//main
	
}//Class
