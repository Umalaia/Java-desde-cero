package testing;

import java.util.ArrayList;

import modelo.dao.Instituto;
import modelo.javabeans.Alumno;
import modelo.javabeans.Persona;
import modelo.javabeans.Profesor;

public class test {

	public static void main(String[] args) {
		ArrayList<Persona> lista = new ArrayList<>();
		Instituto insti1 = new Instituto(lista);
		
		// test buscarTodas para una persona(objeto) tipo de dato pers (elemento) de una lista(nombre de mi arraylist), 
		//mostrar pers(elemento) -> lista personas
		// la persona pers recorre toda la lista y por cada entrada copia todos los datos de cada registro y lo imprime
			for (Persona pers: lista) {
				System.out.println(pers);
			}
			System.out.println("");
			
		// test alta persona
			lista.add(new Alumno("2315645l", "Lara", "C/Sol, 5", "654789632", "1º DAW"));
			for (Persona pers: lista) {
				System.out.println(pers);
			}
			System.out.println("");
	
		// test eliminar persona
			//System.out.println(insti1.eliminarPersona(insti1.buscarPersona("1234567k")));
		
		// test buscar una
			System.out.println("buscar persona por dni");
			System.out.println(insti1.buscarPersona("2315645l"));
			System.out.println("");
		
		// test buscar por tipo
			for (Persona ele: insti1.buscarPersonaPorTipo("Profesor")) {
				System.out.println(ele);
			}
			System.out.println("");
			
		// hacer con un for recorriendo el arraylist y el if con el instanceof() de cada tipo de persona
			
			
		// toString
			System.out.println("Mostrar al alumno con el toString");
			System.out.println(insti1.buscarPersona("2315645l").toString());
		
		

	}

}
