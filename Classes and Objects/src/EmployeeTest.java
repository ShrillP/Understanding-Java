import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee ("Shrill", "Patel", 1500);
		Employee employee2 = new Employee ("Sam", "Smith", -2300);
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Enter employee 1's first name:");
		String firstName = input.next();
		
		System.out.println("Enter employee 1's last name:");
		String lastName = input.next();
		
		employee1.setFirstName(firstName);
		employee1.RaiseSalary(100);
		
		System.out.println(employee1.getFirstName());
		System.out.println(employee1.getMonthlySalary());
		
		System.out.println("Enter employee 2's first name:");
		String firstName1 = input.next();
		
		System.out.println("Enter employee 2's last name:");
		String lastName1 = input.next();
		
		employee2.setFirstName(firstName);
		employee2.RaiseSalary(500);
		
		System.out.println(employee2.getFirstName());
		System.out.println(employee2.getMonthlySalary());

	}
}