package javabasics;


import java.util.Scanner;


public class SumaParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc = new Scanner(System.in);
	float 	par=0, 
			impar=0, 
			residuo, 
			temporal= 0,
			repetir = 0;
	
	    System.out.println("Ingrese el numero de veces a repetir: ");
	    repetir = sc.nextInt();
		
		for (int i = 1; i<=repetir; i++) {
			System.out.println("Ingrese el numero " + i + " :" );
			temporal = sc.nextFloat();
		while(temporal<0) {
			System.out.println("El numero es menor a 0, ingrese uno mayor: " );
			temporal = sc.nextFloat();
		
		}
		
		
		
		residuo = temporal%2;
		
		if(residuo==0) {
			par+=temporal;
			System.out.println("El numero " + temporal + "Es par");
		}
		if(residuo!=0 && residuo>0) {
			impar+=temporal;
			System.out.println("El numero " + temporal + "Es impar");
		}
		
		
		
		}
		System.out.println("La suma de los pares es: " + par);
		System.out.println("La suma de los impares es: " + impar);
		sc.close();
	}

}
