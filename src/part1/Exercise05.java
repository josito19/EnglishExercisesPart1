package part1;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		// Creation of the scanner and the variables
		Scanner sc = new Scanner(System.in);

		double velocity = 0;
		double displacement = 0;
		double time = 0;

		String type1;
		String type2;
		double value1;
		double value2;

		// Input data
		System.out.println("Give me one type of data (V, D or T): ");
		type1 = sc.next().toUpperCase();
		System.out.println("Give the value for that data: ");
		value1 = sc.nextDouble();

		System.out.println("Give me another type of data (V, D or T): ");
		type2 = sc.next().toUpperCase();
		System.out.println("Give the value for that data: ");
		value2 = sc.nextDouble();

		// Assign values depending on the type
		if (type1.equals("V")) {
			velocity = value1;
		} else if (type1.equals("D")) {
			displacement = value1;
		} else if (type1.equals("T")) {
			time = value1;
		} else {
			System.out.println("Try again");
		}

		if (type2.equals("V")) {
			velocity = value2;
		} else if (type2.equals("D")) {
			displacement = value2;
		} else if (type2.equals("T")) {
			time = value2;
		} else {
			System.out.println("Try again");
		}

		// Calculation depending on which value is missing
		if (velocity == 0) {
			velocity = displacement / time;
			System.out.println("RESULT: V = " + velocity);
		} else if (displacement == 0) {
			displacement = velocity * time;
			System.out.println("RESULT: D = " + displacement);
		} else if (time == 0) {
			time = displacement / velocity;
			System.out.println("RESULT: T = " + time);
		}

		sc.close();
	}

}
