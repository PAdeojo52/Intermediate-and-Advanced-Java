/**
 * Class: Employee.java
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

public class Employee
{
	String name;
	String salary;
	
	public Employee()
	{
		
	}
	public Employee(String name, String salary)
	{
		this.name = name;
		this.salary = salary;
		
	}
	
	@Override
	public String toString()
	{
		return   "This is the employees name: " + name + " "+ 
				"This is the employees salary:  " + salary + " " ;
	}

}
