package ejercicio1;

public class ValidadorEmail {
	//Constructor de la clase
	public ValidadorEmail() {}
	
	public boolean esValido(String email) {
		
		return email.contains("@")&& email.contains(".") && email.length()>8;
		
	}
	
}
