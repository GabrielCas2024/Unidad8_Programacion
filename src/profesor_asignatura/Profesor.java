package profesor_asignatura;
import java.util.*;

public class Profesor {
	private String nombre;
	private List <Asignatura>asignatura;
	
	//Contructor
	public Profesor() {}
	public Profesor(String nombre) {
		this.nombre=nombre;
		asignatura= new ArrayList<>();
	}
	
	//Getter y Setters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	//Metodos
	public void addAsignatura(Asignatura asignatura) {
		this.asignatura.add(asignatura);
	}
	
}
