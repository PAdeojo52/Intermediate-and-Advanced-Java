/**
 * Class: KennelTester.java
 * 
 * @author ebrannoc
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2014 
 * Written: Sep 8, 2015
 * 
 * 
 *  This class – ******
 * 
 *  Purpose: – ******
 */

/**
 * @author ebrannoc
 *
 */
public class KennelTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		//testing 2 param constructor
		Kennel k = new Kennel();
		Cat c0 = new Cat("Sam","Persian");
		k.addCat(c0);
		Cat c1 = new Cat("Bella","Siamese");
		k.addCat(c1);
		//test 4 param constructor
		Cat c2 = new Cat("Tigger","Main", "14ee" , "19944");
		k.addCat(c2);
		Cat c3 = new Cat("Chloe","British shorthair", "4", "2005");
		k.addCat(c3);
		Cat c4 = new Cat("Oliver","Exotic", "-4" , "2001");	
		c4.setYearBorn(33333333);
		k.addCat(c4);
		Cat c5 = new Cat("Shadow","Ragdoll", "10" , "2006eee");
		k.addCat(c5);
		System.out.println(k);
		
		System.out.println("There were " + k.howManyByYear(2015) + " born in 2015");
	}

}
