package herenciaU9ejercicio;

public class Programador extends Empleado{
	//Atributo propio de la clase Programador
	private String lenguage_Dominante;
	
	//Constructor propio de la clase + los datos de la clase Padre(Empleado);
	public Programador(String nombre, int id, double sueldoBase,String lenguaje_Dominante) {
		super(nombre, id, sueldoBase);
		this.lenguage_Dominante=lenguaje_Dominante;
	}
	
	 public double calcularSueldo() {
		 int extra=200;
		 this.sueldoBase=this.sueldoBase+extra;
		 return this.sueldoBase;
	 }

	 @Override
	 public String toString() {
		return super.toString()+" Programador [lenguage_Dominante=" + lenguage_Dominante + "]";
	 }

	 public String getLenguage_Dominante() {
		 return lenguage_Dominante;
	 }


	 
	 

}
