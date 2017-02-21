/**Class: Bike 
   * @author Evelyn Brannock
   * @version 1.0 
   * Course : ITEC 2150 Spring 2015
   * Written: January 18, 2015
   * 
   * 
   * This class – The Bike class has the following instance variables: 
   *		- manufacturer
   *		- name
   *		- year manufactured
   * a no-argument constructor
   * a constructor which uses all fields as parameters
   * getters and setters for all instance vars
   * an override of the toString method 
   * 
   * Purpose: – To describe a bike
   */

//implements sorting by manuf case insensitive
public class Bike implements Comparable<Bike>
{
	private String manufacturer;
	private String name;
	private int yearManufactured;
	

	/**
	 * Zero param constructor
	 */
	public Bike() 
	{
		this.manufacturer = "default";
		this.name = "default name";
		this.yearManufactured = 2015;
	}

	/**
	 * 3 param const
	 * @param manufacturer
	 * @param name
	 * @param yearManufactured
	 */
	public Bike(String manufacturer, String name, int yearManufactured) 
	{		
		this.manufacturer = manufacturer;
		this.name = name;
		this.yearManufactured = yearManufactured;
	}

	/**
	 * manufacturer getter
	 * @return manufacturer
	 */
	public String getManufacturer() 
	{
		return manufacturer;
	}

	/**
	 * manufacturer setter
	 * @param manufacturer
	 */
	public void setManufacturer(String manufacturer) 
	{
		this.manufacturer = manufacturer;
	}

	/**
	 * name getter
	 * @return
	 */
	public String getName() 
	{
		return name;
	}

	/**
	 * name setter
	 * @param name
	 */
	public void setName(String name) 
	{
		this.name = name;
	}

	/**
	 * yearManufactured getter
	 * @return yearManufactured
	 */
	public int getYearManufactured() 
	{
		return yearManufactured;
	}

	/**
	 * yearManufactured setter
	 * @param yearManufactured
	 */
	public void setYearManufactured(int yearManufactured) 
	{
		this.yearManufactured = yearManufactured;
	}

	/* 
	 * Bike toString
	 * @see java.lang.Object#toString()
	 */
	public String toString()
	{
		return "Bike manufacturer=" + manufacturer + ", name=" + name
				+ ", yearManufactured=" + yearManufactured + "\n";
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Bike other)
	{
		if (this.manufacturer.equalsIgnoreCase(other.manufacturer))
		{
			if (this.yearManufactured == other.yearManufactured) return 0;
			else if (this.yearManufactured < other.yearManufactured) return -1;
			else return 1;
		}
		else if (this.manufacturer.compareToIgnoreCase(other.manufacturer) < 0) return -1;
		return 1;
	}	
}
