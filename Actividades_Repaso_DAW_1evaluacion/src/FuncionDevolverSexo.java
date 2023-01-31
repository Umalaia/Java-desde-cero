import java.util.Scanner;

public class FuncionDevolverSexo {

	public static void main(String[] args) {
		
		System.out.println(devolverSexo("h"));
		
	}

	
	public static String devolverSexo(String genero) {
		Scanner leer = new Scanner(System.in);
		System.out.println("Introduzca su sexo, siendo M para mujer y H para hombre");
		genero = leer.next();
		switch (genero) {
		case "m": case "M":
			return "Mujer";
			
		case "h": case "H":
			return "Hombre";
		
		default :
			return "Sexo erroneo";	
		}
	}
}
