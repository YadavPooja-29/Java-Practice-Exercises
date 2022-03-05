//Exercise 3 : Write a JAVA program to update the records in BANK table using Statement.executeUpdate().
package jdbcExamples;

import java.sql.Connection;
import  java.sql.DriverManager;

import java.sql.SQLException;
import java.sql.Statement;
public class Exercise3 
{

	public static void main(String[] args) throws SQLException 
	{
		Connection con= DriverManager.getConnection("jdbc:mysql://localhost/JDBCExamples","root","root");
	    Statement stmt=con.createStatement();
	    try 
	    {
	    	String update_query="update bank set AccountNo = 287651105 WHERE AccountBal=5000;";
	    	stmt.executeUpdate(update_query);
	    	con.close();
	    }

	    catch(Exception e)
	    {
	    	e.printStackTrace();	
	    }
	}

}