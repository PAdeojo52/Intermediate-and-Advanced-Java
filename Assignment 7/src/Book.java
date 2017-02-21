/**
 * Class: Book.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2015 
 * Written: Sep 15, 2015
 * 
 * 
 *  This class – book
 * 
 *  Purpose: – to be put in arraylist
 */

public class Book
{
	private String title;
	private String author;
	private int iSBN;
	private int numOfPages;
	private boolean isCheckOut;
	
	private String newline = System.getProperty("line.separator");



	//First book class
	public Book(String title, String author)
	{
		this.title= title;
		this.author = author;
		this.iSBN = 9999;
		this.numOfPages = 150;
		boolean isCheckOut = false;

	}
	public Book(String title, String author, String iSBN, int numOfPages, boolean isCheckOut)
	{
		this.setTitle(title);
		this.setAuthor(author);
		this.setiSBN(iSBN);
		this.setNumOfPages(numOfPages);
		this.setCheckOut(isCheckOut);
		

	}
	//My methods
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	//If ever advancing code place a catch for numbers to large for integers
	public int getiSBN()
	{
		return iSBN;
	}
	public void setiSBN(String isbn)
	{
		String s = "";
		for(int i = 0 ; i<isbn.length();i++){
			
			if(Character.isDigit(isbn.charAt(i)))
			{
				s= s + isbn.charAt(i);
			}
			
		}
		
		
		
		
		
		Integer t = 0;
		String regexCheck = "\\d";
		//System.out.println("is bn is " + isbn);
		if( isbn != regexCheck)
		{

			String tier1 = isbn;
			tier1 = tier1.replaceAll("[^\\d]","0");
			//System.out.println(tier1);
			
			
			t= Integer.parseInt(tier1);
		}
		this.iSBN=t;

		/*String mISBN= isbn;
		String regexIsbn = "\\d";
		if(isbn != regexIsbn)
		{
jn
		mISBN = Integer.parseInt(mISBN);

			this.iSBN= mISBN.replaceAll("[^\\d]" , " ");


		 */
	}
	//this.iSBN = iSBN;

	public int getNumOfPages()
	{
		return numOfPages;
	}
	public void setNumOfPages(int numOfPages)
	{
		this.numOfPages = numOfPages;
	}
	public boolean isCheckOut()
	{
		return isCheckOut;
	}
	public void setCheckOut(boolean isCheckOut)
	{
		this.isCheckOut = isCheckOut;
	}

	public boolean isLongBook(Book a)
	{
		String check = a.author;
		boolean longBook=false;
		int bookPages = a.numOfPages;
		

		if(bookPages>400 && check.equalsIgnoreCase("long"))/*check.toLowerCase().contains("long") would have also worked.*/
		{
			longBook = true;

		}
		return longBook;
	}

//My toString
	
	@Override
	public String toString() 
	{
		return "The name of the book is " + title + "."+ newline +
				" The author of the book is " + author +"."+ newline + 
				" The number of pages the book has is "+ numOfPages+ "." + newline +
				" Finally the ISBN number is " + iSBN;
	}



	//5 arg constructor


}
