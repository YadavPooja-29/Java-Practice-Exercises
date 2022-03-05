//Exercise 2 : Write a JAVA program to insert 5 records in BANK table with column ("AccountNo","AccountBal")  using prepared statement.
package jdbcExamples;

import java.sql.Connection;
import  java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise2
{
	static final String url ="jdbc:mysql://localhost/JDBCExamples";
	static final String user = "root";
	static final String password = "root";
	
    public static void main(String args[])throws SQLException
    { 
    	Connection conn = DriverManager.getConnection(url, user, password);
   	 	Statement stmt = conn.createStatement();
   	 
   	 	// Open a connection
        try
        {	         	 
        	String query = "insert into bank(AccountNo,AccountBal) values (?,?);";      	    
       	    PreparedStatement pstmt = conn.prepareStatement(query);
       	    pstmt.setLong(1, 287651100);
       	    pstmt.setLong(2, 2000);
       	    pstmt.execute();
       	    
       	    pstmt.setLong(1, 287651101);
       	    pstmt.setLong(2, 4000);
       	    pstmt.execute();
       	    
       	    pstmt.setLong(1, 287651102);
       	    pstmt.setLong(2, 5000);
       	    pstmt.execute();
       	    
       	    pstmt.setLong(1, 287651103);
       	    pstmt.setLong(2, 6000);
       	    pstmt.execute();
       	
       	    pstmt.setLong(1, 287651104);
       	    pstmt.setLong(2, 7000);
       	    pstmt.execute();
       	    
       	  
       	    System.out.println(" Records added Successfully ");
   	        conn.close();
   	    }
        catch (Exception exc)
   	    {
   	      exc.printStackTrace();
   	    }
   	}
        
} 
 

