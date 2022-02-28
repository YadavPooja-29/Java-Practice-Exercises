/* Exercise 1 : Write a Java program to check if a file or directory specified by path name exists or not. */

import java.io.File;
public class FileDemo 
{
    public static void main(String[] args)
    {
        File my_file_dir = new File("D:/ATDEV JavaProgram/car.class");");
        if (my_file_dir.exists()) 
        {
            System.out.println("The directory or file exists.\n");
        } 
        else
        {
            System.out.println("The directory or file does not exist.\n");
        }
    }
}

/* Exercise 2 : Write a Java program to check if given path name is a directory or a file.  */

import java.io.File;
public class FileDemo 
{
   public static void main(String[] args)
    {
        File my_file_dir = new File("D:/ATDEV JavaProgram/car.class");
        if (my_file_dir.isDirectory()) 
        {
            System.out.println(my_file_dir.getAbsolutePath() + " is a directory.\n");
        } 
        else
        {
            System.out.println(my_file_dir.getAbsolutePath() + " is not a directory.\n");
        }
        if (my_file_dir.isFile()) 
        {
            System.out.println(my_file_dir.getAbsolutePath() + " is a file.\n");
        } 
        else
        {
            System.out.println(my_file_dir.getAbsolutePath() + " is not a file.\n");
        }  
    }
}

/* Exercise 3 : Write a Java program to get last modified time of a file. */

import java.io.File;
import java.util.Date;
public class FileDemo 
{
    public static void main(String[] args)
    {
       File file = new File("car.class");
       Date date=new Date(file.lastModified());
       System.out.println("\nThe file was last modified on: "+date+"\n");	   
    }
}

/* Exercise 4 : Write a Java program to read a file content line by line. */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader; 
public class FileDemo 
{
    public static void main(String a[])
    {
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        String str_data = "";
        try{
            BufferedReader br = new BufferedReader(new FileReader("D:/ATDEV JavaProgram/car.class"));
            while (strLine != null)
            {
                if (strLine == null)
                break;
                str_data += strLine;
                strLine = br.readLine();
            }
            System.out.println(str_data);
            br.close();
            } catch(FileNotFoundException e)
            {
                System.err.println("File not found");
            } catch(IOException e)
            {
                System.err.println("Unable to read the file.");
            }
    }
}

/* Exercise 5 : Write a Java program to append text to an existing file. */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
 
public class FileDemo 
{
    public static void main(String a[])
    {
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try
          {
             String filename= "D:/ATDEV JavaProgram/demo.txt";
             FileWriter fw = new FileWriter(filename,true); 
             //appends the string to the file
             fw.write("Java Exercises\n");
             fw.close();
             BufferedReader br = new BufferedReader(new FileReader("D:/ATDEV JavaProgram/demo.txt"));
             //read the file content
             while (strLine != null)
             {
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                System.out.println(strLine);
            }
             br.close();
           }
           catch(IOException ioe)
           {
            System.err.println("IOException: " + ioe.getMessage());
           }
    }
}


/* Exercise 6 : Write a Java program to find the longest word in a text file.  */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class FileDemo 
{
    public static void main(String [ ] args) throws FileNotFoundException 
    {
        new FileDemo().findLongestWords();
    }
    public String findLongestWords() throws FileNotFoundException
    {
       String longest_word = "";
       String current;
       Scanner sc = new Scanner(new File("D:/ATDEV JavaProgram/demo.txt"));

       while (sc.hasNext())
       {
            current = sc.next();
            if (current.length() > longest_word.length()) 
            {
                longest_word = current;
            }
       }
       System.out.println("\n"+longest_word+"\n");
       return longest_word;
    }
}

/* Exercise 7 : Write a Java program to store text file content line by line into an array */

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;

public class FileDemo
{
    public static void main(String a[])
    {
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        List<String> list = new ArrayList<String>();
        try {
             BufferedReader br = new BufferedReader(new FileReader("D:/ATDEV JavaProgram/demo.txt"));
              while (strLine != null)
               {
                strLine = br.readLine();
                sb.append(strLine);
                sb.append(System.lineSeparator());
                strLine = br.readLine();
                if (strLine==null)
                   break;
                list.add(strLine);
            }
        System.out.println(Arrays.toString(list.toArray()));
        br.close();
        } 
        catch (FileNotFoundException e)
        {
            System.err.println("File not found");
        } 
        catch (IOException e) 
        {
            System.err.println("Unable to read the file.");
        }
    }
}
