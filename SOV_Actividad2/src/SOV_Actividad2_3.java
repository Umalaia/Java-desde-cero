import java.util.Scanner;

public class SOV_Actividad2_3 {

	public static void main(String[] args) {
	String nombre = "", fin = "fin";
	char genero;
	int contarnombres = 0;
	double salario = 0.0, acumulador = 0;
	contarnombres = contarnombres++;
	
	Scanner leer = new Scanner(System.in);	
	
	/*
	 * Pedir que indique su nombre, su sexo y su salario hasta que indique la palabra FIN
	 */
	while (!nombre.equalsIgnoreCase("fin")){
	System.out.println("Escribe tu nombre");
	nombre = leer.next();
	
	/*
	 * Si nombre introducido es igual a (nombre1 "fin"), mostrar la cantidad de nombres evaluados,
	 * la suma de los salarios y la media de estos, indicando el fin del programa.
	 * Sino, seguir leyendo nombre, genero y salario
	 */
	if (nombre.equalsIgnoreCase(fin)){
		System.out.println("La cantidad de nombres evaluados son : "+ contarnombres);
		System.out.println("La suma de los salarios introducidos es : "+ acumulador);
		System.out.println("La media de los salarios es : "+ acumulador/contarnombres);
		System.out.println("Fin del programa");
		return;
		}
	else
		contarnombres++;
		
		System.out.println("Indica tu sexo (h/H) o (m/M)");
		genero = leer.next().charAt(0);
			
			
		System.out.println("Indica tu salario anual");
		salario = leer.nextDouble();
		acumulador += salario;
	
	/*
	 * Llamar al metodo sexo y salarioPersona y mostrar el resultado en la pantalla
	 */
		System.out.println("" + nombre);
		sexo(genero);
		salarioPersona(salario);
		System.out.println("");
		System.out.println("---Para salir introduzca FIN en el apartado nombre---");
	}
	}
	
	/*
	 * Realizamos los metodos sexo y salarioPersona
	 */

	public static char sexo(char genero) {
		switch (genero) {
		case 'h', 'H':
			System.out.println("Eres un hombre");
			break;
		case 'm', 'M':
			System.out.println("Eres una mujer");
			break;
		default:
			System.out.println("Sexo erroneo");
		}
		return genero;
	}

	
	public static void salarioPersona(double salario) {
		if (salario < 25000) {
			System.out.println("Salario Bajo");	
		}
		else
		if (salario >= 25000 && salario <= 45000) {
			System.out.println("Salario Medio");
		}
		else
		if (salario > 45000) {
			System.out.println("Salario Alto");
		}	
	}
	
}
