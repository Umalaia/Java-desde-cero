package fechasantiguas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFechas {

	public static void main(String[] args) {
		Date miFecha = new Date();
		System.out.println(miFecha);
		
		String fechaPedido = "2023-01-14";
		//Pasar un String a date
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
		
		// Haciendo un try/catch de esta linea de abajo
		//miFecha = sdf.parse(fechaPedido);
		//Sale lo siguiente:
		try {
			miFecha = sdf.parse(fechaPedido);
		} catch (ParseException e) {
			System.out.println("error en el formato");
			e.printStackTrace();
		}
		System.out.println(fechaPedido);
		
		

	}

}
