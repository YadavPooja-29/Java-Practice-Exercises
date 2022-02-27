/* Exercise 2 : 
Write a class student who is having Name, Roll number, Fathers’ Name, Contact Number, Address as fields. 

The output of the program should be 

Student Name is: Mr. Abhishek
Roll Number is: 123
Fathers' Name is: Mr. Sulekh
Contact Number is: +1-8745733445
Student Address is: #321, South Street, No-3, Ontario

*/

package Constructors;


import java.util.*;
class Student
{
    Scanner sc = new Scanner(System.in);
    String name,father_name,contactNo,address;
    int rno;
    Student()
    {
        System.out.println("Enter your Roll No :");
        rno = sc.nextInt();
        System.out.println("Enter your Name :");
        name = sc.nextLine();
        System.out.println("Enter your Contact Number :");
        contactNo = sc.nextLine();
        System.out.println("Enter your Father's Name :");
        father_name = sc.nextLine();
        System.out.println("Enter your Adddress :");
        address = sc.nextLine();
    }
    void display()
    {
        System.out.println("\nStudent Name is :" +this.name);
        System.out.println("Roll Number is :" +this.rno);
        System.out.println("Fathers' Name is :" +this.father_name);
        System.out.println("Contact Number is :" +this.contactNo);
        System.out.println("Student Address is :" +this.address);
    }

	  public static void main(String[] args) 
	  {
		   Student s = new Student();
	  }
  
}



/* 
Exercise 1.
Write a program to print the names of students by creating a Student class.
If no name is passed while creating an object of Student class, then the name should be "Unknown", 
otherwise the name should be equal to the String value passed while creating object of Student class.
*/

import java.io.*;
class Student
{
    String name;
    public Student(String s)
    {
        name = s;
    }
  
    public Student()
    {
        name = "Unknown";
    }
  
    public static void main(String[] args)
    {
        Student s = new Student("Pooja");
        Student a = new Student();

        System.out.println(s.name);
        System.out.println(a.name);
    }
  
}
