//Exercise 6 : Write a Java program to  alter table countries including columns country_id,country_name and region_id  to add a column region_id .
package jdbcExamples;

import java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
public class Exercise6 
{
	public static void main(String[] args) throws SQLException
	{
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost/JDBCExamples","root","root");
	    Statement stmt=con.createStatement();
	    String aquery ="alter table countries add region_name char(25);";
  	  	stmt.execute(aquery);
  	  	con.close();
	}

}
