import java.util.Scanner;

public class MostrarLetras {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String palabra = "", vocales = "", consonantes = "";
		char letra = ' ';
		
		System.out.println("Introduce una palabra");
		palabra = leer.next();

		for (int i=0; i< palabra.length(); i++) {
			letra = palabra.charAt(i);
			if ((letra == 'a') ||
				(letra == 'e') || 
				(letra == 'i') || 
				(letra == 'o') || 
				(letra == 'u')) 
				vocales+=letra;
				else
					if( letra>= 'b' && letra <='z' || letra == 'ñ')
						consonantes += letra;
				
			}
			System.out.println("Palabra : " + palabra +"       Vocales : " + vocales + "     Consonantes : "+ consonantes);
		}

	}


