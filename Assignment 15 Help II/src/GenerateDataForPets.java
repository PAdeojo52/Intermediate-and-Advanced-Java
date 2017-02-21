import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
/**Class: GeneralDataForPets.java
 * @author: Parth Patel
 * @version: 1.0
 * Course : ITEC 2150 fall 2015 Dr. Brannock
 * Date Written: Oct 26, 2015
 * Class Description: This class generate 50 dogs and 52 cats.
 * Purpose: TO generate the test data and crate file to read
 */

public class GenerateDataForPets
{
	private String nameCat;
	private String nameDog;
	private Tail[] tailValues;
	private Litter[] litterValues;
	private Random ran;
	private ArrayList<Pet> pal; 
	private static String[] catBreedArray = {"siamese", "sphynx", "turkishvan", "alley", "ragdoll"};;
	private static String[] dogBreedArray= {"lab", "doberman", "poodle", "basenji", "spaniel"};;
	private static String[] colArray= {"black", "brown", "grey", "yellow"};;
	
	private static PrintWriter pw;
	private static int NUM_OF_PETS = 100;
	
	public GenerateDataForPets()
	{
		nameCat = "Snoot";
		nameDog = "Rover";		
		litterValues = Litter.values();
		tailValues = Tail.values(); 
		ran = new Random();
		pal = new ArrayList<Pet>(); 		
	}


	/**
	 * @param i - which pet is this?
	 * @return a pet
	 */
	public Pet createPet(int i)
	{
		Pet p;
		if (i % 2 == 0)
		{ 
			p = new Cat(nameCat + (i/2), catBreedArray[ran.nextInt(5)], colArray[ran.nextInt(3)], ran.nextInt(8) + 2, ran.nextInt(57) + 4, litterValues[ran.nextInt(4)]); 
		}
		else
		{   
			p = new Dog(nameDog + (i/2), dogBreedArray[ran.nextInt(5)], colArray[ran.nextInt(3)], ran.nextInt(8) + 2, ran.nextInt(242) + 2, ran.nextBoolean(), tailValues[ran.nextInt(6)]);    
		}
		return p;
	}


	/**
	 * @return pal - the ArrayList of generated Pets
	 */
	public ArrayList<Pet> getPal() 
	{
		return pal;
	}


	/**
	 * @param pal
	 */
	public void setPal(ArrayList<Pet> pal) 
	{
		this.pal = pal;
	}


	/**
	 * main driver
	 * @param args
	 */
	public static void main(String[] args)
	{
		GenerateDataForPets gdfp = new GenerateDataForPets();
		for (int i = 0; i < NUM_OF_PETS; i++)
		{   
			Pet p = gdfp.createPet(i);
			gdfp.pal.add(p);   
		}

		try
		{
			pw = new PrintWriter("Pets.txt");
			for (Pet p: gdfp.pal)
			{
				if (p instanceof Cat) 
					pw.print("Cat ");
				else if (p instanceof Dog)
					pw.print("Dog ");

				pw.print(p.getName() + " "); 
				pw.print(p.getBreed() + " "); 
				pw.print(p.getColor() + " "); 
				pw.print(p.getNumLegs() + " "); 
				pw.print(p.getWeight() + " "); 				
				if (p instanceof Cat)
					pw.print(((Cat) p).getLitterType().toString() + " ");
				else if (p instanceof Dog)
				{
					pw.print(((Dog) p).getIsTrained() + " ");
					pw.print(((Dog) p).getTailType().toString() + " ");
				}
				pw.println();    
			}
		}
		catch (IOException ioe) {ioe.printStackTrace();}
		finally {pw.close();}
	}
}
