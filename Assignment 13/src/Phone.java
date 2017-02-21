import java.io.Serializable;

/**
 * Class: Phone.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2015 
 * Written: Oct 13, 2015
 * 
 * 
 *  This class – Phone Class 
 * 
 *  Purpose: – Sets up Phone Object
 */

public class Phone implements Comparable<Phone>,Serializable
{
	private int areaCode;
	private String theRest;
	
	//to seperate tostring
	private String newline = System.getProperty("line.separator");

	
	public Phone()
	{
		
		
	}
	public Phone(int areaCode, String theRest)
	{
		this.areaCode=areaCode;
		this.theRest=theRest;
	}
	public int getAreaCode()
	{
		return areaCode;
	}
	public void setAreaCode(int myAreaCode)
	{
		this.areaCode = myAreaCode;
	}
	public String getTheRest()
	{
		return theRest;
	}
	public void setTheRest(String theRest)
	{
		this.theRest = theRest;
	}
	
	
	
	
	@Override
	public String toString()
	{
		return " The Area Code : " + areaCode + newline+
				" The rest of the numbers : "+ theRest + newline;	
	}
	
	
	@Override
	public int compareTo(Phone o)
	{
		
		if(this.areaCode==o.areaCode)return 0;
		else if(this.areaCode<o.areaCode)return -1;
		else return 1;
		/*String intConverter= Integer.toString(this.areaCode);
		if(intConverter.equalsIgnoreCase(Integer.toString(o.areaCode)))
		{
			if(t)
		}
		*/
		
		/*nteger comprator = o.getAreaCode();
		return comprator.compareTo(o.areaCode);*/
		// TODO Auto-generated method stub
		//555return 0;
		
		
	}
	

}
