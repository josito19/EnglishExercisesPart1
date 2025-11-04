package part1;
import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Create Scanner and variables
		Scanner sc = new Scanner(System.in);

		String accountInput;
		char accountType = 0;
		double amount;
		double interestRate = 0.0;
		String accountName = "";
		// Display welcome message and account options
		System.out.println("Account Types Available:");
		System.out.println("A - 1.5% annual interest");
		System.out.println("B - 2.0% annual interest");
		System.out.println("C - 1.0% annual interest");
		System.out.println("X - 5.0% annual interest");

		accountInput = sc.nextLine();
		accountType = accountInput.toUpperCase().charAt(0);

		// Prompt user for deposit amount
		System.out.print("Enter amount of money: $");
		amount = sc.nextDouble();

		// Use switch statement to determine interest rate based on account type
		switch (accountType) {
		case 'A':
			interestRate = 0.015; // 1.5% interest
			accountName = "A";
			break;
		case 'B':
			interestRate = 0.020; // 2.0% interest
			accountName = "B";
			break;
		case 'C':
			interestRate = 0.010; // 1.0% interest
			accountName = "C";
			break;
		case 'X':
			interestRate = 0.050; // 5.0% interest
			accountName = "X";
			break;
		default:
			System.out.println("Please enter A, B, C, or X.");
			sc.close();

		}

		// Calculate interest earned
		double interestEarned = amount * interestRate;
		double totalAmount = amount + interestEarned;

		// Display results
		System.out.println("Account Type: " + accountName);
		System.out.println("Initial Deposit: " + amount);
		System.out.println("Annual Interest Rate: " + interestRate * 100);
		System.out.println("Interest Earned in 1 Year: " + interestEarned);
		System.out.println("Total Amount After 1 Year: " + totalAmount);

		// Close the scanner
		sc.close();

	}

}
