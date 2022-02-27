/* Practice Exercise : 1
Create a class AccountHolder and create three account-holder object Tom, Henry and Sarah.
Output of the program is to test the eligibility for the account holder for credit card. 
Create method testEligibilityForCC() that will return true or false depending on below condition
*/

package ObjectAndClasses;

import java.util.*;
class AccountHolder
{
    String fname, lname ;
	  int age, minAge=25;
	  double balance, minBal=20000;
	  Scanner sc = new Scanner(System.in);
    
    public void getData(String Fname, String Lname, int Age, double Bal) 
	  {
		  fname = Fname;
		  lname = Lname;
		  age = Age;
		  balance = Bal;
	  }
    
    Boolean testEligibilityForCC()
    {
        if(this.age >= minAge & this.balance >= minBal)
			    return true;
	  	  else
			    return false;
    }

    public static void main(String[] args) 
	  {
		
		  AccountHolder tom = new AccountHolder();
		  AccountHolder henry = new AccountHolder();
		  AccountHolder sarah = new AccountHolder();
		  tom.getData("Tom","Smith", 21, 10000);
		  henry.getData("Henry","Hill", 31, 20000);
		  sarah.getData("Sarah", "Miller", 41, 30000);
		  System.out.println(tom.testEligibilityForCC()+"   "+tom.fname);
		  System.out.println(henry.testEligibilityForCC()+"   "+henry.fname);
		  System.out.println(sarah.testEligibilityForCC()+"   "+sarah.fname);
  }
}

/* Practice Exercise : 2
Modify above program so that the minimum age and minimum account balance can be changed at run time. ie: Instead of 25 and 20000 we need 22 and 25000
*/

package ObjectAndClasses;
import java.util.*;
class AccountHolder
{
    String fname, lname ;
	  int age, minAge=25;
	  double balance, minBal=20000;
	  Scanner sc = new Scanner(System.in);
    
    public void getData(String Fname, String Lname, int Age, double Bal) 
	  {
		  fname = Fname;
		  lname = Lname;
		  age = Age;
		  balance = Bal;
	  }
    
    Boolean testEligibilityForCC()
    {
        if(this.age >= minAge & this.balance >= minBal)
			    return true;
	  	  else
			    return false;
    }

     public void setMinValue()
	  {
		  System.out.println("enter minimum age");
		  minAge=sc.nextInt();
		  System.out.println("enter minimum balance");
		  minBal=sc.nextDouble();
	  }
  
    public static void main(String[] args) 
	  {		
		  AccountHolder tom = new AccountHolder();
		  AccountHolder henry = new AccountHolder();
		  AccountHolder sarah = new AccountHolder();
		  tom.getData("Tom","Smith", 21, 10000);
		  henry.getData("Henry","Hill", 31, 20000);
		  sarah.getData("Sarah", "Miller", 41, 30000);
      tom.setMinValue();
		  henry.setMinValue();
		  sarah.setMinValue();
		  System.out.println(tom.testEligibilityForCC()+"   "+tom.fname);
		  System.out.println(henry.testEligibilityForCC()+"   "+henry.fname);
		  System.out.println(sarah.testEligibilityForCC()+"   "+sarah.fname);
  }
}


/* Practice Exercise 3 :
Write a program to create a Student class with properties name , courseEnrolled . 
Write method getCourseEnrolled() that gives the result of the course enrolled by the student. 
Eg: Ram has enrolled for Java course , Vicky has enrolled for HTML course and Reena has enrolled for Spring course.
*/

package ObjectAndClasses;
import java.util.*;
class Student
{
    String name, courseEnrolled;
    Scanner sc = new Scanner(System.in);
    
    void getData()
    {
        System.out.println("Enter your Name:");
        name = sc.nextLine();
        System.out.println("Course Enrolled for :");
        courseEnrolled = sc.nextLine();
    }
    
    void getCourseEnrolled()
    {
        System.out.println(this.name+" has enrolled for "+this.courseEnrolled +" course");
    }
    
    public static void main(String args[])
    {
       
       Student s1 = new Student();
       s1.getData();
       s1.getCourseEnrolled();
       
       Student s2 = new Student();
       s2.getData();
       s2.getCourseEnrolled();
       
       Student s3 = new Student();
       s3.getData();
       s3.getCourseEnrolled();
    }
}


/* Practice Exercise 4 : 
Write a program to create a Accountant class with parameters name , emailId and contactNo. 
Write a method to view all the accountants information.
eg. Accountant Ravi has mail id ravi@gmail.com and contact No 9867785694 . 
Accountant Rutuja has mail id rutuja@gmail.com and contact No 9987565634.
*/

package ObjectAndClasses;
import java.util.*;
class Accountant
{
    String name, email;
    int contactNo;
    Scanner sc = new Scanner(System.in);
    
    public void getData()
    {
        System.out.println("\nEnter your Name :");
        name = sc.nextLine();
        System.out.println("Enter your email :");
        email = sc.nextLine();
        System.out.println("Enter your Contact Number :");
        contactNo = sc.nextInt();
        
    }
    public void showData()
    {
        System.out.println("\n Accountant " +this.name+" has mail id "+this.email +" and contact No "+this.contactNo);
    }
  
   public static void main(String args[])
   {
       
       Accountant a1 = new Accountant();
       a1.getData();
       a1.showData();
       
       Accountant a2 = new Accountant();
       a2.getData();
       a2.showData();
       
   }
}


