/* 1.	
Exercise 5 : 
Modify the following cat method so that it will compile:
	public static void cat(File file) {
	    RandomAccessFile input = null;
	    String line = null;
	
	    try {
	        input = new RandomAccessFile(file, "r");
	        while ((line = input.readLine()) != null) {
	            System.out.println(line);
        }
	        return;
	    } finally {
        if (input != null) {
	            input.close();
        }
	    }
}
*/

public static void cat(File file)
{
    RandomAccessFile input = null;
    String line = null;

    try {
        input = new RandomAccessFile(file, "r");
        while ((line = input.readLine()) != null)
	 {
            System.out.println(line);
        }
        return;
    } 
    catch(FileNotFoundException fnf)
    {
        System.err.format("File: %s not found%n", file);
    }
    catch(IOException e)
    {
        System.err.println(e.toString());
    } 
    finally 
    {
        if (input != null)
        {
            try {
                input.close();
            } 
            catch(IOException io) {
            }
        }
    }
}


/* 
Exercise 6 :
Add a readList method to ListOfNumbers.java.
This method should read in int values from a file, print each value. 
You should catch all appropriate errors. 
You will also need a text file containing numbers to read in.
*/

import java.io.*;
import java.util.Vector;
public class ExceptionDemo 
{
    private Vector<Integer> victor;
    private static final int SIZE = 10;
    public ExceptionDemo() 
    {
        victor = new Vector<Integer>(SIZE);
        for (int i = 0; i < SIZE; i++)
            victor.addElement(new Integer(i));
        this.readList("testfile.txt");
        this.writeList();
    }
    public void readList(String fileName)
    {
        String line = null;
        try {
            RandomAccessFile raf = new RandomAccessFile(fileName, "r");
            while ((line = raf.readLine()) != null)
            {
                Integer i = new Integer(Integer.parseInt(line));
                System.out.println(i);
                victor.addElement(i);
            }
        } 
        catch(FileNotFoundException fnf)
        {
            System.err.println("File: " + fileName + " not found.");
        }
        catch (IOException io)
        {
            System.err.println(io.toString());
        }
    }
    public void writeList() 
    {
        PrintWriter out = null;

        try {
            out = new PrintWriter(new FileWriter("outfile.txt"));
        
            for (int i = 0; i < victor.size(); i++)
                out.println("Value at: " + i + " = " + victor.elementAt(i));
        } 
        catch (ArrayIndexOutOfBoundsException e) 
        {
            System.err.println("Caught ArrayIndexOutOfBoundsException: " +
                                 e.getMessage());
        } catch (IOException e) 
        {
            System.err.println("Caught IOException: " + e.getMessage());
        } finally
        {
            if (out != null) 
            {
                System.out.println("Closing PrintWriter");
                out.close();
            } 
            else
            {
                System.out.println("PrintWriter not open");
            }
        }
    }

    public static void main(String[] args)
    {
        new ExceptionDemo();
    }
}

/*
Exercise 7 : 
What is output of below code   
class Test extends Exception { } 
class Main { 
public static void main(String args[]) { 
	try { 
	throw new Test(); 
	} 
	catch(Test t) { 
		System.out.println("Got the Test Exception"); 
	} 
	finally { 
		System.out.println("Inside finally block "); 
	} 
} 
} 
*/

Got the Test Exception
Inside finally block

/*
Exercise 8 : What is output of below code
class Test 
{ 
	public static void main (String[] args) 
	{ 
		try
		{ 
			int a = 0; 
			System.out.println ("a = " + a); 
			int b = 20 / a; 
			System.out.println ("b = " + b); 
		} 
		catch(ArithmeticException e) 
		{ 
			System.out.println ("Divide by zero error"); 
		} 
		finally
		{ 
			System.out.println ("inside the finally block"); 
		} 
	} 
} 
*/

a = 0
Divide by zero error
inside the finally block

