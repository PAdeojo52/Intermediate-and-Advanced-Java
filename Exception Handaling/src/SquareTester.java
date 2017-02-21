import java.util.ArrayList;
import java.util.Random;


public class SquareTester
{
	public static void main(String []args)
	{
		ArrayList<Square> squareAL = new ArrayList<Square>();

		Random r = new Random();

		final int NUM_SQUARES = 7;
		
		

		for(int i = 0; i < NUM_SQUARES; i++ )
		{
			try
			{
				double doubleLength = ((r.nextDouble() * 100) - 50);				
				//System.out.println(squareAL.get(i));
				squareAL.add(new Square(doubleLength));
			}
			catch (IllegalArgumentException iae)
			{				
				iae.printStackTrace();
			}			
		}
		
		for (Square s: squareAL) System.out.println(s);			
	}
}