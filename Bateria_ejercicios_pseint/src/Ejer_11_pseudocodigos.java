import java.util.Scanner;

public class Ejer_11_pseudocodigos {

	public static void main(String[] args) {
		int num, numintroducidos = 0, sumanum = 0;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("INTRODUCE UN NUMERO");
		num = leer.nextInt();
		while (num != 0) {
			numintroducidos++;
			sumanum += num;
			num = leer.nextInt();
			
		}
		
			System.out.println("NUMEROS LEIDOS : " + numintroducidos);
			System.out.println("SUMA NUMEROS : " + sumanum);
			System.out.println("LA MEDIA ES : " + sumanum/numintroducidos);
				
			
		}
		
	
}
