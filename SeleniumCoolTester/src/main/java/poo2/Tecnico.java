package poo2;

public class Tecnico extends Operario{

	public Tecnico(String nombre) {
		super(nombre);
		System.out.println("Constructor Clase operario");
		// TODO Auto-generated constructor stub
	}

	public String toString() {//Heredando metodo toString pero sobreescribiendo agregando la funcionalidad
		return super.toString()+ " Tecnico";
	}
}
