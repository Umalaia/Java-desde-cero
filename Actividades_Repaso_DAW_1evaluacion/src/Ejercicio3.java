import java.util.Scanner;

public class Ejercicio3 {

	//DISEÑAR UN PROGRAMA QUE MUESTRE EL PRODUCTO DE LOS 10 PRIMEROS NUMEROS IMPARES
    public static void main(String[] args) {
    	Scanner leer = new Scanner(System.in);
    	int num = 0, contadorImpar = 0, prod = 1;
    	System.out.println("Dame un numero");
    	
    	
    	// PORQUE IMPAR != 10, PORQUE COGE EL 10 COMO REFERENCIA DE LOS 10 PRIMEROS Y NO COMO UN NUMERO (10)
    	while (contadorImpar!=10) {
    		num = leer.nextInt();
    		if (num%2 != 0) {
    		prod*=num;
    		contadorImpar++;
    		System.out.println(prod);
    		}
    	}  
    	System.out.println("El producto es : " + prod);
    }
}
