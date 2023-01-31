import javax.accessibility.AccessibleResourceBundle;

public class Ejercicio1ifSimples {

	public static void main(String[] args) {
		/*
		 * variable entera que representa la edad
		 * si edad es mayor o igual de 18 le informamos que es mayor.
		 * pase lo que pase, ponemos fin de programa.
		 */

		int edad = 30;
		
		if (edad >= 18)
			System.out.println("Eres mayor de edad");
		
		System.out.println("FIN DE PROGRAMA");
		
		/*
		 * 2. Tambien si eres menor de edad te informamos.
		 */
		
		
		if (edad >= 18) {
			System.out.println("Eres mayor de edad 2");
			System.out.println("Hola");
		}
		else { 
			System.out.println("Eres menor de edad 2");
			System.out.println("Adios");
		}		
		System.out.println("FIN DE PROGRAMA 2");
		
	}

}
