// All Exercise Examples //

/* Exercise 1:
Write to program to print true if input character 'a' is a Uppercase character.
*/

import java.io.*;
class Main
{ 
    static void check(char ch)
    {
     
        if (ch >= 'A' && ch <= 'Z')
            System.out.println("\n" + ch + " is an UpperCase character");
     
        else if (ch >= 'a' && ch <= 'z')
            System.out.println("\n" + ch + " is a LowerCase character" );
     
        else
            System.out.println("\n" + ch + " is not an aplhabetic character" );
    }
    public static void main(String []args)
    {
        char ch;
        ch = 'A';
        check(ch);
        ch = 'a';
        check(ch);
        ch = '0';
        check(ch);
     
    }
}

/*
Exercise 2: 
Write a program to determine if the input character is a digit or a alphabet.
Use Character.isDigit() method.
*/

import java.io.*;
class Main 
{
    public static void main(String args[]) 
    {
      System.out.println(Character.isDigit('p'));
      System.out.println(Character.isDigit('2'));
   }
}

/* 
Exercise 3: 
Write a program to print all input characters to upper case. 
Use method Character.toUpperCase(). 

eg input 'b' output B
input 'h' output H
*/

import java.io.*;
class Main 
{
    public static void main(String args[]) 
    {
      System.out.println(Character.toUpperCase('b'));
      System.out.println(Character.toUpperCase('h'));
   }
}

/* 
Exercise 4: 
What is the output of below statement
System.out.println(Character.isWhitespace('A'));
System.out.println(Character.isWhitespace(' '));
System.out.println(Character.isWhitespace('\n'));
System.out.println(Character.isWhitespace('\t'));
*/

import java.io.*;
class Main 
{
    public static void main(String args[]) 
    {
        System.out.println(Character.isWhitespace('A'));  
        System.out.println(Character.isWhitespace(' '));  
        System.out.println(Character.isWhitespace('\n'));  
        System.out.println(Character.isWhitespace('\t'));  
   }
}

/* 
Exercise 5: 
What is output of below statement
System.out.println(Character.toLowerCase('A'));
System.out.println(Character.toLowerCase(65));
System.out.println(Character.toLowerCase(48));
*/

import java.io.*;
class Main 
{
    public static void main(String args[]) 
    {
        System.out.println(Character.toLowerCase('A'));  
        System.out.println(Character.toLowerCase(65));  
        System.out.println(Character.toLowerCase(48));  
   }
}
