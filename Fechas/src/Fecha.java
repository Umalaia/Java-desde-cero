import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Fecha {

	public static void main(String[] args) throws ParseException {
		Date fechaSql = new Date(System.currentTimeMillis());
		
		System.out.println(fechaSql);
		
		String fechaNacim = "1960-11-02";
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		java.util.Date fecha = sdf.parse(fechaNacim);
		
		fechaSql.setTime(sdf.parse(fechaNacim).getTime());
		
		fechaSql.setTime(fecha.getTime());
		
		System.out.println(fechaSql);
		

	}

}
