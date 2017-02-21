/**
 * Class: Course.java
 * 
 * @author Peter Adeojo
 * @version 1.0
 *          <p>
 * Course : ITEC 2150 Fall 2015 
 * Written: Sep 11, 2015
 * 
 * 
 *  This class – Course
 * 
 *  Purpose: – To set my course variables
 */

public class Course
{
	//My instance Variables
	private String crn;
	private String subject;
	private String number;
	private String sectionId;
	private String creditHours;
	private String instructor;
	private String isAvaliable;
	//private int SetsectionId;
	
	private String newline = System.getProperty("line.separator");

	public Course()
	{
		//No arg-Cons that initalzes instance variables
		this.crn= "9001"; //REst TBH;
		this.subject= "TBA";
		this.number= "1001";
		this.sectionId= "1";
		this.creditHours="3";
		this.instructor= "TBA";
		this.isAvaliable = "false";
	}

	public Course(String stringCrn, String subject, String stringNumber,String stringSectionId,String stringCreditHours, String instructer, String stringIsAvaliable )
	{
		//7 arg constructer to set vars
		//caslls my setters

		this.setCrn (stringCrn);
		this.setSubject(subject);
		this.setNumber(stringNumber);
		this.setSectionID(stringSectionId);
		this.setCreditHours(stringCreditHours);
		this.setInstructor(instructer);
		this.setAvaliable(stringIsAvaliable);
	}
	//Getters & Setters

	public String getCrn()
	{
		return crn;
	}

	public void setCrn(String stringCrn)
	{

		//String regexCRN = "^\\d{4}$";
		//if(stringCrn.matches(regexCRN)){


		int intCRN = Integer.parseInt(stringCrn);
		//System.out.println(intCRN);
		if(intCRN>1)
		{
			//this.crn= stringCrn;
			this.crn=stringCrn;
		}
		else
		{
			//this.crn= "9001";
			//stringCrn= "9001";
			System.out.println("Invalid value typed for CRN. Defaulting to 9001");
			//System.out.println("The CRN for the course is: " + stringCrn );
			this.crn=crn;
		}
	}
	//this.crn = crn;
	//}

	public String getSubject()
	{
		return subject;
	}

	public void setSubject(String subject)
	{
		//this.subject = subject;
		//System.out.println();
		this.subject= subject;
	}

	public String getNumber()
	{

		return number;
	}

	public void setNumber(String stringNumber)
	{
		String regexNumber = "\\d{4}";
		if(stringNumber.matches(regexNumber)){

			int intNumber= Integer.parseInt(stringNumber);
			//System.out.println(number);
			//Test
			//System.out.println(intNumber);
			//boolean Test1 = false;

			/*
			if(intNumber>=1 && intNumber<= 9999){
				Test1= true;
				System.out.println(Test1);
			}
			else
			{
				System.out.println(Test1);
			}
			 */
			if( intNumber>=1 &&  intNumber<=9999)
			{
				//this.number= stringNumber;
				//System.out.println();
				this.number=stringNumber;
			}
			else
			{
				//stringNumber="1001";

				this.number="1001";
				this.number=stringNumber;
				System.out.println("Invalid value typed for course number. Defaulting to 1001 ");
				
			}

		}
		else{
			this.number="1001";

			System.out.println("Invalid value typed for course number. Defaulting to 1001 ");
			this.number=this.number;
			//System.out.println("The course number for this class is: "+ stringNumber);//this.number = number;
		}
	}

	public String getSectionID()
	{
		return sectionId;
	}

	public void setSectionID(String stringSectionId)
	{
		String regixID = "(\\d|\\d\\d)";

		/*
		if(stringSectionId.matches(regixID)){

			System.out.println("true");
		}
		else 
		{
			System.out.println("False");
		}
		 */

		int intSectionId= Integer.parseInt(stringSectionId);

		if(stringSectionId.matches(regixID))
		{



			if(intSectionId>= 1 && intSectionId <=80)
			{
				this.sectionId = stringSectionId;
				//System.out.println();
			}
			else
			{
				//this.sectionId= "1";
				stringSectionId= "1";
				this.sectionId=stringSectionId;
				System.out.println("Invalid value typed for section ID. Defaulting 1");
				//System.out.println("The Section ID for the course is : " + stringSectionId);

			}
		}

		//this.sectionId = sectionID;
	}

	public String getCreditHours()
	{
		return creditHours;
	}

	public void setCreditHours(String stringCreditHours)
	{
		String regexCreditHour= "\\d";
		if(stringCreditHours.matches(regexCreditHour))
		{
			int intCreditHour = Integer.parseInt(stringCreditHours);
			if(intCreditHour>0 && intCreditHour<=4)
			{
				this.creditHours=stringCreditHours;
				
				//System.out.println("The number of credit hours for the course is: "+ stringCreditHours);
			}
			else
			{
				//this.creditHours = "3";
				stringCreditHours= "3";
				this.creditHours=stringCreditHours;
				System.out.println("Invalid value typed for credit hours. Defaulting to 3");
				//System.out.println("The number of credit hours for the course is: " + stringCreditHours);
			}	
		}


		//return this.creditHours = creditHours;
	}

	public String getInstructor()
	{
		return instructor;
	}

	public void setInstructor(String instructor)
	{
		
		this.instructor = instructor;
		//System.out.println();
	}

	public String isAvaliable()
	{
		return isAvaliable;
	}

	public void setAvaliable(String stringIsAvaliable)
	{
		String Y = "Y";
		String y = "y";
		String T = "T";
		String t = "t";

		String firstLetter = stringIsAvaliable.substring(0, 1);
		//System.out.println(firstLetter +"fl");
		if(firstLetter.matches(Y)||firstLetter.matches(y)||firstLetter.matches(T)||firstLetter.matches(t))
		{
			stringIsAvaliable = "True";
			isAvaliable= stringIsAvaliable;
			//this.isAvaliable = stringIsAvaliable;
			//System.out.println("The course is currently avaliable.");


		}
		else
		{
			stringIsAvaliable = "False";
			isAvaliable= stringIsAvaliable;
			//System.out.println("The course is not currently avaliable");
		}

	}
	@Override
	public String toString() 
	{
		return  newline+ "The CRN for the course is : "+ crn+" "+ newline+   "The Subject of the course is: " + subject+" "+newline + 
				"The course number for this class is: "+ number+" " + newline + "The Section ID for the course is : " + sectionId+" "+ newline
				+ "The number of credit hours for the course is: "+ creditHours+" "+ newline +"The instructor for the course is : " + instructor+ " "+newline + 
				"Is the course currently avaliable : " + isAvaliable+ " " + newline;
	}	


}
