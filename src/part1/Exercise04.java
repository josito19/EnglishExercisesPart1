package part1;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Creation of the scanner and variables
		Scanner sc = new Scanner(System.in);

		// Declare constants for the coins
		final int EUR_2 = 200;
		final int EUR_1 = 100;
		final int CENT_50 = 50;
		final int CENT_20 = 20;
		final int CENT_10 = 10;
		final int CENT_5 = 5;
		final int CENT_2 = 2;
		final int CENT_1 = 1;

		// variables to store change so we can print it later
		int num2Eur;
		int num1Eur;
		int num50;
		int num20;
		int num10;
		int num5;
		int num2;
		int num1;

		// Variables for both price and quantity in cents
		int pay;
		int coins;
		// change stores the amount of coins to be returned
		int change;

		// Ask to the user for prize to be paid and coins given
		System.out.println("Introduce the quantity to pay:");
		pay = sc.nextInt();
		System.out.println("Introduce coins given:");
		coins = sc.nextInt();

		// Calculate change
		change = coins - pay;

		// Calculate number of coins for each type
		num2Eur = change / EUR_2;
		change = change % EUR_2;

		num1Eur = change / EUR_1;
		change = change % EUR_1;

		num50 = change / CENT_50;
		change = change % CENT_50;

		num20 = change / CENT_20;
		change = change % CENT_20;

		num10 = change / CENT_10;
		change = change % CENT_10;

		num5 = change / CENT_5;
		change = change % CENT_5;

		num2 = change / CENT_2;
		change = change % CENT_2;

		num1 = change / CENT_1;

		// Print results
		System.out.println("Change to return:");
		System.out.println("2€ coins: " + num2Eur);
		System.out.println("1€ coins: " + num1Eur);
		System.out.println("50c coins: " + num50);
		System.out.println("20c coins: " + num20);
		System.out.println("10c coins: " + num10);
		System.out.println("5c coins: " + num5);
		System.out.println("2c coins: " + num2);
		System.out.println("1c coins: " + num1);

		sc.close();
	}

}
