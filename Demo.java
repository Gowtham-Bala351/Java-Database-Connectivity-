package DynamicReading_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		Connection con=DriverManager.getConnection("");
		Statement s=con.createStatement();
		
		s.execute("create database databasename");
		
		
	}

}
