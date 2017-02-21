/**
 * Class: Color.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 3150 Spring 2016 
 * Written: Jan 18, 2016
 * 
 * 
 *  This class – Colors for cat and Dogs
 * 
 *  Purpose: – Sets the colors for the Cats and Dogs. if I ever make this a v1.1 i may try expanding
 *  the color library. or make it more fur related....
 */

public enum Color
{
	
	APRICOT, BLEINHEIM, BLACK, RED , ORANGE, TAN, RUBY, RUST, WHITE, YELLOW, BLUE, ONIX ,GREEN, VIOLET, INDIGO, PINK;
	
	
	@Override 
	public String toString() 
	{
		String s = super.toString();
		return s.toLowerCase();
	}
}

/*@Override
public String toString()
{
	String
}*/
