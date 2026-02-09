package herenciaU8;

public class Cuerpo {
	private String nombrePropietario;
	
	public Cuerpo(String nombrePropietario) {
		this.nombrePropietario=nombrePropietario;
	}
	//Metodo
	public void nacer() {
		Corazon miCorazon = new Corazon();
		miCorazon.latir();
	}
	
	//Clase interna
	class Corazon{
		public void latir() {
			System.out.println("Esta latiendo");
		}
	}
}
