import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * Class: UserInterface.java
 * 
 * @author Temi T
 * @version 2.0
 * 
 * 1.0 - Base
 * 1.1 - Deals with ArrayStoreException in the remove and Search methods
 * 1.2 - Deals with ClassCastException being thrown in remove and search
 * 1.3 - 1.6 - Deals with Casting problems across the board
 * 1.7 - Deals with Runtime problems
 * 1.8 - Deals with a series of Logic Errors &  Created the Redacted code
 * 2.0 - Creted Arraylist Attributes, Added the mutiple buttons for Add and Search. Set my catches throughout the program
 *          <p>
 * Course : ITEC 3150 Spring 2016 
 * Written: Jan 23, 2016
 * 
 * 
 *  This class – This class describes the common attributes and methods
 *          of the UserInterface.java
 * 
 *  Purpose: – UI methods are added here
 */

public class UserInterface
{
	//Sets up Arraylist for dog and instances
	private ArrayList<Dog>d1;
	private ArrayList<Other> o1;
	private ArrayList<Cat>c1;
	//private PrintWriter pw ;


	//This will set up my methods for adding, removing, modding etc....

	public UserInterface()
	{
		/**
	     * Method:UserInterface()
	     * 
	     *  Intializes variablees for use in array
	     *
	     */
		
		//For Dog
		d1 = new ArrayList<Dog>();
		//For Cat
		o1 = new ArrayList<Other>();
		//For other
		c1 = new ArrayList<Cat>();
		//pw = null;
	}


