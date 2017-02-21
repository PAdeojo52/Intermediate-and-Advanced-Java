import java.util.ArrayList;

/**
 * Class: SameEnds.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2015 
 * Written: Sep 1, 2015-Sep 8
 * 
 * 
 *  This class – ******
 * 
 *  Purpose: – ******
 */

public class SameEnds
{
	 ArrayList<Integer> ends;

	public SameEnds(ArrayList<Integer> ends)
	{
		this.ends= ends;
		//ArrayList<Integer>ends = new ArrayList<Integer>();
	}
	
	
	// The Tayo method
	public void tayo()
	{
		//helper vars
		int middle = ends.size()/2;
		int count=0;
		String begin;
		String over;
		
		//Algorhthm
		for(int i = 0; i< middle ;i++)
		{
			begin=" ";
			
			over= " ";
			for(int j =0; j<=i;j++)
			{
				begin = begin + ends.get(j);
			}
			for(int j = (middle*2)-1-i;j < middle*2; j++)
			{
				over= over + ends.get(j);
			}
			if(begin.equals(over))
			{
				count = i + 1;
			}
			
			
		}
		// The method outputs
		System.out.print("The ArayList : ");
		
		for(int i = 0; i< middle *2 ; i++)
		{
			System.out.print("  "+ ends.get(i));
		}
		
		System.out.println(" ");
		
		if(count == 0)
		{
			System.out.println("There are  no common sequences");
		}
		else
		{
			System.out.print("The longest sequence is");
			for(int x = 0; x< count ; x++)
			{
				System.out.println(" "+ ends.get(x));
			}
			System.out.print(" and the length of the sequence is");
			System.out.print(count);
		}
		
		
		System.out.println("   ");
	}
	
	
	
	
	//Spare/Outaken Code
	
	/*public SameEnds(ArrayList<Integer> ends)
	{
		this.ends= ends;
	}
	public ArrayList<Integer> getEnds()
	{
		return ends;
	}
	public void setEnds(ArrayList<Integer> ends)
	{
		this.ends = ends;
	}
	
	public void print ()
	{
		for(Integer s : ends)
		{
			System.out.println((s + " "));
		}
		System.out.println();
		*/
	}
	/*//public void sameEnds()
	//{
		int middle = ends.size()/2;

		System.out.println("This is the middle" + middle);
		
		for (int i = middle; i >0; i--)
		{
			System.out.println("this is  pre i : " + i);
			boolean match = true;
			System.out.println("This is  post I " + i);
			
			for (int j = 0; match && j < i; j++)
			{
				if (ends.get(j)!= ends.get(ends.size()-i+j))
				System.out.println("This is post j " + j);
				System.out.println("This is post i " + i);
				
				{
					 match = false;
					 
				}
			
					
			}
			
		}
		return 0;
		
		int count = 0;
		int midLength = ends.size()/2; //size()<2 means 1 element or empty[]
		if (ends.size() < 2) 
			count = 0;
		else
		{     for ( int i=0; i<count; i++ )
		      {     boolean match = true;
		             for (int j = 0; match &&(j>i);j-- ) 
		            	 //<-match
		            {   if (ends.get(i) != ends.get(midLength) )
		                 match=false; //up your count if they actually match
		            }
		      }
		
		}
		print(count);
	
	}
	private void print(int count)
	{
		for(Integer s : ends)
		{
			System.out.println((s + " "));
		}
		System.out.println();// TODO Auto-generated method stub
		
	}*/
	
	
	/*public ArrayList<Integer> getEnds()
	{
		return ends;
	}


	public void setEnds(ArrayList<Integer> ends)
	{
		this.ends = ends;
	}


	public SameEnds(ArrayList<Integer> ends)
	{
	
		this.ends = ends;
	}
	public void removeEvenLength()
	{
		for(int i = 0; i < ends.size();i++ )
		{
			if(ends.get(i).length()%2== 0);
			{
				ends.remove(i);
				i--;
				
			}
			
		}
	}
	public void sameEnds()
	{
		
		private ArrayList
		*/
	


	/*
	AL.add(1);
	AL.add(4);
	AL.add(9);
	AL.add(10);
	AL.add(11);
	AL.add(12);
	AL.add(1);
	AL.add(4);
	AL.add(9);
	 */


	/*public  SameEnds()
	{
		AL.add(1);
		AL.add(4);
		AL.add(9);
		AL.add(10);
		AL.add(11);
		AL.add(12);
		AL.add(1);
		AL.add(4);
		AL.add(9);

*/
	
