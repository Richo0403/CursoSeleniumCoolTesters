package polimorfismo;

public class TestVehiculo {
	public static void main(String[] args) {
		Vehiculo misVehiculos[] = new Vehiculo[4];
		
		misVehiculos[0] = new Vehiculo("SAD123", "Ford", "2009");
		misVehiculos[1] = new VehiculoTurismo(8, "sae123", "audi", "2012");
		misVehiculos[2] = new VehiculoDeportivo(6,"sap12323", "M", "2012");
		misVehiculos[3] = new VehiculoCarga("sfasdfa", "toyota", "2021", 9);
		
		//Vehiculos = misVehiculos[n]
		for(Vehiculo Vehiculos : misVehiculos) {
			System.out.println("mostrar Vehiculos: "+ Vehiculos.mostrarDatos());
			System.out.println("");
		}
		
		 
	}
}
