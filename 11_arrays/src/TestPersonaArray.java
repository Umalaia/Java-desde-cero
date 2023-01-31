
public class TestPersonaArray {

	public static void main(String[] args) {
		Persona [] personas = 
			{ new Persona("eva", "gomez", "664666777"),
			  new Persona("sara", "garcia", "665688854"),
			  new Persona("tomas", "escudero", "636545485")
			};

		System.out.println(personas[1].getNombre());
		System.out.println(" ");
		
		for(Persona ele: personas) {
			System.out.println(ele.getNombre());
		}
		
	}

}
