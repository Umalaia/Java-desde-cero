import java.util.Scanner;

public class EjercicioSarita {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		String nombre = " ", pass = " ";

		System.out.println("Introduce tu nombre");
		nombre = leer.next();

		if (nombre.equalsIgnoreCase("SARA")) {
			System.out.println("Introduce tu contraseña");
			pass = leer.next();
		} else
			System.out.println("usuario incorrecto");
		if (nombre.equalsIgnoreCase("SARA"))
			if (pass.equalsIgnoreCase("SARITA"))
				System.out.println("ususario y contraseña correctas, bienvenido a la app");
			else
				System.out.println("Contraseña incorrecta");

	}

}
