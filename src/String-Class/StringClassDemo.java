// All Examples //

/*
Exercise 1 :
Write a Java program to get the character at the given index within the String. 

Sample Output:
Original String = Java Exercises! The character at position 0 is J
*/

import java.io.*;
public class Main 
{
    public static void main(String[] args)
    {
        String str = "Hello! It's me Pooja Yadav ";
        System.out.println("Original String = " + str);
        int index1 = str.charAt(0);
        int index2 = str.charAt(15);

        System.out.println("The character at position 0 is " +(char)index1);
        System.out.println("The character at position 10 is " +(char)index2);
    }
}

/* 
Exercise 2: 
Write a Java program to test if a given string contains the specified sequence of char values.

Sample Output: 
Original String: PHP Exercises and Python Exercises 

Specified sequence of char values:

Python 

Output : The string "PHP Exercises and Python Exercises" contains string "Python"

*/

import java.io.*;
public class Main 
{
    public static void main(String[] args)
    {
        String str1 = "PHP Exercises and Python Exercises";
        String str2 = "and";
        System.out.println("Original String: " + str1);
        System.out.println("Specified sequence of char values: " + str2);
        System.out.println(str1.contains(str2));
    }
}

/*
Exercise 3: 
Write a Java program to check whether a given string ends with the contents of another string.

Sample Output: 
"Python Exercises" ends with "se"? false                                                                      
"Python Exercise" ends with "se"? true
 */

import java.io.*;
public class Main 
{
    public static void main(String[] args)
    {
        String str1 = "Python Exercises";
        String str2 = "Python Exercise";

        String endStr = "se";

        boolean ends1 = str1.endsWith(endStr);
        boolean ends2 = str2.endsWith(endStr);

        System.out.println( str1 + " ends with " +endStr + "? " + ends1);
        System.out.println(str2 + " ends with " +endStr + "? " + ends2);
    }
}


/*
Exercise 4: 
Write a Java program to compare a given string to another string, ignoring case considerations.

Sample Output:
"Stephen Edwin King" equals "Walter Winchell"? false 
"Stephen Edwin King" equals "stephen edwin king"? true.
*/

import java.io.*;
public class Main 
{
    public static void main(String[] args)
    {
        String str1 = "Stephen Edwin King";
        String str2 = "Walter Winchell";
        String str3 = "stephen edwin king";

        boolean equals1 = str1.equalsIgnoreCase(str2);
        boolean equals2 = str1.equalsIgnoreCase(str3);

        System.out.println("\"" + str1 + "\" equals \"" + str2 + "\"? " + equals1);
        System.out.println("\"" + str1 + "\" equals \"" +str3 + "\"? " + equals2);
    }
}


/*
Exercise 5 : Write a java program to get the length of a given string.
*/

import jav.IO.*;
public class Main 
{
    public static void main(String[] args)
    {
        String str1 = "Stephen Edwin King";
        String str2 = "Walter Winchell";
        String str3 = "stephen edwin king";

        System.out.println("\Length of String 1 :" + str1.length());
        System.out.println("\Length of String 2 :" + str2.length());
        System.out.println("\Length of String 3 :" + str3.length());
    }
}


/*
Exercise 6: 
Write a Java program to get a sub string of a given string between two specified positions.

Sample Output: 
old = The quick brown fox jumps over the lazy dog.            
new = brown fox jumps

*/

public class Main 
{
    public static void main(String[] args)
    {
        String str1 = "The quick brown fox jumps over the lazy dog";
        
        System.out.println("\nSubstring Demo for : "+ str1);
        System.out.println("Old : "+str1);
        System.out.println("New : "+str1.substring(10,25));
    }
}


/*
Exercise 7: 
Write a Java program to trim any leading or trailing whitespace from a given string. 

Sample Output: 
Original String:  Java Exercises                                                                              
New String: Java Exercises
*/

public class Main 
{
    public static void main(String[] args)
    {
        String str1 =" Java Exercises";
        System.out.println("\Trimming of :"+ str1);
        System.out.println("Old : "+str1);
        System.out.println("New : "+str1.trim());
    }
}

/*
Exercise 8 :
Given a string and an int n, return a string made of n repetitions of the last n characters of the string. 
You may assume that n is between 0 and the length of the string, inclusive.

Sample input and expected output
repeatEnd("Hello", 3) → "llollollo"
repeatEnd("Hello", 2) → "lolo"
repeatEnd("Hello", 1) → "o"

*/

import java.util.*;
PUBLIC class Main
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = in.nextLine();
        System.out.println("Enter iteration time : ");
        int n = in.nextInt();
        System.out.println(nlastRepeat(str, n));
    }
    static String nlastRepeat(String s, int n)
    {
        String r = s.substring(s.length()-n);
        String big = "";
        for(int i=0;i<n; i++) 
        {
            big += r;
        }
        return big;
    }
}

/* 
Exercise 9 :
Given a string, consider the prefix string made of the first N chars of the string. 
Does that prefix string appear somewhere else in the string? 
Assume that the string is not empty and that N is in the range 1..str.length().

prefixAgain("abXYabc", 1) → true
prefixAgain("abXYabc", 2) → true
prefixAgain("abXYabc", 3) → false
*/

import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = in.nextLine();
        System.out.println("Enter iteration time : ");
        int n = in.nextInt();
        System.out.println(prefixAgain(str, n));
    }
    static boolean prefixAgain(String str, int n)
    {
        int len = str.length();
        String prefix = str.substring(0,n);
        for (int i = n; i < len; i++)
        {
            if(n+i <= len)
            {
                if (prefix.equals(str.substring(i,n+i)))
                return true;
            }
        }
        return false;
    }
}


/* 
Exercise 10: 
Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri".
The string length will be at least 2.

middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
*/

import java.util.*;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = in.nextLine();
        System.out.println(middleTwo(str));
    }
    static String middleTwo(String str)
    {
        int half = str.length() / 2;
        return str.substring(half-1,half+1);
    }
}


