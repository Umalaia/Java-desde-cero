import java.util.Scanner;

public class Mayor_MenorDeEdad_Y_Sexo {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int edad = 0;
		char sexo = ' ';
		
		System.out.println("Inserte su edad");
		edad = leer.nextInt();
		System.out.println("Inserte su sexo (H o M)");
		sexo = leer.next().charAt(0);
		
		if (edad >= 18) {
			System.out.println("Mayor de edad");
			if (sexo == 'h' || sexo == 'H')
				System.out.println("Hombre");
			else
			if (sexo =='m' || sexo == 'M')
				System.out.println("Mujer");
		} 
		if (edad < 18) {
		System.out.println("Menor de edad");

			if (sexo == 'h' || sexo == 'H')
				System.out.println("Hombre");
			else
			if (sexo =='m' || sexo == 'M')
				System.out.println("Mujer");
		}
	}

}
