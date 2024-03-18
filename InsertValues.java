package DynamicReading_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertValues 
{
  public static void main(String[]args) throws ClassNotFoundException, SQLException
  {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
	System.out.println("connectionj established---");
	
//	creating query with placeholders
	PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?)");
	
	Scanner sc=new Scanner(System.in);
	
//	take input from user
	System.out.println("enter id..");
	int id=sc.nextInt();
	System.out.println("enter name..");
	String name=sc.next();
	System.out.println("enter address..");
	String address=sc.next();
	System.out.println("enter designation..");
	String desig=sc.next();
	
//	set user entered values to the query
	ps.setInt(1, id);
	ps.setString(2, name);
	ps.setString(3, address);
	ps.setString(4, desig);
	
//	execute the query
	ps.executeUpdate();
	System.out.println("..........values inserted.........");
	
}
}
