
public class Ejercicio9 {

	public static void main(String[] args) {
		//Diseñar una función que tenga como parámetros dos números, y que calcule y devuelva el máximo
		System.out.print("El numero mayor es : ");
		devolverMaximo(7,8);
		
	}

	
	public static void devolverMaximo( int n1, int n2) {
		if (n1>n2)
			System.out.println(n1);
		else
			if (n2>n1)
				System.out.println(n2);
			else System.out.println("Numeros iguales : " + n1);
		
	}
	
}

/*
 *  o hacerlo con funcion tipo int
 *  
 *  System.out.println(devolverMaximo(7,8));


}


public static int devolverMaximo(int n1, int n2) {
if (n1>n2)
	return n1;
else
	if (n2>n1)
		return n2;
	else return n1;

}
 */

