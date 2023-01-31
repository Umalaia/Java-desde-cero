
import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
		double num1 = 0, num2 = 0;
		char operador = ' ';
		Scanner leer = new Scanner(System.in);

		
		System.out.println("Introduce el primer numero");
		num1 = leer.nextDouble();
		System.out.println("Introduce el segundo numero");
		num2 = leer.nextDouble();
		System.out.println("Introduce un operador (+,-,*,/,%)");
		operador = leer.next().charAt(0);
		
		switch(operador) {
		case '+':
			System.out.println("La suma es : "+ (num1+num2));
			break;
		case '-':
			System.out.println("La resta es : "+ (num1-num2));
			break;
		case '*':
			System.out.println("El producto es : "+ (num1*num2));
			break;
		case '%':
			System.out.println("El resto es : "+ (num1%num2));
			break;
		case '/':
			if (num2 != 0)
				System.out.println("La division es : "+ (num1/num2));
			else
				System.out.println("No divisible entre 0");
			
		
		
		
		}
		
		

	}

}
