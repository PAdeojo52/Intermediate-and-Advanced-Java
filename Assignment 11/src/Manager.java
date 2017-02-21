/**
 * Class: Manager.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2015 
 * Written: Oct 8, 2015
 * 
 * 
 *  This class – ******
 * 
 *  Purpose: – ******
 */

public class Manager extends Employee
{
	String department;
	public Manager()
	{
		
	}
	public Manager(String name, String salary, String department )
	{
		super(name, salary);
		this.department=department;
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString()
	{
		return super.toString() +
				"This is his department: "+ department;
	}


		

}
