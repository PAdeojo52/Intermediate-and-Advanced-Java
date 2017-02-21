import java.util.ArrayList;
import java.util.Random;
/**
 * Class: SquareTester.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2015 
 * Written: Aug 25, 2015
 * 
 * 
 *  This class – ******
 * 
 *  Purpose: – ******
 */

public class SquareTester
{

	public static void main(String[] args)
	{
		/*
		Square[] squareArray= new Square[4];
		Square s0= new Square();
		squareArray[0]= s0;
		Square s1= new Square(3);
		squareArray[1]= s1;
		Square s2 = new Square(5);
		squareArray[2]= s2;
		Square s3 = new Square(7);
		squareArray[3]= s3;


		for (int i = 0; i < squareArray.length; i++)
		{
				System.out.println(squareArray[i]);

		}
		/*
		 * 
		 */
		/*circleArray[0] = c0;
		Circle c1 = new Circle(2.0);
		circleArray[1] = c1;
		Circle c2 = new Circle(200.044);
		circleArray[2] = c2;
		 */

		ArrayList<Square> squareAL = new ArrayList<Square>();
		Random r = new Random();
		final int NUM_SQUARES = 7;
		Square s0 = new Square (1);




		

			for (int i = 0; i < NUM_SQUARES; i++)
			{
				try
				{

				double doubleLength = ((r.nextDouble()*100)-50);
				s0=new Square(doubleLength);
				squareAL.add((new Square(doubleLength)));
				squareAL.add(s0);
				//System.out.println(squareAL.get(i));

			}
			
			catch(IllegalArgumentException iae)
			{
				iae.printStackTrace();
			}
				/*
			finally
			{
				squareAL.add(s0);
				
			}
			*/

		}
		

		for(Square s: squareAL)
		{
			System.out.println(s);
		}
	}
	//Try & Catch Exception

	/*
		try
		{
			squareAL.add(new Square(1));

		}
		catch(IllegalArgumentException iae)
		{
			iae.printStackTrace();

		}
		try
		{
			squareAL.add(new Square(-2.5));

		}
		catch(IllegalArgumentException iae)
		{
			iae.printStackTrace();

		}
		try
		{
			squareAL.add(new Square (3));


		}
		catch(IllegalArgumentException iae)
		{
			iae.printStackTrace();

		}
		try
		{
			squareAL.add(new Square(4));

		}
		catch(IllegalArgumentException iae)
		{
			iae.printStackTrace();

		}
		try
		{
			squareAL.add(new Square(5));

		}
		catch(IllegalArgumentException iae)
		{
			iae.printStackTrace();

		}
	 */

}


