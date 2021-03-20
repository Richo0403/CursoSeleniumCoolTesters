package poo;

import java.util.Scanner;

public class TestCuenta {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String nombre,
				numero;
		Double tipo,
				importe,
				prueba;
		
		Cuenta cuenta1 = new Cuenta();
		Cuenta cuenta2 = new Cuenta("Ricardo Perez","15324",12.3,5000);
		
		
		
		System.out.println("Ingresa Nombre: ");
		nombre = sc.next();
		System.out.println("Ingresa Cuenta: ");
		numero = sc.next();
		System.out.println("Tipo de Interes: ");
		tipo = sc.nextDouble();
		System.out.println("Ingrese el importe: ");
		importe = sc.nextDouble();
		sc.close();
		
		cuenta1.setNombre(nombre);
		cuenta1.setnumeroCuenta(numero);
		cuenta1.setTipo(tipo);
		cuenta1.setsaldo(importe);
		System.out.println("Saldo cuenta 1:" + cuenta1.getSaldo());
	
		System.out.println(cuenta2.getNombre());
		
		Cuenta cuenta3 = new Cuenta(cuenta1);
		System.out.println(cuenta3.getSaldo());
		cuenta1.ingreso(4000);
		System.out.println("Saldo cuenta 1:" + cuenta1.getSaldo());
		
		System.out.println("Saldo cuenta 3:" + cuenta3.getSaldo());
		
		
		/////////////////////////Tranferencia de cuenta 3 a cuenta 2
		
		cuenta3.transferencia(cuenta2, 1000);
		System.out.println("Saldo cuenta 2:" + cuenta2.getSaldo());
		
		System.out.println("Saldo cuenta 3:" + cuenta3.getSaldo());  ///// cuenta3.getSaldo ---> muestra el saldo de la cuenta 3
		
		Cuenta cuenta4 = new Cuenta(cuenta3);
		cuenta4.setNombre("isaias");                              ////   cuenta4.setNombre  
		cuenta4.setsaldo(5000);
		
		System.out.println(cuenta4.getNombre());    //////Cuenta4.getNombre -->Muestra el nombre de la cuenta 4
		prueba = cuenta4.getSaldo();
		
		System.out.println(prueba);
		
	}

}
