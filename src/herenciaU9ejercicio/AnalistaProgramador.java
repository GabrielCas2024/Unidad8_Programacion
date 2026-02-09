package herenciaU9ejercicio;

public class AnalistaProgramador extends Programador {
	//Atributo propio de la clase
	private int aniosExp;
	//Contructo que contiene los datos del abuelo(Empleado)  el padre(Programador)
	//Empleado=nombre,id,sueldo y lenguaje
	//Programador= lenguaje_Dominante
	public AnalistaProgramador(String nombre, int id, double sueldoBase, String lenguaje_Dominante
			,int aniosExp) {
		super(nombre, id, sueldoBase, lenguaje_Dominante);
		this.aniosExp=aniosExp;
	}
	
	public double calcularSueldo(int aniosExp) {
		int extra=50;
		double bono=aniosExp*extra;
		this.sueldoBase=this.sueldoBase+bono;
		return this.sueldoBase;
	 }

	@Override
	public String toString() {
		return super.toString()+" AnalistaProgramador [aniosExp=" + aniosExp + "]";
	}

	public int getAniosExp() {
		return aniosExp;
	}

	
}
