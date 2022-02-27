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
