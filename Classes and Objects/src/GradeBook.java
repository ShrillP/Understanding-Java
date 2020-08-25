//This is a GradeBook class that is a constructor to initalize many details.

public class GradeBook {
	
	private String courseName;		//The course name for this grade book 
	private String instructorName;	//The instructor name for this grade book 
	
	//A constructor method that initalizes the course name & instructor name as a String 
	public GradeBook (String courseName, String instructorName) {
		
	 setCourseName(courseName);
	 setInstructorName(instructorName);
	 
	}
	
	//A method to set up the course name 
	public void setCourseName (String name) {
		courseName = name;		//Stores the course name 
		
	}

	//A method to retrieve the course name
	public String getCourseName () {
		return courseName;
		
	}
	
	//A method to set instructor name 
	public void setInstructorName (String instructorName) {
		this.instructorName = instructorName;
		
	}
	
	//A method to retrieve the instructor name 
	public String getInstructorName () {
		return instructorName;
		
	}
	
	//toString method 
	@Override 
	public String toString () {
		return "GradeBook [courseName = " + courseName + ", instructorName = " + instructorName + " ] ";
		
	}
	
	//Utility Method 
	public void displayMessage() {
		
		System.out.printf("Welcome to the Grade Book for: \n%s!\n" , courseName);
		System.out.printf("This course is presented by: %s\n" , getInstructorName());
		
	}
}