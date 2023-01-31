import java.util.Scanner;

public class Caso_3 {

	public static void main(String[] args) {
		int mes = 0;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Inserte el numero de mes");
		mes = leer.nextInt();
		
		switch(mes) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println("31 Dias");
			break;
		case 2: 
			System.out.println("28 Dias");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println("30 Dias");
			
		}

	}

}
