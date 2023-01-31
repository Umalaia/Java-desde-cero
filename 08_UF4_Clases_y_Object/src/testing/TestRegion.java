package testing;

import javabeans.Region;

public class TestRegion {

	public static void main(String[] args) {
		String nombre = "andres";
		Region reg1, reg2, reg3;
		
		reg1 = new Region();
		
		reg1.setRegionId(1);
		reg1.setRegionName("Europa");
		
		reg2 = new Region(2, "America"); //Se ha creado una estructura en la direccion por ejemplo 454f4gs4
		reg3 = new Region(2, "America"); // Se ha creado una estructura en la direccion 554fgg
		//por lo tanto, aunque las dos se llamen america, son distintas ya que cada region apunta a una direccion en la memoria
		
		
		System.out.println(reg2.getRegionName());
		
		System.out.println(reg2.toString());
		System.out.println(nombre.toString());
		
		//para comparar el contenido con String usar el equals
		if (reg2.equals (reg3))
			System.out.println("REGIONES IGUALES");
		else 
				System.out.println("REGIONES DISTINTAS");

	}

}
