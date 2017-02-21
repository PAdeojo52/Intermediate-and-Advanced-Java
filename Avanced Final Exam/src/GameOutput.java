import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * Class: GameOutput.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 3150 Spring 2016 
 * Written: May 5, 2016
 * 
 * 
 *  This class – This class describes the common attributes and methods
 *          of the GameOutput.java
 * 
 *  Purpose: – ******
 */

public class GameOutput
{

	public static void main(String[] args)
	{
		Game gameMaker1 = new Game(1232,"game1", "action",4);
		Game gameMaker2 = new Game(1242,"game2", "action",5);
		Game gameMaker3 = new Game(1252,"game3", "action",6);

		ArrayList<Game>gameList = new ArrayList<Game>();

		gameList.add(gameMaker1);
		gameList.add(gameMaker2);
		gameList.add(gameMaker3);

		try
		{
			ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("games.ser"));


			for (int i =0; i< gameList.size(); i++)
			{
				Game myGame =gameList.get(i);
				output.writeObject(myGame);
			}
			// done writing close file
			output.close();
		}
		catch (Exception e2)
		{
			// TODO: handle exception
		}


		// TODO Auto-generated method stub

	}

}
