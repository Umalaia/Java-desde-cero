
public class Ejercicio10 {

	public static void main(String[] args) {
		//Diseñar una función que tenga como parámetros tres números, y que calcule y devuelva el máximo

		devolverMaximo(5,3,5);
	}
	
	public static void devolverMaximo( int n1, int n2, int n3) {
		if (n1>n2 && n1>n3)
			System.out.println(n1);
		else
			if (n2>n1 && n2>n3)
				System.out.println(n2);
			else 
				if (n3>n1 && n3>n2)
					System.out.println(n3);
				else 
					if (n1==n2 && n2==n3)
				System.out.println("Son iguales");
					else 
						if (n1==n2 && n1>n3)
							System.out.println(n1);
						else 
							if (n1==n3 && n1>n2)
								System.out.println(n1);
							else
								if (n2==n1 && n2>n3)
									System.out.println(n2);
								else 
									if (n2==n3 && n2>n1)
										System.out.println(n2);
									else 
										if (n3==n1 && n3>n2)
											System.out.println(n3);
										else 
											if
											(n3==n2 && n3>n1)
												System.out.println(n3);
											else System.out.println("Son iguales");
		
	}

}
