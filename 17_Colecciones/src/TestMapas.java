import java.util.HashMap;
import java.util.Map;

public class TestMapas {

	public static void main(String[] args) {
		Map<Integer, String> nombres;
		
		nombres = new HashMap<>();
		
		nombres.put(1, "tomas");
		nombres.put(2, "esteban");
		nombres.put(3, "andrea");
		//si utilizo el mismo 3 para el mismo nombre, lo que hace es machacar el contenido, se queda con el último
		nombres.put(3, "carmen");
		
		for (String ele: nombres.values())
			System.out.println(ele);
		

	}

}
