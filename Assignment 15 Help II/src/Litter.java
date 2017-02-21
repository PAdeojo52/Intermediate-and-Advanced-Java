/**Class: Litter.java
 * @author: Parth Patel
 * @version: 1.0
 * Course : ITEC 2150 fall 2015 Dr. Brannock
 * Date Written: Oct 26, 2015
 * Class Description: this class describe litter information of the pet
 * Purpose:  Enumerate types of litter
 */


	public enum Litter 
	{
		SCOOPABLE, CRYSTALS, REGULAR, CORN, NONE;  //only valid values.

		@Override 
		public String toString() 
		{
			String s = super.toString();
			return s.toLowerCase();
		}
	}

