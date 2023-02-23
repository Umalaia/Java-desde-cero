package modelo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FamiliaDaoImplMy8 {

	private Connection conn;
	private PreparedStatement ps;
	private ResultSet rs;
	private String sql;
	
	
	public FamiliaDaoImplMy8() {
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Programacion?=serverTimezone=UTC\", "root", "root")";
	}
	
	
	
	
}
