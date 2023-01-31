import java.util.Scanner;

public class SOV_Actividad2_2 {

	public static void main(String[] args) {
		/*
		 * Inicializar la variable intentos = 1, para que el primer numero introducido ya cuente como 1 intento
		 */
		int aleatorio, intentos = 1, numero;
		Scanner leer = new Scanner(System.in);
		
		intentos = intentos++;
		aleatorio = (int)(Math.random()*40+1);
		
		System.out.println("BIENVENIDO A ¡HACIERTA EL NUMERO!");
		System.out.println("Inserte un numero del 1 al 40");
		numero = leer.nextInt();
		
		/*
		 * Mientras el numero introducido sea diferente al numero generado aleatoriamente, ir leyendo numeros
		 * hasta que se acierte, mostrando cada vez que no se acierte una ayuda para ver si el numero aleatorio
		 * es mayor o menos del introducido. Incrementando en 1 los intentos.
		 * Tambien, si introducen un numero <1 o >40, mostrar numero erroneo y volver a leer el numero, 
		 * sin que esto cuente como intento.
		 */
			
		while (numero !=aleatorio) {
			if (numero > 40 || numero < 1) {
				System.out.println("Numero erroneo");
				numero = leer.nextInt();
			}
		
			else
			if (aleatorio > numero) {
				intentos++;
				System.out.println("El numero es mayor");
				numero = leer.nextInt();
				
			}
			else
			if (aleatorio < numero) {
				intentos++;
				System.out.println("El numero es menor");
				numero = leer.nextInt();
			}
		} 
		
		System.out.println("¡Has ganado!");
		System.out.println("Numero de intentos : "+ intentos);

	}

}
