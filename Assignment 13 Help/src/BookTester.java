import java.util.ArrayList;
import java.util.Collections;



/**
 * Class: BookTester.java
 *
 * @author ebrannoc
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

/**
 * @author ebrannoc
 *
 */
public class BookTester
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		ArrayList<Book> bookAL = new ArrayList<Book>();
		Book b0 = new Book("Java", "Liang", "999", 999, true);
		Book b1 = new Book("Another Java", "Horstmann", "9999", 2999, false);
		Book b7 = new Book("Another Java", "Anderson", "99", 101999, false);
		Book b5 = new Book("Another Java", "Horstmann2", "9999", 99, false);		
		Book b2 = new Book("Hobbit", "Tolkien", "9993", 9997, true);
		Book b3 = new Book("The Firm", "Grisham", "9992", 11999, true);
		Book b4 = new Book("Comprehensive Java", "Liang", "9991", 999, true);
		Book b6 = new Book("c++", "Horstmann", "9999", 1999, false);
		bookAL.add(b0); bookAL.add(b1); bookAL.add(b2);	bookAL.add(b3);	bookAL.add(b4); bookAL.add(b5);bookAL.add(b6); bookAL.add(b7);
		
		System.out.println("Original Books");		
		System.out.println(bookAL);
		System.out.println("Sorted Books by author then title");
		Collections.sort(bookAL);
		System.out.println(bookAL);
		
		System.out.println("Sorted Books by ISBN");
		Collections.sort(bookAL, new ISBNComparator());
		System.out.println(bookAL);
		
		System.out.println("Sorted Books by Pages");
		Collections.sort(bookAL, new NumOfPagesComparator());
		System.out.println(bookAL);
		
		System.out.println("Sorted Books by Checked Out");
		Collections.sort(bookAL, new CheckedOutComparator());
		System.out.println(bookAL);
		
		
		
	}
}
