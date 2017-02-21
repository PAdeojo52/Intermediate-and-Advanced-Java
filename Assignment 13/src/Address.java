import java.io.Serializable;

/**
 * Class: Address.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2015 
 * Written: Oct 13, 2015
 * 
 * 
 *  This class –  The Address Class
 *  Purpose: – Sets up Address Object
 */

public class Address implements Comparable<Address>,Serializable
{
	private String street;
	private String city;
	private String state;
	private int zip;
	//to seperate the to string
	private String newline = System.getProperty("line.separator");

	/*public Address()
	{


	}*/
	public Address(String street, String city, String state,String zip )
	{
		this.street = street;
		this.city=city;
		setState(state);

		setZip(zip);

	}
	public String getStreet()
	{
		return street;
	}
	public void setStreet(String street)
	{
		this.street = street;
	}
	public String getCity()
	{
		return city;
	}
	public void setCity(String city)
	{
		this.city = city;
	}
	public String getState()
	{
		return state;
	}
	public void setState(String state)
	{
		if(state.length()== 2)
		{
			this.state = state;

		}
		else
		{
			String Fixed = state.substring(0, 2);
			this.state= Fixed;
		}
	}
	public int getZip()
	{
		return zip;
	}
	public void setZip(String zip)
	{
	
		// zipChange = Integer.toString(zip);
		//System.out.println(zip);
		String zipRegex = "\\d{5}";
		/*if(zipChange.matches(zipRegex))
		{
			System.out.println("trrue");
		}
		else
		{
			System.out.println("false");
		}*/
		if (zip.matches(zipRegex))
		{
			Integer w =Integer.parseInt(zip);
			this.zip = w;
		}
		else
		{
			String newZip = "";
			int i = 0;
			for(i = 0; i<zip.length();i++)
			{
				char c = zip.charAt(i);
				if(c >= '0'&& c <='9')
				{
					newZip = newZip + c;
				}
			}
			Integer w =Integer.parseInt(newZip);
			this.zip = w;
		}



	}
	@Override
	public String toString()
	{
		return "the Street is " + street +newline+
				"the City is : "+ city + newline+
				"the State is : " + state+newline+
				"the zip code : " + zip+ newline;

	}

	@Override
	public int compareTo(Address o)
	{
		if(this.city.equalsIgnoreCase(o.city))
		{
			return 0;
		}
		else if(this.city.compareToIgnoreCase(o.city)<0)
		{
			return -1;
		}

		else 
		{
			return 1;
		}

		//return o.getCity().compareTo(getCity());

	}





}
