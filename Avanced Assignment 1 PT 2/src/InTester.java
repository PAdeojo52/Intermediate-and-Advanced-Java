import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Class: InTester.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 3150 Spring 2016 
 * Written: Jan 26, 2016
 * 
 * 
 *  This class – This class describes the common attributes and methods
 *          of the InTester.java
 * 
 *  Purpose: – ******
 */

public class InTester
{

	public static void main(String[] args) throws IOException, ClassNotFoundException
	{
		
		try
		{
			
			
			FileInputStream fne =new FileInputStream("Person.dat");
			
			ObjectInputStream infile = new ObjectInputStream(fne);
			
			Object readOne = infile.readObject();
			Object readTwo = infile.readObject();
			Object readThree = infile.readObject();
			
			System.out.println(readOne);
			System.out.println(readTwo);
			System.out.println(readThree);
			
			
			
			
			
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}

	}

}
