/**
 * Class: Square.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2015 
 * Written: Aug 25, 2015
 * 
 * 
 *  This class – ******
 * 
 *  Purpose: – ******
 */

public class Square
{
	
	private double length;
	
	public Square()
	{
		this.length= 0;
		
	}
	public Square(double length)
	{
		this.setLength(length);
		
	}
	public double getLength()
	{
		return length;
	}
	public void setLength(double length) throws IllegalArgumentException
	{
		if(length>=0)
		{
		this.length = length;
		}
		else
		{
			this.length= Math.abs(length);
			throw new IllegalArgumentException("You cannot have a length less than Zero. Length defaulted to abs value");
		}
	}
	
	@Override
	public String toString()
	{
		String value = "Length is " + length + " The Area is: "+ getArea()+ 
				" The Preimeter is : "+ getPerimeter() + 
				" The Diagonal is :" + getDiagnol();
		return value;
	}
	public double getPerimeter()
	{
		
		return this.length + this.length + this.length+ this.length;
	}
	public double getArea()
	{
		return this.length * this.length;
		
	}
	public double getDiagnol()
	{
		double area= this.length * this.length;
		
		return  area / 2;
	}



}
