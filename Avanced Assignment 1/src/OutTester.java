import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class: OutTester.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 3150 Spring 2016 
 * Written: Jan 19, 2016
 * 
 * 
 *  This class – This class describes the common attributes and methods
 *          of the OutTester.java
 * 
 *  Purpose: – ******
 */

public class OutTester
{

	public static void main(String[] args) throws IOException
	{
		/*Redacted Code- Ignore
		 * // TODO Auto-generated method stub
		
		Person p1 = new Person("Temi", "Adeojo", 9946695, "Atlanta");
		Person p2 = new Person("Ian", "White", 200010023, "Birmingham");
		Person p3 = new Person("Lambo", "Black", 4000304, "Brooklyn");
		
		ArrayList pList = new ArrayList();
		pList.add(p1);
		pList.add(p2);
		pList.add(p3);
		
		Scanner scan;
		
		*/
		
		try(DataOutputStream out = new DataOutputStream(new FileOutputStream ("Person.dat"));)
		{ // This is the creation of the output stream
			
			//THis will out put the info.
			
			//Person 1
			out.writeUTF("Temi");
			out.writeUTF("Adeojo");
			out.writeInt(9946695);
			out.writeUTF("Atlanta");
			
			//PErson 2
			out.writeUTF("Ian");
			out.writeUTF("White");
			out.writeInt(2000100023);
			out.writeUTF("Birmingaham");
			
			//Person 3
			out.writeUTF("Lambo");
			out.writeUTF("Black");
			out.writeInt(40000343);
			out.writeUTF("Brooklyn");
			
			
		} 
		
		
		

	}

}
