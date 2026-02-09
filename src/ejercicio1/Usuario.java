package ejercicio1;

public class Usuario {
	private String nombre;
	private String email;
	
	//Constructor con datos
	public  Usuario(String nombre,String email) {
		this.nombre=nombre;
		this.email=email;
	}
	//Constructor vacio
	public  Usuario() {}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
}
