import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestList {

	public static void main(String[] args) {
		List<String> lista1, lista2, lista3;
		
		lista1 = new ArrayList<>();
		
		lista1.add("tomas");
		lista1.add("carmen");
		lista1.add("eva");
		lista1.add("sara");
		lista1.add("tomas");
		
		for(String nombre: lista1) {
			System.out.println(nombre);
		}
		
		lista2 = new LinkedList<>();
		lista2 = lista1;
				
				for (String ele: lista2) 
					System.out.println(ele);
				

	}

}
