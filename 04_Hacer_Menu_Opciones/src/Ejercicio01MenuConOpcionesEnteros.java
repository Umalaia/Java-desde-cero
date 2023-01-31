import java.util.Scanner;

public class Ejercicio01MenuConOpcionesEnteros {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int opcion = 0, num1 = 0, num2 = 0;
		
		/*
		 * Mientras opcion sea diferente a 5, hacer:
		 * Primero leemos la opcion, antes de hacer el while
		 */
		opcion = pintarMenu();
		while(opcion != 5) {
		System.out.println("Teclea 2 numeros");
		num1 = leer.nextInt();
		num2 = leer.nextInt();
		
		switch(opcion) {
		case 1:
			sumar(num1,num2);
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
		/*
		 * Volvemos a leer el menu al terminar el switch, para que se vuelva a mostrar si no se pulsa el 5
		 */
		opcion = pintarMenu();
		}
		
		System.out.println("Fin de programa");
		
		
		/*
		 * CREAR LAS OPERACIONES QUE QUEREMOS MOSTRAR EN EL SWITCH
		 */
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

	/*
	 * PINTAR EL MENU CON SUS OPCIONES
	 */
	
	public static int pintarMenu() {
		Scanner leer = new Scanner(System.in);
		int opcion= 0;
		
		System.out.println("1.- Sumar");
		System.out.println("2.- Restar");
		System.out.println("3.- Multiplicar");
		System.out.println("4.- Dividir");
		System.out.println("5.- Salir");
		
		System.out.println("Teclea una opcion del 1 al 4, o 5 para salir");
		opcion = leer.nextInt();
		
		while(opcion <1 || opcion >5) {
			System.out.println("Opciones del 1 al 5");
			opcion = leer.nextInt();
		}	
		return opcion;	
	}
	
	
	
}
