/* 
Exercise 2 : 
Create a class classRoom with parameters noOfDesk and noOfBench . 
Package this class in package School. 
Create another package test and write a program to print the details of 3 classes from 5th to 8th std with no of desk and no of benches in each class room.
*/

package School;

public class classRoom
{
	public void classRoom(int noOfDesk, int noOfBench )
	{
		System.out.println("No. of Desk ="+noOfDesk +" No. of Bench = "+noOfBench);
	}
}

package Test1;
import School.classRoom;
import java.util.*;
public class Room
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Class:");
		int cls = sc.nextInt();
		if(cls==5 || cls==6 || cls==7 || cls==8)
		{
			School.classRoom c = new School.classRoom();
			c.classRoom(5,8);
		}
		else
		{
			System.out.println("Invalid Input");
		}
		
	}

}
