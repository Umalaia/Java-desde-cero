import java.util.Scanner;

public class Pruebas {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int numero = 0, cuantos = 0;
		System.out.println("Ingrese un numero");
		numero = leer.nextInt();
		
		while (numero>=1) {
			System.out.println("Numero : " + numero);
			System.out.println("Ingrese un numero");
			numero = leer.nextInt();
			cuantos++;
		} System.out.println("Total numeros metidos : " + cuantos);

	}

}
