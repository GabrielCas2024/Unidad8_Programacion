package relacionesclases;

public class Persona {
	private String nombre;
	private String apellidos;
	private String dni;
	private Cuenta cuenta;
	
	public Persona(String nombre,String apellido,String dni,Cuenta cuenta) {
		this.nombre=nombre;
		this.apellidos=apellido;
		this.dni=dni;
		this.cuenta=cuenta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
}
