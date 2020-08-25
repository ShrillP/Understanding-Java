import java.util.Scanner;

public class E15_FahrenheitCelsius {

	public static void main (String args []) {

		//Variables 
		Scanner input = new Scanner (System.in);
		int selection;
		double temp;

		//Prompt user to enter what they want to convert to 
		System.out.println("What temperature unit would you like to convert to:");
		System.out.println("[1] To Fahrenheit");
		System.out.println("[2] To Celsius");
		selection = input.nextInt();

		//If user entered 1 
		if (selection == 1) {

			System.out.println("Enter a Celcius value:");
			temp = input.nextDouble();
			System.out.println("The temperature in Fahrenheit is " +  fahrenheit(temp));

			//Otherwise
		} else if (selection == 2) {

			System.out.println("Enter a Fahrenheit value:");
			temp = input.nextDouble();
			System.out.println("The temperature in Celsius is " +  celsius(temp));

		}
	}

	//Converts to Celsius 
	public static double celsius (double fahrenheit) {

		return 5.0 / 9.0 * (fahrenheit - 32);
	}

	//Converts to Fahrenheit 
	public static double fahrenheit (double celsius) {

		return 9.0 / 5.0 * (celsius + 32);
	}
}