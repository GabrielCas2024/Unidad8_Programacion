package herenciaU9ejercicio;

public class Empleado {
	//Atributos a utilizar
	protected String nombre;
	protected int id;
	protected double sueldoBase;
	
	//Constructor de la clase Empleado
	public Empleado(String nombre,int id,double sueldoBase) {
		this.nombre=nombre;
		this.id=id;
		this.sueldoBase=sueldoBase;
	}
	//Metodos propios de la clase
	public double calcularSueldo(){return sueldoBase;}
	
	
	public String getNombre() {
		return nombre;
	}

	public double getSueldoBase() {
		return sueldoBase;
	}


	public void setSueldoBase(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", id=" + id + ", sueldoBase=" + sueldoBase + "]";
	}
	
}
