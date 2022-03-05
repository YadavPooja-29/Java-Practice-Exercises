//Exercise 1 : Write a JAVA program to update the Bank table with column ("AccountNo","AccountBal") using resultset object.
package jdbcExamples;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise1 
{		
	static final String url ="jdbc:mysql://localhost/JDBCExamples";
	static final String user = "root";
	static final String password = "yes ";	 
	public static void main(String[] args) throws SQLException
	{
		Connection conn = DriverManager.getConnection(url, user,password);
		Statement stmt = conn.createStatement();
		// Open a connection
	    try
	    {	
		    //Update table coloum	
		    ResultSet rs = stmt.executeQuery("alter table BANK change Acc_no to AccountNo , Acc_bal to AccountBal");
		    while(rs.next())
		    {}
			String  selectSql=  "select * from BANK";
			stmt = conn.createStatement();	
			stmt.executeQuery(selectSql);
	         
	        conn.close();
	     }
	    catch (Exception exc)
	    {
	    	exc.printStackTrace();
	    }
	}
}
 