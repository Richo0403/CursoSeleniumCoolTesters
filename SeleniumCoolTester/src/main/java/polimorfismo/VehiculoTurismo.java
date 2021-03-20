package polimorfismo;

public class VehiculoTurismo extends Vehiculo{

	private int numPuertas;
	/**
	 * @Autor	Isaias Espinoza
	 * @Return N/A
	 * @param matricula
	 * @param marca
	 * @param modelo
	 */
	public VehiculoTurismo(int numPuertas, String matricula, String marca, String modelo) {
		super(matricula, marca, modelo);
		this.numPuertas = numPuertas;
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the numPuertas
	 */
	public int getNumPuertas() {
		return numPuertas;
	}
	

	
	@Override 
	public String mostrarDatos() {
		return "Matricula: " + matricula + 
				"\nMarca: " + marca+  
				"\nModelo: " + modelo + 
				"\n Numero de Puertas: " + numPuertas;  
	}
	
	
	
}
