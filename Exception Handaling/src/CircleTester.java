import java.util.ArrayList;

public class CircleTester 
{

	public void printCircleArrayList(ArrayList<Circle> al)
	{
		for (Circle c: al)
		{
			System.out.println(c);
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		ArrayList<Circle> circleAL = new ArrayList<Circle>();
		CircleTester ct = new CircleTester();

		Circle c0 = new Circle(2.4);
		circleAL.add(c0);
		Circle c1 = new Circle(78782.4);
		circleAL.add(c1);
		Circle c2 = new Circle(.4);
		circleAL.add(c2);
		circleAL.add(new Circle(78782.4));
		circleAL.add(new Circle(100.4));
		circleAL.add(new Circle(10.4));

		//SOP all circles
		System.out.println("SOP all circles ");
		ct.printCircleArrayList(circleAL);


		//Get rid of all circles with radius > 99
		for (int i = 0; i <  circleAL.size(); i++)
		{
			if (circleAL.get(i).getRadius() > 99)
			{
				circleAL.remove(i);
				i--;
			}
		}
		System.out.println("\nSOP all circles with radius <= 99 ");
		ct.printCircleArrayList(circleAL);
		
		System.out.println("\nTotal of all radii is: " + Circle.getTotalLegs(circleAL));
		

	}
}
