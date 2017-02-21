/**
 * Class: Claws.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 3150 Spring 2016 
 * Written: Jan 18, 2016
 * 
 * 
 *  This class –Claws for Cats
 * 
 *  Purpose: – A small class for the cat claws. Maybe a little unnecessary. If i ever have to update this program, i may cut it....
 */

public enum Claws
{
	CLAWED,DECLAWED;

	
	
	@Override 
	public String toString() 
	 /*
     * Method:toString() Converts the attributes of the class to a text readable
     * format.
     * 
     * (non-Javadoc)
     * 
     * @see java.lang.Object#toString()
     */
	{
		String s = super.toString();
		return s.toLowerCase();
	}
}

