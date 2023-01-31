import java.util.Scanner;

public class Caso_6 {

	public static void main(String[] args) {
		int num = 0;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Inserte un numero");
		num = leer.nextInt();
		if (num >= 0)
			System.out.println("El numero introducido es : " + num);
		else
			if (num<0)
				System.out.println("El numero introducido es negativo");
		

	}

}
