package herenciaU8;

public class Furgoneta extends Vehiculo {
	//1- Atributos de la clas
	private int plazas_extra;
	private int capacidad_carga;

	//2- Constructor
	public Furgoneta(int ruedas,int motor, int ancho, int largo, int peso, String color, boolean asientos_cuero
			,int plazas_extras,int capacidad_carga) {
		//El super llama a los datos del contructor del padre
		super(ruedas,motor, ancho, largo, peso, color, asientos_cuero);
		this.plazas_extra=plazas_extras;
		this.capacidad_carga=capacidad_carga;
		
		
	}
	//3-Geter y Setter

	public int getPlazas_extra() {
		return plazas_extra;
	}

	public void setPlazas_extra(int plazas_extra) {
		this.plazas_extra = plazas_extra;
	}

	public int getCapacidad_carga() {
		return capacidad_carga;
	}

	public void setCapacidad_carga(int capacidad_carga) {
		this.capacidad_carga = capacidad_carga;
	}
	public void cargarMercancia() {
		System.out.println("Cargando mercancia: "+" ");
	}

	@Override
	public String toString() {
		return super.toString()+ "\nFurgoneta [plazas_extra=" + plazas_extra + ",\n capacidad_carga=" + capacidad_carga + "]";
	}
	
}
