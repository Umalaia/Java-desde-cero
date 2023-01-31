
public class Ejercicio01Unidimensionales {

	public static void main(String[] args) {
		int [] pares = {2,4,6,8};
		
		String [] nombres = {"andres", "sebastian", "eva"};
		
		int [] impares = new int[10];
		
		String[] meses = {"enero", "febrero", "diciembre"};
		
		int mes = 2;
		System.out.println("el mes es : " + meses[mes-1]);
		
		for (int ele:pares) {
			System.out.println(ele);
		}
		
		for (String ele:meses) {
			System.out.println(ele);
		}
		
		for (int i = 0; i < pares.length; i++) {
			System.out.println("posicion " + i + " está el número : " + pares[i]);
		}
		
		
		String nombre = "tomas escudero delgado y ayala";
		for (String ele: nombre.split(" ")) {
			System.out.println(ele);
		}
		
		String nombre2 = "tomas;escudero;delgado;y;ayala";
		for (String ele: nombre2.split(";")) {
			System.out.println(ele.toUpperCase());
		}
		
	}

}
