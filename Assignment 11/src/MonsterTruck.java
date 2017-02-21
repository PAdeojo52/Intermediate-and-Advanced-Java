/**
 * Class: MonsterTruck.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2015 
 * Written: Oct 8, 2015
 * 
 * 
 *  This class – ******
 * 
 *  Purpose: – ******
 */

public class MonsterTruck extends Truck //extends truck
{
	public void m1()
	{
		System.out.println("monster 1"); // makes monster 1
	}
	public void m2 ()
	{
		super.m1();//pulls truck 1
		super.m2();// car 1
		
	}


@Override
public String toString()
{
	return "Monster " + super.toString(); //vroom vroom
}

public static void main(String [] args)
{
	
	MonsterTruck monsterCar = new MonsterTruck();
	
	monsterCar.m1();
	monsterCar.m2();
	System.out.println(monsterCar.toString());
	//m1();
	//m2();

}

}