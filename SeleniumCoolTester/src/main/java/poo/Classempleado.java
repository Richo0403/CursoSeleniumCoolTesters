package poo;

public class Classempleado {
	protected String nombre;

	
	
	/**
	 * @author isaias Espinoza
	 * @date 06/03/2021
	 * @param N/A
	 */
	
	public Classempleado() {//constructor
		
	}
	
	/**
	 * @author isaias Espinoza
	 * @date 06/03/2021
	 * @param String, double
	 */
	
	public Classempleado (String nombre, double cuenta){
		this.nombre = nombre;
		
	}
	
	/**
	 * @author isaias Espinoza
	 * @date 06/03/2021
	 * @param N/A
	 * @return String
	 */
	public String getNombre() {
		return this.nombre;
	}

	
	/**
	 * @author isaias Espinoza
	 * @date 06/03/2021
	 * @param String
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @author isaias Espinoza
	 * @date 06/03/2021
	 * @param String
	 */
	public String toString() {
		return "nombre: " + nombre;
	}
	
	
}
