
public class Ejercicio11 {

	public static void main(String[] args) {
		//Función a la que se le pasan dos enteros y muestra todos los números comprendidos entre ellos, 
		//inclusive, siempre de menor a mayor)
		
		numComprendidos(1,12);
		System.out.println("Otra ristra");
		numComprendidos(16,12);
		System.out.println("Otra ristra");
		numComprendidos(12,12);
		
	}

	public static void numComprendidos(int num1, int num2) {
		if (num1<num2)
		for (int i = num1; i <=num2; i++) {
			System.out.println(i);
		}
		else
		if (num1>num2) {
			for (int i = num2; i <=num1; i++) {
				System.out.println(i);
			}
		}
		else 
			if (num1 ==num2)
			System.out.println(num1);

	}
}
