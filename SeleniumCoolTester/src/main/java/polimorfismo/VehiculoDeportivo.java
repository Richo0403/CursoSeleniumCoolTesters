package polimorfismo;

public class VehiculoDeportivo extends Vehiculo {
	private int cilindrada;
	
	
	
	/**
	 * @Autor	Isaias Espinoza
	 * @Return N/A
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param cilindrada
	 */
	
	
	public VehiculoDeportivo(int cilindrada, String matricula, String marca, String modelo) {
		super(matricula, marca, modelo);
		this.cilindrada = cilindrada;
		// TODO Auto-generated constructor stub
	}

	
	@Override 
	public String mostrarDatos() {
		return "Matricula: " + matricula + 
				"\nMarca: " + marca+  
				"\nModelo: " + modelo + 
				"\n Numero de Puertas: " + cilindrada;  
	}



	
}
