import java.util.ArrayList;
/**Class: Cat.java
 * @author: Parth Patel
 * @version: 1.0
 * Course : ITEC 2150 fall 2015 Dr. Brannock
 * Date Written: Oct 26, 2015
 * Class Description:  this class have the information of the cat and it is subclass of Pet Class
 * Purpose: Cat creates its own instance variable, litterType enum, Litter that is uses to hold the different types of Litter. It holds
 *  the setWeight method that is different than the Dog's validations. 
 */

public class Cat extends Pet
{
	private Litter litterType;

	public Cat()
	{
		super();
		this.litterType = Litter.REGULAR;
	}

	public Cat(String name, String breed, String color, double weight)
	{
		super(name, breed, color, 4, weight);
		this.litterType = Litter.REGULAR;
	}

	public Cat(String name, String breed, String color, double weight, Litter litterType)
	{
		super(name, breed, color, 4, weight);
		this.litterType = litterType;
	}

	public Cat(String name, String breed, String color, int numLegs, double weight, Litter litterType)
	{
		super(name, breed, color, numLegs, weight);
		this.litterType = litterType;
	}

	public Cat(String name, String breed, String color, String numLegs, String weight, String litterType)
	{
		super(name, breed, color, numLegs, weight);
		this.setLitterType(litterType);
	}

    //getters and setters
	public Litter getLitterType()
	{
		return litterType;
	}

	public void setLitterType(String lt)
	{
		if (lt.equalsIgnoreCase("crystals"))
		{
			this.litterType = Litter.CRYSTALS;
		}
		else if (lt.equalsIgnoreCase("Scoopable"))
		{
			this.litterType = Litter.SCOOPABLE;
		}
		else if (lt.equalsIgnoreCase("None"))
		{
			this.litterType = Litter.NONE;
		}
		else
		{
			this.litterType = Litter.REGULAR;
		}
	}

	@Override
	public void setWeight(double weight)
	{
		if (weight >= 4.0 && weight <= 60.0)
		{
			this.weight = weight;
		}
		else
		{
			System.out.println("Weight is below 4 or above 60, defaulting to 10");
			this.weight = 10.0;
		}
	}

	@Override
	public String toString()
	{
		return super.toString() + ", Litter type = " + litterType;
	}
	
	
	/**
	 * @param pets
	 * @return the total weight of all Cats
	 */
	public static double totalWeights(ArrayList<Pet> pets)
	{
		double total = 0;
		for (Pet p: pets)
		{
			if (p instanceof Cat)
				total += p.weight;			
		}
		return total;
	}
}
