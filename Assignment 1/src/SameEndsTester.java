import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class: SameEndsTester.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2015 
 * Written: Sep 1, 2015
 * 
 * 
 *  This class – ******
 * 
 *  Purpose: – ******
 */

public class SameEndsTester
{

	public static void main(String[] args)
	{
		//Test 1
		ArrayList<Integer> one = new ArrayList<Integer>(Arrays.<Integer>asList(1,4,9,10,11,12,1,4,9));
		//Test 2
		ArrayList<Integer> two = new ArrayList<Integer>(Arrays.<Integer>asList(1,1,1,1,1,12,2,2,2,4,4,5,5,6,7,7));
		//Test 3
		ArrayList<Integer> three = new ArrayList<Integer>(Arrays.<Integer>asList(22,23433,23433,12,3434,34,3,4,5,65,54,5,5));
		//Test 4
		ArrayList<Integer> four = new ArrayList<Integer>(Arrays.<Integer>asList(9,9,9,8,6,76,45,3,34,3,4,35,34,5,345,3,45,345,34));
		//Test 5
		ArrayList<Integer> five = new ArrayList<Integer>(Arrays.<Integer>asList(11,27,11,27,2,2,3,4,4,12,43,123));
		
		//The Setup
		SameEnds endsOne= new SameEnds(one);
		SameEnds endsTwo= new SameEnds(two);
		SameEnds endsThree= new SameEnds(three);
		SameEnds endsFour= new SameEnds(four);
		SameEnds endsFive= new SameEnds(five);
		//The Put out
		endsOne.tayo();
		endsTwo.tayo();
		endsThree.tayo();
		endsFour.tayo();
		endsFive.tayo();


		
		




		




		/*
		
		testAL.clear();
		go = new SameEnds(testAL);
		go.sameEnds();
		
		testAL.clear();
		testAL.add(5); testAL.add(6); testAL.add(7); testAL.add(8); testAL.add(5); testAL.add(6); testAL.add(7);
		go = new SameEnds(testAL);
		go.sameEnds();
		*/

	}

}
