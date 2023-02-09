
public class Envolventes {

	public static void main(String[] args) {
		Integer num =7;
		int entero = num;
		System.out.println(num + " - " + entero);
		
		entero = 97;
		num = entero;
		System.out.println(num + " - " + entero);

		String edad = "62";
		entero = Integer.parseInt(edad);
		System.out.println(num + " - " + entero);
		
		System.out.println(Integer.MAX_VALUE);
		
		num = Integer.valueOf(edad);
		System.out.println(num + " - " + entero);
		
		
		
		
	}

}
