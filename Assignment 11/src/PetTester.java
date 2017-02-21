import java.util.ArrayList;

/**
 * Class: PetTester.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2015 
 * Written: Oct 8, 2015
 * 
 * 
 *  This class – ******
 * 
 *  Purpose: – ******
 */

public class PetTester
{

	public static void main(String[] args)
	{
		
		//Array:ost Creation
		ArrayList<Pet>petAL = new ArrayList<Pet>();
		
		Pet ani = new Dog();
		
		//Dog Object Declaration
		Dog d1;
		Dog d2;
		Dog d3;
		Dog d4;
		Dog d5;
		Dog d6;
		Dog d7;
		//Cat Object Declaration
		
		Cat c1;
		Cat c2;
		Cat c3;
		Cat c4;
		Cat c5;
		Cat c6;
		Cat c7;
		
		//Dog Object Intialization
	d1= new Dog();
	d2= new Dog("Grace","German Shepard", "Brown",45, Tail.FLAGPOLE);
	d3 = new Dog("Natsu", "huskie", "Red", 50.0 , true ,Tail.SICKLE );
	d4 = new Dog("Lucy", "labrador retriever", "Yellow", "5", "52.0", "SaBER");
	d5 = new Dog("Happy", "beagle", "Blue", 1.0, true, Tail.SABER);
	d6 = new Dog("Gray", "siberian husky", "Grey", 67.5, Tail.SICKLE);
	d7 = new Dog("Ezra", "rottweiler", "Silver", "4", "80.5", "bob");
	
	
	//Cat Object Initialization
	c1= new Cat();
	c2 =new Cat("Luffy", "bengal cat", "Orange", 30.0);
	c3= new Cat("Zoro", "abyssinian cat", "Green", 40, Litter.SCOOPABLE);
	c4 = new Cat("Nami", "exotic shorthair", "Orange", 15, Litter.REGULAR);
	c5 = new Cat("Ussop", "scottish fold", "Yellow", "3", "25", "none");
	c6 = new Cat("Sanji","ocicat" , "Yellow", "3", "3", "crystals");
	c7  = new Cat("Chopper", "egyptian mau", "Brown", 60);
	//c7

	//Adding the Dogs into the ArrayList
	petAL.add(d1);
	petAL.add(d2);
	petAL.add(d3);
	petAL.add(d4);
	petAL.add(d5);
	petAL.add(d6);
	petAL.add(d7);
	
	
	//Adding the Cats into the ArrayList
	petAL.add(c1);
	petAL.add(c2);
	petAL.add(c3);
	petAL.add(c4);
	petAL.add(c5);
	petAL.add(c6);
	petAL.add(c7);
	
	//Full output
	System.out.println("The entire ArrayList of Pets : " +petAL);
	
	
	//Full Cats Output
	System.out.println("Cat Output: " + petAL.get(7));
	System.out.println("Cat Output: " + petAL.get(8));
	System.out.println("Cat Output: " + petAL.get(9));
	System.out.println("Cat Output: " + petAL.get(10));
	System.out.println("Cat Output: " + petAL.get(11));
	System.out.println("Cat Output: " + petAL.get(12));
	System.out.println("Cat Output: " + petAL.get(13));

	//Full Dog Output
	System.out.println("Dog Output: " + petAL.get(0));
	System.out.println("Dog Output: " + petAL.get(1));
	System.out.println("Dog Output: " + petAL.get(2));
	System.out.println("Dog Output: " + petAL.get(3));
	System.out.println("Dog Output: " + petAL.get(4));
	System.out.println("Dog Output: " + petAL.get(5));
	System.out.println("Dog Output: " + petAL.get(6));
	
	//totalLegs
	System.out.println("Total Legs");
	System.out.println(ani.totalLegs(petAL));
	//System.out.println(ani.totalLegs(petAL.));
	
	
	//Total Weight
	System.out.println("Total Weight");
	System.out.println(ani.totalWeight(petAL));
	
	}
}
