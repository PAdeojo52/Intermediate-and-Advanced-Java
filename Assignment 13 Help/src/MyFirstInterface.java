import java.util.ArrayList;
import java.util.Collections;

/**
 * Class: MyFirstInterface.java
 * 
 * @author ebrannoc
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2014 
 * Written: Oct 1, 2015
 * 
 * 
 *  This class – ******
 * 
 *  Purpose: – ******
 */

/**
 * @author ebrannoc
 *
 */
public class MyFirstInterface
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ArrayList<String> nameAL = new ArrayList<String>();
		nameAL.add("Mickey"); nameAL.add("Minnie"); nameAL.add("Goofy"); nameAL.add("Pluto");
		System.out.println("Original List");
		System.out.println(nameAL);
		System.out.println("Reverse List");
		Collections.reverse(nameAL);
		System.out.println(nameAL);
		System.out.println(Collections.min(nameAL));
		System.out.println("Sorted List");
		Collections.sort(nameAL);
		System.out.println(nameAL);
		
		ArrayList<Circle> circleAL = new ArrayList<Circle>();
		
		Circle c0 = new Circle(2.4);
		circleAL.add(c0);
		Circle c1 = new Circle(78782.4);
		circleAL.add(c1);
		Circle c2 = new Circle(.4);
		circleAL.add(c2);
		circleAL.add(new Circle(78782.4));
		circleAL.add(new Circle(100.4));
		circleAL.add(new Circle(10.4));

		//SOP all circles
		System.out.println("SOP all circles ");
		System.out.println(circleAL);
		Collections.sort(circleAL);
		System.out.println("SOP sorted circles ");
		System.out.println(circleAL);



		

	}

}
