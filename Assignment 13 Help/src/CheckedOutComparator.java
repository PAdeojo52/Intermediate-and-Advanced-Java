import java.util.Comparator;

/**
 * Class: CheckedComparator.java
 * 
 * @author ebrannoc
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2014 
 * Written: Oct 6, 2015
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
public class CheckedOutComparator implements Comparator<Book>
{
	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(Book b0, Book b1)
	{
		String b0Bool = "" + b0.isCheckOut();
		String b1Bool = "" + b1.isCheckOut();
		
		if (b0Bool.equalsIgnoreCase(b1Bool)) return 0;
		else if (b0Bool.compareToIgnoreCase(b1Bool) < 0) return 1;
		return -1;
	}

}
