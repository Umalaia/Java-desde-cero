import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		double base = 0, altura = 0, area = 0;
		Scanner leer = new Scanner(System.in);
		
		
		System.out.println("Introduce la base del triangulo");
		base = leer.nextDouble();
		System.out.println("Introduce la altura del triangulo");
		altura = leer.nextDouble();
		
		area = base * (altura/2);
		 System.out.println("El área del triangulo es : " + area);
		
		
		
		
		
		
		
		
		

	}

}
