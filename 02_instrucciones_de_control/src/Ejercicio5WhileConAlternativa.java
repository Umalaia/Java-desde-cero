import java.util.Scanner;

public class Ejercicio5WhileConAlternativa {

	public static void main(String[] args) {
	
		/*
		 * leer edad de las personas hasta que pulsen un 0
		 * cuantos he leido correctos, y cuanto suman sus edades
		 */
		int contadorMayores = 0, contadorMenores = 0,sumaEdades = 0, edad = 0;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("TECLEA TU EDAD COMO ENTERO Y 0 PARA TERMINAR");
		edad = leer.nextInt();
		
		while(edad != 0) {
			//procesar la edad : DISTINGUIR CADA UNO QUE ME LLEGA
				if (edad>=18)
					contadorMayores++;
				else 
					contadorMenores++;

				sumaEdades += edad;
		
			 //volver a leer
			System.out.println("TECLEA TU EDAD COMO ENTERO Y 0 PARA TRERMINAR");
			edad = leer.nextInt();
		}
			
			System.out.println("Mayores : "+ contadorMayores);
			System.out.println("Menores : "+ contadorMenores);
			System.out.println("Cuanto suman las edades : "+ sumaEdades);
		}
	

	}

