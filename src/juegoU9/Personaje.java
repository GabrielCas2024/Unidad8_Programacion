package juegoU9;

public class Personaje {
	protected String nombre;
	protected int vida,danioPropio;
	protected Arma armaEquipada;
	
	public Personaje(String nombre,int vida,int danioPropio,Arma arma) {
		this.nombre=nombre;
		this.vida=vida;
		this.danioPropio=danioPropio;
		armaEquipada=arma;
	}
	public Personaje(String nombre,int vida,int danioPropio) {
		this.nombre=nombre;
		this.vida=vida;
		this.danioPropio=danioPropio;
	}
	//Metodos

	public String getNombre() {
		return nombre;
	}


	public int getVida() {
		return vida;
	}

	public Arma getArmaEquipada() {
		return armaEquipada;
	}

	public void setArmaEquipada(Arma armaEquipada) {
		this.armaEquipada = armaEquipada;
	}
	public int getDanioPropio() {return this.danioPropio;}
}
