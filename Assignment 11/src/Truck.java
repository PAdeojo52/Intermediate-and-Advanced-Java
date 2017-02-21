/**
 * Class: Truck.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2015 
 * Written: Oct 7, 2015
 * 
 * 
 *  This class – ******
 * 
 *  Purpose: – ******
 */

public class Truck extends Car
{
	
	
		public void m1()
		{
			System.out.println("truck 1");
		}
		public void m2 ()
		{
			super.m1();
		}
		public String toString()
		{
			return super.toString()+ super.toString();
		}
	}



