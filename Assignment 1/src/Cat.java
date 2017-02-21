import java.util.ArrayList;

/**
 * Class: Cat.java
 * 
 * @author Peter Adeojo
 * @version 2.0
 *          <p>
 * Course : ITEC 2150 Fall 2015 
 * Written: Aug 25, 2015
 * 
 * 
 *  This class – ******
 * 
 *  Purpose: – ******
 */

public class Cat
{
	
	private String name;
	private String breed;
	private int numberOfLegs;
	private int yearBorn;



public Cat()
{
	this.name= "Default Name";
	this.breed= "Deafult Breed";
	this.numberOfLegs= 4;
	this.yearBorn= 0;
}

	
public Cat(String name, String Breed, int numberOfLegs, int yearBorn ){
	
	this.name= name;
	this.breed= Breed;
	this.numberOfLegs= 4;
	this.yearBorn= yearBorn;
	
}
public static void print(int sum)
{
	
	System.out.println("These are all the legs " + sum );
}

public static void getTotalLegs(ArrayList<Cat>catAL)
{
	
	//for (int i : ArrayList<E>)
	  //  sum += i;
	int sum = 0;
	for(int i = 0;i<catAL.size();i++)
	{
		//int base= sum++;
		//int Tsu = base * 2; 
		//sum = Tsu;
		int y = sum++;
	}
	print(sum * 4);

	 
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
	breed = breed;
}



public int getNumberOfLegs()
{
	return numberOfLegs;
}

public void setNumberOfLegs(int St)


public void setNumberOfLegs(int numberOfLegs)
{
	this.numberOfLegs = numberOfLegs;
}



public int getYearBorn()
{
	return yearBorn;
}



public void setYearBorn(int yearBorn)
{
	this.yearBorn = yearBorn;
}




@Override
public String toString()
{
	return "name= " + name + ", Breed = "  + breed + ", numberOfLegs= "
			+ numberOfLegs + ",  yearBorn= " + yearBorn + "]";
}


}

