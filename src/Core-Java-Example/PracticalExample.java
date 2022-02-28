/*
Exercise 1: 
Write a program to check the input character is a vowel or consonant using switch case.
*/

import java.util.*;
class Main 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character :");
        char ch = sc.next().charAt(0);
        switch(ch)
        {
            case 'a' : System.out.println(ch+ " is a vowel");
                break;
            case 'A' : System.out.println(ch+ " is a vowel");
                break;
            case 'e' : System.out.println(ch+ " is a vowel");
                break;
            case 'E' : System.out.println(ch+ " is a vowel");
                break;
            case 'i' : System.out.println(ch+ " is a vowel");
                break;
            case 'I' : System.out.println(ch+ " is a vowel");
                break;
            case 'o' : System.out.println(ch+ " is a vowel");
                break;
            case 'O' : System.out.println(ch+ " is a vowel");
                break;
            case 'u' : System.out.println(ch+ " is a vowel");
                break;
            case 'U' : System.out.println(ch+ " is a vowel");
                break;
            default : System.out.println(ch+ " is a consonant");
        }
    }
}


/* 
Exercise 2: 
Write a program to reverse a string entered by user using recursion.
*/

import java.util.*;
class Main
{
	void reverse(String str)
	{
		if ((str==null)||(str.length() <= 1))
		System.out.println(str);
		else
		{
			System.out.print(str.charAt(str.length()-1));
			reverse(str.substring(0,str.length()-1));
		}
	}
	
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a String : ");
		String str = sc.nextLine();
		Main obj = new Main();
		obj.reverse(str);
	}
}


/*
Exercise 3: 
Write a program to reverse a 6-digit number using while or for loop.
*/

import java.util.*;
class Main 
{
	static int reversDigits(int num)
	{
		int rev_num = 0;
		while (num > 0)
		{
			rev_num = rev_num * 10 + num % 10;
			num = num / 10;
		}
		return rev_num;
	}
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a Number of > 4 digits :");
		int num = sc.nextInt();
		System.out.println("Reverse of no. is :" + reversDigits(num));
	}
}

/*
Exercise 4:
Write a program to calculate your age as of today by giving your date of birth as input. 
Example you are born on 11 april 1989 and today is 22 april 2019 then output will be
I am 30 years, 0 months and 11 days old.
*/

import java.io.*;
import java.util.*;
class Main 
{
	static void findAge(int current_date, int current_month,int current_year, int birth_date,int birth_month, int birth_year)
	{
		int month[] = { 31, 28, 31, 30, 31, 30, 31,31, 30, 31, 30, 31 };
		if (birth_date > current_date)
		{
			current_month = current_month - 1;
			current_date = current_date + month[birth_month - 1];
		}
		if (birth_month > current_month)
		{
			current_year = current_year - 1;
			current_month = current_month + 12;
		}
		int calculated_date = current_date - birth_date;
		int calculated_month = current_month - birth_month;
		int calculated_year = current_year - birth_year;
		System.out.println("Present Age");
		System.out.println("Years: " + calculated_year +" Months: " + calculated_month + " Days: " +calculated_date);
	}
	public static void main(String[] args)
	{
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter Current date :");
		int current_date = sc.nextInt();
		System.out.println("Enter Current month :");
		int current_month = sc.nextInt();
		System.out.println("Enter Current year :");
		int current_year = sc.nextInt();

    System.out.println("Enter Birth date :");
		int birth_date = sc.nextInt();
		System.out.println("Enter Birth month :");
		int birth_month = sc.nextInt();
		System.out.println("Enter Birth year :");
		int birth_year = sc.nextInt();

		findAge(current_date, current_month, current_year,birth_date, birth_month, birth_year);
	}
}

 
/*
Exercise 5: 
Write a Java program to get the current time in New York.
*/


import java.util.*;
public class Main 
{
   public static void main(String[] args)
    {
        Calendar calNewYork = Calendar.getInstance();
        calNewYork.setTimeZone(TimeZone.getTimeZone("America/New_York"));
	    System.out.println(); 
        System.out.println("Time in New York: " + calNewYork.get(Calendar.HOUR_OF_DAY) + ":"+ calNewYork.get(Calendar.MINUTE)+":"+calNewYork.get(Calendar.SECOND));
		System.out.println(); 
    }
}


