package poo;

import comun.leerProperties;

public class testProperties {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		leerProperties prop  = new leerProperties();
		prop.getSystemProperties();
		
		String mensaje1 = System.getProperty("Mensaje");
		String mensaje2 = System.getProperty("Mensaje2");
		
		int numero = Integer.parseInt(System.getProperty("numero"));
		
		
		
		System.out.println(numero);
		System.out.println(mensaje1);
		System.out.println(mensaje2);
		
		
		prop.setSystemPropFileName(System.getProperty("user.dir")+"src\\main\\resources\\dataFiles\\data2.properties");
		prop.getSystemProperties();
		String archivo = System.getProperty("Mensaje");
		
		System.out.println(archivo);
	
		
	}

}
