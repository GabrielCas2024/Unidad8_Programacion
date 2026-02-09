package juegoU9;

import java.util.ArrayList;

public class Nigromante extends Mago {
	ArrayList <Esbirros> horda;
	
	public Nigromante(String nombre, int vida, int danio ,Arma arma ,int mana) {
		super(nombre, vida, mana, arma, mana);
		horda=new ArrayList<>();
	}
	
	//Metodo de invocacion de esbirros, muestra en pantalla "He invocado una"
	public void invocar(Esbirros esbirro) {
		horda.add(esbirro);
		System.out.println("He invocado al esbirro: "+esbirro.getNombre());
	}
	
	public int ataqueHorda() {
		int danioTotal=0;
		for(Esbirros s : horda) {
			 danioTotal=+s.getDanioPropio()+s.getArmaEquipada().getDanio();
		}
		return danioTotal;
	}
	//Metodo para crear esbirro
	

}
