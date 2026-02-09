package herenciaU8;
import java.util.*;
public class PrincipalVehiculo {

	public static void main(String[] args) {
		//Creamos un objeto
		Furgoneta furgoneta_1 = new Furgoneta(4,1,230,265,360,"rojo",true,2,500);
		
		//Mostramos los datos de la furgoneta
		Scanner sc = new Scanner(System.in);
		ArrayList<Vehiculo> vehiculos = new ArrayList<>();
		int ruedas,motor,ancho,largo,peso;
		String color;
		boolean asientos_cuero,climatizador;
		
		for(int i=0;i<3;i++) {
			System.out.println("Ingresa la cantidad de ruedas: ");ruedas=sc.nextInt();
			System.out.println("Ingresa la potencia del motor: ");motor=sc.nextInt();
			System.out.println("Ingresa el ancho del vehiculo: ");ancho=sc.nextInt();
			System.out.println("Ingresa el largo del vehiculo: ");largo=sc.nextInt();
			System.out.println("Ingresa el peso del vehiculo: ");peso=sc.nextInt();sc.nextLine();
			System.out.println("De que color es? ");color=sc.nextLine();
			System.out.println("Posee asientos de cuero? (true/false)");asientos_cuero=sc.nextBoolean();
			vehiculos.add(new Vehiculo(ruedas,motor,ancho,largo,peso,color,asientos_cuero));
		}

		for(Vehiculo s: vehiculos) {
			System.out.println(s.toString());
		}
		sc.close();
	}

}
