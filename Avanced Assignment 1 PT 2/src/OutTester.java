import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

/**
 * Class: OutTester.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 3150 Spring 2016 
 * Written: Jan 26, 2016
 * 
 * 
 *  This class – This class describes the common attributes and methods
 *          of the OutTester.java
 * 
 *  Purpose: – ******
 */

public class OutTester //implements Serializable
{

	public static void main(String[] args) throws IOException , NotSerializableException
	{
		// TODO Auto-generated method stub


		//DataInputStream outfile = new DataInputStream(new FileInputStream("in.dat"));

		Person p1 = new Person("Temi", "Adeojo", 9946695, "Atlanta");
		Person p2 = new Person("Ian", "White", 200010023, "Birmingham");
		Person p3 = new Person("Lambo", "Black", 4000304, "Brooklyn");
		try(ObjectOutputStream outfile = new ObjectOutputStream(new FileOutputStream("Person.dat"));)
		{
			//FileOutputStream fos = new FileOutputStream("Person.dat");
			//
			//ObjectOutputStream outfile = new ObjectOutputStream(new FileOutputStream("Person.dat"));


			outfile.writeObject(p1);
			outfile.writeObject(p2);
			outfile.writeObject(p3);


			//new ObjectOutputStream(outputStream).writeObject(obj);


			/*outfile.writeObject(new Person("Temi", "Adeojo", 9946695, "Atlanta"));
		outfile.writeObject(new Person("Ian", "White", 200010023, "Birmingham"));
		outfile.writeObject(new Person("Lambo", "Black", 4000304, "Brooklyn"));*/



			outfile.close();

		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		/*catch(NotSerializableException nse)
		{
			nse.printStackTrace();
		}*/





	}

}
