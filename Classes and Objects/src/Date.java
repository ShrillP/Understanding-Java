public class Date {
	
	private int month;
	private int day;
	private int year;
	
	//Constructor method (has 3 parameters)
	public Date (int m, int d, int y) {
		month = m;
		day = d;
		year = y;
		
	}
	
	//Getters and Setters 
	public void setDay (int day){
		 this.day = day;
	}
	
	public int getDay () {
		return day;
	}
	
	public void setMonth (int month) {
		if (month >= 1 && month <= 12)
			this.month = month;
	}
	
	public int getMonth () {
		return month;
	}
 
	public void setYear (int year){
		 this.year = year;
	}
	
	public int getYear () {
		return year;
	}
	
	public void displayDate() {
		System.out.printf("%d / %d / %d \n" , getMonth(), getDay(), getYear());
	}
}