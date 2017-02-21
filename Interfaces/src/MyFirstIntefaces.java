import java.util.ArrayList;
import java.util.Collections;

/**
 * Class: MyFirstIntefaces.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2015 
 * Written: Oct 1, 2015
 * 
 * 
 *  This class – ******
 * 
 *  Purpose: – ******
 */

public class MyFirstIntefaces
{

	public static void main(String[] args)
	{
		ArrayList<String> nameAL = new ArrayList<String>();
		nameAL.add("Mickey");nameAL.add("Minnie");nameAL.add("Goofy");nameAL.add("Pluto");
		System.out.println("Original List");
		System.out.println(nameAL);
		
		Collections.reverse(nameAL);
		System.out.println(nameAL);
		System.out.println(Collections.min(nameAL));
		

	}

}
