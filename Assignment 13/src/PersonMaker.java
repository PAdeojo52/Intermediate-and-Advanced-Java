import java.util.ArrayList;
import java.util.Collections;

/**
 * Class: PersonMaker.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2015 
 * Written: Oct 15, 2015
 * 
 * 
 *  This class – Person Maker
 * 
 *  Purpose: – To test Objects
 */

public class PersonMaker
{
	

	public static void main(String[] args)
	{ArrayList<Person>per1= new ArrayList<Person>();
	ArrayList<Phone>phoneAL = new ArrayList<Phone>();
	ArrayList<Phone>phoneAL1 = new ArrayList<Phone>();
	ArrayList<Phone>phoneAL2 = new ArrayList<Phone>();
	ArrayList<Phone>phoneAL3 = new ArrayList<Phone>();
	ArrayList<Phone>phoneAL4 = new ArrayList<Phone>();
	ArrayList<Phone>phoneAL5 = new ArrayList<Phone>();
	
	

	ArrayList<Address>addressAL= new ArrayList<Address>();
	ArrayList<Address>addressAL1= new ArrayList<Address>();
	ArrayList<Address>addressAL2= new ArrayList<Address>();
	ArrayList<Address>addressAL3= new ArrayList<Address>();
	ArrayList<Address>addressAL4= new ArrayList<Address>();
	ArrayList<Address>addressAL5= new ArrayList<Address>();





	Person p1;
	Person p2; 
	Person p3;
	Person p4;
	Person p5; 
	

		//
		//Person,Address and Phone objects creation
		Address a1 = new Address ("Brad Street", "Atlanta", "Georgia", "30014");
		Phone ph1 = new Phone(555, "1234");
		phoneAL.add(ph1);
		addressAL.add(a1);
		phoneAL1.add(ph1);
		addressAL1.add(a1);
		p1 =  new Person("Temitayo","Adeojo",phoneAL2,addressAL2);

		//System.out.println(p1.getPhone());


		

		phoneAL.add(ph2);
		addressAL.add(a2);
		phoneAL2.add(ph2);
		addressAL2.add(a2);
		p2 = new Person ("Jay", "Z", phoneAL2,addressAL2);

		Address a3 = new Address("Funny Bunny Street", "Bejing", "New York", "20001");
		Phone ph3 = new Phone (323, "5453");
		phoneAL.add(ph3);
		addressAL.add(a3);
		phoneAL3.add(ph3);
		addressAL3.add(a3);
		p3 = new Person("Kanye", "West", phoneAL3,addressAL3);
		System.out.println(p3);

		Address a4 = new Address("Hyrbrid Rainbow Avenue", "Paris", "Idaho", "6234D");
		Phone ph4 = new Phone (343, "5445");
		phoneAL.add(ph4);
		addressAL.add(a4);
		phoneAL4.add(ph4);
		addressAL4.add(a4);
		p4 = new Person("Blue", "Ivy", phoneAL4, addressAL4);

		Address a5 = new Address("Carnival Street", "London", "Rhode Island", "34344");
		Phone ph5 = new Phone (343,"3453");
		phoneAL.add(ph5);
		addressAL.add(a5);
		phoneAL5.add(ph5);
		addressAL5.add(a5);
		p5 = new Person("Nicki", "Minaj", phoneAL5,addressAL5);


		System.out.println(phoneAL1 + "WATFDDFGDGDGDFGDFGD");

		per1.add(p1);
		per1.add(p2);
		per1.add(p3);
		per1.add(p4);
		per1.add(p5);

		for(int i= 0; i<per1.size();i++)
		{
			System.out.println(per1.get(i));

		}
		Collections.sort(per1);
		Collections.sort(phoneAL);
		Collections.sort(addressAL);

System.out.println("Sorted Persons");
		System.out.println(per1);
		System.out.println("Sorted Phones");
		System.out.println(phoneAL);
		System.out.println("Sorted Address");
		System.out.println(addressAL);
		//Phone ArrayList
		/*
		phoneAL.add(ph2);
		phoneAL.add(ph3);
		phoneAL.add(ph4);
		phoneAL.add(ph5);

		//Adress ArrayList
		addressAL.add(a1);
		addressAL.add(a2);
		addressAL.add(a3);
		addressAL.add(a4);
		addressAL.add(a5);
		 */



		/*	



		// new Phone ("Fooly Cooly Street ", "Lagos", "Nigeria", "200012");











		Collections.sort(per1);
	}*/
	}

}
