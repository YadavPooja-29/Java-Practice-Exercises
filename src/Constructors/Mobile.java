/*  Exercise 1: 
Write a program to create 3 objects of class mobile owned by Abhishek , Rahul and Ravi.

Output of the program should be

Abhishek own iPhone Gold colour smartphone having 8MP camera
Rahul own Samsung White colour smartphone having 13MP camera
Ravi own Nexus Black colour smartphone having 8MP camera

*/
package Constructors;

import java.util.*;
class Mobile
{
    String name, mobile, color, camera;
    Scanner sc = new Scanner(System.in);
    
    Mobile()
    {
        System.out.println("\nEnter your Name :");
        name = sc.nextLine();
        System.out.println("Enter your Mobile Name :");
        mobile = sc.nextLine();
        System.out.println("Enter color of your Mobile :");
        color = sc.nextLine();
        System.out.println("Enter Camera pixel of your mobile :");
        camera = sc.nextLine();
    }
    
    void display()
    {
        System.out.println("\n " +this.name+" own  "+this.mobile +" "+ this.color+" smartphone having "+this.camera+" camera");
    }
  
   public static void main(String args[])
   {
       
       Mobile m1 = new Mobile();
       m1.display();
     
       Mobile m2 = new Mobile();
       m2.display();
     
       Mobile m3 = new Mobile();
       m3.display();
   }
}


