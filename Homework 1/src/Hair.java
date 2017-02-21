/**
 * Class: Hair.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 3150 Spring 2016 
 * Written: Jan 18, 2016
 * 
 * 
 *  This class – Hair for Cat
 * 
 *  Purpose: – Sets up enum class for Cat. Definitly would intergrate later
 */

public enum Hair
{
	LONG, SHORT;

	
	@Override 
	public String toString() 
	{
		String s = super.toString();
		return s.toLowerCase();
	}
}
