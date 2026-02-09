package objetosgatitos;

public class Felino {
	private boolean bigotes;
	private int patas;
	private int ojos;
	private int orejas;
	private String pelaje;
	
	//Constructor
	public Felino() {}
	public Felino(String pelaje) {
		this.bigotes=true;
		this.ojos=2;
		this.orejas=2;
		this.patas=4;
		this.pelaje=pelaje;
		
		//Getters  y Setters
	}
	public boolean isBigotes() {
		return bigotes;
	}
	public void setBigotes(boolean bigotes) {
		this.bigotes = bigotes;
	}
	public int getPatas() {
		return patas;
	}
	public void setPatas(int patas) {
		this.patas = patas;
	}
	public int getOjos() {
		return ojos;
	}
	public void setOjos(int ojos) {
		this.ojos = ojos;
	}
	public int getOrejas() {
		return orejas;
	}
	public void setOrejas(int orejas) {
		this.orejas = orejas;
	}
	public String getPelaje() {
		return pelaje;
	}
	public void setPelaje(String pelaje) {
		this.pelaje = pelaje;
	}
	
	//Metodos publicos
	public void emitir_sonido(String sonido) {
		System.out.println("sonido");
	}
	public void cazar() {
		System.out.println("Puedo ccazar");
	}
	public void informacionFelino() {
		System.out.println("Este felino tiene "+ this.patas + "patas");
		System.out.println("Este felino tiene "+ this.orejas + "orejas");
		System.out.println("Este felino tiene "+ this.ojos + "ojos");
		System.out.println("Y su color es "+ this.pelaje);
	}
	
}
