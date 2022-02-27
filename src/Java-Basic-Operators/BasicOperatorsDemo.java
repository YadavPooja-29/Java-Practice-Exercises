// All Practice Examples //

/* 
Exercise : Write a program to print output if Feb month has 29 days then the year is a leap year.
*/

import java.util.*;
class LeapYear
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year to check whether it is leap year :");
        int y = sc.nextInt();
        if(y%4==0)
        {
            System.out.println("Year "+y +" has 29 days in February");
        }
        else
        {
            System.out.println("Year "+y +" has 28 days in February");
        }
    }
}

/* 
Exercise 1 : Write a program to print the value of variable int i=10 using prefix and post fix ++ operator.
*/
import java.io.*;
class Main
{
    public static void main(String args[])
    {
        int i = 10;
        System.out.println("Value after prefix operation :"+(++i));
        System.out.println("Value after postfix operation :"+(i++));
    }
}


/* 
Exercise 2 :
Write a program to print the result if result is combination of 
a.	 true and true 
b.	true and false
c.	false and true
    Use && operator 
*/

import java.io.*;
class Main
{
    public static void main(String args[])
    {
        boolean a = true;
        boolean b = false;
        System.out.println("If values are true and true  :"+(a && a));
        System.out.println("If values are true and false  :"+(a && b));
        System.out.println("If values are false and true  :"+(b && a));
        System.out.println("If values are false and false :"+(b && b));
    }
}


/* 
Exercise 3 : Write a program using Relational operators to print whether variable i is between 10 to 20.
*/

import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for i:");
        int i = sc.nextInt();
        if(i>=10 && i<=20)
        {
            System.out.println("variable i is in range");
        }
        else
        {
            System.out.println("Please enter value in range");
        }
    }
}


/*
Exercise 4 : Write a program using ternary operator to print value of x if x is less than 10 else it should print value of y.(Input x=5,y=13)
*/

import java.util.*;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for x and y :");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int c = (x<10) ? x: y;
        System.out.println( "Value of y is : " + c );
    }
}

/*
Exercise 5 : Write a program using instanceof operator to tests whether a String name = "ATDEV" is an instance of class Object.
*/

import java.util.*;
public class Main
{
    public static void main(String args[])
   {
        String name = "ATDEV";
        // following will return true since name is type of String
        boolean result = name instanceof String;
        System.out.println( result );
   }
}


