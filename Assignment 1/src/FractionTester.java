/**
 * Class: FractionTester.java
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

public class FractionTester
{

	public static void main(String[] args)
	{
		
		Fraction f1 = new Fraction();
		Fraction f2 = new Fraction(2);
		Fraction f3 = new Fraction(1,2);
		Fraction f4 = new Fraction(1,4);
		
		Fraction f5= f3.add(f4);
		System.out.println(f3 + "+" + f4 + "="+ f3.add(f4));
		
		// TODO Auto-generated method stub

	}

}
