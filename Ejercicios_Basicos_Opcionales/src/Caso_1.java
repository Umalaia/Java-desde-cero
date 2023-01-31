import java.util.Scanner;

public class Caso_1 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int num = 0;
		
		System.out.println("Inserte un numero");
		num= leer.nextInt();
		
	switch(num){
		case 1:
			System.out.println("Uno");
			break;
		case 2:
			System.out.println("Dos");
			break;
		case 3:
			System.out.println("Tres");
			break;
		case 4:
			System.out.println("Cuatro");
			break;
		case 5:
			System.out.println("Cinco");
			break;
		case 6:
			System.out.println("Seis");
			break;
		case 7:
			System.out.println("Siete");
			break;
		case 8:
			System.out.println("Ocho");
			break;
		case 9:
			System.out.println("Nueve");
			break;
		case 10:
			System.out.println("Diez");
			break;
		default :
			System.out.println("Numero no válido");
			
	}
		

	}


}