/*
Exercise 6: 
Write a Java method to count all vowels in a string
*/


import java.util.Scanner;
public class Main 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the string: ");
        String str = in.nextLine();
        System.out.print("Number of  Vowels in the string: " + count_Vowels(str)+"\n");
    }
    public static int count_Vowels(String str)
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'|| str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
}


/*
Exercise 7:
Write a Java method to display the current date and time.
*/

import java.util.Scanner;
public class Main 
{
    public static void main(String[] args)
    {
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds / 1000;
        long currentSecond = (int)(totalSeconds % 60);
        long totalMinutes = totalSeconds / 60;
        long currentMinute = (int)(totalMinutes % 60);
        long totalHours = totalMinutes / 60;
        long currentHour = (int)(totalHours % 24);
        long totalDays = totalHours / 24;
        int currentYear = (int)(totalDays / 365) + 1970;
        long daysInCurrentYear = (totalDays - numberOfLeapYearsSince1970(currentYear)) % 365;
        if (currentHour > 0) daysInCurrentYear++;
        int currentMonthNum = getMonthFromDays(currentYear, (int) daysInCurrentYear);
        String month = getMonthName(currentMonthNum);
        int daysTillCurrentMonth = getNumOfDaysToReachThatMonth(currentYear, currentMonthNum);
        int startDay = getStartDay(currentYear, currentMonthNum);
        int today = (int) daysInCurrentYear - daysTillCurrentMonth;
        String dayOfWeek = dayNameOfWeek( ((startDay + today) % 7));

        System.out.println("Current date and time: " + dayOfWeek + " " + month + " " + today +", " + currentYear +" " + currentHour + ":"+ currentMinute + ":" + currentSecond );

    }

    public static String dayNameOfWeek(int dayOfWeek) 
    {

        switch (dayOfWeek) 
        {
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wednesday";
            case 5: return "Thursday";
            case 6: return "Friday";
            case 7: return "Saturday";
            case 1: return "Sunday";
            default: return null;
        }
    }

    public static int numberOfLeapYearsSince1970(long year)
    {

        int count = 0;
        for (int i = 1970; i <= year; i++)
        {
            if (isLeapYear(i))count++;
        }
        return count;
    }


    public static int getMonthFromDays(int year, int days)
    {
        int dayTracker = 0;
        for (int i = 1; i <= 12; i++)
        {

            dayTracker += getNumberOfDaysInMonth(year, i);

            if (dayTracker > days) return i;
        }
        return 12;
    }
    public static int getNumOfDaysToReachThatMonth(int year, int month) 
    {
        int dayTracker = 0;
        for (int i = 1; i < month; i++) 
        {

            dayTracker += getNumberOfDaysInMonth(year, i);
        }
        return dayTracker;
    }

    public static int getStartDay(int year, int month)
    {
        final int START_DAY_FOR_JAN_1_1800 = 3;
        int totalNumberOfDays = getTotalNumberOfDays(year, month);

        return (totalNumberOfDays + START_DAY_FOR_JAN_1_1800) % 7;
    }

    public static int getTotalNumberOfDays(int year, int month)
    {
        int total = 0;

        for (int i = 1800; i < year; i++)
            if (isLeapYear(i))
                total = total + 366;
            else
                total = total + 365;

        for (int i = 1; i < month; i++)
            total = total + getNumberOfDaysInMonth(year, i);

        return total;
    }

    public static int getNumberOfDaysInMonth(int year, int month)
    {

        if (month == 1 || month == 3 || month == 5 || month == 7 ||
                month == 8 || month == 10 || month == 12)
            return 31;

        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;

        if (month == 2) return isLeapYear(year) ? 29 : 28;

        return 0; // If month is incorrect
    }

    public static boolean isLeapYear(int year) 
    {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }


    public static String getMonthName(int month) 
    {
        String monthName = "";
        switch (month) 
        {
            case 1: monthName = "January"; break;
            case 2: monthName = "February"; break;
            case 3: monthName = "March"; break;
            case 4: monthName = "April"; break;
            case 5: monthName = "May"; break;
            case 6: monthName = "June"; break;
            case 7: monthName = "July"; break;
            case 8: monthName = "August"; break;
            case 9: monthName = "September"; break;
            case 10: monthName = "October"; break;
            case 11: monthName = "November"; break;
            case 12: monthName = "December";
        }
        return monthName;
    }
}


