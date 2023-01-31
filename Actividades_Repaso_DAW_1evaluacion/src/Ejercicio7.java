import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Pedir un número entero  y decir cuantas cifras tiene.
		Scanner leer = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Inserte un numero");
		num = leer.nextInt();
		
		
		System.out.println( "El numero de cifras es : " +(int) (Math.log10(num) + 1));
		
		
	}

}
