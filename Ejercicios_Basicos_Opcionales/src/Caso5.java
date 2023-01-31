import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int dia = 0, mes = 0, año = 0;
		String numeromes = "";
		
		System.out.println("Inserte el día");
		dia = leer.nextInt();
		System.out.println("Inserte el mes");
		mes = leer.nextInt();
		System.out.println("Inserte el año");
		año = leer.nextInt();
		
		
		switch (mes) {
		case 1:
			numeromes = "Enero";
		case 2:
			numeromes = "Febrero";
		case 3:
			numeromes = "Marzo";
		case 4:
			numeromes = "Abril";
		case 5:
			numeromes = "Mayo";
		case 6:
			numeromes = "Junio";
		case 7:
			numeromes = "Julio";
		case 8:
			numeromes = "Agosto";
		case 9:
			numeromes = "Septiembre";
		case 10:
			numeromes = "Octubre";
		case 11:
			numeromes = "Noviembre";
		case 12:
			numeromes = "Diciembre";
		
		}
				
		System.out.println("Hoy es dia " + dia + " de " + numeromes + " de " + año);	
		
		
		
	}

}
