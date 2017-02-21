import java.util.ArrayList;

/**
 * Class: Kennel.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2015 
 * Written: Sep 8, 2015
 * 
 * 
 *  This class – ******
 * 
 *  Purpose: – ******
 */

public class Kennel
{
	private ArrayList<Cat>catAL;
	public Kennel()
	{
		this.catAL= new ArrayList<Cat>();
		
	}
	public ArrayList<Cat> getCatAL()
	{
		return catAL;
	}
	public void setCatAL(ArrayList<Cat> catAL)
	{
		this.catAL = catAL;
	}
	public int howManyByYear(int yr)
	
	{
		int total = 0;
		for(Cat c : catAL)
		{
			
		}
	}


}

/*
 * numLegs > 1 and <=10
 * breed exacly 5 long or less
 * 
 * 
 * add to cat
 * Public Cat(String Name, String Breed)
 * 
 * 
