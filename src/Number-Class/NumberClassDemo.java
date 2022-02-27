//All Excerises

/* 
Exercise 1 : 
Write a Java program to check whether a given number is an ugly number. 
In number system, ugly numbers are positive numbers whose only prime factors are 2, 3 or 5. 
First 10 ugly numbers are 1, 2, 3, 4, 5, 6, 8, 9, 10, 12. By  convention, 1 is included.
TestDate: Input an integer number: 235
Expected Output :
It is not an ugly number.
*/

import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input an integer number: ");
        int n = in.nextInt();  		
        if (n <= 0) 
        {
            System.out.print("Input a correct number.");
        }
		int x = 0;
        while (n != 1) 
        {
            if (n % 5 == 0)
            {
                n /= 5;
            } 
            else if (n % 3 == 0) 
            {
                n /= 3;
            } 
            else if (n % 2 == 0)
            {
                n /= 2;
            } 
            else 
            {
                System.out.print("It is not an ugly number.");
				x = 1;
				break;
            }
        }
        if (x==0)
		System.out.print("It is an ugly number.");
		System.out.print("\n");
    }
}


/* 
Exercise 2 : Write a Java program to generate random integers in a specific range.
*/

import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    int min = 100;
	    int max = 200;
 
	    Random random = new Random();
	    int randomNumber = random.nextInt((max - min) + 1) + min;
 
	    System.out.println(randomNumber);
	}
}

/*
Exercise 3: Write a Java program to check a number is a cube or not.(eg: 8 is input then output is " Number 8 is a cube")
*/

import java.util.*;
public class Main 
{
    public static void main( String args[] )
    { 
        Scanner sc = new Scanner( System.in ); 
        System.out.print("Input a number: "); 
        int num = sc.nextInt(); 
        int n = (int) Math.round(Math.pow(num, 1.0/3.0));
        if((num == n * n * n))
		{
			 System.out.print("Number is a cube.");
        }
		else
		{
			System.out.print("Number is not a cube.");
		}
		System.out.println("\n");
    }
}

/*
Exercise 4 :
Write a Java program to find and print the first 10 happy numbers.
Happy number: Starting with any positive integer, replace the number by the sum of the squares of its digits,
and repeat the process until the number equals 1, or it loops endlessly in a cycle which does not include 1. 

Example: 19 is a happy number
12 + 92=82 (1st iteration)
82 + 22=68 (2nd iteration)
62 + 82=100(3rd iteration)
12 + 02 + 02=1(4th iteration)
(Hint: to avoid infinite loop consider iterating for 100 times only )

Expected Output
First 10 Happy numbers:                                                 
1                                                                       
7                                                                       
10                                                                      
13                                                                      
19                                                                      
23                                                                      
28                                                                      
31   
*/

package happyNumber;

import java.util.HashSet;
public class HappyNumber
{
	public static void main(String[] args)
	{
		System.out.println("First 10 Happy numbers:");
		for(long num = 1,count = 0;count<8;num++)
		{
           if(happy_num(num))
           {
               System.out.println(num);
               count++;
           }
       }
	}
	public static boolean happy_num(long num)
	{
       long m = 0;
       int digit = 0;
       HashSet<Long> cycle = new HashSet<Long>();
	   while(num != 1 && cycle.add(num))
	   {
           m = 0;
           while(num > 0)
           {
               digit = (int)(num % 10);
               m += digit*digit;
               num /= 10;
           }
           num = m;
       }
       return num == 1;
	}   
 }
