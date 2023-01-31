import java.util.Scanner;

public class Caso_8 {

	public static void main(String[] args) {
		double precio = 0.0, descuento = 0.0;
		int cantidad = 0;
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Introduzca el precio del articulo");
		precio = leer.nextDouble();
		System.out.println("Introduzca la cantidad comprada");
		cantidad = leer.nextInt();
		
		if (cantidad > 100) {
		descuento = precio - (0.40*precio);
		System.out.println("El precio con el 40 % de descuento aplicado es : " + descuento*cantidad);
		}
		else
		if (cantidad >=25 && cantidad <=100) {
		descuento = precio - (0.20*precio);
		System.out.println("El precio con el 20% de descuento aplicado es : " + descuento*cantidad);
		}
		else
		if (cantidad >=10 && cantidad <=24) {
		descuento = precio - (0.10*precio);
		System.out.println("El precio con el 10% de descuento aplicado es : " + descuento*cantidad);
		}
		else
		if (cantidad < 10)
			System.out.println("El precio de los articulos es : " + precio*cantidad);
		
		
	}

}
