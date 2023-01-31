import java.text.DecimalFormat;
import java.util.Scanner;

public class SOV_Actividad3_1 {

	public static void main(String[] args) {
		int opcion = 0, numero = 0;
		double oper1 = 0, oper2 = 0;
		char oper3 = ' ';
		String palabra = " ";
		
		// PINTAR MENU Y LLAMAR A LOS METODOS MIENTRAS LA OPCION SEA ENTRE 1 Y 3. AL PUSAR 4, SALIR DEL PROGRAMA
		
		opcion = pintarMenu();
		while (opcion >= 1 && opcion <=3) {
			if (opcion == 1) {
				binario(numero);
				System.out.println(" ");
				opcion = pintarMenu();
			}
			else
			if (opcion == 2) {
				operacion(oper1, oper2, oper3);
			System.out.println(" ");
			opcion = pintarMenu();
			}
			else 
				if (opcion == 3) {
					analizador(palabra);
				System.out.println(" ");
				opcion = pintarMenu();
				}
		
		}
			if (opcion == 4)
				System.out.println("Adiós");
	
	
	}
	
	
		
		/*
		 * METODO PASAR UN NUMERO ENTERO A BINARIO
		 */

	public static void binario(int numero) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce un numero : ");
		numero = leer.nextInt();
		System.out.print("El numero " + numero);
		System.out.println(" en binario es : " + Integer.toBinaryString(numero));
	}
	
		/*
		 * METODO CALCULADORA, SACANDO UN RESULTADO CON DOS DECIMALES
		 */
	
	public static void operacion(double op1, double op2, char op3) {
		double n1 = 0, n2 = 0;
		char operador = ' ';
		Scanner leer = new Scanner(System.in);
		DecimalFormat dosdecimales = new DecimalFormat("#0.00");
		
		System.out.println("Introduce el primer numero");
		n1 = leer.nextDouble();
		System.out.println("Introduce el segundo numero");
		n2 = leer.nextDouble();
		System.out.println("Introduce un operador");
		operador = leer.next().charAt(0);
			if (operador == '+') {
				System.out.println(" ");
				System.out.print(dosdecimales.format(n1));
				System.out.print(" + ");
				System.out.print(dosdecimales.format(n2));
				System.out.print(" = ");
				System.out.println(dosdecimales.format(n1+n2));
			}
			else
				if (operador == '-') {
					System.out.println(" ");
					System.out.print(dosdecimales.format(n1));
					System.out.print(" - ");
					System.out.print(dosdecimales.format(n2));
					System.out.print(" = ");
					System.out.println(dosdecimales.format(n1-n2));
				}
			else 
				if (operador == '*') {
					System.out.println(" ");
					System.out.print(dosdecimales.format(n1));
					System.out.print(" * ");
					System.out.print(dosdecimales.format(n2));
					System.out.print(" = ");
					System.out.println(dosdecimales.format(n1*n2));
				}
			
			else 
				if (operador == '/') {
					System.out.println(" ");
					System.out.print(dosdecimales.format(n1));
					System.out.print(" / ");
					System.out.print(dosdecimales.format(n2));
					System.out.print(" = ");
					System.out.println(dosdecimales.format(n1/n2));
				}
			else 
				if (operador == '%') {
					System.out.println(" ");
					System.out.print(dosdecimales.format(n1));
					System.out.print(" % ");
					System.out.print(dosdecimales.format(n2));
					System.out.print(" = ");
					System.out.println(dosdecimales.format(n1%n2));
				}
			else System.out.println("Operacion no valida");
	}

		/*
		 * METODO ANALIZAR PALABRA, SACANDO POR UN LADO LAS CONSONANTES Y POR OTRO LAS VOCALES Y LA LONGITUD.
		 */
	
	public static void analizador(String palabra) {
		String vocales = "", consonantes = "";
			
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduce una palabra");
		palabra = leer.next();
		
		
		for (int i = 0; i < palabra.length(); i++) {
			//PARA SACAR LAS VOCALES
			char letraVocal = palabra.charAt(i);
			switch(letraVocal) {
			case 'A', 'a': case 'E', 'e': case 'I', 'i': case 'O', 'o': case 'U', 'u':
				vocales += letraVocal;
				break;
			}
	
			//PARA SACAR LAS CONSONANTES
			char letraCons = palabra.charAt(i);
			switch(letraCons) {
			case 'B', 'b': case 'C', 'c': case 'D', 'd': case 'F', 'f': case 'G', 'g': case 'H', 'h': case 'J', 'j': case 'K', 'k': case 'L', 'l': case 'M', 'm': case 'N', 'n':
			case 'Ñ', 'ñ': case 'P', 'p': case 'Q', 'q': case 'R', 'r': case 'S', 's': case 'T', 't': case 'V', 'v': case 'W', 'w': case 'X', 'x': case 'Y', 'y': case 'Z', 'z':
			consonantes += letraCons;
			break;
			}
		}
		
		//MOSTRAR PALABRA, VOCALES, CONSONANTES Y LONGITUD
		System.out.println(" ");
		System.out.printf("%-15s %-15s %-15s %-10s%n", "PALABRA ", "VOCALES", "CONSONANTES", "LONGITUD");
		System.out.println("-----------------------------------------------------------");
		System.out.printf("%-15s %-15s %-15s %-10s%n", palabra, vocales, consonantes, palabra.length());	
	
			
		
	}
	

		/*
		 * PINTAR EL MENU
		 */
		
		public static int pintarMenu(){
			Scanner leer = new Scanner(System.in);
			int opcion = 0;
		System.out.println(" ");	
		System.out.println("  ********  MENU  ********   ");
		System.out.println("-----------------------------");
		System.out.println("1. Conversor decimal-binario");
		System.out.println("2. Calculadora");
		System.out.println("3. Analizador de frase");
		System.out.println("4. Salir");
		System.out.println("     ");
		System.out.println("Introduce una opcion: ");
		opcion = leer.nextInt();
		
		while(opcion <1 || opcion >4) {
			System.out.println("   Opciones del 1 al 4");
			System.out.println(" ");	
			System.out.println("  ********  MENU  ********   ");
			System.out.println("-----------------------------");
			System.out.println("1. Conversor decimal-binario");
			System.out.println("2. Calculadora");
			System.out.println("3. Analizador de frase");
			System.out.println("4. Salir");
			System.out.println("     ");
			System.out.println("Introduce una opcion: ");
			opcion = leer.nextInt();
			}
		return opcion;

		}
			
	}

