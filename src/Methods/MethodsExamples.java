/* 
Exercise 1: 
Write a Java method to find the smallest number among three numbers.

Test Data:
Input the first number: 25
Input the Second number: 37
Input the third number: 29

Expected Output:
The smallest value is 25.0
*/

import java.util.Scanner;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double a = sc.nextDouble();
        System.out.print("Input the Second number: ");
        double b = sc.nextDouble();
        System.out.print("Input the third number: ");
        double c = sc.nextDouble();
        System.out.print("The smallest value is " + smallest(a, b, c)+"\n" );
    }
    public static double smallest(double a, double b, double c)
    {
        return Math.min(Math.min(a, b), c);
    }
}

/* 
Exercise 2: 
Write a Java method to display the middle character of a string.

Input string  "Rakhi".
Output : Middle character is k.
*/

import java.util.Scanner;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = sc.nextLine();
        System.out.print("The middle character in the string: " + middle(str)+"\n");
    }
    public static String middle(String str)
    {
        int position;
        int length;
        if (str.length() % 2 == 0)
        {
            position = str.length() / 2 - 1;
            length = 2;
        }
        else
        {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }
}

/*
Exercise 3: 
Write a Java method to count all words in a string.
Input : I am very happy today
Output : No of words in input string 'I am very happy today' is 5
*/

import java.util.Scanner;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();
        System.out.print("Number of words in the string: " + count_Words(str)+"\n");
    }
    public static int count_Words(String str)
    {
       int count = 0;
        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1))))
        {
            for (int i = 0; i < str.length(); i++)
            {
                if (str.charAt(i) == ' ')
                {
                    count++;
                }
            }
            count = count + 1; 
        }
        return count;
    }
}


/* 
Exercise 4: 
Write a Java method to print characters between two characters (i.e. A to P ).
Print each character on new line.
*/

import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        print_Chars('a', 'p', 20);
        print_Chars('A','P', 20);
    }
    public static void print_Chars(char char1, char char2, int n)
    {
        for (int ctr = 1; char1 <= char2; ctr++, char1++)
        {
            System.out.print(char1 + " ");
            if (ctr % n == 0) System.out.println("");
        }
		System.out.print("\n");
    }
}


/* 
Exercise 5 : 
Write a Java method to check whether a string is a valid password. 

Password rules:
A password must have at least eight characters.
A password consists of only letters and digits.
A password must contain at least two digits.
*/

import java.io.*;
import java.util.*;
class Main 
{
    public void checkvalidation(String s)
    {
	    int n=s.length();
	    boolean let=false;
	    int digit=0;
	    for (int i = 0; i < n; i++)
	    {
		    if(Character.isDigit(s.charAt(i)))
			    digit+=1;
		    if(Character.isAlphabetic(s.charAt(i)))
		    	let=true;
	    }
	    if(n>=8)
	    {
		    if(let==true)
		    {
		    	if(digit>=2)
		    	{
		    		System.out.println("your password is strong");
		    	}
			    else
			    {
			    	System.out.println("your password is not contain 2 number");
		    	}
		    }
		    else
		    {
		    	System.out.println("your password is not contain Character");
	        }
        }
        else
	    {
	    	System.out.println("your password is less than 8 digit");
	    }
    }
    public static void main(String[] args) 
    {
		Main t=new Main();
		t.checkvalidation("Pooja@29");
	}
}

