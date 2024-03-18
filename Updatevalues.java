package DynamicReading_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Updatevalues 
{
public static void main(String[] args) throws ClassNotFoundException, SQLException 
{
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/company","root","root");
	System.out.println("connectionj established---");
	
//	creating query with placeholders
	PreparedStatement ps=con.prepareStatement("update employee set ename=? where empid=?");
	
	Scanner sc=new Scanner(System.in);
//	taking input from user 
	System.out.println("enter id........");
	int id=sc.nextInt();
	System.out.println("enter new name to be updated....");
	String name=sc.next();
	
//	setset the user entered values to query
	ps.setString(1, name);
	ps.setInt(2, id);
	
//	execute the query
	ps.executeUpdate();
	
	con.close();
	
	

}
}
