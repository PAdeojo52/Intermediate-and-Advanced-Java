import java.util.ArrayList;

/**
 * Class: Pet.java 
 * @author Robert Bryan
 * @version 1.0
 * Course : ITEC 2150 Fall 2015 
 * Written: October 6th, 2015
 * 
 * 
 *  This class - This class holds and validates the information of the Pets. 
 * 
 *  Purpose - This class serves as the superclass of the Dog and Cat classes. It is abstract because it holds
 *  an abstract method, setWeight, as both the Dog and Cats have different weight validations. 
 */

public abstract class Pet implements Comparable <Pet>
{
	protected String name;
	protected String breed;
	protected String color;
	protected int numLegs;
	protected double weight;

	public Pet()
	{
		this("TBD", "TBD", "TBD", 4, 10); 
	}

	public Pet(String name, String breed, String color, int numLegs, double weight)
	{
		this.setName(name);
		this.setBreed(breed);
		this.setColor(color);
		this.setNumLegs(numLegs);
		this.setWeight(weight);
	}

	public Pet(String name, String breed, String color, String numLegs, String weight)
	{
		this.setName(name);
		this.setBreed(breed);
		this.setColor(color);
		this.setNumLegs(numLegs);
		this.setWeight(weight);
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getBreed()
	{
		return breed;
	}

	public void setBreed(String breed)
	{
		this.breed = breed;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	public int getNumLegs()
	{
		return numLegs;
	}

	public void setNumLegs(int numLegs)
	{
		if (numLegs >= 2 && numLegs <= 10)
		{
			this.numLegs = numLegs;
		}
		else
		{
			System.out.println("Invalid input for the number of legs, defaulting to 4.");
			this.numLegs = 4;
		}

	}

	public void setNumLegs(String numLegs)
	{
		try
		{			
			setNumLegs(Integer.parseInt(numLegs));
		}
		catch (NumberFormatException nfe)
		{
			System.out.println("Number of legs has been defaulted to 4.");
			this.numLegs = 4;
		}
	}

	public double getWeight()
	{
		return weight;
	}

	public abstract void setWeight(double weight);

	public void setWeight(String input)
	{
		try
		{
			setWeight(Double.parseDouble(input));
		}

		catch (NumberFormatException nfe)
		{
			System.out.println("The weight is not a valid number, defaulting to 0.");
			if (this instanceof Cat)
				this.weight = 10;
			else if (this instanceof Dog)
				this.weight = 40;
			else
				this.weight = 0.0;
		}
	}

	@Override
	public String toString()
	{
		return "Name = " + name + ", Breed = " + breed + ", Color = " + color + ", Number of Legs = " + numLegs + ", Weight = " + weight;
	}
	
	/**
	 * @param pets
	 * @return total number of legs of all pets
	 */
	public static int totalLegs(ArrayList<Pet> pets)
	{
		int count = 0;
		for (Pet p: pets)
		{
			count += p.numLegs;
		}
		return count;
	}
	
	/**
	 * @param pets
	 * @return weight of all Pets
	 */
	public static double totalWeights(ArrayList<Pet> pets)
	{
		double count = 0;
		for (Pet p: pets)
		{
			count += p.weight;
		}
		return count;
	}
}
