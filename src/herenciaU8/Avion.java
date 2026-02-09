package herenciaU8;

public class Avion extends Vehiculo {
	private int num_turbinas;
	private int num_Salidas;
	
	public Avion(int ruedas, int motor, int ancho, int largo, int peso, String color, boolean asientos_cuero
			,int num_turbinas,int num_salidas) {
		super(ruedas, motor, ancho, largo, peso, color, asientos_cuero);
		this.num_turbinas=num_turbinas;
		this.num_Salidas=num_salidas;
	}

	public int getNum_turbinas() {
		return num_turbinas;
	}

	public void setNum_turbinas(int num_turbinas) {
		this.num_turbinas = num_turbinas;
	}

	public int getNum_Salidas() {
		return num_Salidas;
	}

	public void setNum_Salidas(int num_Salidas) {
		this.num_Salidas = num_Salidas;
	}
	
	public void volar() {
		System.out.println("Esta volando");
	}

	@Override
	public String toString() {
		return super.toString()+ "Avion [num_turbinas=" + num_turbinas + ", num_Salidas=" + num_Salidas + "]";
	}
	
	
}
