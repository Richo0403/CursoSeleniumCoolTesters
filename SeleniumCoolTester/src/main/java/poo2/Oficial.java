package poo2;

public class Oficial extends Operario{

	public Oficial(String nombre) {
		super(nombre);
		System.out.println("Constructor de oficial");
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {//Heredando metodo toString pero sobreescribiendo agregando la funcionalidad
		return super.toString()+ " Oficial";
	}
	
}
