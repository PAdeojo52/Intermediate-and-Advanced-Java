/**
 * Class: Tester.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 3150 Spring 2016 
 * Written: Feb 24, 2016
 * 
 * 
 *  This class – This class describes the common attributes and methods
 *          of the Tester.java
 * 
 *  Purpose: – ******
 */

public class Tester
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub

		int Test1 = 2;
		int Test2 = 5;
		int Test3 = 8;
		
		int Test4 = 1;
		
		String Tester1 = "Tayo";
		String Tester2 = "Segun";
		String Tester3 = "Alexis";
		
		String Tester4 = "Tayo";

		Mid testing = new Mid();
		System.out.println(testing.hashCode(Tester1, Test1));
		System.out.println(testing.hashCode(Tester4, Test4));
		System.out.println(testing.hashCode(Tester2, Test3));

		
		
	}

}
