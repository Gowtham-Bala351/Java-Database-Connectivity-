package DynamicReading_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Deletevalues {

	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
		System.out.println("connectionj established---");
		
//		creating query with place holders
		PreparedStatement ps=con.prepareStatement("delete from employee where empid=?");
		
		Scanner sc=new Scanner(System.in);
		
//		taking input from user
		System.out.println("enter id...");
		int id=sc.nextInt();
		
//		set the user enterd values to query
		ps.setInt(1, id);
		
//		execute the query
		ps.executeUpdate();
		System.out.println("values deleted...");
		
		con.close();
	}

}
