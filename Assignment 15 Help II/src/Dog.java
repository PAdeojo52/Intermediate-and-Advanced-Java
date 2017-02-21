import java.util.ArrayList;
/**Class: Dog.java
 * @author: Parth Patel
 * @version: 1.0
 * Course : ITEC 2150 fall 2015 Dr. Brannock
 * Date Written: Oct 26, 2015
 * Class Description: This class holds the information of Dog. this class i the subclass of Pet class
 * Purpose: this class declare its own  instance variables, isTrained, and tailType, instance variables that are unique to the Dogs in pets. 
 */

public class Dog extends Pet
{
	private boolean isTrained;
	private Tail tailType;

	public Dog()
	{
		super();
		this.tailType = Tail.WHIP;
		this.isTrained = false;
	}

	public Dog(String name, String breed, String color, double weight, boolean isTrained, Tail tailType)
	{
		super(name, breed, color, 4, weight);
		this.isTrained = isTrained;
		this.tailType = tailType;
	}

	public Dog(String name, String breed, String color, int numLegs, double weight, boolean isTrained, Tail tailType)
	{
		super(name, breed, color, numLegs, weight);
		this.isTrained = isTrained;
		this.tailType = tailType;
	}
	public Dog(String name, String breed, String color, String numLegs, String weight, String tailType)
	{
		super(name, breed, color, numLegs, weight);
		this.setTailType(tailType);
	}

	public boolean getIsTrained()
	{
		return isTrained;
	}


	public void setTrained(boolean isTrained)
	{
		this.isTrained = isTrained;
	}


	public Tail getTailType()
	{
		return tailType;
	}

	public void setTailType(String tt)
	{

		if (tt.equalsIgnoreCase("ring") || tt.equalsIgnoreCase("ringed"))
		{
			this.tailType = Tail.RING;
		}
		else if (tt.equalsIgnoreCase("dock") || tt.equalsIgnoreCase("docked"))
		{
			this.tailType = Tail.DOCKED;
		}
		else if (tt.equalsIgnoreCase("bobbed") || tt.equalsIgnoreCase("bob"))
		{
			this.tailType = Tail.BOBBED;
		}
		else
		{
			this.tailType = Tail.WHIP;
		}
	}


	@Override
	public void setWeight(double weight)
	{
		if (weight >= 2.0 && weight <= 250.0)
		{
			this.weight = weight;
		}
		else
		{
			System.out.println("Weight is below 2 or above 250, defaulting to 40.");
			this.weight = 40.0;
		}
	}

	@Override
	public String toString()
	{
		return super.toString() + ", isTrained = " + isTrained + ", Tail Type = " + tailType;
	}
	
	/**
	 * @param pets
	 * @return total weight of all dogs
	 */
	public static double totalWeights(ArrayList<Pet> pets)
	{
		double count = 0;
		for (Pet p: pets)
		{
			if (p instanceof Dog)
			{
				count += p.weight;	
			}
		}
		return count;
	}
}

