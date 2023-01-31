import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int numero = 0, suma = 0;
		
		System.out.println("Inserte un numero");
		while (suma <= 30) {
			numero = leer.nextInt();
			suma += numero;
			
		} System.out.println("El numero es mayor de 30 y en total suma : " + suma);
		

	}

}
