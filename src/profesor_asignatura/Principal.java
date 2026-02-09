package profesor_asignatura;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Dime el profesor");
		String nombre_P=sc.nextLine();
		Profesor new_profe= new Profesor(nombre_P);
		

	}

}
