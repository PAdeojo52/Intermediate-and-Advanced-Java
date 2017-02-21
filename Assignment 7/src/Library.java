import java.util.ArrayList;
import java.util.regex.*;


/**
 * Class: Library.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2015 
 * Written: Sep 17, 2015
 * 
 * 
 *  This class – Library
 * 
 *  Purpose: – To set up arraylist
 */

public class Library
{
	private String newline = System.getProperty("line.separator");

	//Constructors
	private ArrayList <Book> bookList;


	public Library()
	{
		//ArrayList<Book> bookList = new ArrayList<Book>();
		//This is the  not okay. Dont redeclare the Arraylist
		bookList = new ArrayList<Book>();
	}


	public ArrayList<Book> getBookList()
	{
		return bookList;
	}
	//My Methods

	public void addBook(Book aBook)   
	{

		bookList.add(aBook);
		//this.bookList = aBook;


	}
	public int countTotalPages()
	{
		int totalPages = 0;
		for(Book i: bookList){
			
			//totalpages+= i.getNumOfPages() works to
			totalPages = i.getNumOfPages()+ totalPages ;
			//int count2 = i.getNumOfPages()+ 
			//totalPages=count;

		}
		return totalPages;
	}
	public int countLongBooksCheckedOut(Library a)
	{
		int countOne=0;
		for(Book k: bookList)
		{
			if(k.getNumOfPages()>400 && k.getAuthor().equalsIgnoreCase("long") && k.isCheckOut()==true)
			{
				countOne++;
			}

		}
		return countOne;
	}

	public void listBooksCheckedOut(Library a)
	{
		String titleGetter= "none";
		//String regexTester = "\\w{8}";
		int size = 8;

		for(Book i: bookList)
		{

			if(i.getTitle().length() >= size /*regexTester*/)
			{
				//forgot to check if it was printed out
				System.out.println("Checked out title : ");
				System.out.println(titleGetter= i.getTitle().substring(0, 7));
				
				/*if (!i.getTitle().equals( i.getTitle().substring(0, 7) ))
				{
					System.out.println("Checked out title : ");
					System.out.println(titleGetter= i.getTitle()
					
				}
				//System.out.println; 
*/			}
			else if(i.getTitle().length() <= size)
			{
				System.out.println("Checked out title : ");

				System.out.println(titleGetter = i.getTitle());

			}
		}


		/*System.out.println("Checked out title");
		String titleGetter= "none";
		String regexTester = "\\d{8}";
		if
		 */

		/*	if(Book.this.isCheckOut()!= false)
		{
		if(c.getTitle()!= regexTester)
		{
			titleGetter= c.getTitle().substring(0, 7);
		}
		else
		{
			titleGetter = c.getTitle();
		}

		}
		 */
	}

	//toString

	@Override
	public String toString()
	{
		return "The Library class sets up an  Array List and  four methods(Excluding this one)"+newline+ 
				"The addBook method adds into the Array List"+ newline+
				"countTotalPages counts the mounts of pages in ArrayList"+newline+
				"countLongBookCheckedOut finds the number of books considered long then then sees if there checked out"+newline+
				"listBooksCheckedOut list the books checked out";

	}

}
