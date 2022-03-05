//Exercise 5: Write a Java program to create  a table  countries including columns country_id,country_name and region_id .
package jdbcExamples;

import java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise5 
{

	public static void main(String[] args) throws SQLException
	{		
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost/JDBCExamples","root","root");
	    Statement stmt=con.createStatement();
	    String query ="create table countries(country_id int,country_name char(50), region_id int);";
  	  	stmt.execute(query);
  	  	con.close();
	}

}
