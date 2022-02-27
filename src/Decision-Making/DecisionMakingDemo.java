/* All Practice Examples */

/* 
Exercise 1: 
Write a program to check that 29 is a prime number or not using for loop. Print the output as
29 is a prime number
*/

public class Main
{
    public static void main(String[] args) 
    {
        int num = 29;
        boolean flag = false;
        for (int i = 2; i <= num / 2; ++i)
        {
            // condition for nonprime number
            if (num % i == 0) {
            flag = true;
            break;
        }
    }
    if (!flag)
        System.out.println(num + " is a prime number.");
    else
        System.out.println(num + " is not a prime number.");
  }
}


/* 
Exercise 2: Write a program to calculate the sum of first 10 natural number.
*/

public class Main
{
    public static void main(String[] args) 
    {
        int n=10;
        int sum =0;
        for(int i = 1; i<=10; i++)
        {
            sum +=i;
        }
        System.out.println("Sum of 1st 10 Natural Numbers are :"+sum);
    }
}


/*
Exercise 3: Write a program that  outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.
*/

pulic class Main
{
    public static void main(String[] args) 
    {
        int reversed = 0;
        for(int num = 12345; num != 0; num /= 10) 
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }
        System.out.println("Reversed Number: " + reversed);
    }
}

/* 
Exercise 4:
Write a program to print out all Armstrong numbers between 1 and 500. 
If sum of cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )
*/

class Main
{
    public static void main(String[] args)
    {
        int d1, d2, d3; 
	      for(int number = 1; number <= 500; number++)
	      {
            int temp = number;
	          d1 = temp % 10;

            temp = temp / 10;
            d2 = temp % 10;
            
            temp = temp / 10;
            d3 = temp % 10;

	          if(d1*d1*d1 + d2*d2*d2 + d3*d3*d3 == number)
            {
	            System.out.println(number);
            }
        }
    }  
}


/*
Exercise 5: 
Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 24 .....
*/
import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        int n1 = 0,
        int n2 = 1,
        int n3;
 
        System.out.print("Enter number of terms of series : ");
        num = sc.nextInt();
 
        System.out.print(n1 + " " + n2 + " ");
 
        for(int i = 3; i <= num; i++)
	   {
            n3 = n1+ n2;
            System.out.print(n3 + " ");
            n1 = n2;
            n2 = n3;
	    }
    }  
}

/*  Exercise 6: Write a program to print numbers from 1 to 10. */

import java.io.*;
class Main
{
    public static void main(String[] args)
    {
        for(int i = 1; i <= 10; i++)
	    {
            System.out.print(i + " ");
	    }
    }  
}

/* Exercise 7: Write a program that print the multiplication table of number 7. */

import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any positive integer: ");
        int n = sc.nextInt();
        System.out.println("Multiplication Table of " + n);
        for(int i = 1; i <= 10; i++)
	    {
            System.out.println(n+" * "+i+ " = "+n*i);
	    }
    }  
}

/* Exercise 8 : 
Write a program that with int number = 13. 
It should then output a message indicating whether the number is a prime number.
*/

public class Main
{
    public static void main(String[] args) 
    {
        int number = 13;
        boolean flag = false;
        for (int i = 2; i <= number / 2; ++i)
        {
            // condition for nonprime number
            if (number % i == 0) {
            flag = true;
            break;
        }
    }
    if (!flag)
        System.out.println(number + " is a prime number.");
    else
        System.out.println(number + " is not a prime number.");
  }
}

/*
Exercise 9 :
Write a program to calculate the sum of following series where n = 9
1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
*/

import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int number;  
        double sum = 0;
        System.out.print("Enter number of terms of series : ");
        number = sc.nextInt();
        for(int i = 1; i <= number; i++)
	    {
            sum += 1.0/i;
	    }
        System.out.println("sum: " + sum);
    }  
}

/* 
Exercise 10 : Write a program to print following :
*
**
***
****
*****
*/

import java.util.*;
public class Main 
{ 
    public static void main(String args[]) 
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to draw pattern :");
        int n = sc.nextInt();
        int i,j;
        for(i=0; i<n; i++) 
        {    
            for(j=0; j<=i; j++)
            {
                System.out.print("*"); 
            }
            System.out.println(); 
        }           
    }
}

/* Exercise 11: Write program  to print odd numbers between 1 and 50. */

import java.io.*;
public class Main 
{
	public static void main(String[] args) 
	{
		int number = 50;
		for(int i = 1; i <= number; i++)
		{
			if(i % 2 != 0)
			{
				System.out.print(i+" "); 
			}
		}	
	}
}

/* Exercise 12 : Write program to print Prime Numbers between 1 to 100 using for loop */

import java.io.*;
class Main  
{  
    public static void main(String args[])   
    {  
        int ct=0,n=0,i=1,j=1;  
        while(n<25)  
        {  
            j=1;  
            ct=0;  
            while(j<=i)  
            {  
                if(i%j==0)  
                    ct++;  
                    j++;   
            }  
            if(ct==2)  
            {  
                System.out.printf("%d ",i);  
                n++;  
            }  
            i++;  
        }    
    }  
}  


