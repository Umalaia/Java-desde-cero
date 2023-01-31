import java.util.Scanner;

public class Ejercicio4Whiles {

	public static void main(String[] args) {
		/*
		 * leer edad de las personas hasta que pulsen un 0
		 * cuantos he leido correctos, y cuanto suman sus edades
		 */
		int contador = 0, acumulador = 0, edad = 0;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("TECLEA TU EDAD COMO ENTERO Y 0 PARA TERMINAR");
		edad = leer.nextInt();
		
		while(edad != 0) {
			//procesar la edad : lo mismo para todos los que lea y no sean 0
			contador++;
			acumulador += edad;
			 //volver a leer
			System.out.println("TECLEA TU EDAD COMO ENTERO Y 0 PARA TRERMINAR");
			edad = leer.nextInt();
		}
		
		System.out.println("Edades procesadas : "+ contador);
		System.out.println("Cuanto suman las edades : "+ acumulador);
		
		
	}

}
