import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		//Realizar una función, a la que se le pase como parámetro un número N, y muestre por pantalla N veces,
		//el mensaje: “Módulo ejecutándose”
		int num = 0;
	
		mostrarNVeces(num);

	}
	
	public static void mostrarNVeces(int n) {
		Scanner leer = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Cuantas veces");
		num = leer.nextInt();
		
		for (int i=1; i<=num; i++) {
			System.out.println("Modulo ejecutandose");
			
		}
		
		/*
		 *  o hacerlo de esta manera
		 *  
		 *  for (int i= 0; i<num; i++) {
			System.out.println("Modulo ejecutandose");
		}
		
		 */
	}

}
