package herenciaU9ejercicio;

public class Gerente extends Empleado {
	//Atributos propios de la clase
	private String departamento;
	
	//Contructor propio de la clase + los datos de la clase Padre(Empleado)
	public Gerente(String nombre, int id, double sueldoBase,String departamento) {
		super(nombre, id, sueldoBase);
		this.departamento=departamento;
	}
	//Metodo calcularSalario
	public double calcularSueldo(int esp_Tecnica) {
		 double bono=this.sueldoBase*0.15;
		 this.sueldoBase=this.sueldoBase+bono;
		 return this.sueldoBase;
	 }
	@Override
	public String toString() {
		return super.toString()+" Gerente [departamento=" + departamento + "]";
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	
	

}
