/**Class: Book.java
 * @version 1.0
 * Date Written: Feb 22, 2015
 * Class Description: TODO
 */

/**
 * @author 2150
 *
 */
public class Book
{
	private String title, author;
	private int iSBN, numOfPages;
	private boolean isCheckOut;

	/**
	 * Constructor
	 * @param author
	 * @param title
	 */
	public Book(String author, String title)
	{
		this.title = title;
		this.author = author;
		this.isCheckOut = false;
		this.iSBN = 9999;
		this.numOfPages = 150;
	}

	/**
	 * Constructor
	 * @param title
	 * @param author
	 * @param iSBN
	 * @param numOfPages
	 * @param isCheckOut
	 */
	public Book(String title, String author, String iSBN, int numOfPages,
			boolean isCheckOut)
	{
		this.title = title;
		this.author = author;
		this.setiSBN(iSBN);
		this.numOfPages = numOfPages;
		this.isCheckOut = isCheckOut;
	}

	/**Method Name: getTitle
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}

	/**Method Name: setTitle
	 * @param title the title to set
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}

	/**Method Name: getAuthor
	 * @return the author
	 */
	public String getAuthor()
	{
		return author;
	}

	/**Method Name: setAuthor
	 * @param author the author to set
	 */
	public void setAuthor(String author)
	{
		this.author = author;
	}

	/**Method Name: getiSBN
	 * @return the iSBN
	 */
	public int getiSBN()
	{
		return iSBN;
	}

	/**Method Name: setiSBN
	 * @param iSBN the iSBN to set
	 */
	private void setiSBN(String iSBN)
	{
		try
		{
			this.iSBN = Integer.parseInt(iSBN);
		}
		catch (NumberFormatException nfe)
		{
			this.iSBN = 9999;
		}
	}

	/**Method Name: getNumOfPages
	 * @return the numOfPages
	 */
	public int getNumOfPages()
	{
		return numOfPages;
	}

	/**Method Name: setNumOfPages
	 * @param numOfPages the numOfPages to set
	 */
	public void setNumOfPages(int numOfPages)
	{
		this.numOfPages = numOfPages;
	}

	/**Method Name: isCheckOut
	 * @return the isCheckOut
	 */
	public boolean isCheckOut()
	{
		return isCheckOut;
	}

	/**Method Name: setCheckOut
	 * @param isCheckOut the isCheckOut to set
	 */
	public void setCheckOut(boolean isCheckOut)
	{
		this.isCheckOut = isCheckOut;
	}

	/**
	 * Method Name: isLongBook
	 * @return
	 * Method Description: Determines if a book is long based on author name and
	 * number of pages.
	 */
	public boolean isLongBook()
	{
		boolean longBook = false;
		if (this.numOfPages > 400 && this.author.toLowerCase().contains("long"))
		{
			longBook = true;
		}
		return longBook;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Book title => " + title + " | author => " + author
				+ " | iSBN => " + iSBN + " | numOfPages => " + numOfPages
				+ " | isCheckOut => " + isCheckOut;
	}



}
