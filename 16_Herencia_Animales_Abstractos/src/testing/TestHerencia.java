package testing;

import modelo.javabean.Animal;
import modelo.javabean.Gato;
import modelo.javabean.Perro;

public class TestHerencia {

	public static void main(String[] args) {
	//	Animal animal1 = new Animal(4, true, "Animal a secas");
		
	//	animal1.saludar();
	//	animal1.sonido();
	//	animal1.medioLocomocion();
		
		
		Gato gato1 = new Gato(4, true, "Con botas", 7);
		
		gato1.saludar();
		gato1.sonido();
		gato1.medioLocomocion();
		
		Perro perro1 = new Perro(4, true, "Punchi", "Callejero");
		
		perro1.saludar();
		perro1.sonido();
		perro1.medioLocomocion();
		
		

	}

}
