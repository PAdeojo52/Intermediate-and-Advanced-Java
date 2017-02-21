/**
 * Class: Pet.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2015 
 * Written: Oct 1, 2015
 * 
 * 
 *  This class – ******
 * 
 *  Purpose: – ******
 */
import java.util.ArrayList;
import java.util.Iterator;


public abstract class Pet{

	protected String name;
	protected String breed;
	protected String color;
	protected int numOfLegs;
	protected double weight;

	public Pet()
	{
		this.name = "TBD";
		this.breed= "TBD";
		this.color="TBD";
		this.numOfLegs = 4;
		this.weight= 10;

	}
	public Pet(String name, String breed,String color,int numOfLegs, double weight)
	{
		setNumOfLegs(numOfLegs);
		setWeight(weight);
	}
	public Pet(String name, String breed, String color, String numOflegs ,String weight)
	{
		setNumOfLegs(numOflegs);
		setWeight(weight);
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
	public int getNumOfLegs()
	{
		return numOfLegs;
	}


	public void setNumOfLegs(int numOfLegs)
	{
		if(numOfLegs>2 && numOfLegs<8)	
			this.numOfLegs = numOfLegs;
		else
			this.numOfLegs = 4;
	}


	public void setNumOfLegs(String a)
	{
		if(Integer.parseInt(a)>2 &&  Integer.parseInt(a)<10)
		{
			this.numOfLegs=Integer.parseInt(a);
			//setNumOfLegs(a);
		}
		else
		{
			this.numOfLegs=4;
		}
	}
	public double getWeight()
	{
		return weight;
	}
	public abstract void setWeight(double weight);

	public void setWeight(String input) throws NumberFormatException
	{
		try
		{
			//double x= Double.parseDouble(input);
			this.setWeight(Double.parseDouble(input));
		}
		catch

		(NumberFormatException nfe)
		{
			this.weight = 0;
			System.out.println("Invalid Number");
		}


		/*Double.parseDouble(input);
		setWeight(input);*/
	}

	public int totalLegs(ArrayList<Pet>AL)
	{	
		int x = 0;

		for (Pet element: AL)
		{
			x+= element.getNumOfLegs();
		}
		return x;


	}
	public double totalWeight(ArrayList<Pet>AL)
	{
		double x = 0;
		for (Pet element: AL)
		{
			x+= element.getWeight();

		}
		return x; 
	}




			/*public int totalLegs(pets:ArrayList<Pet>)
	{
		int x = 0
		return x
	}*/


			@Override
			public String toString()
	{
		return "Pet";

	}
	/*	public int totalLegs(ArrayList<Pets>pets)
	{



	}

	public double totalWeights(ArrayList<Pets>pets)
	{


	}*/









}



