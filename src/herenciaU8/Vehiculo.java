package herenciaU8;
//Clase Padre

public class Vehiculo {
	//Atributos del Padre
	protected  int ruedas;
	private int motor;
	private int ancho;
	private int largo;
	private int peso;
	private String color;
	private boolean asientos_cuero;
	private boolean climatizador;
	//Constructor
	public Vehiculo(int ruedas,int motor,int ancho,int largo,int peso,String color,boolean asientos_cuero) {
		this.ruedas=ruedas;
		this.motor=motor;
		this.ancho=ancho;
		this.largo=largo;
		this.peso=peso;
		this.color=color;
		this.asientos_cuero=asientos_cuero;
		this.climatizador=true;
	}
	// getter y setter
	
	public int getRuedas() {
		return ruedas;
	}

	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}

	public int getMotor() {
		return motor;
	}

	public void setMotor(int motor) {
		this.motor = motor;
	}

	public int getAncho() {
		return ancho;
	}

	public void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getLargo() {
		return largo;
	}

	public void setLargo(int largo) {
		this.largo = largo;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isAsientos_cuero() {
		return asientos_cuero;
	}

	public void setAsientos_cuero(boolean asientos_cuero) {
		this.asientos_cuero = asientos_cuero;
	}

	public boolean isClimatizador() {
		return climatizador;
	}

	public void setClimatizador(boolean climatizador) {
		this.climatizador = climatizador;
	}
	//4- Metodos propios del Padre
	public void Acelerar() {
		System.out.println("estou acelerando... rum");
	}
	
	public void frenar() {
		System.out.println("he frenado...");
	// Metodo toString()
		
	}

	@Override
	public String toString() {
		return "Vehiculo [ruedas=" + ruedas + ",\n motor=" + motor + ",\n ancho=" + ancho + ",\n largo=" + largo + ",\n peso="
				+ peso + ",\n color=" + color + ",\n asientos_cuero=" + asientos_cuero + ",\n climatizador=" + climatizador
				+ "]";
	}
}