	//First up Adding in new Pet Objects
	public static void addPets(ArrayList<Pet> a, int a1 ) throws IOException 
	{
		/**
	     * Method:addPets
	     * 
	     *  Allows user to add in pets and the like
	     *  
	     *  @param (ArrayList<Pet> a
	     *  @int a1
	     *
	     */
		
		FileWriter fw = null;
		Scanner scan = null;
		PrintWriter pw  = null;

		//PrintWriter pw = null;
		try
		{
			//fw = new FileWriter(new File("Pets.txt")); Writer
			scan = new Scanner("Pets.txt");
			fw = new FileWriter("Pets.txt", true);
			//pw = new PrintWriter(new File("Pets.txt"));
			



			// int i = 0;
			// while(i <= a1){

			//Pet addItem = new productItem();
			// a[i]=addItem.itemID= new
			// Integer(JOptionPane.showInputDialog("Put in ID"));

			//sets up this  methods buttons
			String[]buttons = {"Dog", "Cat", "Other", "Exit"};

			int petAdder = JOptionPane.showOptionDialog(null, "Is the animal your adding a Dog or a Cat?",
					"adding", JOptionPane.INFORMATION_MESSAGE, 0, null, buttons, buttons[2]);

			if(petAdder == 0)
			{
				int again = 0;
				int add = 1;
				//Creates a Dog instance
				String param1 = JOptionPane.showInputDialog("Please enter your pets name");
			//	String param2 = JOptionPane.showInputDialog("your first or last name");
			//	String param3 = JOptionPane.showInputDialog("Please enter your pets age");
			//	String param4 = JOptionPane.showInputDialog("please enter your dogs breed");
			//	String param5 = JOptionPane.showInputDialog("Please enter your pets color");*/
				
				Dog d2 =new Dog("Dog", param1 /*JOptionPane.showInputDialog("Please enter your pets name")*/
						, JOptionPane.showInputDialog("your first or last name")
						, JOptionPane.showInputDialog("Please enter your pets age")
						,  JOptionPane.showInputDialog("please enter your dogs breed"), 
						JOptionPane.showInputDialog("Please enter your pets color"));
				//fw.write(d2);
				//Adds it back into base ArrayList...
				//I orginally did this in a Array 1 yr
				//Check for errors
				
				//Adds in the Array list
				a.add(d2);
				//pw.print(a);
				fw.write(param1);
				//return d2;

			}
			else if (petAdder == 1)
			{
				int again = 0;
				int add = 1;

				//sets up cat instance
				
				/*String param1 = JOptionPane.showInputDialog("Please enter your pets name");
				String param2 = JOptionPane.showInputDialog("Please enter your first or last name");
				String param3 = JOptionPane.showInputDialog("Please enter your cats age");
				String param4 = JOptionPane.showInputDialog("Please enter your cats hair type (Long or Short)");
				String param5 = JOptionPane.showInputDialog("Please enter your whether your cat is declawed or not. (Please input clawed or declawed)");
				String param6 = JOptionPane.showInputDialog("Please enter your cats color");*/
				 
				Cat c2 = new Cat("Cat", JOptionPane.showInputDialog("Please enter your pets name")
						,JOptionPane.showInputDialog("Please enter your first or last name")
						,JOptionPane.showInputDialog("Please enter your cats age")
						,JOptionPane.showInputDialog("Please enter your cats hair type (Long or Short)")
						,JOptionPane.showInputDialog("Please enter your whether your cat is declawed or not. (Please input clawed or declawed)")
						,JOptionPane.showInputDialog("Please enter your cats color"));
				
				//pw.println("Cat");
				
				//Adds in the Array list

				a.add(c2);
				//pw.println(c2);
				/*fw.write(param1);
				fw.write(param2);
				fw.write(param3);
				fw.write(param4);
				fw.write(param5);
				fw.write(param6);*/


				
				
				//return c2;
			}
			else if(petAdder == 2)
			{
				int again = 0;
				int add = 1;
				//sets up Other instance
			/*	String param1 = JOptionPane.showInputDialog("Please enter what animal your pet is");
				String param2 = JOptionPane.showInputDialog("Please enter your pets name");
				String param3 = JOptionPane.showInputDialog("Please enter what animal your pet is");
				String param4 = JOptionPane.showInputDialog("Please enter your pets age");
				String param5 = JOptionPane.showInputDialog("Does your pet require special Handling ? Please enter Yes or No");*/
						
				Other o2 = new Other("Other", JOptionPane.showInputDialog("Please enter what animal your pet is")
						, JOptionPane.showInputDialog("Please enter your pets name")
						, JOptionPane.showInputDialog("Please enter what animal your pet is")
						, JOptionPane.showInputDialog("Please enter your pets age")
						, JOptionPane.showInputDialog("Does your pet require special Handling ? Please enter Yes or No"));
				
				
				
				/*fw.write(param1);
				fw.write(param2);
				fw.write(param3);
				fw.write(param4);
				fw.write(param5);*/
				

				//Adds in the Array list
				a.add(o2);
				pw.println(o2);
				//pw.print(o2);
				// return o2;

			}
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		
		/*finally
		{
			if(fw!=null)
				fw.close();
		}*/
		


	}

	public static void removePets(ArrayList<Pet> a, int a1) throws IOException
	{
		/**
	     * Method:removePets
	     * 
	     *  Allows user to remove pet
	     *  
	     *  @param ArrayList<Pet> a - a was chosen in order to help simplyfy this kinda complex code.
	     *  @param a1
	     *
	     */
		
		PrintWriter pw = null;
		Scanner scan = null;
		try
		{
			//fw = new FileWriter(new FileWriter));
			pw = new PrintWriter(new FileWriter("Pets.txt",true));
			scan = new Scanner(new File("Pets.txt"));
		
		//Swing is based in arrays. So conversions are need
		Pet[]petArray = new Pet[a.size()];
		//ArrayList-->Array
		a.toArray(petArray);
		//Pet Removal
		Pet removePet = (Pet) JOptionPane.showInputDialog(
				null, "Pick an item to remove", "Removal",
				JOptionPane.PLAIN_MESSAGE, null, petArray , null);
		
		//Removes in the Array list
		a.remove(removePet);
		
		while(scan.hasNextLine() == true)
		{
			if(scan.next().equals(removePet))
			{
				pw.print(removePet);
			}
			//Removes in the Array list
		}

		//System.out.println(removePet);
		
		a.remove(removePet);
		}
		catch(FileNotFoundException fne)
		{
			fne.printStackTrace();
		}
		
		
		
		//System.out.println();

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public static void searchItem(ArrayList<Pet> a, int a1) throws ClassCastException
	{
		/**
	     * Method: searchItem
	     * 
	     *  Allows the user to search for items
	     *  
	     *  @param a
	     *  @param a1
	     *
	     */
		
		try{
			
		
			//Sets up buttons for search
		String[]buttons = {"Dog", "Cat", "Other", "Exit"};

		
		//They pick dog, cat and other
		//This limits the scope that they could techinically see
		int petSearcher = JOptionPane.showOptionDialog(null, "Is the animal your searching for a Dog or a Cat? If neither, select Other",
				"adding", JOptionPane.INFORMATION_MESSAGE, 0, null, buttons, buttons[2]);


		//Dog
		if(petSearcher == 0)
		{
			//JOP is set in arrays
			//assigns array
			Object[]options = a.toArray();
			
			//Input dialog for Dog search
		Dog searchPets = (Dog) JOptionPane.showInputDialog(
					null, "Pick an item to view", "search",
					JOptionPane.PLAIN_MESSAGE, null,a.toArray(), null);
		
		//The return for picking dog
		JOptionPane.showMessageDialog(null, "name: " + searchPets.name + " "
				+ "Owners name: "+ searchPets.ownersName);
		
		}
		//Cat
		else if(petSearcher == 1)
		{
		//System.out.println(a);
		
			//Input dialog for Cat search
		Cat searchItems = (Cat) JOptionPane.showInputDialog(
				null, "Pick an item to view", "search",
				JOptionPane.PLAIN_MESSAGE, null, a.toArray(), null);
		//Return for specific Cat
		JOptionPane.showMessageDialog(null, "name: " + searchItems.name+ " "
				+ "Owners name: "+ searchItems.ownersName);
		}
		else if(petSearcher == 2)
		{
			//Other specif dialog
			Other searchItems = (Other) JOptionPane.showInputDialog(
					null, "Pick an item to view", "search",
					JOptionPane.PLAIN_MESSAGE, null, a.toArray(), null);
			
			//return for picking other
			JOptionPane.showMessageDialog(null, "Name: " + searchItems.name + " "
					+ "Owners Name: "+ searchItems.ownersName );

		}
		}
		catch(ClassCastException CCE)
		{
			//Stops the user from unexpectedly terminating the programs
			JOptionPane.showMessageDialog(null, "Access Denied" + "\n" + "You have choosen a different type of animal other than the one you have choosen earlier."+
		" Please try again");
		}
		
		
//		Redacted Code
		
		
		
		//1.7 ArrayList<Pet> --> Array Pet[]a
		/*ArrayList<Pet>d1 = new ArrayList<Pet>();
		ArrayList<Pet>c1 = new ArrayList<Pet>();
		ArrayList<Pet>o1 = new ArrayList<Pet>();


		//System.out.println(a.);
		//Sets up petArray size. Based on ArrayList
		Pet[]petArray = new Pet[a.size()];
		Dog[]dogArray = new Dog[a.size()];*/
		/*for(Pet pd : d1)
		                        {
		                        	int counter;
		                        	if (pd.type == "Dog")
		                        	{
		                        		counter++;
		                        	}
		                
		                        
		                        }*/
		/*
		for(int x = 0; x< a.size(); x++)
		{
			if(a.contains("Dog"))
			{
				d1.add(a.get(x));
			}
			else if(a.contains("Cat"))
			{
				c1.add(a.get(x));
			}
			else if(a.contains("Other"))
			{
				o1.add(a.get(x));
			}
			
		}*/
		//ArrayList-->Array
		/*a.toArray(petArray);*///- Throws ArrayStoreException 

		/*for(Pet p1 : d1)
		{
			if(p1 instanceof Dog)
			{
				d1.add(p1);
			}
			else if(p1 instanceof Cat)
			{
				c1.add(p1);
			}
			else if (p1 instanceof Other)
			{
				o1.add(p1);
			}
		}*/
		
		//ArrayStoreException Fixed
		//I was Casting to String not PEt :P
		/*int x = a.size();
	    petArray=toArray(new String[x]);*/


		//1.2 The Cast is likely coming from (ArrayList<Pet>)
		//1.2 Solution Cast from pet -> ArrayList
		/*nteger searchPets = (Integer) JOptionPane.showInputDialog(
				null, "Pick an item to view", "search",
				JOptionPane.PLAIN_MESSAGE, null, petArray, null);
			System.out.println(searchPets);*/

		//JOptionPane.showMessageDialog(null, "Pet Information: " + a. );
		//JOptionPane.showMessageDialog(null, petArray);

		/*String[]buttons = {"Dog", "Cat", "Other", "Exit"};

		int petSearcher = JOptionPane.showOptionDialog(null, "Is the animal your searching for a Dog or a Cat? If neither, select Other",
				"adding", JOptionPane.INFORMATION_MESSAGE, 0, null, buttons, buttons[2]);


		if(petSearcher == 0)
		{
			Object[]options = a.toArray();
			
		Object searchPets = (String) JOptionPane.showInputDialog(
					null, "Pick an item to view", "search",
					JOptionPane.PLAIN_MESSAGE, null,a, null);*/
			
		/*int index = a.indexOf(searchPets);
			JOptionPane.showMessageDialog(null, "Dog:" + a.indexOf(searchPets));*/
		/*}*/

		
		/*End of Redacted Code*/
	}



}
