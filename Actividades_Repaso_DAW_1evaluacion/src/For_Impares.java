import java.util.Scanner;

public class For_Impares {

	public static void main(String[] args) {
	Scanner leer = new Scanner(System.in);
	int n = 0, num = 0, impar = 1;
	System.out.println("Cuantos elementos va a ingresar (N)");
	n = leer.nextInt();
	
	for (int i=1; i<=n; i++) {
		System.out.println("Inserte un numero");
		num = leer.nextInt();
		if (num%2 !=0) {
			System.out.println(num);
		impar*= num;}
		else System.out.println(num);
		
	} System.out.println("Producto Impares : " +impar);
	
	
	

	}

}
