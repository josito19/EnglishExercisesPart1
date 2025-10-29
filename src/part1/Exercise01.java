package part1;
import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Declare the variables and creation of the scanner
		Scanner sc = new Scanner(System.in);

		// Declare variables for product prices
		// screen stores the screen price (to be determined by user choice)
		double screen;
		// antivirus stores the fixed antivirus price
		double antivirus = 65.99;
		// printer stores the fixed printer price
		double printer = 125.0;
		// totalPrice stores the sum of all selected product prices (starts with base price)
		double totalPrice = 375.99;
		// choice stores the user's yes/no decisions as boolean values
		boolean choice;
		// answer stores the user's raw input for yes/no questions
		String answer;

		// Ask the user for screen preference and process the choice
		System.out.println("Which screen do you prefer? 38cm or 43cm?");
		// Use ternary operator: if input is not 43, assign 38 to screen, otherwise assign 43
		screen = sc.nextInt() != 43 ? 38 : 43;

		// Convert screen choice to actual price based on size
		if (screen == 43) {
		    screen = 99.99;  // 43cm screen costs 99.99
		} else if (screen == 38) {
		    screen = 75.99;  // 38cm screen costs 75.99
		}

		// Ask user if they want antivirus protection
		System.out.println("Do you want antivirus? yes/no");
		answer = sc.next();
		// Convert yes/no answer to boolean (true for "yes", false for anything else)
		choice = answer.equalsIgnoreCase("yes") ? true : false;
		if (choice) {
		    totalPrice += 65.99;  // Add antivirus price to total if selected
		}

		// Ask user if they want a printer
		System.out.println("Do you want a printer? yes/no");
		answer = sc.next();
		// Convert yes/no answer to boolean
		choice = answer.equalsIgnoreCase("yes") ? true : false;
		if (choice) {
		    totalPrice += 125.0;  // Add printer price to total if selected
		}

		// Add the screen price to the total (screen price was determined earlier)
		totalPrice += screen;

		// Display the final calculated total price to the user
		System.out.println("Your total price is " + totalPrice);

		// Close the scanner to prevent resource leaks
		sc.close();
}

}