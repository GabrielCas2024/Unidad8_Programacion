package herenciaU9ejercicio;
import java.util.*;
public class Principal {

	public static void main(String[] args) {
	/*Crea al menos dos Programadores (un programador y un analista) y un Gerente
	con datos distintos*/		
	Programador new_prog_1= new Programador("Gabriel",23,500,"lava");
	AnalistaProgramador new_Analista_1=new AnalistaProgramador("Roberto", 29, 600, "BD",3);
	
	Gerente new_Gerent_1= new Gerente("Silvia", 18, 700,"Programacion");
	
	//2. Almacena a todos los empleados en un ArrayList<Empleado>.
	ArrayList<Empleado>empleados=new ArrayList<>();
	empleados.add(new_Gerent_1);
	empleados.add(new_Analista_1);
	empleados.add(new_prog_1);
	
	//Muestra el nombre y el sueldo final de cada uno.
	for(Empleado s: empleados) {
		System.out.println(s.getNombre()+s.calcularSueldo());
		//Mostramos los metodos y atributos
		if(s instanceof Gerente) {
			System.out.println("Soy un Gerente y mi departamento es: "+ ((Gerente)s).getDepartamento());
		}else if(s instanceof Programador) {
			System.out.println("Soy un programador mi lenguaje es: "+ ((Programador)s).getLenguage_Dominante());
		}else if(s instanceof AnalistaProgramador){
			System.out.println("Soy un Analista Programador y tengo: "+((AnalistaProgramador)s).getAniosExp());
		}
	}

	}

}
