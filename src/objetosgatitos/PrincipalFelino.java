package objetosgatitos;
import java.util.*;
public class PrincipalFelino {

	public static void main(String[] args) {
		Felino gatito_raro=new Felino();
		Felino gatito_normal = new Felino("negro");
		
		System.out.println("Patas del gato raro: "+gatito_raro.getPatas());
		System.out.println("Patas del gato normal: "+gatito_normal.getPatas());
		
		

	}

}
