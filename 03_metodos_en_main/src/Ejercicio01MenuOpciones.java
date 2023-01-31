import java.util.Scanner;

public class Ejercicio01MenuOpciones {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int num1 = 0, num2 = 0, opcion = 0;

		System.out.println("teclea dos numeros");
		num1 = leer.nextInt();
		num2 = leer.nextInt();
		
		opcion = leer.nextInt();
		
		switch(opcion) {
			case 1:
				sumar(num1,num2);
				sumar (2.3,5.6);
				break;
			case 2:
				restar(num1,num2);
				break;
			case 3:
				multiplicar(num1,num2);
				break;
			case 4:
				dividir(num1,num2);
				break;
			default:
				System.out.println("opcion erronea");
				break;				
		}
		
		System.out.println("FIN DE PROGRAMA");
		
	}
	
	public static void sumar(int op1, int op2) {
		int resultado = 0;
		resultado = op1 + op2;
		System.out.println("La suma es : " + resultado);
	}
	
	public static void sumar(double op1, double op2) {
		double resultado = 0;
		resultado = op1 + op2;
		System.out.println("La suma de doubles es : " + resultado);
	}

	public static void restar(int op1, int op2) {
		System.out.println("La resta es : " + (op1 - op2));
	}
	
	public static void multiplicar(int op1, int op2) {
		System.out.println("La multiplicacion es :" + (op1 * op2));
	}
	
	public static void dividir(int op1, int op2) {
		if (op2 == 0)
			System.out.println("La division es imposible");
		else
		System.out.println("La division es : " + (op1 / op2));
	}
	
	
	
	
}
