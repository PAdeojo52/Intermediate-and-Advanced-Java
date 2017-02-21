/**Program: Cat
 * @author: ITEC 2150
 * @version 1.0
 * Course: ITEC 2150-01
 * Written: Feb 10, 2010
 *
 **/

//Cat.java implements the Cat subclass describing the unique characteristics of a cat

/**
 * Set number of legs to default to 4; if you want a different
 * number of legs, must use the second constructor
 */

public class Cat extends Pet
{

	private Litter litterType; //scoopable, crystals, regular, none	
	private String newline = System.getProperty("line.separator");

	public Cat()
	{
		litterType = Litter.REGULAR;
		

	}

	public Cat(String name, String breed, String color, double weight)
	{
		super.setName(name);
		super.setBreed(breed);
		super.setColor(color);
		setWeight(weight);
		litterType = Litter.REGULAR;

	}
	public Cat(String name, String breed, String color, double weight,Litter littertype)
	{
		super.setName(name);
		super.setBreed(breed);
		super.setColor(color);
		setWeight(weight);
		setLitterType(littertype);
	}

	public Cat(String name, String breed, String color, String numOfLegs,String weight,String littertype)
	{
		super.setName(name);
		super.setBreed(breed);
		super.setColor(color);
	
		//setWeight(weight);
		super.setNumOfLegs(numOfLegs);
		setLitterType(littertype);
	}

	/*public Cat (Litter inLitterType)
	{
		//super(name, breed, coatColor, weight);

		this.litterType = inLitterType;		
	}*/

	public Litter getLitterType()
	{
		return this.litterType;
	}


	public void setLitterType(Litter litterType)
	{
		this.litterType = litterType;

	}
	public void setLitterType(String it)
	{
		if(it.equalsIgnoreCase("crystals"))
		{
			this.litterType=Litter.CRYSTALS;
		}
		else if (it.equalsIgnoreCase("Regular")||it.equalsIgnoreCase("invalid")||it.equalsIgnoreCase("Not sure"))
		{
			this.litterType=Litter.REGULAR;
		}
		else if (it.equalsIgnoreCase("SCOOPABLE")||it.equalsIgnoreCase("Scoopable"))
		{
			this.litterType=Litter.SCOOPABLE;
		}
		else if (it.equalsIgnoreCase("None"))
		{
			this.litterType=Litter.NONE;
		}
		else
		{
			this.litterType=Litter.REGULAR;
		}

	}
	public  void setWeight(double weight)
	{

		if(weight>4&&weight<60)
		{
			this.weight= weight;

		}
		else 
		{
			this.weight = 10;
		}

	}



	/*public void setWeigh(double weight)
	{
		if(weight>4||weight<60)
		{
			 Super(weight);
		}
		else 
			{
			this.weight = 10;
			}
	}*/

	/**
	 * @return
	 */

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return super.toString()+
				"The name of the cat is : " + name + newline+
				"The breed of the cat is: " + breed + newline +
				"The color of the cat is: "+ color + newline + 
				"The number of legs the cast has:  "+ numOfLegs+ newline+ 
				" The weight of the cat is: "+ weight + newline +
				"The cats's litter type is: "+ litterType + newline+ newline;
	}


}
