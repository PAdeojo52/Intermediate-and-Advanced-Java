import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Class: InTester.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 3150 Spring 2016 
 * Written: Jan 20, 2016
 * 
 * 
 *  This class – This class describes the common attributes and methods
 *          of the InTester.java
 * 
 *  Purpose: – ******
 */

public class InTester
{

	public static void main(String[] args) throws IOException
	{
		//set up the reader
		try(DataInputStream in = new DataInputStream(new FileInputStream("Person.dat"));)
		{
			
			Person p1 = new Person(in.readUTF() , in.readUTF() , in.readInt() , in.readUTF());
			Person p2 = new Person(in.readUTF() , in.readUTF() , in.readInt() , in.readUTF());
			Person p3 = new Person(in.readUTF() , in.readUTF() , in.readInt() , in.readUTF());
			
	
			System.out.println(p1);
			System.out.println(p2);
			System.out.println(p3);


			/*System.out.println(in.readUTF() + " " + in.readUTF() + " " + in.readInt() + " " + in.readUTF());
			System.out.println(in.readUTF() + " " + in.readUTF() + " " + in.readInt() + " " + in.readUTF());
			System.out.println(in.readUTF() + " " + in.readUTF() + " " + in.readInt() + " " + in.readUTF());
			System.out.println(in.readUTF() + " " + in.readUTF() + " " + in.readInt() + " " + in.readUTF());*/
		}

	}

}
