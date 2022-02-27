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

