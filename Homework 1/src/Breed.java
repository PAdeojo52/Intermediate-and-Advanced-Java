/**
 * Class: Breed.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 3150 Spring 2016 
 * Written: Jan 18, 2016
 * 
 * 
 *  This class – This Class is a enum for use in Dog.Java
 * 
 *  Purpose: – This sets the lists of acceptable dog breed to be input in Dog
 */

public enum Breed
{
	
	LABRADOR_RETRIEVER, BULLDOG, GERMAN_SHEPHERD, GOLDEN_RETRIEVER, YORKSHIRE_TERRIER, POODLE, BEAGLE,SIBERIAN_HUSKY,BOXER,
	PUG,ENGLISH_MASTIFF,ROTTWEILER,DACHSHUND,DOBERMAN, GREAT_DANE, SHIH_TZU, BULL_TERRIER,BORDER_COLLIE, FRENCH_BULLDOG,
	/*PEMBROKE_WELSH_CORGI,*/ ALASKAN_MALAMUTE, AUSTRILIAN_SHEPHERD,BASSET_HOUND, /*ENGLISH_COCKER_SPANIEL,*/AKITA,POMERANIAN,MALTESE,POINTER,GREYHOUND,
	OTHER ; 
	
	
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
		
		String s = super.toString();
		return s.toLowerCase();
	}

}




