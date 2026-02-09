package juegoU9;

public class Esbirros extends Personaje {
	
	private String grito;
	private int danio;
	
	public Esbirros(String nombre, int vida,int danio,Arma arma,String grito) {
		super(nombre, vida, danio, arma);
		this.grito=grito;
	}
	public String gritoGuerra() {
		
		return this.grito;
	}
	

}
