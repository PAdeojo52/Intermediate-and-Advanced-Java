/**
 * Class: Pet.java
 * 
 * @author Peter Adeojo
 * @version 1.1
 *          <p>
 * Course : ITEC 3150 Spring 2016
 * Written: Jan 12, 2016
 * 
 * 
 *  This class – This class describes the common attributes and methods
 *          of the Pet being collected into an inventory
 * 
 *  Purpose: – This class sets up the parent class of my subsequent classes(Dog, Cat , Other) 
 *  while also setting up the five variables (name, ownersName, age, type)
 *  
 */

public abstract class Pet
{
	//Basic attributes of pet
	//Sets name of pet
	
	protected String name;
	
	//sets name of owner
	
	protected String ownersName;
	
	//sets pets age
	protected String age;
	
	//sets type. Super important. Careful if modding
	protected String type;


	public Pet()
	{
		 /**
	     * Method:Pet() Empty Constructor method. 
	     * 
	     * sets defualt attributes
	     *
	     */
		
		//Default attribute set
		this.type = "TBD";
		this.name = "TBD";
		this.ownersName = "TBD";
		this.age = "TBD";
	}


	//Generated getters and setters
	public String getName()
	{
		
		 /**
	     * Method:getName() 
	     *  
	     * 
	     * basic generated getter
	     *
	     */
		
		return name;
	}
	public void setName(String name)
	{
		 /**
	     * Method:setName(String name)
	     * 
	     * basic generated setter
	     *@param name
	     */
		
		this.name = name;
	}
	public String getOwnersName()
	{
		 /**
	     * Method:getOwnersName()
	     * 
	     * basic generated getter
	     *
	     *
	     */
		return ownersName;
	}
	public void setOwnersName(String ownersName)
	{
		 /**
	     * Method:PsetOwnersName(String ownersName)
	     * 
	     * basic generated setter
	     * 
	     * @param ownersName
	     *
	     */
		
		this.ownersName = ownersName;
	}
	public String getAge()
	{
		 /**
	     * Method:getAge()
	     * 
	     * basic generated getter
	     *
	     */
		
		return age;
	}
	public void setAge(String age)
	{
		 /**
	     * Method:setAge(String age)
	     * 
	     * basic generated setter
	     *
	     *@param age
	     */
		
		this.age= age;

	}
	public void setAge(int age)
	{
		 /**
	     * Method: setAge(int age)
	     * 
	     * basic generated setter
	     * 
	     * @param age
	     */
		
		this.age= Integer.toString(age);
	}
	public String getType()
	{
		 /**
	     * Method:getType()
	     * 
	     * basic generated getter
	     *
	     */
		
		return type;
	}
	public void setType(String type)
	{
		 /**
	     * Method:setType(String type)
	     * 
	     * 
	     * basic generated setter
	     *
	     *@param type
	     */
		
		this.type = type;
	}
	
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
		return "name=" + name + ", ownersName=" + ownersName + ", age="
				+ age + ", type=" + type;
	}

	
	//Methods
	
	
	

}

