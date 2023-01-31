import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String nombre = "", apellido = "";
		int nota = 0;
		
		
		System.out.println("Introduce tu nombre");
		nombre = leer.next();
		System.out.println("Inserte su apellido");
		apellido = leer.next();
		System.out.println("Inserte su nota");
		nota = leer.nextInt();
				
		System.out.print(nombre + " " + apellido + " tiene un ");
		switch (nota){
		case 1,2,3,4 :
			System.out.println("Suspenso");
			break;
		case 5,6:
			System.out.println("Aprobado");
			break;
		case 7,8:
			System.out.println("Notable");
			break;
		case 9,10:
			System.out.println("Sobresaliente");
		}
		

	}

}
