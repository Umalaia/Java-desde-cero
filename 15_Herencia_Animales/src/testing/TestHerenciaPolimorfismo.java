package testing;

import java.util.ArrayList;

import modelo.javabean.Animal;
import modelo.javabean.Gato;
import modelo.javabean.Perro;

public class TestHerenciaPolimorfismo {
	public static void main(String[] args) {
	
		
		Animal animal, gato, perro;
		
		animal = new Animal(2, false, "calamar");
		gato = new Gato(4, true, "Botas", 3);
		perro = new Perro(4, true, "Punchi", "Callejero");
		
		animal.saludar();
		gato.saludar();
		perro.saludar();
		
		
		/*
		 * ArrayList<Animal> animales = new ArrayList<>();
		 * animales.add(new Animal(2, false, "calamar"));
		animales.add(new Gato(4, true, "Botas", 3));
		animales.add(new Perro(4, true, "Punchi", "Callejero"));
		
		for(Animal ele: animales) {
			
			ele.sonido();
		}
		 */
		
		//HACER UN CATING DE UNA CLASE SUPERIOR A UNA INFERIOR, SOLO PASA EN HERENCIA
		Gato migato = (Gato)gato;
		System.out.println(migato.getVidas());
		
		//TAMBIEN SE PUEDE HACER DE ESTA MANERA: 
		System.out.println(((Gato)gato).getVidas());
		
		
	
				
		
		
		
	}
}
