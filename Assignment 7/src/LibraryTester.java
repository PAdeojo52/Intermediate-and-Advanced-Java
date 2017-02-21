/**
 * Class: LibraryTester.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2015 
 * Written: Sep 17, 2015
 * 
 * 
 *  This class – librarytester
 * 
 *  Purpose: – to test classes
 */

public class LibraryTester
{

	public static void main(String[] args)
	{
		Book b1=  new Book("Academia","Horikoshi Kouhei");
		
		Book b2 = new Book("The School for Good and Evil","long", "23994BDF", 475,true);
		
		Book b3 = new Book("Batman"," Alan Moore ","T1R3FG34f3",450, false);
		
		System.out.println("Book 1 " +  b1 );
		System.out.println("    ");

		System.out.println("Book 2 "+ b2);
		System.out.println("    ");

		System.out.println("Book 3 "+ b3);
		System.out.println("    ");
		
		System.out.println("Theses are my isLong books methods");
		System.out.println(b1.isLongBook(b1));

		System.out.println(b2.isLongBook(b2));

		System.out.println(b3.isLongBook(b3));
		
		System.out.println("    ");
		//Library add in
		Library myLibrary = new Library();
		myLibrary.addBook(b1);
		myLibrary.addBook(b2);
		myLibrary.addBook(b3);
		
		//Counts pages- Dont forget to factor in the default pages
		System.out.println("Total Page Expected :1075");
		System.out.println("Total page gotten: " + myLibrary.countTotalPages());
		System.out.println("     ");
		System.out.println("Expected output for  Long books out : 1");
		System.out.println("The current Long books out: " + myLibrary.countLongBooksCheckedOut( myLibrary));
		
		
		System.out.println("     ");
		
		System.out.println("The number of books checked out");
		System.out.println("The Checked out Method");
		myLibrary.listBooksCheckedOut(myLibrary);
		//System.out.println(myLibrary);
		
		//System.out.println(myLibrary.countTotalPages());
		
		

		//System.out.println(b2.getiSBN());
		
		

	}

}
