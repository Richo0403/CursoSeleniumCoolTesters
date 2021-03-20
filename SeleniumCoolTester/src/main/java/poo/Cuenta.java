package poo;

public class Cuenta {
	private String nombre; // Private o public son modificadores de acceso
	private String numeroCuenta;
	private double tipoInteres;
	private double saldo;
	

	/**
	 * @author isaias Espinoza
	 * @date 06/03/2021
	 * @param N/A
	 */
	public Cuenta() {

	}

	/**
	 * @author isaias Espinoza
	 * @date 06/03/2021
	 * @param string, string, double, double
	 */

	public Cuenta(String nombre, String numeroCuenta, double tipoInteres, double saldo) {
		this.nombre = nombre;
		this.numeroCuenta = numeroCuenta;
		this.tipoInteres = tipoInteres;
		this.saldo = saldo;

	}

	/**
	 * @author isaias Espinoza
	 * @date 06/03/2021
	 * @param N/A
	 */
	public Cuenta(Cuenta c) {
		nombre = c.nombre;
		numeroCuenta = c.numeroCuenta;
		tipoInteres = c.tipoInteres;
		saldo = c.saldo;

	}

	/**
	 * @author isaias Espinoza
	 * @date 06/03/2021
	 * @param N/A
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setTipo(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}

	public void setnumeroCuenta(String numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public void setsaldo(double saldo) {
		this.saldo = saldo;
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
	 * @param N/A
	 * @return String
	 */
	public String getNumeroCuenta() {
		return this.numeroCuenta;
	}

	/**
	 * @author isaias Espinoza
	 * @date 06/03/2021
	 * @param N/A
	 * @return double
	 */
	public double getSaldo() {
		return this.saldo;
	}

	/**
	 * @author isaias Espinoza
	 * @date 06/03/2021
	 * @param N/A
	 * @return double
	 */

	public double getTipoInteres() {
		return this.tipoInteres;
	}

	/**
	 * @author isaias Espinoza
	 * @date 06/03/2021
	 * @param N/A
	 * @return boolean
	 */
	public boolean ingreso(double n) {
		boolean ingresoCorrecto = true;
		if (n < 0) {
			ingresoCorrecto = false;
		} else {
			saldo = saldo + n;
		}

		return ingresoCorrecto;
	}

	/**
	 * @author isaias Espinoza
	 * @date 06/03/2021
	 * @param N/A
	 * @return double
	 */
	public boolean reintegro(double n) {
		boolean reintegroCorrecto = true;
		if (n < 0) {
			reintegroCorrecto = false;
		} else if (saldo >= n) {
			saldo -= n;
		} else {
			reintegroCorrecto = false;
		}
		return reintegroCorrecto;
	}

	/**
	 * @author isaias Espinoza
	 * @date 06/03/2021
	 * @param N/A
	 * @return object double
	 */
	public boolean transferencia(Cuenta c, double n) {
		boolean correcto = true;
		if (n < 0) {
			correcto = false;
		} else if (saldo >= n) {
			reintegro(n);
			c.ingreso(n);
		} else {
			correcto = false;
		}

		return correcto;
	}

}//class
