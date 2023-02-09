package fechasantiguas;

import java.sql.Date;

public class TestSqlJavaSql {

	public static void main(String[] args) {
	//	java.util.Date fechaUtil = new java.util.Date();
		
	//	Date mifecha = new Date(fechaUtil.getTime());
		
		Date mifecha = new Date(new java.util.Date().getTime());
		
		System.out.println(mifecha);

	}

}
