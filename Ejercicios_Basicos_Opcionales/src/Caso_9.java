import java.util.Scanner;

public class Caso_9 {

	public static void main(String[] args) {
		int num = 0;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Escribe un numero");
		num= leer.nextInt();
		
		if (num >= 0 && num<=9999)
			System.out.println("La cantidad de digitos que tiene es : " + (int)(Math. log10(num)+1));
		else
			System.out.println("Error");
	}

}
