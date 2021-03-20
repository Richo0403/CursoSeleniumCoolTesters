package javabasics;

import java.util.Scanner;

public class OperacionesMat {

	public static int suma(int a, int b) {
		int resultado;
		
		resultado = a + b;
		
		return resultado;
	}
	
	
	public static int resta(int a, int b) {
		int resultado;
		
		resultado = a - b;
		
		return resultado;
	}
	
	public static int division(int a, int b) {
		int resultado;
		
		resultado = a / b;
		
		return resultado;
	}
	
	public static int multiplicacion(int a, int b) {
		int resultado;
		
		resultado = a * b;
		
		return resultado;
	}
	
	public static double areaCirculo(int a) {
		double resultado;
		
		resultado = Math.PI * Math.pow(a,2);
		
		
		return resultado;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in)	;
		
		int numero;
		int numero2;
		
		
		System.out.println("Inserta un numero: ");
		numero = sc.nextInt();
		System.out.println("Ingresa el segundo numero: ");
		numero2 = sc.nextInt();
		
		System.out.println( "El resultado de la suma  es: " + suma(numero, numero2 ));
		System.out.println( "El resultado de la restaes: " + resta(numero, numero2 ));
		System.out.println( "El resultado de la division es: " + division(numero, numero2 ));
		System.out.println( "El resultado de la multiplicacion es: " + multiplicacion(numero, numero2 ));
		System.out.println( "El area del curculo es:  " + areaCirculo(numero));
		
		sc.close();
	}

}
