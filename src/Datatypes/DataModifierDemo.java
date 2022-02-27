/* All Practice Examples */

/*
Exercise 1 : 
Write a Java program to declare a Boolean variable with initial value of “true” and later change it to “false” before printing it.
*/

package Datatypes;
import java.io.*;
class DataModifierDemo
{
    public static void main(String[] args)
    {
        boolean a =true;
        System.out.println("Initial Value :"+a);
        System.out.println("Laterial Value:"+(!a));
    }
}

/* Exercise 2 : Print the ASCII value of the character 'h'.  */

package Datatypes;

import java.io.*;
class DataModifierDemo
{
    public static void main(String[] args)
    {
        System.out.println("ASCII Value of h: "+(int)'h');
    }
}

/* Exercise 3 : Write a program to assign a value of 100.235 to a double variable and then convert it to int.  */

package Datatypes;

import java.io.*;
class DataModifierDemo
{
    public static void main(String[] args)
    {
        double a = 100.235;
        System.out.println("Initial Value of a :"+a);
        System.out.println("Value after type casting into Integer :"+(int)a);
    }
}

/* Exercise 4 : Write a program to add 3 to the ASCII value of the character 'd' and print the equivalent character. */

package Datatypes;

import java.io.*;
class DataModifierDemo
{
    public static void main(String[] args)
    {
        System.out.println("ASCII Value of d :"+(int)'d');
        System.out.println("Adding 3 & taking input as Integer :"+(3+(int)'d'));
        System.out.println("Taking input as Character :"+(char)(3+(int)'d'));
    }
}

/* Exercise 5 : Write a program to assign a value of 100.235 to a double variable and then convert it to float. */

package Datatypes;

import java.io.*;
class DataModifierDemo
{
    public static void main(String[] args)
    {
        double a = 100.235;
        System.out.println("Type casting double variable a into float :"+(float)a);
    }
}	
