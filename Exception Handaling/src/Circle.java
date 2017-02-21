import java.util.ArrayList;

/*1.	Create a class called Circle which has the following instance variables (do NOT add any other instance variables to the class): 
- radius (private double radius;)
2.	Create the constructor which receives the radius as a parameter 
3.	Write the getter and setter methods for the instance variable
4.	Override the toString method by using the following code

     @Override
	public String toString()
	{
		String value = "radius is " + radius;
		return value;
	}

5.	Write a method to compute the area of the circle*/

public class Circle
{

	private double radius;

	public Circle(double radius) 
	{
		this.radius = radius;
	}

	public double getRadius() 
	{
		return radius;
	}

	public void setRadius(double radius) 
	{
		this.radius = radius;
	}

	public String toString() 
	{
		return String.format("The circle's radius is %8.2f and the area is %-12.4f", radius, computeArea()); 
		//the radius lines up on the right, and the area (because of the -) lines up on the left

	}

	public double computeArea()
	{
		return Math.PI * this.radius * this.radius;
	}

	public static int getTotalLegs(ArrayList<Circle> circleAL)
	{
		///your code that totals the radii
		int total = 0;
		for (Circle c: circleAL)
		{
			//total = total ....something
		}
		return total;
	} 
}
