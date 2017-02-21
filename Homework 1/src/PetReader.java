import java.awt.Button;
import java.beans.DesignMode;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.NoSuchElementException;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Class: PetReader.java
 * 
 * @author Peter Adeojo
 * @version 1.6
 * 
 * 1.0 - 1.5 Construction
 * 1.6-1.7 - Final touches. Slight;y unstable
 *          <p>
 * Course : ITEC 3150 Spring 2016 
 * Written: Jan 21, 2016
 * 
 * 
 *  This class – This class describes the common attributes and methods
 *          of the PetReader.java
 * 
 *  Purpose: – This is the main method of my entire program
 */

public class PetReader
{
	String type;
	/*String dogName;
	String ownersName;*/
	

	public static void main(String[] args) throws IOException
	{
		
		/**
	     * Method: main
	     * 
	     * This method holds the my intial file reading and and the creation of UI
	     *
	     */
		
		//THis sets up my parrent Array. Inherits Child classes
		ArrayList<Pet>petAL = new ArrayList<Pet>();

		Scanner scan;
		try
		{
			//Scannning my files like a b
			scan = new Scanner(new File("Pets.txt"));
			while(scan.hasNextLine())
			{
				//System.out.println(scan.next());
				//So this is set up for the instance of dog

				if(scan.next().equals("Dog"))
				{
					//Dog Attributes from the file
					String type = "Dog";
					String dogName= scan.next();
					String ownersName = scan.next();
					String dogAge= scan.next();
					String dogBreed = scan.next();
					String colortype = scan.next();
					//Dog Object creation

					Dog d1 = new Dog(type, dogName , ownersName , dogAge , dogBreed, colortype);
					petAL.add(d1);
					System.out.println(d1);

					//System.out.println(scan.next() + scan.next());	
				}

				//System.out.println(scan.next() + scan.next());	
			}
		}//Basic catching
		catch(FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();


		}
		try
		{
			scan = new Scanner(new File("Pets.txt"));
			while(scan.hasNextLine())
			{
				//System.out.println(scan.next());
				//So this is set up for the instance of cat

				if(scan.next().equals("Cat"))
				{
					//System.out.println(scan.next());
					//Cat Attributes from the file
					String type = "Cat";
					String catName= scan.next();
					String ownersName = scan.next();
					String catAge= scan.next();
					String catHair = scan.next();
					String clawType = scan.next();
					String colorType = scan.next();

					//Cat Object creation

					Cat c1 = new Cat (type, catName, ownersName, catAge, catHair, clawType, colorType);
					petAL.add(c1);
					System.out.println(c1);
				}

			}
		}
		catch(FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();

		}

		try
		{
			scan = new Scanner(new File("Pets.txt"));
			while(scan.hasNextLine())
			{
				//System.out.println(scan.next());
				//So this is set up for the instance of OTher

				if(scan.next().equals("Other"))
				{
					//System.out.println(scan.next());
					//Otber Attributes from the file
					String altPlacer = "Other";
					String otherType = scan.next();
					String otherName= scan.next();
					String ownersName = scan.next();
					String otherAge= scan.next();
					String specialHandling = scan.next();

					//System.out.println(otherType+ otherName+ ownersName + otherAge);

					//Other Object creation


					Other o1 = new Other(altPlacer,otherType, otherName, ownersName, otherAge, specialHandling);
					petAL.add(o1);
					System.out.println(o1);
					//System.out.println();
				}
			}

		} //The Last catch. 8	
		//So to me for future notes, the v1.1-4 are good but for SINGULAR go throughs, for mutiple instances use mutiple try catches.
		catch(FileNotFoundException fnfe)
		{
			fnfe.printStackTrace();
		}




		//Normally don't go past 150 lines in main, but for sake of UI, I will
		
		//1.6 adds in  UI
		
		//UI introduction
		
		int petCount = petAL.size();
		
		//WE HAVE A TITLE!
		JOptionPane.showMessageDialog(null, "Peter T. Adeojo's Vet Client Catolog");
		//Sets up my buttons
		/*ArrayList<String> buttonAL = new ArrayList<String>();
		buttonAL.add("Add");
		buttonAL.add("Remove");
		buttonAL.add("Search");
		buttonAL.add("Exit");*/
		
		//For my future output
		PrintWriter pw = null;
		//UI Buttons
		String[]buttons = {"Add", "Remove", "Search", "Exit"};
		
		
		//sets up my while loop

		
		boolean looper = false;

		while(looper == false)
		{
			
			//Intial decision
			int decision = JOptionPane.showOptionDialog(null, "Would you like to add, remove, search, or exit?",
					"confirm", JOptionPane.INFORMATION_MESSAGE, 0, null, buttons, buttons[2]);

			//Add
			if(decision == 0)
			{
				int again = 0;
				int add = 1;
				do
				{
					//put add method in here
					UserInterface.addPets(petAL, petCount);

					//loop caller
					again = JOptionPane.showConfirmDialog(null,
							"Would you like to add another item", "Again?",
							JOptionPane.YES_NO_CANCEL_OPTION);
				}
				while(again == JOptionPane.YES_OPTION);
			}
			//remove
			else if(decision == 1)
			{//THis is for removal. Concept Kinda unstable. Gonna wing it

				int again = 0;
				int remove = 1;
				int x;
				do
				{
					//remove method insert here
					UserInterface.removePets(petAL, petCount);

					again = JOptionPane.showConfirmDialog(null,
							"Would you like to remove another item", "Again?",
							JOptionPane.YES_NO_CANCEL_OPTION);				
				}
				while(again == JOptionPane.YES_OPTION);

			}
			//Search
			else if(decision == 2)
			{
				//this be the search 
				int again = 0;
				int searchItems = 1;
				int x;
				do
				{
					System.out.println(petAL.contains("Dog"));
					System.out.println(petAL.toString());
					//Insert Search method
				// petAL.toArray();
					//Object[] petArray = (Object[])petAL.toArray(new Object[petAL.size()]);
					UserInterface.searchItem(petAL, petCount);
					

					//Try Again
					again = JOptionPane.showConfirmDialog(null,
							"Would you like to search another item", "Again?",
							JOptionPane.YES_NO_CANCEL_OPTION);

				}
				while(again == JOptionPane.YES_OPTION);
			}
			//The exit
			else if(decision == 3)
			{
				System.out.println(petAL);
				
				//For while loop
				boolean loopkeeper = false;
				
				while(loopkeeper != true)
				{
					try
					{
						
					
					pw = new PrintWriter(new FileOutputStream("Pets.txt", false));
					
					for(Pet out : petAL)
					{
						pw.print(out);
						pw.print("\n");
					}
					pw.close();
					
					}
					catch(IOException ioe)
					{
						ioe.printStackTrace();
						/*pw.println(petAL);
						pw.close();*/
					}
					
				}
				
				System.exit(0);
			}

		}

	}
}
