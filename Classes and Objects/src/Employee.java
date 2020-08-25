public class Employee {

	private String firstName;
	private String lastName;
	private double monthlySalary;

	//constructor emthod 
	public Employee(String firstName, String lastName, double monthlySalary) {
		setFirstName(firstName);
		setLastName(lastName);
		setMonthlySalary(monthlySalary);
		
	}

	//Getters and Setters
	public void setFirstName (String firstName) {
		this.firstName = firstName;

	}

	public String getFirstName() {
		return firstName;

	}

	public void setLastName (String lastName) {
		this.lastName = lastName;

	}

	public String getLastName() {
		return lastName;

	}

	public void setMonthlySalary (double monthlySalary) {
		if (monthlySalary < 0)
			this.monthlySalary = 0.0;
		else 
			this.monthlySalary = monthlySalary;

	}

	public double getMonthlySalary() {
		return monthlySalary;

	}
	
	//Utility Methods 
	public void RaiseSalary (double raiseAmount) {
		monthlySalary += raiseAmount;
		
	}
}