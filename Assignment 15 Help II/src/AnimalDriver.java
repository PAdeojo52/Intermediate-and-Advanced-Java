import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
/**Class: AnimalDriver.java
 * @author: Parth Patel
 * @version: 1.0
 * Course : ITEC 2150 fall 2015 Dr. Brannock
 * Date Written: Oct 26, 2015
 * Class Description: 
 * Purpose: Array list to store pets
 */

public class AnimalDriver
{
	public static void main(String[] args){
		ArrayList<Pet> pets = new ArrayList<Pet>(); //array list to store pets

		//read all the pets to array list
		Scanner scanner;
		try {
			scanner = new Scanner(new File("Pets.txt"));
			while(scanner.hasNextLine()){
				Scanner lineScanner = new Scanner(scanner.nextLine());
				if(lineScanner.next().equals("Cat"))
					pets.add(new Cat(lineScanner.next(), lineScanner.next(), lineScanner.next(), lineScanner.next(), lineScanner.next(), lineScanner.next()));
				else{
					String name = lineScanner.next();
					String breed = lineScanner.next();
					String color = lineScanner.next();
					String numOflegs = lineScanner.next();
					String weight = lineScanner.next();
					boolean isTrained = lineScanner.nextBoolean();
					String tailType = lineScanner.next();
					Dog dog = new Dog(name, breed, color, numOflegs, weight, tailType);
					dog.setTrained(isTrained);
					pets.add(dog);
				}
				lineScanner.close();	
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Collections.sort(pets); //sort pets according to weight

		//write to file the sorted pets in the original format (Copied from GenerateDataFor pets)
		PrintWriter pw = null;
		try {
			pw = new PrintWriter(new File("SortedPets.txt"));
			for (Pet pet : pets) {
				if (pet instanceof Cat) 
					pw.print("Cat ");
				else if (pet instanceof Dog)
					pw.print("Dog ");

				pw.print(pet.getName() + " "); 
				pw.print(pet.getBreed() + " "); 
				pw.print(pet.getColor() + " "); 
				pw.print(pet.getNumLegs() + " "); 
				pw.print(pet.getWeight() + " "); 				
				if (pet instanceof Cat)
					pw.print(((Cat) pet).getLitterType().toString() + " ");
				else if (pet instanceof Dog)
				{
					pw.print(((Dog) pet).getIsTrained() + " ");
					pw.print(((Dog) pet).getTailType().toString() + " ");
				}
				pw.println();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally{
			if(pw!=null)
				pw.close(); 
		}
	}
}
