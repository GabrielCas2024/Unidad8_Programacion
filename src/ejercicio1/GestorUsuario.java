package ejercicio1;

public class GestorUsuario {
	//Creamos un objeto de la clase ValidadorEmail para poder invocar a su metodo
	//no es un atributo de la clase 
	ValidadorEmail validador = new ValidadorEmail();
	
	public GestorUsuario() {}
	
	public void registraUsuario(String nombre,String email) {
		if(validador.esValido(email)) {
			Usuario miUsuario = new Usuario(nombre,email);
		}
	}
}
