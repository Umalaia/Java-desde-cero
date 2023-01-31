import java.security.Identity;
import java.util.Scanner;
import javax.annotation.processing.SupportedSourceVersion;

public class Ejercicio2TresNumerOordenados {

	public static void main(String[] args) {
		int n1 = 0, n2 = 0, n3 = 0;
		Scanner leer = new Scanner(System.in);
		System.out.println("TECLEA TRES NUMEROS ENTEROS");
		n1 = leer.nextInt();
		n2 = leer.nextInt();
		n3 = leer.nextInt();

		if (n1>=n2 && n1>=n3)
			if (n2>=n3)
				System.out.println(n1 + "-" + n2 + "-" + n3);
			else 
				System.out.println(n1 + "-" + n3 + "-" + n2);
				else 
					if (n2>=n3 && n2>=n1)
						if(n1>=n3)
							System.out.println(n2 + "-" + n1 + "-" + n3);
						else 
							System.out.println(n2 + "-" + n3 + "-" + n1);
					else 
						if (n3>=n2 && n3>=n1)
							if (n1>=n2)
								System.out.println(n3 + "-" + n1 + "-" + n2);
							else 
								System.out.println(n3 + "-" + n2 + "-" + n1);
						else 
							System.out.println(n1 + "-" + n2 + "-" + n3);
				
		
							
							
						
				
								
							
					
						
				
			

		
		
		
	}

}
