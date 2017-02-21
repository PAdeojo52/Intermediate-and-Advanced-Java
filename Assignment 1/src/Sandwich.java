/**
 * Class: Sandwich.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2015 
 * Written: Aug 25, 2015
 * 
 * 
 *  This class – ******
 * 
 *  Purpose: – ******
 */

public class Sandwich
{
	private String[] ingredientsArray;
	private String[] condimentsArray;
	
	public static final int INGREDIENTS_SIZE = 10; 
	public static final int CONDIMENTS_SIZE = 5;
	
	

	public Sandwich(String[] iArray, String[] cArray){
		
		this.ingredientsArray = iArray;
		this.condimentsArray = cArray;
	}




	public String[] getIngredientsArray()
	{
		return ingredientsArray;
	}




	public void setIngredientsArray(String[] ingredientsArray)
	{
		this.ingredientsArray = ingredientsArray;
	}




	public String[] getCondimentsArray()
	{
		return condimentsArray;
	}




	public void setCondimentsArray(String[] condimentsArray)
	{
		this.condimentsArray = condimentsArray;
	}

	
}
