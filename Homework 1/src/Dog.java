import javax.swing.JOptionPane;

/**
 * Class: Dog.java
 * 
 * @author Peter Adeojo
 * @version 1.3
 *          <p>
 * Course : ITEC 3150 Spring 2016 
 * Written: Jan 18, 2016
 * 
 * 1.0 - Base
 * 1.1 - Error Fixes
 * 1.2 - Slight Mods for use in JOptionPane
 * 1.3 - Added Try-catch in toString
 * 
 *  This class – This class describes the common attributes and methods
 *          of the Dog 
 *  Purpose: – This class sets up the instance of Dog as an
 *  extension of the class Pet. It also allows for the creation of two
 *  class specific variables(breedType and colorType) to the Breed and Color classes in order to gain
 *  the enums within. 
 */

public class Dog extends Pet
{
	//Atributes of Dog
	
	//Sets breeds for dogs. Source Breed.java
	
	private Breed breedtype;
	
	//Color for dog. Source Color.java
	private Color colorType;
	
	
	public Dog()
	{/**
	     * Method:Dog() Empty Constructor method. No use other than
	     * calling cat in case needed
	     *
	     */
		
	}
	
	public Dog(String type, String name, String ownersName, String age, String breedTyp, String colorType)
	{
		/**
	     * Method:Dog(String type, String name, String ownersName, String age, String breedTyp, String colorType)
	     *  overloaded class used for calling supers and setting dog specfic vars
	     *
	     */
		
		super.setName(name);
		super.setOwnersName(ownersName);
		super.setAge(age);
		super.setType(type);
		setBreedtype(breedTyp);
		setColorType(colorType);
	}

	
	//Getters and Setters of Dog
	
	public Breed getBreedtype()
	{
		/**
	     * Method:getBreedtype() 
	     *  standard getter
	     *
	     */
		return breedtype;
	}

	public void setBreedtype(String breedtype)
	{
		
		/**
	     * Method:setBreedtype 
	     * 
	     * sets up breeds for dogs
	     * 
	     * may 1.x update add more ways to call these dog . Its pretty binary as of 1.2
	     *
	     */
		
		//this.breedtype = breedtype;
		
		if(breedtype.equalsIgnoreCase("Labrador Retriever")|| breedtype.equalsIgnoreCase("Labrador"))
		{
			this.breedtype = Breed.LABRADOR_RETRIEVER;
		}
		else if(breedtype.equalsIgnoreCase("Bulldog"))
		{
			this.breedtype = Breed.BULLDOG;
		}
		else if(breedtype.equalsIgnoreCase("German Shepherd"))
		{
			this.breedtype = Breed.GERMAN_SHEPHERD;
		}
		else if(breedtype.equalsIgnoreCase("Golden Retriever"))
		{
			this.breedtype = Breed.GOLDEN_RETRIEVER;
		}
		else if(breedtype.equalsIgnoreCase("Yorkshire Terrier"))
		{
			this.breedtype = Breed.YORKSHIRE_TERRIER;
		}
		else if(breedtype.equalsIgnoreCase("Poodle"))
		{
			this.breedtype = Breed.POODLE;
		}
		else if(breedtype.equalsIgnoreCase("Beagle"))
		{
			this.breedtype = Breed.BEAGLE;
		}
		else if(breedtype.equalsIgnoreCase("Siberian Husky"))
		{
			this.breedtype = Breed.SIBERIAN_HUSKY;
		}
		else if(breedtype.equalsIgnoreCase("Boxer"))
		{
			this.breedtype = Breed.BOXER;
		}
		else if(breedtype.equalsIgnoreCase("Pug"))
		{
			this.breedtype = Breed.PUG;
		}
		else if(breedtype.equalsIgnoreCase("English Mastiff"))
		{
			this.breedtype = Breed.ENGLISH_MASTIFF;
		}
		else if(breedtype.equalsIgnoreCase("Rottweiler"))
		{
			this.breedtype = Breed.ROTTWEILER;
		}
		else if(breedtype.equalsIgnoreCase("Dachshund"))
		{
			this.breedtype = Breed.DACHSHUND;
		}
		else if(breedtype.equalsIgnoreCase("Doberman"))
		{
			this.breedtype = Breed.DOBERMAN;
		}
		else if(breedtype.equalsIgnoreCase("Great Dane"))
		{
			this.breedtype = Breed.GREAT_DANE;
		}
		else if(breedtype.equalsIgnoreCase("Shih Tzu"))
		{
			this.breedtype = Breed.SHIH_TZU;
		}
		else if(breedtype.equalsIgnoreCase("Bull Terrier"))
		{
			this.breedtype = Breed.BULL_TERRIER;
		}
		else if(breedtype.equalsIgnoreCase("Border Collie"))
		{
			this.breedtype = Breed.BORDER_COLLIE;
		}
		else if(breedtype.equalsIgnoreCase("French Bulldog"))
		{
			this.breedtype = Breed.FRENCH_BULLDOG;
		}
		else if(breedtype.equalsIgnoreCase("Alaskan Malamute"))
		{
			this.breedtype = Breed.ALASKAN_MALAMUTE;
		}
		else if(breedtype.equalsIgnoreCase("Australian Shepherd"))
		{
			this.breedtype = Breed.AUSTRILIAN_SHEPHERD;
		}
		else if(breedtype.equalsIgnoreCase("Basset Hound"))
		{
			this.breedtype = Breed.BASSET_HOUND;
		}
		else if(breedtype.equalsIgnoreCase("Akita"))
		{
			this.breedtype = Breed.AKITA;
		}
		else if(breedtype.equalsIgnoreCase("Pomeranian"))
		{
			this.breedtype = Breed.POMERANIAN;
		}
		else if(breedtype.equalsIgnoreCase("Maltese"))
		{
			this.breedtype = Breed.MALTESE;
		}
		else if(breedtype.equalsIgnoreCase("Pointer"))
		{
			this.breedtype = Breed.POINTER;
		}
		else if(breedtype.equalsIgnoreCase("Greyhound"))
		{
			this.breedtype = Breed.GREYHOUND;
		}
		else
		{
			this.breedtype= Breed.OTHER;
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
	public String toString() throws NullPointerException
	{
		 /*
	     * Method:toString() Converts the attributes of the class to a text readable
	     * format.
	     * 
	     * (non-Javadoc)
	     * 
	     * @see java.lang.Object#toString()
	     */
		
		try{
			
		
		//return super.toString() + " " +" breedtype=" + breedtype + ", colorType=" + colorType.toString() ;
		
		}
		catch(NullPointerException NPE)
		{
			JOptionPane.showMessageDialog(null, "You are missing one or more variables! \n Please try again");
			NPE.getStackTrace();
		}
		
		return super.toString() + " " +" breedtype=" + breedtype + ", colorType=" + colorType.toString() ;
		
		
	}
	
	public String toString1()
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
		
		return super.type;
	}
	
}
	
