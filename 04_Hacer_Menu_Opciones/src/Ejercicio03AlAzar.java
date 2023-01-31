
public class Ejercicio03AlAzar {

	public static void main(String[] args) {
		int aleatorio = 0;
		for (int i=1; i<=40; i++) {
		/*
		 * Numero al azar entre el 0 y el 40
		 */
		aleatorio = (int)(Math.random()*40+1);
		System.out.println(aleatorio);
	}

	}
}
