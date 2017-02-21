/**Class: BookTester.java
 * @version 1.0
 * Date Written: Feb 22, 2015
 * Class Description: TODO
 */

/**
 * @author 2150
 *
 */
public class BookTester
{

	/**Method Name: main
	 * @param args
	 * Method Description: TODO
	 */
	public static void main(String[] args)
	{
		Book b1 = new Book("J.K. Rowling", "Harry Potter");
		Book b2 = new Book("Lord of the Rings", "J.R.R. Tolkein", "3453", 300, true);
		Book b3 = new Book("Forgotten Realms", "R.A. Salvatore", "kdkdkd", 500, false);
		Book b4 = new Book("Test Book", "Long Book", "kdkdkd", 880, true);
		System.out.println("Calling is long book: " + b1.isLongBook());
		System.out.println("Calling is long book: " +b2.isLongBook());
		System.out.println("Calling is long book: " +b3.isLongBook());
		System.out.println("Calling is long book: " +b4.isLongBook());
		Library myLibrary = new Library();
		myLibrary.addBook(b1);
		myLibrary.addBook(b2);
		myLibrary.addBook(b3);
		myLibrary.addBook(b4);
		System.out.println(myLibrary);
		System.out.println("Long Books Checked Out:\t" + myLibrary.countLongBooksCheckedOut());
		System.out.println("Total Pages in Library:\t" +myLibrary.countTotalPages());
		myLibrary.listBooksCheckedOut();
	}

}
