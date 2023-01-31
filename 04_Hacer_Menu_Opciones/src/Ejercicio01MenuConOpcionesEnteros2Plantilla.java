import java.util.Scanner;

public class Ejercicio01MenuConOpcionesEnteros2Plantilla {

	/*
	 * Construir variable static leer
	 */
	private static Scanner leer;
	
	static {
	leer = new Scanner(System.in);
	}
	
	public static void main(String[] args) {
		
		int opcion = 0, num1 = 0, num2 = 0;
		
		opcion = pintarMenu();
		while(opcion != 5) {
		System.out.println("Teclea 2 numeros");
		num1 = leer.nextInt();
		num2 = leer.nextInt();
		
		switch(opcion) {
		case 1:
			procesarCase1(num1,num2);
			break;
		case 2:
			procesarCase2(num1,num2);
			break;
		case 3:
			procesarCase3(num1,num2);
			break;
		case 4:
			procesarCase4(num1,num2);
			break;
		default:
			System.out.println("opcion erronea");
			break;		
		}
		opcion = pintarMenu();
		}
		
		System.out.println("Fin de programa");
		
		/*
		 * CREAR LAS OPERACIONES
		 */
		
	}
	
	public static void procesarCase1(int op1, int op2) {
		System.out.println("Tratamiento Case 1");
	}
	
	public static void procesarCase1(double op1, double op2) {
		System.out.println("Tratamiento Case 1 sobrecargado");
	}

	public static void procesarCase2(int op1, int op2) {
		System.out.println("Tratamiento Case 2");
	}
	
	public static void procesarCase3(int op1, int op2) {
		System.out.println("Tratamiento Case 3");
	}
	
	public static void procesarCase4(int op1, int op2) {
		System.out.println("Tratamiento Case 4");
	}

	/*
	 * PINTAR EL MENU
	 */
	
	public static int pintarMenu() {
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
