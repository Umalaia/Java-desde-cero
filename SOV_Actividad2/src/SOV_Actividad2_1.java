import java.util.Scanner;

public class SOV_Actividad2_1 {

	public static void main(String[] args) {
		int l1, l2, l3;
		Scanner leer = new Scanner (System.in);

		System.out.println("Inserte un lado del triangulo");
		l1 = leer.nextInt();
		System.out.println("Inserte otro lado del triangulo");
		l2 = leer.nextInt();
		System.out.println("Inserte el ultimo lado del triangulo");
		l3 = leer.nextInt();
		
		/*
		 * Saber si el triangulo es correcto o no
		 */
		if ((l1+l2)>l3 && (l2+l3)>l1 && (l1+l3)>l2)	
				System.out.println("El triangulo es correcto");
			else
				System.out.println("El triangulo es incorrecto");
		
		/*
		 * Mientras el triangulo sea correcto hacer lo siguiente:
		 */
		 while ((l1+l2)>l3 && (l2+l3)>l1 && (l1+l3)>l2)	{
				
			if (l1==l2 && l2==l3 && l1==l3) 
				System.out.println("El triangulo es equilatero");
			else
			if (l1!=l2 && l1!=l3 && l2!=l3)
				System.out.println("El triangulo es escaleno");
			else
				System.out.println("El triangulo es isosceles");
			
			break;
		 }
			
	}

}
