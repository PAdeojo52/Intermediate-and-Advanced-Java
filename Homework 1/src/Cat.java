/**
 * Class: Cat.java
 * 
 * @author Peter Adeojo
 * @version 1.3
 *          <p>
 * Course : ITEC 3150 Spring 2016 
 * Written: Jan 18, 2016
 * 
 * 
 *  This class – This class describes the common attributes and methods
 *          of the Cat
 * 
 *  Purpose: – This class creates the instance of class to be
 */

public class Cat extends Pet
{
	
	private Hair hairType;
	private Claws clawType;
	private Color colorType;
	
	public Cat()
	{ /**
	     * Method:Cat() Empty Constructor method. No use other than
	     * calling cat in case needed
	     *
	     */
		
	}
	
	public Cat(String type, String name, String ownersName, String age, String hairType, String clawType, String colorType)
	{
		 /**
	     * Method: Cat() Constructor method that accepts values for all the
	     * attributes and sets them.
	     *
	     * @param type
	     * @param name
	     * @param ownersName
	     * @param age
	     * @param hairType
	     * @param clawtype
	     * @param colorType
	     */
		
		super.setName(name);
		super.setOwnersName(ownersName);
		super.setAge(age);
		super.setType(type);
		setHairType(hairType);
		setClawType(clawType);
		setColorType(colorType);
	}

	public Hair getHairType()
	{
		 /**
	     * Method: getHairType() gennerated getter method
	     *
	     *@returns hairtype
	     */
		
		return hairType;
	}

	public void setHairType(String hairType)
	{ /**
	     * Method: setHairType - Sets up the enum class Hair in Cat
	     * 
	     * @param  hairtype
	     */
		
		if(hairType.equalsIgnoreCase("Long"))
		{
			this.hairType = Hair.LONG;
		}
		else
		{
			this.hairType = Hair.SHORT;
		}
	}

	public Claws getClawType()
	{
		/**
	     * Method: getClawType - generated getter for claw types
	     * 
	     *  
	     */
		
		return clawType;
	}

	public void setClawType(String clawType)
	{
		/**
	     * Method: setClawType - Sets up the enum Class Clawtype in cat
	     * 
	     * @param clawType
	     */
		
		if(clawType.equalsIgnoreCase("Declawed"))
		{
			this.clawType = Claws.DECLAWED;
		}
		else
		{
			this.clawType = Claws.CLAWED;
		}
	}

	public Color getColorType()
	{
		/**
	     * Method: getColorType - generated getter to get Color of cat
	     * 
	     * 
	     */
		
		return colorType;
	}

	public void setColorType(String colorType)
	{
		
		
		/**
	     * Method: setColorType - sets up color for pet.
	     * 
	     * @param colorType
	     */
		if(colorType.equalsIgnoreCase("Apricot"))
		{
			this.colorType = Color.APRICOT;
		}
		else if(colorType.equalsIgnoreCase("BLEINHEIM"))
		{
			this.colorType = Color.BLEINHEIM;
		}
		else if(colorType.equalsIgnoreCase("Black"))
		{
			this.colorType = Color.BLACK;
		}
		else if(colorType.equalsIgnoreCase("Red"))
		{
			this.colorType = Color.RED;
			
		}
		else if(colorType.equalsIgnoreCase("Orange"))
		{
			this.colorType = Color.ORANGE;
		}
		else if(colorType.equalsIgnoreCase("Tan"))
		{
			this.colorType = Color.TAN;
		}
		else if(colorType.equalsIgnoreCase("Ruby"))
		{
			this.colorType = Color.RUBY;
		}
		else if(colorType.equalsIgnoreCase("Rust"))
		{
			this.colorType = Color.RUST;
		}
		else if(colorType.equalsIgnoreCase("Pink"))
		{
			this.colorType = Color.PINK;
		}
		else if(colorType.equalsIgnoreCase("White"))
		{
			this.colorType = Color.WHITE;
		}
		else if(colorType.equalsIgnoreCase("Yellow"))
		{
			this.colorType = Color.YELLOW;
		}
		else if(colorType.equalsIgnoreCase("blue"))
		{
			this.colorType = Color.BLUE;
			//System.out.println(Color.BLUE);
			
		}
		else if(colorType.equalsIgnoreCase("onix"))
		{
			this.colorType = Color.ONIX;
		}
		else if(colorType.equalsIgnoreCase("green"))
		{
			this.colorType = Color.GREEN;
		}
		else if(colorType.equalsIgnoreCase("violet"))
		{
			this.colorType = Color.VIOLET;
		}
		else if(colorType.equalsIgnoreCase("Indigo"))
		{
			this.colorType = Color.INDIGO;
		}
	}

	
	@Override
	public String toString()
	{
		 /*
	     * Method:toString() Converts the attributes of the class to a text readable
	     * format.
	     * 
	     * (non-Javadoc)
	     * 
	     * @see java.lang.Object#toString()
	     */
		
		return super.toString() +" "+ hairType + " "+ clawType + " "+ colorType;
	}
	

}




