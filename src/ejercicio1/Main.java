package ejercicio1;
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Dime el nombre del usuario: ");
		String nombre=sc.nextLine();
		System.out.print("Dime el email del usuario: ");
		String email=sc.nextLine();
		
		GestorUsuario gestor = new GestorUsuario();
		gestor.registraUsuario(nombre, email);
		
		
		

	}

}
