/**
 * Class: Other.java
 * 
 * @author Peter Adeojo
 * @version 1.2
 *          <p>
 * Course : ITEC 3150 Spring 2016 
 * Written: Jan 18, 2016
 * 
 * 
 * 1.0 - Base creation
 * 1.1 - Fixed up errors and such
 * 1.2 - Added altPlacer
 *  This class – This class describes the common attributes and methods
 *          of Other
 * 
 *  Purpose: – Sets u the Other type of pet. Allows other pets outside Dog and Cats.
 */

public class Other extends Pet
{
	//All other pets need to be checked if they need special handling
	
	private boolean specialHandling;
	
	//This allows all other pets to be classifeid different from dog and cats
	//prior to 1.2 All pets would have been placed in a sepreate class
	//This allows me to set Other as one specfic type.
	
	private String altPlacer;
	
	public Other()
	{
		/**
	     * Method:Other()
	     * 
	     *  Sets the default special handling
	     *
	     */
		
		this.specialHandling = false;
		
	}
	
	public Other(String altPlacer, String type, String name, String ownersName, String age, boolean specialHandling)
	{
		/**
	     * Method:Other(String altPlacer, String type, String name, String ownersName, String age, boolean specialHandling)
	     *  sets defaults of other attributes
	     *
	     *@param altPlacer
	     *@param type
	     *@param name
	     *@param ownersName
	     *@param age
	     *@param specialhandling
	     */
		
		super.setName(name);
		super.setOwnersName(ownersName);
		super.setAge(age);
		super.setType(type);
		setSpecialHandling(specialHandling);
		setAltPlacer(altPlacer);
	}
	public Other(String altPlacer, String type, String name, String ownersName, String age, String specialHandling)
	{
		/**
	     * Method: public Other(String altPlacer, String type, String name, String ownersName, String age, String specialHandling)
	     * 
	     * Sets an overloaded method of Other
	     * 
	     *@param altplacer
	     *@param type
	     *@param name
	     *@param ownersName
	     *@param age
	     *@param specialhandling
	     */
		
		
		super.setName(name);
		super.setOwnersName(ownersName);
		super.setAge(age);
		super.setType(type);
		setSpecialHandling(specialHandling);
		setAltPlacer(altPlacer);
	}

	
	
	public String getAltPlacer()
	{
		/**
	     * Method:getAltPlacer() 
	     * 
	     * standard getter
	     *
	     */
		
		return altPlacer;
	}

	public void setAltPlacer(String altPlacer)
	{
		/**
	     * Method: setAltPlacer 
	     * 
	     *  standard setter
	     * 
	     * @param altplacer
	     *
	     */
		
		this.altPlacer = altPlacer;
	}

	public boolean isSpecialHandling()
	{
		/**
	     * Method:isSpecialHandling()
	     * 
	     * standard getter
	     * 
	     * The name wasnt my choice, it was generrated
	     *
	     */
		
		return specialHandling;
	}

	public void setSpecialHandling(boolean specialHandling)
	{
		/**
	     * Method: setAltPlacer 
	     * 
	     *  standard setter
	     * 
	     * @param specialHandling
	     *
	     */
		
		this.specialHandling = specialHandling;
	}
	public void setSpecialHandling(String specialHandles)
	{
		
		/**
	     * Method: setAltPlacer 
	     * 
	     *  standard setter. I set this overload in order to help expand handles ability. Maybe ill upgrade it in future versions
	     * 
	     * @param specialHandling
	     *
	     */
		
		if (specialHandles.equalsIgnoreCase("yes")|| specialHandles.equalsIgnoreCase("y"))
		{
			this.specialHandling = true;
		}
		else
		{
			this.specialHandling = false;
		}
	}
	
	@Override 
	public String toString() 
	{
		 /*
	     * Method:toString() Converts the attributes of the class to a text readable
	     * format. THis is an overload that i planned to use if i ever bumped to a 2.0
	     * This would fix that pesky unslightlness of havingall that information show during 
	     * the search in JOptionPane
	     * 
	     * (non-Javadoc)
	     * 
	     * @see java.lang.Object#toString()
	     */
		return super.toString() + " " + specialHandling;
	}
	

}