/* 
Exercise 13 :
Write a Java program to calculate the revenue from a sale based on the unit price and quantity of a product input by the user. 
The discount rate is 10% for the quantity purchased between 100 and 120 units, and 15% for the quantity purchased greater than 120 units.
If the quantity purchased is less than 100 units, the discount rate is 0%. See the example output as shown below:
Enter unit price: 25
Enter quantity: 110
The revenue from sale: 2475.0$
After discount: 275.0$(10.0%)
*/

package revenue;
import java.util.*;
public class Revenue
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int unitprice, quantity;
		double revenue, afterdiscount, discount = 0;
		System.out.println("Enter unit price:");
		unitprice = sc.nextInt();
		System.out.println("Enter quantity:");
		quantity = sc.nextInt();
		revenue = unitprice * quantity;
		System.out.println("The revenue from sale: " + revenue + "$");
		if ((quantity >= 100) && (quantity <= 120))
		{
		     discount = (revenue * 10) / 100;
		}
		 if (quantity > 120)
		 {
		      discount = (revenue * 15) / 100;
		 }
		 if (quantity < 100)
		 {
		      discount = (revenue * 0) / 100;
		 }
		 afterdiscount = revenue - discount;
		 System.out.println("After discount: " + afterdiscount + " $");
	}

}

/* 
Exercise 14: 
Write a Java program to detect key presses. 
If the user pressed number keys( from 0 to 9), the program will tell the number that is pressed,  otherwise, program will show "Not allowed".(Hint: Use switch case)
*/

package keypress;
import java.util.*;
public class Keypress
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Press a key : ");
		char key = sc.next().charAt(0);
		switch(key)
		{
			case '0': System.out.println(" You pressed 0. ");
						break;
			case '1': System.out.println(" You pressed 1. ");
						break;
			case '2': System.out.println(" You pressed 2. ");
						break;
			case '3': System.out.println(" You pressed 3. ");
						break;
			case '4': System.out.println(" You pressed 4. ");
						break;
			case '5': System.out.println(" You pressed 5. ");
						break;
			case '6': System.out.println(" You pressed 6. ");
						break;
			case '7': System.out.println(" You pressed 7. ");
						break; 
			case '8': System.out.println(" You pressed 8. ");
						break;
			case '9': System.out.println(" You pressed 9. ");
						break;
			default : System.out.println(" Not Allowed ");
						break;
		}
	}
}


/* 
Exercise 15:
Write Java program to allow the user to input his/her age. 
Then the program will show if the person is eligible to vote. 
A person who is eligible to vote must be older than or equal to 18 years old.
*/

import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your age : ");
        int age = sc.nextInt();
        if(age>=18)
        {
            System.out.println("You are eligible to vote");
        }
        else
        {
            System.out.println("You are not eligible to vote..");
        }
    }
}


/* 
Exercise 16 : 
We have a loud talking parrot. 
The "hour" parameter is the current hour time in the range 0..23. 
We are in trouble if the parrot is talking and the hour is before 7 or after 20. 
Return true if we are in trouble.
parrotTrouble(true,6)→true
parrotTrouble(true,7)→false
parrotTrouble(false, 6) → false
Write a program to check if we are in trouble . 
Print the output for method  parrotTrouble(boolean talking, int hour) using above sample input.
*/

package talkingParrot;

public class TalkingParrot
{
	public boolean parrotTrouble(boolean talking, int hour)
    {
        if (!talking)
            return false;
        else if (hour > 20 || hour < 7)
            return true;
        else
            return false;
    }
}

package test3;
import talkingParrot.TalkingParrot;
public class TestDemo
{
	public static void main(String[] args)
	{
		talkingParrot.TalkingParrot t = new talkingParrot.TalkingParrot();
		t.parrotTrouble(false, 22);
	}

}

/*
Exercise 17 :
Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
Sample input and expected output.
diff21(19)→2
diff21(10)→11
diff21(21) → 0
*/

import java.util.*;
class TestDemo
{
    Scanner sc = new Scanner(System.in);
    int n;
    public void diff21() 
    {
        System.out.println("Enter a number :");
        n = sc.nextInt();
        if (n <= 21)
        {
            System.out.println("Difference :"+(21-n));
        } 
        else
        {
            System.out.println("Difference :"+(n-21)*2);
        }
    }
  
    public static void main(String[] args)
    {
        TestDemo m = new TestDemo();
        m.diff21();
    }
}

/* 
Exercise 18 : Given two int values, return their sum. Unless the two values are the same, then return double their sum.
Sample input and expected output.
sumDouble(1,2)→3
sumDouble(3,2)→5
sumDouble(2, 2) → 8
*/

import java.util.*;
class TestDemo
{
    Scanner sc = new Scanner(System.in);
    int a,b;
    public void sumDouble()
    {
        System.out.println("Enter value for a & b : ");
        a = sc.nextInt();
        b = sc.nextInt();
        int sum = a + b;
        if (a == b) 
        {
            sum = sum * 2;
        }
        System.out.println("sum : "+sum);
    }
  
    public static void main(String[] args)
    {
        TestDemo m = new TestDemo();
        m.sumDouble();
    }
}
