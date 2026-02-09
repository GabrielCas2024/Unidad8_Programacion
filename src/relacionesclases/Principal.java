package relacionesclases;

public class Principal {

	public static void main(String[] args) {
		//Cuenta miCuenta = new Cuenta("ES25 2255 55222 3354548",85547);
		Persona silvia= new Persona("Silvia","Orenes","12354835L",new Cuenta("ES25 2255 55222 3354548",85547));
		
		System.out.println("Datos de la persona: ");
		System.out.println("Nombre: "+silvia.getNombre());
		System.out.println("Apellidos: "+ silvia.getApellidos());
		System.out.println("Dinero de la cuenta: "+silvia.getCuenta	().getCantidad());
		

	}

}
