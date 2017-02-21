import java.util.ArrayList;

/**
 * Class: ScheduleTester.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2015 
 * Written: Sep 13, 2015
 * 
 * 
 *  This class –ScheduleTester
 * 
 *  Purpose: To Test Course 
 */

public class ScheduleTester
{


	public static void main(String[] args)
	{

		//3 Test, used variably
		//Defaults checked
		//Wrong vars chcked
		Course course1= new Course("5500", "ITEC", "2150", "08", "4", "Brannock", "True");
		//System.out.println("     ");
		Course course2= new Course("5582", "MATH", "2100", "05", "4", "Whiter", "False");
		//System.out.println("              ");
		Course course3= new Course("2300", "ITEC", "3000", "80", "3", "Paproth", "True");

		//the first of my sysout
		System.out.println("Course 1: " + course1);
		System.out.println("Course 2: " + course2);
		System.out.println("Course 3 :" + course3);
		//New schedule
		Schedule mySchedule= new Schedule();
		//Added Courses
		mySchedule.addCourse(course1);
		mySchedule.addCourse(course2);
		mySchedule.addCourse(course3);
		System.out.println(mySchedule);
		
		//Checked Methods
		System.out.println("Expected results for numAvailiable method: 2"+  " Actual results " + mySchedule.numAvailableCourses(mySchedule));
		System.out.println("    ");
		System.out.println("Expected total credit: 11"+ " Actual number credit: "+ mySchedule.totalCredits(mySchedule));
		System.out.println("      ");
		System.out.println("Expected total Course matchs is : 2 "+ " Actual number of course matches: "+ mySchedule.howManyBySubject("ITEC"));
		System.out.println("      ");
		
		

	}

}
