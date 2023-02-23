package testingJDBC;

import java.sql.Connection;
import modelo.dao.ConexionDaoMy8;

public class testConexionMy8 {

	public static void main(String[] args) {
		Connection conn1 = ConexionDaoMy8.getConexion();
		Connection conn2 = ConexionDaoMy8.getConexion();
		
		System.out.println(conn1);
		System.out.println(conn2);
	}

}
