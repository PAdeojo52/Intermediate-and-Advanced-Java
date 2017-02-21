import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;




public class BinaryFileIO
{


	public static void main(String[] args)
	{
		// create instance
		Pet[] pets = new Pet[3];
		pets[0] = new Pet("Mr. Jones", "A001", "Fluffy", 6);
		pets[1] = new Pet("Ms. Smith", "B001", "Spot", 1);
		pets[2] = new Pet("Mr. Simpson", "A002", "Peanut", 3);

		ObjectOutputStream output = null;


		try
		{
			output = new ObjectOutputStream(new FileOutputStream("petInfo.dat"));
			for(int x = 0; x<pets.length;x++)
			{
				output.writeObject(pets[x]);
			}

			output.close();
		}
		catch (Exception e)
		{
			e.printStackTrace();;
		}



		try
		{
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("petInfo.dat"));
			while (true)
			{
				String name = (String)in.readObject();
				System.out.println(name + "yeet");
			}

		}
		catch (Exception e)
		{
		}

	}
	// YOUR CODE GOES HERE
	// Write code to create a binary file in the default directory 
	// named "Petss.dat" using ObjectOutputStream

	//   write the contents of the string array named petst to the file you just opened


	// close the file



}


