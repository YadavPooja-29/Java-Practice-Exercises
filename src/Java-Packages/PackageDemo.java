/* 
Exercise 1 : Create a class car with parameters colour, model, engine-type.
Package this car class in package vehicle. 
Create another package test and write a program to print the details of the car.
*/

package Vehicle;

public class Car
{
	String colour,model,engine_type;
    public void displayDetails(String c, String m, String e)
    {
        colour = c;
        model = m;
        engine_type = e;
        System.out.println("\n*****Details of the Car*****");
        System.out.println("Car Colour :" +colour);
        System.out.println("Car Model :" +model);
        System.out.println("Car Engine- type :" +engine_type);
    }
}

package Test;
import Vehicle.Car;
public class PackageDemo {

	public static void main(String[] args)
	{
		Vehicle.Car p = new Vehicle.Car();
        p.displayDetails("Black","Duster","A1");
	}

}
