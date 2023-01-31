import java.util.Scanner;

public class Ejercicio5LeerDatosConsola {

	public static void main(String[] args) {
	
		Scanner leer = new Scanner(System.in);
		int numeroLeido = 0;
		System.out.println("teclea un numero");
		numeroLeido = leer.nextInt();
		
		System.out.println("numeroLeido es : " + numeroLeido);
		
		leer.close();

	}

}
