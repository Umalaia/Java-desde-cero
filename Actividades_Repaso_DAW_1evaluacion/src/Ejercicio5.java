import java.util.Scanner;

public class Ejercicio5 {
	public static void main(String[] args) {
		// Leer números hasta que se introduzca un 0. Para cada uno indicar si es par o impar. Y al final del proceso, 
		// escribir cuantos son pares e impares y cuanto suman los pares y los impares
		Scanner leer = new Scanner(System.in);
		int num = 0, cuantosPares = 0, cuantosImpares = 0, sumaPares= 0, sumaImpares = 0;

		System.out.println("Introduce un numero");
		num = leer.nextInt();
		while (num !=0) {
			if (num%2 == 0) {
				System.out.println("Es par");
				cuantosPares++;
				sumaPares+=num;	
					
			}
			else
			if (num%2 != 0) {
				System.out.println("Es impar");
				cuantosImpares++;
				sumaImpares+=num;	
				
			}	System.out.println("Introduce otro numero");
				num = leer.nextInt();
				
		} 	
			System.out.println("Total numeros pares : " + cuantosPares);
			System.out.println("Total numeros pares : " + cuantosImpares);
			System.out.println("La suma de los pares son : " + sumaPares);
			System.out.println("La suma de los impares son : " + sumaImpares);
			System.out.println("La suma de numeros pares e impares es : " +(sumaPares + sumaImpares));

	}

}
