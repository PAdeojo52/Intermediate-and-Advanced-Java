import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class: CatTester.java
 * 
 * @author Peter Adeojo
 * @version 2.0
 *          <p>
 *          Course : ITEC 2150 Fall 2015 Written: Aug 25, 2015
 * 
 * 
 *          This class – ******
 * 
 *          Purpose: – ******
 */

public class CatTester
{

	public static void main(String[] args)
	{
		/*
		 * Bike[] bikeArray = new Bike[5]; Bike b0 = new Bike(); bikeArray[0] =
		 * b0; Bike b1 = new Bike("huffy", "x10", 2014); bikeArray[1] = b1; Bike
		 * b2 = new Bike("schwinn", "x100", 2004); bikeArray[2] = b2; Bike b3 =
		 * new Bike("pedal", "10x", 2003); bikeArray[3] = b3; Bike b4 = new
		 * Bike("best", "thebest", 2014); bikeArray[4] = b4;
		 * System.out.println("All Bikes"); for (int i = 0; i <
		 * bikeArray.length; i++) { System.out.println(bikeArray[i]); }
		 */
		
	
		
		
		
		
		Cat[]catArray = new Cat[11];
		//Sets my Array List
		ArrayList<Cat>catAL = new ArrayList<Cat>();
		
		Cat c0 = new Cat();
		catArray[0]= c0;
		catAL.add(c0);
		
		Cat// name,breed,legs,year born
		// No need to delete anything, Just Plug needed info in
		c1 = new Cat("Tsubaki", "Persian Cat", 4, 2001);
		catArray[1] = c1;
		catAL.add(c1);

		Cat c2 = new Cat("Black Star", "Siamese Cat", 4, 2002);
		catArray[2] = c2;
		catAL.add(c2);
		
		Cat c3 = new Cat("Maka", "British Shorthair", 4, 2003);
		catArray[3] = c3;
		catAL.add(c3);

		Cat c4 = new Cat("Foul", "Abyssinian Cat", 4, 2004);
		catArray[4] = c4;
		catAL.add(c4);

		Cat c5 = new Cat("Flair", "Black Cat", 3, 2005);
		catArray[5] = c5;
		catAL.add(c5);

		Cat c6 = new Cat("Fatty", "Maine Coon", 4, 2006);
		catArray[6] = c6;
		catAL.add(c6);

		Cat c7 = new Cat("Fizz", "Bengal Cat", 4, 2008);
		catArray[7] = c7;
		catAL.add(c7);

		Cat c8 = new Cat("DTK", "Russian Blue", 4, 2015);
		catArray[8] = c8;
		catAL.add(c8);

		Cat c9 = new Cat("Chrona", "Siberian Cat", 4, 2016);
		catArray[9]= c9;
		catAL.add(c9);

		Cat c10 = new Cat("Frank", "Siberian Cat " , 4 , 2005 );
		catArray[10]=c10;
		catAL.add(c10);

		//Cat c11 = new Cat("Frank", "Siberian Cat", 5, 2007);
		//catArray[9] = c9;
		//System.out.println("All Cats");
		//Test my tests
		
		//System.out.println(catArray[1]);
		//System.out.println(catAL.get(0));
	
		//System.out.println(catArray[1])
		
		for(int k = 0; k<catAL.size(); k++)
		{
			// This helps me search my name string 
			String t = catAL.get(k).getName().substring(0, 1);
			//System.out.println(t);
			
			//Sets what i'm looking for
			String f = "F";
			//prints outs results
			
			if (t.equalsIgnoreCase(f))
			{
				System.out.println(catAL.get(k));
				//Adjust for ArrayList
				catAL.remove(k--);	
			}
			
		}
		System.out.println(" Remaining Cats");

		for(int x = 0;x< catAL.size();x++ ){
			
			System.out.println(catAL.get(x));
		}
		
		//Array With Snoot Cat
		System.out.println("List with Snoot Cat");
		Cat c11= new Cat ("Snoot", "Calico", 2000, 4);
		catAL.add(1,c11);
		
		for(int t = 0; t< catAL.size();t++)
		{
			System.out.println(catAL.get(t));
		}
	
		 Cat.getTotalLegs(catAL);
		
		/*

		for (int i = 0; i < catArray.length; i++)
		{
			System.out.println(catArray[i]);
		}

		System.out.println("Cats born  after 2004 and have 3 legs or greater");
		for (int i = 0; i < catArray.length; i++)
		{
			if (catArray[i].getYearBorn() > 2004 && catArray[i].getNumberOfLegs()> 3)
			{
				System.out.println(catArray[i]);
			}

		}
		*/
	}
	
}
