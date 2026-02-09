package juegoU9;

public class Guerrero extends Personaje {
	protected int fuerza;
	
	public Guerrero(String nombre,int vida,int danioPropio,Arma arma, int fuerza) {
		super(nombre,vida,danioPropio, arma);
		this.fuerza=fuerza;
	}
	public Guerrero(String nombre,int vida,int danioPropio,int fuerza) {
		super(nombre,vida,danioPropio);
		this.fuerza=fuerza;
	}
	//Metodo atacar fuerza+ danio de arma
	public int atacar(int fuerza) {
		int danio=fuerza+this.armaEquipada.getDanio();
		return danio;
	}
}
