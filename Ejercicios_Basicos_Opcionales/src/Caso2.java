import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
	Scanner leer = new Scanner(System.in);
	int n1 = 0, n2 = 0;
	
	System.out.println("INSERTE UN NUMERO");
	n1 = leer.nextInt();
	System.out.println("INSERTE OTRO NUMERO");
	n2 = leer.nextInt();
	
	
	if (n1>n2)
		System.out.println("El numero mayor es : " + n1);
	else
		if (n2>n1)
			System.out.println("El numero mayor es : " + n2);
	else
		if (n1 == n2)
			System.out.println("Ambos numeros son iguales");
			
		
		

	}

}
