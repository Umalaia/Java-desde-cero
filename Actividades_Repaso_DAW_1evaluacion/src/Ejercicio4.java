import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
	//Leer un número y mostrar su cuadrado, repetir el proceso hasta que se introduzca un número negativo
		Scanner leer = new Scanner(System.in);
		double num = 0.0;
		
		System.out.println("Introduce un numero, negativo para terminar");
		num = leer.nextInt();
		
		while (num >=0) {
			System.out.println("el cuadrado es : " + Math.pow(num, 2));
			num = leer.nextInt();
		} System.out.println("Error, se ha introducido un numero negativo");
		
		leer.close();
		}

}
