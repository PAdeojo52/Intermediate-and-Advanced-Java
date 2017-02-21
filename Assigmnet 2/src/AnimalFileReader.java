import java.awt.List;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Class: AnimalFileReader.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 * No version tracking done
 *          <p>
 * Course : ITEC 3150 Spring 2016 
 * Written: Feb 9, 2016
 * 
 * 
 *  This class – This class describes the common attributes and methods
 *          of the AnimalFileReader.java
 * 
 *  Purpose: – This class will read in .dat files and manipulate the incoming data in order to form a new one
 */

public class AnimalFileReader
{

	//Added in some throwables
	public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException
	{
		
		/**
	     * Method:main()
	     *  the main method of my program
	     *  intakes data, manipulates it, then outputs
	     *
	     */
		// TODO Auto-generated method stub

		//Setsd up my file reading 
		ArrayList<Animal> zoo = new ArrayList<Animal>();
		//DataInputStream in = null;
		ObjectInputStream input = null;
		Set<String> animalSet = new HashSet<String>();
		

		//Reading in the animal file
		try
		{
			//Imported Datastream and FileStream
			//in = new DataInputStream(new FileInputStream("animal.dat"));	

			input = new ObjectInputStream(new FileInputStream("animal.dat"));
		}
		catch(FileNotFoundException fnfe)
		{
			//In case file not found

			fnfe.printStackTrace();
			System.out.println("Not Founsd");
		}
		catch(IOException ioe)
		{
			//in case of problems reading the file
			System.out.println("Problem reading from file");
			ioe.printStackTrace();
		}


		//From here We are reading the File


		//This reads the Data
		try
		{
			while(true)
			{
				//Cast to animal and blaces in a list
				Animal a = (Animal)input.readObject();
				//ArrayList<Animal> zoo = new ArrayList<Animal>();
				zoo.add(a);
				//System.out.println(zoo);
			}

		}	
		catch(EOFException EOFE)
		{
			//Checks when done
			System.out.println("Done");

		}
		catch(IOException IOE)
		{
			//In case of file mismanagement
			IOE.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			//In case of mismatched Class Animal vars
			System.out.println("Corrupted file - regenerate");
			e.printStackTrace();
		}

		for(Animal a: zoo)
		{
			//The animals name
			System.out.println("The orginal names: " + a.getAnimalName());
			
			
			
			//now add names in the set
			animalSet.add(a.getAnimalName());
			//String s = a.getAnimalName();
			//System.out.println(s);
			
			//out.writeUTF(s);
		}
		
		//To print out hash set
		for(String b: animalSet)
		{
			//Prints out names no duplicates
			System.out.println("Names in my hashSet: " + b);
			
		}
		//Creates new file for output
		try(DataOutputStream out = new DataOutputStream(new FileOutputStream ("names.dat")))
		{
			//Iterates through and writes out data.
			for(String b: animalSet)
			{
				out.writeUTF(b);
				
			}
			
		}
		
		
	}

}
//done