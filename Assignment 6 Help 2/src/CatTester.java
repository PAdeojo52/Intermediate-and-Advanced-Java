/*1.	Create a class called CatTester which constructs 10 different Cat objects
2.	Add each Cat object to an array
3.	Use a for loop to SOP each Cat reference
4.	Use a second for loop to SOP only those Cats that are born after 2004 and have legs  greater than 3
*/
public class CatTester {

	public static void main(String[] args)
	{
		Cat[] catArray = new Cat[10];
		Cat c0 = new Cat("Sam","Persian",4,2015);
		catArray[0] = c0;
		Cat c1 = new Cat("Bella","Siamese", 4, 2003);
		catArray[1] = c1;
		Cat c2 = new Cat("Tigger","Maine coon", 4 , 2004);
		catArray[2] = c2;
		Cat c3 = new Cat("Chloe","British shorthair", 4, 2005);
		catArray[3] = c3;
		Cat c4 = new Cat("Oliver","Exotic", 4 , 2001);
		catArray[4] = c4;
		Cat c5 = new Cat("Shadow","Ragdoll", 4 , 2006);
		catArray[5] = c5;
		Cat c6 = new Cat("Molly","American", 4 , 2008);
		catArray[6] = c6;
		Cat c7 = new Cat("Kitty","Bengal", 4 , 2000);
		catArray[7] = c7;
		Cat c8 = new Cat("Smokey","Burmese", 4 , 2010);
		catArray[8] = c8;
		Cat c9 = new Cat("Angel","Scottish", 4 , 2007);
		catArray[9] = c9;
		System.out.println("All Cats");
		for (int i = 0; i < catArray.length; i++)
		{
			System.out.println(catArray[i]);
		}
		System.out.println("\nCats Born after 2004 and that have greater than three legs");
		for (int i = 0; i < catArray.length; i++)
		{
			if (catArray[i].getYearBorn() > 2004 && catArray[i].getNumberOfLegs() > 3)
			{
				System.out.println(catArray[i]);
			}
		}
	}

}
