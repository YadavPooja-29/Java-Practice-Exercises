/*
Exercise 3. Create a package animal and create two classes domestic and wild with parameter name.
Create another package test and write a program to print names of 2 domestic animals and two wild animals.
*/

package animal;

public class Domestic
{
	public void Info()
	{
		System.out.println("\n*****Domestic Animals*****");
		System.out.println("1: Cow \t 2: Dog");
	}
}

package animal;

public class Wild
{
	public void Info()
	{
		System.out.println("\n*****Wild Animals*****");
		System.out.println("1: Lion \t 2: Tiger");
	}
}

package test2;
import animal.Domestic;
import animal.Wild;
public class TestDemo
{

	public static void main(String[] args)
	{
		animal.Domestic d = new animal.Domestic();
		d.Info();
		animal.Wild w = new animal.Wild();
		w.Info();
	}

}
