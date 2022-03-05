/*  Exercise 7 : Write a Java program  to insert a record with values taken from user into the table countries against each columns using prepared statement. 
We can use a string array to store our own values.  */
package jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Exercise7
{
	public  String country_id;
	public  String country_name;
	public  String region_id;
	public String region_name;
	public static void main(String[] args) throws SQLException
	{
		Scanner sc=new Scanner(System.in);		
		System.out.println("Enter Country Id : ");
		int country_id = sc.nextInt();
		System.out.println("Enter Country Name : ");
		String country_name = sc.nextLine();
		System.out.println("Enter Region Id: ");
		int region_id = sc.nextInt();
		System.out.println("Enter Region Name : ");
		String region_name = sc.nextLine();
		try
		{	   
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/JDBCExamples","root","root");
			Statement stmt = con.createStatement();
			PreparedStatement pstmt = con.prepareStatement("insert into countries(country_id, country_name, region_id, region_name) values(?,?,?,?)");  
			pstmt.setLong(1,country_id); 
			pstmt.setString(2,country_name);  
			pstmt.setLong(3,region_id);
			pstmt.setString(4,region_name);
			int i = pstmt.executeUpdate();  
			System.out.println(i+" records inserted");        
			con.close();  
		}
		catch(Exception e)
		{
			System.out.println(e);
		}  
	  
	}  
}
