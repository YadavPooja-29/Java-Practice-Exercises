/*
Exercise 2 :
Create a class named 'Rectangle' with two data members- length and breadth and a method to calculate the area which is 'length*breadth'. 
The class has three constructors which are :
1 - having no parameter - values of both length and breadth are assigned zero.
2 - having two numbers as parameters - the two numbers are assigned as length and breadth respectively.
3 - having one number as parameter - both length and breadth are assigned that number.
Now, create objects of the 'Rectangle' class having none, one and two parameters and print their areas.
*/

import java.io.*;
class Rectangle
{
    float length, breadth;
    public void area()
    {
        length = 23;
        breadth = 24;
        float area = length * breadth; 
        System.out.println("Area of rectangle = " +area);
    }   
    Rectangle()
    {
        length = 0;
        breadth = 0;
    }
    Rectangle(float b)
    {
        length = 12;
        breadth =b;
        float a = length*breadth;
        System.out.println("Area of Rectangle ="+a);
    }
    Rectangle(float l, float b)
    {
        length = l;
        breadth = b;
        float area = length * breadth;
        System.out.println("Area of rectangle ="+area);
    }
}
public class Area
{
    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle();
        r1.area();
        Rectangle r2 = new Rectangle(25);
        r2.area();
        Rectangle r3 = new Rectangle(5,10);
        r3.area();
    }
}
