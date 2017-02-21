import java.util.ArrayList;

/**
 * Class: Kennel.java
 * 
 * @author ebrannoc
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2014 
 * Written: Sep 8, 2015
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
public class Kennel
{
         private ArrayList<Cat> catAL;

		public Kennel()
		{
			this.catAL = new ArrayList<Cat>();
		}

		public ArrayList<Cat> getCatAL()
		{
			return catAL;
		}

		public void setCatAL(ArrayList<Cat> catAL)
		{
			this.catAL = catAL;
		}
		
		public int howManyByYear(int yr)
		{
			int total = 0;
			for (Cat c: catAL)
			{
				if (c.getYearBorn() == yr) total++;
			}
			return total;
		}
		
		public void addCat(Cat aCat)
		{
			catAL.add(aCat);
		}

		@Override
		public String toString()
		{
			return "Kennel catAL=" + catAL;
		}  
         
}
