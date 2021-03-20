package poo2;

public class Operario extends Empleado{

	public Operario(String nombre) {
		super(nombre);
		System.out.println("Constructor del operario");
	}
	
	
	@Override
	public String toString() {//Heredando metodo toString pero sobreescribiendo agregando la funcionalidad
		return super.toString()+ " Operario";
	}

}