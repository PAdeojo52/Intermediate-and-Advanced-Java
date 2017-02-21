/**
 * Class: Marketer.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 3150 Spring 2016 
 * Written: May 5, 2016
 * 
 * 
 *  This class – This class describes the common attributes and methods
 *          of the Marketer.java
 * 
 *  Purpose: – ******
 */

public class Marketer extends Employee
{
	Double newSalary;

	public Marketer()
	{
		// TODO Auto-generated constructor stub
	}
	
	

	    public double getSalary()
	    {
	    	
	    	newSalary= super.getSalary()+10000;
	    	
	        return newSalary;
	    }

	
	    
	    public void advertise()
	    {
	    	System.out.println("Act now, while supplies last!");
	    	
	    }

}
