
public class Ejercicio6DoWhile {

	public static void main(String[] args) {

		/*
		 * PROCESAMOS NUMEROS DEL 1 AL 10
		 * ESCRIBIR CADA UNO Y SUMAR TODOS LOS NUMEROS PROCESADOS
		 */
		int acumulador = 0, numero = 1;
		
		do {
			System.out.println(numero);
			acumulador += numero;
			numero++;
		} while (numero<= 10);
		
		

		System.out.println("suma de numero : "+ acumulador);

	}

}
