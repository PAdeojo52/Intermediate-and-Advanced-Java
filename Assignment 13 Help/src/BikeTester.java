import java.util.ArrayList;
import java.util.Collections;

/**Class: BikeTester
* @author Evelyn Brannock
* @version 1.0
* Course : ITEC 2150 Spring 2015
* Written: January 18, 2015
*
*
* This class : This class tests Bike
*
* Purpose: Create bikes, place them in an array, and SOP them
*/

public class BikeTester 
{


	/**
	 * This is the main/driver method
	 * @param args
	 */
	public static void main(String[] args) 
	{
		ArrayList<Bike> bikeAL = new ArrayList<Bike>();
		Bike b0 = new Bike();
		bikeAL.add(b0);
		Bike b1 = new Bike("huffy", "x10", 2014);
		bikeAL.add(b1);
		Bike b2 = new Bike("schwinn", "x100", 2004);
		bikeAL.add(b2);
		Bike b3 = new Bike("pedal", "10x", 2003);
		bikeAL.add(b3);
		Bike b5 = new Bike("pedal", "10x", 2015);
		bikeAL.add(b5);
		Bike b6 = new Bike("pedal", "10x", 2004);
		bikeAL.add(b6);
		Bike b4 = new Bike("best", "thebest", 2014);
		bikeAL.add(b4);
		System.out.println("All Bikes using for loop");
		for (int i = 0; i < bikeAL.size(); i++)
		{
			System.out.println(bikeAL.get(i));			
		}
		System.out.println("\nAll Bikes using for each loop");
		for (Bike b: bikeAL)
		{
			System.out.println(b);
		}
		/*System.out.println("\nBikes manufactured after 2004");
		for (int i = 0; i < bikeAL.size(); i++)
		{
			if (bikeAL.get(i).getYearManufactured() > 2004)
			{
				System.out.println(bikeAL.get(i));	
			}
		}*/
		Collections.sort(bikeAL);
		System.out.println("Sorted Bikes ");
		System.out.println(bikeAL);
	
	}
}
