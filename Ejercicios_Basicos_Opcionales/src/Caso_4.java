
public class Caso_4 {

	public static void main(String[] args) {
		int rdodado = 0;
		
		rdodado =(int)(Math.random()*6+1);
		System.out.println("resultado obtenido al lanzar un dado de seis es : "
				+ rdodado);
		System.out.print("La cara opuesta al resultado es : ");
		if (rdodado == 1)
			System.out.println("Seis");
		else
		if (rdodado == 2)
			System.out.println("Cinco");
		else
			if (rdodado == 3)
				System.out.println("Cuatro");
		else
			if (rdodado == 6)
				System.out.println("Uno");
		else
			if (rdodado == 5)
				System.out.println("Dos");
		else
			if (rdodado == 4)
				System.out.println("Tres");
	}

}