/*
Exercise 8:
Write a Java program to append text to an existing file.
*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
 
public class Main 
{
    public static void main(String a[])
    {
        StringBuilder sb = new StringBuilder();
        String strLine = "";
        try
          {
             String filename= "demo.txt";
             FileWriter fw = new FileWriter(filename,true); 
             //appends the string to the file
             fw.write("Java Exercises\n");
             fw.close();
             BufferedReader br = new BufferedReader(new FileReader("demo.txt"));
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


/*
Exercise 9:
Write a Java program to find the longest word in a text file.
*/


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class Main
{
    public static void main(String [ ] args) throws FileNotFoundException
    {
        new Main().findLongestWords();
    }
    public String findLongestWords() throws FileNotFoundException
    {
       String longest_word = "";
       String current;
       Scanner sc = new Scanner(new File("demo.txt"));
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


/*
Exercise 10:
Write a Java program that accepts two double variables and test if both strictly between 0 and 1 and false otherwise. 
If input is not a double but a integer user is prompted to input double variable only.
*/


import java.util.Scanner;
public class Main 
{
	public static void main(String[] args) 
	{
		 Scanner in = new Scanner(System.in);
		 System.out.print("Input first number: ");
         double n1 = in.nextDouble();
         System.out.print("Input second number: ");
         double n2 = in.nextDouble();
		 System.out.println(n1 > 0 && n1 < 1 && n2 > 0 && n2 < 1);
	}
}


/*
Exercise 11: 
Write a program to find the GCD - greatest common divisor of two number using for loop.
*/


import java.util.*;
class Main
{
    static int gcd(int a, int b)
    {
        if (a == 0)
          return b;
        if (b == 0)
          return a;
      
        if (a == b)
            return a;
      
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
     
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first digit :");
        int a = sc.nextInt();
        System.out.println("Enter second digit :");
        int b = sc.nextInt();
        System.out.println("GCD of " + a +" and " + b + " is " + gcd(a, b));
    }
}


/*
Exercise 12 :
Write a program to print the Fibonacci series based on user input. Fibonacci series of first 6 numbers is  0,1,1,2,3,5
*/


import java.util.Scanner;
public class Main 
{
    public static void main(String[] args)
    {
        int FibLength;
        Scanner sc = new Scanner(System.in); 
        System.out.print("Please enter length: ");
        FibLength = sc.nextInt();

        int[] num = new int[FibLength];
        num[0] = 0;
        num[1] = 1;
        for (int i = 2; i < FibLength; i++) 
        {
            num[i] = num[i - 1] + num[i - 2];
        }

        System.out.println("Fibonacci Series: ");
        for (int i = 0; i < FibLength; i++) 
        {
            System.out.print(num[i] + " ");
        }
    }
}


/*
Exercise 13: 
Write a program to swap two integers without using a temporary variable.
*/


import java.util.*;
class Main 
{
    public static void main(String a[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  Number :");
        int x = sc.nextInt();
        System.out.println("Enter a  Number :");
        int y = sc.nextInt();
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swapping:"+ " x = " + x + ", y = " + y);
    }
}


/*
Exercise 14 :
Write a program to find the ASCII value of a given character.
*/


public class Main 
{
    public static void main(String[] args)
    {
        char c = 'e';
        int ascii = c;
        System.out.println("The ASCII value of " + c + " is: " + ascii);
    }
}


/*
Exercise 15: 
Write a program to throw a user defined exception. eg Create a exception which is thrown when the input string is less than 100.
*/


class Main
{
    public static void main(String args[])
    {
        try{
            throw new MyException(99);
        }
        catch(MyException e)
        {
            System.out.println(e) ;
        }
    }
}
class MyException extends Exception
{
   int a;
   MyException(int b) {
     a=b;
   }
   public String toString(){
     return ("Exception Number =  "+a) ;
  }
}


/*
Exercise 16:
Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the array.
Return true if the array does not contain any triples.
Sample input/output
noTriples([1, 1, 2, 2, 1]) → true
noTriples([1, 1, 2, 2, 2, 1]) → false
noTriples([1, 1, 1, 2, 2, 2, 1]) → false
*/

import java.io.*;
class Main
{
    public static boolean noTriples( int[] nums )
    {
        for ( int i = 0; i < nums.length - 2; i++ )
        {
            if ( nums[i] == nums[i + 1] && nums[i] == nums[i + 2] )
            {
                return false;
            }
        }

        return true;
    }
    public static void main(String args[])
    {
        int[] nums = {1, 1, 2, 2, 1};
        noTriples(nums);
    }

}

/*
Exercise 17: 
Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does not count towards the sum and values to its right do not count. 
So for example, if b is 13, then both b and c do not count.
Sample input/output
luckySum(1, 2, 3) → 6
luckySum(1, 2, 13) → 3
luckySum(1, 13, 3) → 1
*/


import java.io.*;
class Main
{
    public static int loneSum(int a, int b, int c)
    {
        if ( a == b && b == c)
            return 0;
        if (a == b)
            return c;
        if (b == c)
            return a;
        if (a == c)
            return b;
        else
            return a + b + c;
    } 
    public static void main(String args[])
    {
        loneSum(1,2,3);
    }

}

/*
Exercise 18:
Given an array of scores, return true if each score is equal or greater than the one before. 
The array will be length 2 or more.
Sample input/output
scoresIncreasing([1, 3, 4]) → true
scoresIncreasing([1, 3, 2]) → false
scoresIncreasing([1, 1, 4]) → true
*/


import java.io.*;
class Main
{
    public boolean scoresIncreasing(int[] scores) 
    {
        boolean match = false;
        for (int i = 0; i < scores.length-1; i++) 
        {
            if (scores[i+1] >= scores[i])
                match = true;
            else
                return false;
        }
        return match;
    }
    public static void main(String args[])
    {
        int[] scores = {1, 3, 4};
        scoresIncreasing(scores);
    }

}

/*
Exercise 19: 
Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator 
old35(3) → true
old35(10) → true
old35(15) → false
*/


import java.io.*;
class Main
{
    public boolean old35(int n)
    {
        return n % 3 == 0 ^ n % 5 == 0;
    }
    public static void main(String args[])
    {
        old35(3);
    }

}


/*
Exercise 20 :
You have a red lottery ticket showing ints a, b, and c, each of which is 0, 1, or 2. 
If they are all the value 2, the result is 10. Otherwise if they are all the same, the result is 5. 
Otherwise so long as both b and c are different from a, the result is 1. Otherwise the result is 0.
Sample input/output
redTicket(2, 2, 2) → 10
redTicket(2, 2, 1) → 0
redTicket(0, 0, 0) → 5 
*/

import java.io.*;
class Main
{
    public int redTicket(int a, int b, int c)
    {
        if(a==b&&b==c)
        {
            if(a==2) return 10;
                else return 5;
        }
        else if(b!=a&&c!=a) return 1;
            else return 0;
    }
    public static void main(String args[])
    {
        Main m = new Main();
        m.redTicket(2,2,2);
    }
}

/*
Exercise 21 : 
Java Program to Calculate the Power of a Number using while loop only with using ready-made Math.pow() method. 
Eg base=3 exponent = 4 then result will be 3x3x3x3=81
*/

import java.util.*;
class Main
{
    public static int power(int base, int a)
    {
        if(a !=0)
            return (base * power(base, a-1));
        else
            return 1;
    }
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter base number : ");
       int base = sc.nextInt();
       System.out.println("Enter power number(positive integer) : ");
       int a = sc.nextInt();
       int result = power(base,a);
       System.out.println(+base);
       System.out.println(+a);
       System.out.println(+ result);
    }
}


/*
Exercise 22 : 
Write a Java method to check whether a string is a valid password. Go to the editor
Password rules:
1.A password must have at least ten characters.
2.A password consists of only letters and digits.
3.A password must contain at least two digits.
*/


import java.util.Scanner;
public class Main 
{
    public static final int PASSWORD_LENGTH = 8;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print(
                "1. A password must have at least eight characters.\n" +
                "2. A password consists of only letters and digits.\n" +
                "3. A password must contain at least two digits \n" +
                "Input a password (You are agreeing to the above Terms and Conditions.): ");
        String s = input.nextLine();
        if (is_Valid_Password(s))
        {
            System.out.println("Password is valid: " + s);
        } 
        else
        {
            System.out.println("Not a valid password: " + s);
        }
    }
    public static boolean is_Valid_Password(String password) 
    {
        if (password.length() < PASSWORD_LENGTH) return false;
        int charCount = 0;
        int numCount = 0;
        for (int i = 0; i < password.length(); i++)
        {
            char ch = password.charAt(i);
            if (is_Numeric(ch)) numCount++;
            else if (is_Letter(ch)) charCount++;
            else return false;
        }
        return (charCount >= 2 && numCount >= 2);
    }
    public static boolean is_Letter(char ch) 
    {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }
    public static boolean is_Numeric(char ch)
    {
        return (ch >= '0' && ch <= '9');
    }
}


/*
Exercise 23 :  
Given an int n, return true if difference between n and 100 or 200 is single digit number . 
Note: Math.abs(num) computes the absolute value of a number.
Sample input/Output
nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false"
*/


import java.io.*;
import java.util.*;
class Main 
{
    public static void nearHundred(int n) 
    {
       if((Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10))
       {
           System.out.println("true");
       }
       else
       {
           System.out.println("false");
       }
    }
    public static void main(String args[])
    {
        int n = 89;
        nearHundred(n);
    }
}


/*
Exercise 24 : 
Write a Java Program to Count Vowels and Consonants in a String
*/


import java.io.*;
import java.util.*;
class Main 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        int vowels = 0, consonants = 0, digits = 0, spaces = 0;
        line = line.toLowerCase();
        for (int i = 0; i < line.length(); ++i) 
        {
            char ch = line.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
            {
                ++vowels;
            }
            else if ((ch >= 'a' && ch <= 'z'))
            {
                ++consonants;
            }
            else if (ch >= '0' && ch <= '9') 
            {
                ++digits;
            }
            else if (ch == ' ') 
            {
                ++spaces;
            }
        }
    System.out.println("Vowels: " + vowels);
    System.out.println("Consonants: " + consonants);
    System.out.println("Digits: " + digits);
    System.out.println("White spaces: " + spaces);
  }
}


