import java.util.ArrayList;


/**
 * Class: Schedule.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2015 
 * Written: Sep 13, 2015
 * 
 * 
 *  This class – Schedule
 * 
 *  Purpose: set Schedule ArrayList  && methods
 */

public class Schedule
{
	private ArrayList <Course> courseList;


	public Schedule()
	{
		courseList = new ArrayList<Course>();
	}


	public ArrayList<Course> getCourseList()
	{
		return courseList;
	}


	public void setCourseList(ArrayList<Course> courseList)
	{
		this.courseList = courseList;
	}


//Available method
	public int numAvailableCourses(Schedule a){

		int t= 0;
		for(Course i: courseList)
		{
			if(i.isAvaliable() == "True")
			{
				t++;
			}

		}
		return t;

	}
	
	//Credit Method
	public int totalCredits(Schedule a) 
	{
		
		int intCH =0;

		for(Course I: courseList)
		{
			
				intCH = Integer.parseInt(I.getCreditHours()) + intCH;
				
		
			
		}
		
		return intCH;


	}
	//my Subject method
	
	public int howManyBySubject(String subject)
	{
		String t = subject;
		int v = 0;
		//int x = 0;

		for(Course s: courseList)
		{
			if(s.getSubject()== t)
			{
				//x++;
				v++;
			}		
			
		}
		return v;	



	}
	

//Add Course method
	public void addCourse(Course aCourse)
	{
		courseList.add(aCourse);

	}




	
	//My toString
	@Override
	public String toString() 
	{
		int x = 0;
		return "Schedule CourseList" +  courseList;
		
	}
}

