package part1;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Declare the variables and creation of the scanner
		Scanner sc = new Scanner(System.in);

		// Declare variables for product prices
		// screen stores the screen price
		double screen;

		// totalPrice stores the sum of all selected product prices
		double totalPrice = 375.99;
		// choice stores the user's yes/no decisions
		boolean choice;
		// answer stores the users answer
		String answer;

		// Ask the user for screen preference
		System.out.println("Which screen do you prefer? 38cm or 43cm?");
		// if input is not 43, assign 38 to screen, otherwise assign 43
		screen = sc.nextInt() != 43 ? 38 : 43;

		// Convert screen choice to actual price based on size
		if (screen == 43) {
			screen = 99.99;
		} else if (screen == 38) {
			screen = 75.99;
		}

		// Ask user if they want antivirus
		System.out.println("Do you want antivirus? yes/no");
		answer = sc.next();
		// Convert yes/no answer to boolean
		choice = answer.equalsIgnoreCase("yes") ? true : false;
		if (choice) {
			totalPrice += 65.99;
		}

		// Ask user if they want a printer
		System.out.println("Do you want a printer? yes/no");
		answer = sc.next();
		// Convert yes/no answer to boolean
		choice = answer.equalsIgnoreCase("yes") ? true : false;
		if (choice) {
			totalPrice += 125.0;
		}

		// Add the screen price to the total
		totalPrice += screen;

		// Display the final price
		System.out.println("Your total price is " + totalPrice);

		// Close the scanner
		sc.close();
	}

}