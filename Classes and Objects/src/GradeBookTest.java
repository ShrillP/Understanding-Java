public class GradeBookTest {
	
	public static void main (String args []) {
		
		GradeBook gradeBook1 = new GradeBook ("ICS101 - Introduction to Java Programming" , "Mr.Patel");
		GradeBook gradeBook2 = new GradeBook ("ICS101 - Data Structures in Java" , "Mr.Patel");
		
		System.out.printf("Course Name for GradeBook1 is: %s\n" , gradeBook1.getCourseName());
		System.out.printf("This course is presented by: %s\n" , gradeBook1.getInstructorName());
		System.out.printf("Course Name for GradeBook2 is: %s\n" , gradeBook2.getCourseName());
		System.out.printf("This course is presented by: %s\n" , gradeBook2.getInstructorName());
		
		gradeBook1.displayMessage();
		gradeBook2.displayMessage();
		
		System.out.println(gradeBook1.toString());
		System.out.println(gradeBook2.toString());
		
	}
}