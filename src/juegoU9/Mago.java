package juegoU9;

public class Mago extends Personaje {
	protected int mana; 
	public Mago(String nombre, int vida,int danioPropio, Arma arma,int mana) {
		super(nombre, vida, danioPropio, arma);
		this.mana=mana;
	}
	public Mago(String nombre, int vida,int danioPropio,int mana) {
		super(nombre,vida,danioPropio);
		this.mana=mana;
	}
	//metodo ataque (mana/2)+ danio del arma
	public void ataqueMago() {
		
	}

}