/*
Exercise 25 : 
Write a program  to check whether a number can be Expressed as Sum of Two Prime Numbers.
Sample input/output
Enter number : 34   
34 = 3 + 31
34 = 5 + 29
34 = 11 + 23
34 = 17 + 17
*/


import java.io.*;
public class Main 
{
    public static void main(String[] args) 
    {
        int number = 34;
        boolean flag = false;
        for (int i = 2; i <= number / 2; ++i) 
        {
            if (checkPrime(i)) 
            {
                if (checkPrime(number - i)) 
                {
                    System.out.printf("%d = %d + %d\n", number, i, number - i);
                     flag = true;
                }
            }
        }
        if (!flag)
            System.out.println(number + " cannot be expressed as the sum of two prime numbers.");
    }
    static boolean checkPrime(int num) 
    {
        boolean isPrime = true;
        for (int i = 2; i <= num / 2; ++i)
        {
            if (num % i == 0)
            {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}


/*
Exercise 26: 
Create a class to print the area of a square and a rectangle. 
The class has two methods with the same name but different number of parameters. 
The method for printing area of rectangle has two parameters which are length and breadth respectively,
while the other method for printing area of square has one parameter which is side of square.
*/


package area;
public class Area 
{
    float area;
    public static void main(String[] args)
    {
        Area a =new Area();
        a.printarea(6.7f, 8.3f);
        a.printarea(5f);
    }
    void printarea(float length , float breadth)
    {
        area = length * breadth;
        System.out.println("Area of rectangle is: " +area);
    }
    void printarea(float side)
    {
        area = side * side;
        System.out.println("Area of square is: "+area);
    }
}


/*
Exercise 27 : 
Create a class 'Student' with three data members which are name, age and address.
The constructor of the class assigns default values name as "unknown", age as '0' and address as "not available".
It has two members with the same name 'setInfo'. 
First method has two parameters for name and age and assigns the same whereas the second method takes has three parameters which are assigned to name, age and address respectively. Print the name, age and address of 10 students.
Hint - Use array of objects.
*/

import java.util.ArrayList;
import java.util.List;

public class Student
{
  String name;
  int age;
  String address;
  public Student()
  {
    this.name="unknown";
    this.age=0;
    this.address="not avaliable";
  }

  public void setinfo(int age,String name)
  {
    this.name=name;
    this.age=age;
  }

  public void setinfo(int age ,String name,String address)
  {
    this.name=name;
    this.age=age;
    this.address=address;
  }

  @Override
  public String toString()
  {
      return "Student [name=" + name + ", age=" + age + ", address=" + address + "]";
  }

  public static void main(String[] args)
  {
    List<Student> stu=new ArrayList<>();
    stu.add(new Student());
    stu.add(new Student());
    stu.add(new Student());
    stu.add(new Student());
    stu.add(new Student());
    stu.add(new Student());
    stu.add(new Student());
    stu.add(new Student());
    stu.add(new Student());
    stu.add(new Student());
    stu.get(0).setinfo(34, "Pooja");
    stu.get(2).setinfo(36, "Amruta","Aurangabad");
    stu.get(3).setinfo(37, "Sudha","Aurangabad");
    stu.get(5).setinfo(31, "Jayeshree","Aurangabad");
    stu.get(6).setinfo(42, "Preeti","Aurangabad");
    stu.get(8).setinfo(47, "Saraswati");
    
    for(Student s :stu)
    {
      System.out.println(s);
    }
    
  }
  
}


/*
Exercise 28 : 
A boy has his money deposited $1000, $1500 and $2000 in banks-Bank A, Bank B and Bank C respectively.
We have to print the money deposited by him in a particular bank. 
Create a class 'Bank' with a method 'getBalance' which returns 0. 
Make its three subclasses named 'BankA', 'BankB' and 'BankC' with a method with the same name 'getBalance' which returns the amount deposited in that particular bank. 
Call the method 'getBalance' by the object of each of the three banks.
*/


package bank;
public class Bank
{
    int amount = 0;
    public static void main(String[] args)
    {
    	  Bank b = new Bank();
        System.out.println("amoutn = " +b.getBalance());
        Bank_A ba = new Bank_A();
        System.out.println("amoutn = " +ba.getBalance());
        Bank_B bb = new Bank_B();
        System.out.println("amoutn = " +bb.getBalance());
        Bank_C bc = new Bank_C();
        System.out.println("amoutn = " +bc.getBalance());
    }
    int getBalance()
    {
    	return 0;
    }
}
class Bank_A extends Bank
{
    int getBalance()
    {
    	int deposit = 1000;
    	amount = amount + deposit; 
    	return amount;
    }
}
class Bank_B extends Bank
{
    int getBalance()
    {
    	int deposit = 1500;
    	amount = amount + deposit; 
    	return amount;
    }
}

class Bank_C extends Bank
{    
    int getBalance()
    {
      int deposit = 2000;
      amount = amount + deposit; 
      return amount;
    }
}


/*
Exercise 29:
Create a class to print an integer and a character with two methods having the same name but different sequence of the integer and the character parameters.
For example, if the parameters of the first method are of the form (int n, char c), then that of the second method will be of the form (char c, int n).
*/


import java.io.*;
class Print
{
    void output(int a, char[20] c)
    {
        System.out.println("Integer is : "+a);
        System.out.println("Character is : "+c);
    }
    void output(char[20] c, int a)
    {
        System.out.println("Character is : "+c);
        System.out.println("Integer is : "+a);
    }
}
class Main extends Print 
{
    public static void main(String args[])
    {
        Main obj = new Main();
        obj.output("Programming Skills", 10);
        obj.output(10, "Programming Skills");
    }
}


/*
Exercise 30 :
Create a class 'Degree' having a method 'getDegree' that prints "I got a degree".
It has two subclasses namely 'Undergraduate' and 'Postgraduate' each having a method with the same name that 
prints "I am an Undergraduate" and "I am a Postgraduate" respectively. Call the method by creating an object of each of the three classes.
*/


import java.io.*;
class degree
{
    getDegree ()
    {
        System.out.println("I got a degree.");
    }
}
class undergraduate extends degree
{
    undergraduate()
    {
        System.out.println("I am an Undergraduate");
    }
}
class postgraduate extends degree
{
    postgraduate()
    {
        System.out.println("I am a Postgraduate");
    }
    public static void main(String args[])
    {
        undergraduate u = new undergraduate();
        postgraduate p = new postgraduate();
    }
}
