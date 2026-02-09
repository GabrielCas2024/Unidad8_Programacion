package actividadmatematica;
import java.util.*;
public class funciones_matematicas {
	
	public static boolean esCapicua(int num) {
		String texto=String.valueOf(num);
		String invertido ="";
		for(int i=texto.length()-1;i>=0;i--) {
			invertido += texto.charAt(i);
		}
		return texto.equals(invertido);
	}
	
	public static boolean esPrimo(int num) {
		if(num<=0) {
			return false;
		}else {
			for(int i=2;i<=num-1;i++) {
				if(num%i==0) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static int digitos(int num) {
		int cont=0;
		if(num==0)return 1;
		while(num !=0) {
			num=num/10;
			cont++;
		}
		return cont;
	}
	
	public static double potencia(int num,int expo) {
		double numeros=num;
		numeros=Math.pow(num, expo);
		
		return numeros;
	}
	
	
}
