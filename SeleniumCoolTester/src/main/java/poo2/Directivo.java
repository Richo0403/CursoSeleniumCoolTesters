package poo2;

public class Directivo extends Empleado{

	/**
	 * 
	 */
	public Directivo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 */
	public Directivo(String nombre) {
		super(nombre);
		System.out.println("Constructor del Directivo");
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public String toString() {//Heredando metodo toString pero sobreescribiendo agregando la funcionalidad
		return super.toString()+ "Directivo";
	}
	
}
