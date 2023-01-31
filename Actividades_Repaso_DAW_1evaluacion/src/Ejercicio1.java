import java.util.Scanner;

public class Ejercicio1 {
	//Pedir el día, mes y año de una fecha e indicar si la fecha es correcta (los años que terminan en 00 no son bisiestos) 
	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int dia = 0, mes = 0, anio = 0;
		
		//boolean bisiesto = (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
		
		System.out.println("Ingrese el dia");
		dia = leer.nextInt();
		System.out.println("Ingrese el mes");
		mes = leer.nextInt();
		System.out.println("Ingrese el año");
		anio = leer.nextInt();
																				// NO FUNCIONA!!!! //
		
		switch (mes) {
		case 1,3,5,7,8,10,12:
			if (dia > 1 && dia <= 31)
				if (String.valueOf(anio).charAt(2) != '0' && String.valueOf(anio).charAt(3) != '0') {
					System.out.println("Fecha correcta, es un año bisiesto");
				} else if (dia > 1 && dia <= 31)
					if (String.valueOf(anio).charAt(2) == '0' && String.valueOf(anio).charAt(3) == '0') {
						System.out.println("Fecha correcta, no es un año bisiesto");
					}
			break;

		case 2:
			if (dia == 29)
				if (String.valueOf(anio).charAt(2) != '0' && String.valueOf(anio).charAt(3) != '0') {
					System.out.println("Fecha correcta, es un año bisiesto");
				} else if (dia > 1 && dia >= 28)
					if (String.valueOf(anio).charAt(2) == '0' && String.valueOf(anio).charAt(3) == '0') {
						System.out.println("Fecha correcta, no es un año bisiesto");
					}
			break;
		case 4,6,9,11:

			if (dia > 1 && dia <= 30)
				if (String.valueOf(anio).charAt(2) != '0' && String.valueOf(anio).charAt(3) != '0') {
					System.out.println("Fecha correcta, es un año bisiesto");
				} else if (dia > 1 && dia <= 30)
					if (String.valueOf(anio).charAt(2) == '0' && String.valueOf(anio).charAt(3) == '0') {
						System.out.println("Fecha correcta, no es un año bisiesto");
					}
			break;
		default:
			System.out.println("Fecha erronea");
			
		}
		
		
	}
}
		
		

