import java.util.ArrayList;

/**Class: Library.java
 * @version 1.0
 * Date Written: Feb 22, 2015
 * Class Description: TODO
 */

/**
 * @author Matt
 *
 */
public class Library
{
	private ArrayList<Book> bookList;
	
	/**
	 * Constructor
	 *
	 */
	public Library()
	{
		this.bookList = new ArrayList<Book>();
	}

	/**Method Name: getBookList
	 * @return the bookList
	 */
	public ArrayList<Book> getBookList()
	{
		return bookList;
	}
	
	/**
	 * Method Name: addBook
	 * @param book
	 * Method Description: Adds the book parameter to the list of books.
	 */
	public void addBook(Book book)
	{
		this.bookList.add(book);
	}
	
	/**
	 * Method Name: countTotalPages
	 * @return total pages
	 * Method Description: Returns the sum of all pages in the library.
	 */
	public int countTotalPages()
	{
		int sum = 0;
		for (Book element: this.bookList)
			sum += element.getNumOfPages();
		return sum;
	}
	
	/**
	 * Method Name: countLongBooksCheckedOut
	 * @return total books long and checked out
	 * Method Description: Returns the sum of the books that are long and checked out.
	 */
	public int countLongBooksCheckedOut()
	{
		int sum = 0;
		for (Book element: this.bookList)
			if (element.isCheckOut() && element.isLongBook())
				sum ++;
		return sum;
	}
	
	/**
	 * Method Name: listBooksCheckedOut
	 * 
	 * Method Description: Displays all books that are checked out.
	 */
	public void listBooksCheckedOut()
	{
		System.out.println("List of Checked Out Books\n");
		for (Book element: this.bookList)
			if (element.isCheckOut())
				System.out.println("Checked out book:\t" + element);;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "[Library] bookList => " + bookList;
	}
	
	
}
