import java.util.Scanner;

public class Ejercicio01UsuarioPassword {

	public static void main(String[] args) {
		/*
		 * Pedir usuario por pantalla
		 * si es "sara" ponemos usuario correcto
		 * si no es sara, usuario incorrecto
		 */

		Scanner leer = new Scanner(System.in);
		String usuario = null;
		usuario = leer.next();
		
	/*
	 * 	if (usuario == "sara")
	 */
		if (usuario.equals("sara"))
			System.out.println("USUARIO CORRECTO");
		else
			System.out.println("USUARIO INCORRECTO");
		
	
	String nombre1 = "tomas";
	String nombre2 = "tomas";
	
	/*
	 * if (nombre1 == nombre2)
	 */
	if (nombre1.equals(nombre2))
		System.out.println("SON IGUALES");
	else
		System.out.println("SON DIFERENTES");
		
		
	String nombre3 = new String ("andres");
	String nombre4 = new String ("andres");
	
	/*
	 * if (nombre3 == nombre4)
	 */
	if (nombre3.equals(nombre4))
		System.out.println("SON IGUALES");
	else
		System.out.println("SON DIFERENTES");
	
		
	}

}
