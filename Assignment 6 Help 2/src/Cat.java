import java.io.FileReader;
import java.util.Calendar;

/*Class: ITEC 2150
 * @author Samir Ahmed
 * @version 1.6
 * Course : ITEC 2150 Spring 2012
 * Written: January 18, 2015
 *
 *
 * This class � This class is about cat. it contains name of cats,breed,number of legs,and year born *
 * Purpose: � The purpose of this class is to find the cats who were born before 2004 and the cats should have legs more than 3. 
 * */
public class Cat 
{
	private String name;
	private String breed;
	private int numberOfLegs;
	private int yearBorn;

	public Cat(String name, String breed) 
	{
		this.name = name;
		this.setBreed(breed);
		this.numberOfLegs  = 4;
		this.yearBorn = 2015;
	}


	//all input for the cat is in String form as if it came from another UI
	public Cat(String name, String breed, String stringNumberOfLegs, String stringYearBorn) 
	{		
		this.name = name;
		this.setBreed(breed);
		this.setNumberOfLegs(stringNumberOfLegs);
		this.setYearBorn(stringYearBorn);
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

	//breed should be 5 chars or less
	public void setBreed(String breed) 
	{
		if (breed.length() > 5)
			this.breed = breed.substring(0, 5);
		else 
			this.breed = breed;
	}

	public int getNumberOfLegs() 
	{
		return numberOfLegs;
	}

	//numOfLegs should be (1,10] or defaults to 4
	//we are assuming that user did not enter anything but numbers
	public void setNumberOfLegs(int intNumOfLegs) 
	{
		if (intNumOfLegs >  1 && intNumOfLegs <= 10)
			this.numberOfLegs = intNumOfLegs;
		else
		{
			this.numberOfLegs = 4;
			System.out.println("You did not enter a valid number, it is defaulting to 4");
		}

	}

	//numOfLegs should be (1,10] or defaults to 4
	//we are assuming that user did not enter anything but numbers
	public void setNumberOfLegs(String stringNumberOfLegs) 
	{
		try
		{
			this.setNumberOfLegs(Integer.parseInt(stringNumberOfLegs.trim()));
		}
		catch (NumberFormatException nfe)
		{
			System.out.println("You did not enter a valid number, it is defaulting to 4");
			this.numberOfLegs = 4;
		}
		catch (Exception e)
		{
			System.out.println("Tell helpdesk to look at line 81 in Cat");
		}

		finally
		{
			System.out.println("I do this last NO MATTER WHAT!!!!!!");
		}

	}

	public int getYearBorn()
	{
		return yearBorn;
	}

	//yr must be > 2000 or default to 2000
	public void setYearBorn(int intYrBorn)
	{
		int currentYear =  Calendar.getInstance().get(Calendar.YEAR);
		if ((intYrBorn > currentYear - 15) && (intYrBorn <= currentYear))
			this.yearBorn = intYrBorn;
		else
			this.yearBorn = currentYear - 15;
	}


	//yr must be > 2000 or default to 2000
	public void setYearBorn(String stringYearBorn)
	{
		int currentYear =  Calendar.getInstance().get(Calendar.YEAR);
		if (stringYearBorn.matches("\\d{4}"))			
			this.setYearBorn(Integer.parseInt(stringYearBorn));		
		else 
			this.yearBorn = currentYear - 15; 

	}

	@Override
	public String toString() 
	{
		return "Cat [name=" + name + ", breed=" + breed + ", numberOfLegs="
				+ numberOfLegs + ", yearBorn=" + yearBorn + "]";
	}	
}


