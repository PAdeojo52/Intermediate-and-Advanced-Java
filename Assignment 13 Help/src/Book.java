/*Create the Book class
2. Create the 2-arg constructor
- Book(String title, String author)
- Use the following default values:
i. ISBN: 9999
ii. numberOfPages: 150
iii. isCheckOut: false
3. Create the 5-argument constructor:
- Book(String title, String author, String iSBN, int numOFPages, boolean isCheckOut)
4. Generate all getters and setters for instance variables
5. Modify setISBN with the method declaration:
- private void setISBN(String isbn)
- The setter will remove any non-numeric characters from the string input (anything that is not a
digit), convert it to an integer, and then set the instance variable iSBN to the int value. (Ignore
overflow)
6. Modify the 5 argument constructor to invoke the setISBN method.
7. isLongBook: This method will return true if BOTH of the following are true:
- Number of pages > 400 AND
- Author’s name has the word “long” in it (case insensitive)
8. toString: Return a nicely formatted string describing this object.*/


/**
 * Class: Book.java
 *
 * @author ebrannoc
 * @version 1.0
 *          
 * Course : ITEC 2150 Fall 2015
 * Written: Sep 22, 2015
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
public class Book implements Comparable<Book> 
{
	private String title;
	private String author;
	private int iSBN;
	private int numOfPages;
	private boolean isCheckOut;
	public Book(String title, String author)
	{
		this.title = title;
		this.author = author;		
		this.iSBN = 9999;
		this.numOfPages =  150;
		this.isCheckOut =  false;
	}

	public Book(String title, String author, String iSBN, int numOfPages,
			boolean isCheckOut)
	{
		this.title = title;
		this.author = author;
		this.setISBN(iSBN);
		this.numOfPages = numOfPages;
		this.isCheckOut = isCheckOut;
	}

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

	public int getiSBN()
	{
		return iSBN;
	}

	// The setter will remove any non-numeric characters from the string input (anything that is not a
	//digit), convert it to an integer, and then set the instance variable iSBN to the int value. (Ignore
	//		overflow)
	public void setISBN(String iSBN)
	{
		String sAllDigits = ""; 
		for (int i = 0; i < iSBN.length(); i++)
		{
			if (Character.isDigit(iSBN.charAt(i)))
			{
				sAllDigits = sAllDigits + iSBN.charAt(i);
			}
		}
		if (sAllDigits.length() > 1)
		{
			this.iSBN = Integer.parseInt(sAllDigits);
		}
		else this.iSBN = 0;

	}

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

	//isLongBook: This method will return true if BOTH of the following are true:
	//- Number of pages > 400 AND
	//- Author’s name has the word “long” in it (case insensitive)
	public boolean isLongBook()
	{
		return (this.numOfPages > 400 && this.author.toLowerCase().contains("long"));			
	}

	@Override
	public String toString()
	{
		return "Book title=" + title + ", author=" + author + ", iSBN=" + iSBN
				+ ", numOfPages=" + numOfPages + ", isCheckOut=" + isCheckOut + "\n";
	}

	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	public int compareTo(Book b)
	{
		if (this.author.equalsIgnoreCase(b.author)) 
			if (this.title.equalsIgnoreCase(b.title)) return 0;
			else if (this.title.compareToIgnoreCase(b.title) < 0) return -1;
			else return 1;		
		else if (this.author.compareToIgnoreCase(b.author) < 0) return -1;
		else return 1;
	}

}
