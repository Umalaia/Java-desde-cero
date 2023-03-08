package testing;

import modelo.javabeans.Familia;
import modelo.javabeans.Producto;

public class testAsociacionFamilias {

	public static void main(String[] args) {
		Familia fam1 = new Familia(1, "Pantalones");
		
		Producto prod1 = new Producto(1, "Pantalon verde talla 48", 125, fam1);
		
		Producto prod2 = new Producto(2, "Falda vaquera de mujer talla XS", 70, 
				new Familia(2, "Faldas"));
		
		fam1.setDescripcion("PANTALON");
		
		System.out.println("la variable fam1 : " + fam1);
		System.out.println("la familia del prod1 : " + prod1.getFamilia());
		System.out.println("Descripcion de la familia del producto 1 : "+ prod1.getFamilia().getDescripcion());
		
		System.out.println("Id de la familia es : " + prod1.getFamilia().getIdFamilia());
		
		System.out.println(prod1);
		
		

	}

}
