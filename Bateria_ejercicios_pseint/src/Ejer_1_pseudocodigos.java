import java.util.Scanner;

public class Ejer_1_pseudocodigos {

	public static void main(String[] args) {
		int n1, n2, suma = 0, resta = 0, producto = 0, division = 0, resto = 0;
		
		
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Escribe un numero entero");
		n1 = leer.nextInt();
		System.out.println("Escribe otro numero entero");
		n2 = leer.nextInt();
		
		suma = (n1 + n2);
		resta = (n1 - n2);
		producto = (n1 * n2);
		division = (n1 / n2);
		resto = (n1 % n2);
		
		System.out.println("Escribe una opcion");
		System.out.println("sumar, restar, multiplicar, dividir o resto");
		String opcion = leer.next();
		switch(opcion) {
			case "sumar":
				System.out.println(suma);
				break;
			case "restar":
				System.out.println(resta);
				break;
			case "multiplicar":
				System.out.println(producto);
				break;
			case "dividir":
				System.out.println(division);
				break;
			case "resto":
				System.out.println(resto);
				break;
			default:
				System.out.println("opcion incorrecta");					
		}
		
		

	}

}
