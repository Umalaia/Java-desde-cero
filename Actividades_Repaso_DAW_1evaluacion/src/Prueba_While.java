import java.util.Scanner;

public class Prueba_While {
//Hacer un programa para ingresar un número, si el número es mayor a 10, 
	//multiplique los 10 primeros números, sino, sumar los 10 primeros números.
	
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int numero = 0, prod = 1, suma = 0, totalNum = 1;
		System.out.println("Ingrese un numero");
		numero = leer.nextInt();
		
		while (totalNum !=10) {
			if (numero>10) {
			prod *= numero;
			totalNum++;
			System.out.println("Ingrese un numero");
			numero = leer.nextInt();
			}
			else if  (numero<10) {
			suma+=numero;
			totalNum++;
			System.out.println("Ingrese un numero");
			numero = leer.nextInt();
			}
		}
		System.out.println("LA MULTIPLICACION ES : "+prod);
		System.out.println("LA SUMA ES : "+suma);
		
	}
		
	

}
