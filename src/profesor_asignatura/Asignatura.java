package profesor_asignatura;

public class Asignatura {
	private String nombre;
	private Profesor profesor;
	
	//Constructor
	public Asignatura(String nombre) {
		this.nombre=nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		if(this.profesor != profesor) {
		this.profesor = profesor;
		profesor.addAsignatura(this);
		}
	}
	
}
