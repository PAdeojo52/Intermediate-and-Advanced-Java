import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;


public class HashSetUser
{
	private HashSet<String> mySet = new HashSet<String>();


	public HashSetUser(String[] initialValues)
	{
		for (int i=0; i< initialValues.length; i++)
		{
			mySet.add(initialValues[i]);
		}
	}

	public HashSetUser()
	{
		// initially an empty hash set
	}

	public Iterator<String> getIterator()
	{
		return mySet.iterator();
	}

	public void add(String data)
	{
		mySet.add(data);
	}

	public void remove(String data)
	{
		mySet.remove(data);
	}

	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		// create instance
		String initialSet[] = {"Romeo", "Juliet", "Adam", "Eve", "Homer", "Marge", "Aaron", "Eve"};
		HashSetUser aSet = new HashSetUser(initialSet);

		// YOUR CODE GOES HERE
		// using the instance of HashSetUser named aSet, add code that 
		// 1.   prints the contents of the hashset to console
		Iterator<String> itr = aSet.mySet.iterator();

		while(itr.hasNext())
		{
			System.out.println("Item in the set "  + itr.next().toString() );
		}

		// 2.  Find the name in the hashSet that is alphabetically the lowest and print it to console (Note:  Don't just 
		// print "Aaron" from the initialSet above.  Do it by checking each element in the HashSetUser hashset


		List sortedList = new ArrayList();

		sortedList.add(aSet);
		Collections.sort(sortedList);

	


	}

}
