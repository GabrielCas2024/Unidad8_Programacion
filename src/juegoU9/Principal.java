package juegoU9;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		final int NUM_HERO=3;
		int vida,danioPropio,mana;
/*Crea un ArrayList<Personaje> llamado escuadron. 
 * Pide al usuario por consola que cree 3 héroes. En cada iteración:
• Pregunta el tipo (1-Guerrero, 2-Mago, 3-Nigromante).
• Pide los datos comunes
• Pide los datos específicos*/		
		ArrayList <Personaje> escuadron=new ArrayList<>();
		System.out.println("Crea 3 heroes");
		System.out.println("1- Guerrero");
		System.out.println("2- Mago");
		System.out.println("3- Nigromante");
		//Creamos un bucle que nos permita repetir la cantidad de veces solicitadas
		for(int i=0;i<NUM_HERO;i++) {
		int op=sc.nextInt();
		sc.nextLine();
		System.out.println("Dame el nombre:");
		String nombre=sc.nextLine();	
		sc.nextLine();
		System.out.println("Dame la vida ");
		vida=sc.nextInt();
		sc.nextLine();
		System.out.println("Dame el danio");
		danioPropio=sc.nextInt();
		sc.nextLine();
		switch(op) {
			case 1: {
				System.out.println("Como has seleccionado al Guerrero necesito que me des la fuerza de el");
				int fuerza=sc.nextInt();
				sc.nextLine();	
				Guerrero new_g_1 = new Guerrero(nombre,vida,danioPropio,fuerza);
				Arma armaGuerrero= new Arma("Espada",15);
				new_g_1.setArmaEquipada(armaGuerrero);
			
			}break;
			case 2:{
				System.out.println("Como has seleccionado al Mago necesito que me indiques el 'Mana'");
				int fuerza=sc.nextInt();
				sc.nextLine();	
					
				Mago new_M_1 = new Mago(nombre,vida,mana);
				Arma armaMago= new Arma("barita",20);
			}break;
			case 3:{
				System.out.println("Has seleccionado al NIGROMANTE!!");
				System.out.println("Completa los datos");
				System.out.println("Dame el nombre de tu Nigromante");
				String nombre=sc.nextLine();			
				do {
					System.out.println("Dame la vida de tu Nigromante");
					vida=sc.nextInt();
				}while(!sc.hasNextInt());
				do {
					System.out.println("Dame la fuerza de tu Nigromante");
					fuerza=sc.nextInt();
				}while(!sc.hasNextInt());	
				Nigromante new_N_1 = new Nigromante(nombre,vida,fuerza);
			}break;
			}
		}
		
		
	}

}
