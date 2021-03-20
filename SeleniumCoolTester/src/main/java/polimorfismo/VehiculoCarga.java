package polimorfismo;

public class VehiculoCarga  extends Vehiculo{
	private int carga;

	/**
	 * @param matricula
	 * @param marca
	 * @param modelo
	 */
	public VehiculoCarga(String matricula, String marca, String modelo, int carga) {
		super(matricula, marca, modelo);
		this.carga= carga;
		// TODO Auto-generated constructor stub
	}
	
	public int getCarga() {
		return carga;
	}
	
	
	@Override 
	public String mostrarDatos() {
		return "Matricula: " + matricula + 
				"\nMarca: " + marca+  
				"\nModelo: " + modelo + 
				"\n carga: " + carga;  
	}
	
	
	
}
