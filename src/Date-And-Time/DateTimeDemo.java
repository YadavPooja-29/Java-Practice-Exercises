//All Examples

/* Exercise 1 : Write a Java program to find seconds since 1970. */

import java.util.*;
import java.io.*;
public class Main
{
    public static void main(String[] args)
    {
     long seconds = System.currentTimeMillis() / 1000l;
     System.out.println("\nSeconds since 1970: "+seconds+"\n");
    }
}


/* 
Exercise 2 : 
Write a Java program to get and display information (year, month, day, hour, minute) of
a default calendar. Output should be for date 20th April 2018 time 1:57:00
Year: 2018                                                                                                   
Month: 4                                                                                                   
Day: 20                                                                                                   
Hour: 1                                                                                                   
Minute: 57 
 */

import java.util.Calendar;
public class Main
{
    public void displayInfo()
	{
	    Calendar cal = Calendar.getInstance();
	   // Get and display information of current date from the calendar:
		 System.out.println();
	     System.out.println("Year: " + cal.get(Calendar.YEAR));
	     System.out.println("Month: " + cal.get(Calendar.MONTH));
	     System.out.println("Day: " + cal.get(Calendar.DATE));
	     System.out.println("Hour: " + cal.get(Calendar.HOUR));
	     System.out.println("Minute: " + cal.get(Calendar.MINUTE));
	}
	public static void main(String[] args) 
	{
		Main m = new Main();
	  m.displayInfo();
		System.out.println();
	}
}

/* Exercise 3 : Write a Java program to get the last day of the current month. */

import java.util.*;
public class Main 
{
    public static void main(String[] args)
    {
        Calendar calendar = Calendar.getInstance();
        System.out.println("Last date of current month : ");     
        System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
    }
}

/* Exercise 4 : Write a Java program to get a day of the week of a specific date.  */

import java.util.*;
public class Main 
{
    public static void main(String []args)
    {
        Calendar cal = Calendar.getInstance();
	      System.out.println();
        int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
        System.out.println("Day of the week : " + dayOfWeek); 
	      System.out.println();
    }
}

/* Exercise 5: Write a Java program to convert a string to date. */

import java.time.*;
import java.util.*;
import java.time.format.DateTimeFormatter;
public class Main 
{
    public static void main(String[] args)
    {
        String string = "May 1, 2016";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(string, formatter);
        System.out.println();
        System.out.println(date);
        System.out.println();
    }
}

/* Exercise 6: Write a Java program to get the next and previous Friday.  */

import java.time.*;
import java.time.temporal.TemporalAdjusters;
public class Main 
{
    public static void main(String[] args)
    {
        LocalDate dt = LocalDate.now();    
        System.out.println("\nNext Friday: "+dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY)));
        System.out.println("Previous Friday: "+dt.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY))+"\n");
    }
}

/*  */
