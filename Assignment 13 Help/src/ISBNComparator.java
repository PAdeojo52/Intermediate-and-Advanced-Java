import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * Class: ISBNComparator.java
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
public class ISBNComparator implements Comparator<Book>
{

	/* (non-Javadoc)
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	public int compare(Book b0, Book b1)
	{
		return b0.getiSBN() - b1.getiSBN();
	}
}
