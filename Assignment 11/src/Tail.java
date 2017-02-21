/**
 * Class: Tail.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2015 
 * Written: Oct 7, 2015
 * 
 * 
 *  This class – ******
 * 
 *  Purpose: – ******
 */

public enum Tail
{
	RING,DOCKED,CORKSCREW,BOB,FLAGPOLE,SABER,SICKLE;//tail values
	
	@Override
	public String toString()
	{
		String d = super.toString();
		return d.toLowerCase();
	}
	

}
