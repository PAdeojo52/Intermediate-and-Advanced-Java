
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import java.util.Set;


public class HashMapUser
{
    
    public static void main(String[] args)
    {
       // create instance
        String initialSet[] = {"Romeo", "Juliet", "Adam", "Eve", "Homer", "Marge", "Bart", "Eve"};
       
        Random randomGenerator = new Random();
        
        // create a random double number between 0 and 60
        double random = randomGenerator.nextDouble() * 60;
        
        HashMap<String,Double>nameMap = new HashMap<String,Double>();
        
        for(int x = 0; x< initialSet.length; x++)
        {
        	nameMap.put(initialSet[x], random);
        }
        
        Set<String> keys = nameMap.keySet();
        for(String name: keys)
        {
        	System.out.println("The name is " + name + 
        			"and the value is "+  nameMap.get(name));
        	//System.out.println(nameMap.get(z));
        }
        

    }

}
