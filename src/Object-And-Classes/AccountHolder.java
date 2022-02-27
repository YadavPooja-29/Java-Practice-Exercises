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



