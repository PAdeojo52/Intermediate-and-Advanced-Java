import java.util.ArrayList;

/**
 * Class: Person.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2015 
 * Written: Oct 13, 2015
 * 
 * 
 *  This class – Person Class
 * 
 *  Purpose: – Sets up Person Object
 */

public class Person implements Comparable<Person>
{
	private String firstName;
	private String lastName;
	private ArrayList<Phone>phone;
	private ArrayList<Address>address;
	
	//to seperate tostrings
	private String newline = System.getProperty("line.separator");

	
	//private int areaCode;
	//private String theRest;

	/*public Person()
	{

	}*/
	public Person(String firstName, String lastName, ArrayList<Phone> phone, ArrayList<Address>adresss)
	{
		this.firstName=firstName;
		this.lastName=lastName;
		this.phone= phone;
		this.address= adresss;


	}

	public String getFirstName()
	{
		return firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	public String getLastName()
	{
		return lastName;
	}
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	}
	public ArrayList<Phone> getPhone()
	{
		return phone;
	}
	public void setPhone(ArrayList<Phone> phone)
	{
		this.phone = phone;
	}
	public ArrayList<Address> getAddress()
	{
		return address;
	}
	public void setAddress(ArrayList<Address> address)
	{
		this.address = address;
		//System.out.println(address);
	}


/*	public int compareTo(Person personName)
	{
		
		return 0;
	}*/
	@Override
	public String toString()
	{
		return "The first name : " + firstName + newline+
				"The last name : " + lastName + newline +
				"the  Phone is : " + phone.get(0)+ newline +
				"the address is " + address.get(0);
		
		
	}

	@Override
	public int compareTo(Person o)
	{
		if(this.lastName.compareTo(o.lastName)<0)
		{
			
			return this.firstName.compareTo(o.firstName);
		
		}
		else
		{
			return this.lastName.compareTo(o.lastName);
		}
			/*if(this.firstName.equalsIgnoreCase(o.firstName))return 0;
			else if(this.firstName.compareToIgnoreCase(o.firstName)<0)return -1;
			else return 1;
		}*/
	/*	else if(this.lastName.compareToIgnoreCase(o.lastName)<0) return -1;
		else return 1;*/
		//return this.firstName.compareToIgnoreCase(o.getFirstName());
		//lastname + first name 
		
		//return 0;
	}
}
