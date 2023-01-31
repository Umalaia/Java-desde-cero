import java.util.Scanner;

public class Ejer_2_pseudocodigos {

	public static void main(String[] args) {
		int radio;
		double  circunferencia = 0, area = 0;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Escribe el radio");
		radio = leer.nextInt();
		
		circunferencia = 2*Math.PI*radio;
		area = Math.PI*(radio^2);
		
		System.out.println(circunferencia);
		System.out.println(area);
		
		

	}

}
