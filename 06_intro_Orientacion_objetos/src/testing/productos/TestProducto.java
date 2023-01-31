package testing.productos;
import javabeans.Producto;

public class TestProducto {

	public static void main(String[] args) {
		Producto p2 = new Producto(4, "Prestamo hipotecario a 15 años",125_000 ,"Hipotecarios" );
		Producto p1 = new Producto();
		
		p2.setDescripcion("Hipo 15");
		p2.setFamilia("Hipotecario");
		
		System.out.println("la descripcion de p2 es : " + p2.getDescripcion());
		
		System.out.println(p2.toString());
		System.out.println(p1);

	}

}
