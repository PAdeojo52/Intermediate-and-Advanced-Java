/**
 * Class: EmployeeTester.java
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

public class EmployeeTester
{

	public static void main(String[] args)
	{
		//5 Employyee objects
		Employee E1 = new Employee("Matt", "60000");
		Employee E2 = new Employee("Jimmy", "60000");
		Employee E3 = new Employee("David", "60000");
		Employee E4 = new Employee("Jamal", "60000");
		Employee E5 = new Employee("Ladonte", "60000");
		
		//5 Manager Objects
		Manager M1 = new Manager("Jacky", "80000", "Support Services");
		Manager M2 = new Manager("Mickey","80000","Support Services");
		Manager M3 = new Manager("Nicholas","80000", "Support Services");
		Manager M4 = new Manager("David", "80000", "Support Services");
		Manager M5 = new Manager("Chris", "80000", "CTS");
		
		//5 Executive objects
		Executive X1 = new Executive("Soul", "100000","Communications");
		Executive X2 = new Executive("Neo","100000","Stratigic Planning");
		Executive X3 = new Executive("Steve","100000","Student Dicipline");
		Executive X4 = new Executive("Renton","100000","Admissions");
		Executive X5 = new Executive("Staz","200000","President");
		
		
//Console OutPut
		
		System.out.println(E1.toString());
		System.out.println(E2.toString());
		System.out.println(E3.toString());
		System.out.println(E4.toString());
		System.out.println(E5.toString());
		System.out.println(M1.toString());
		System.out.println(M2.toString());
		System.out.println(M3.toString());
		System.out.println(M4.toString());
		System.out.println(M5.toString());
		System.out.println(X1.toString());
		System.out.println(X2.toString());
		System.out.println(X3.toString());
		System.out.println(X4.toString());
		System.out.println(X5.toString());
		//E1.toString();





		
		// TODO Auto-generated method stub

	}

}
