package part1;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Creation of the scanner and the variables
		Scanner sc = new Scanner(System.in);
		int hour;
		int minute;
		// mirrored time is the first given
		int hourMirrored;
		int minuteMirrored;

		System.out.println("Introduce hours and minutes: ");
		hourMirrored = sc.nextInt();
		minuteMirrored = sc.nextInt();

		// Calculation of minutes and hours
		if (minuteMirrored == 0) {
			if (hourMirrored == 12) {
				hour = 12;
				minute = 0;
			} else {
				minute = 0;
				hour = 12 - hourMirrored;
			}
		} else {
			if (hourMirrored == 12) {
				hour = 11;
				minute = 60 - minuteMirrored;
			} else {
				minute = 60 - minuteMirrored;
				hour = 11 - hourMirrored;
			}
		}

		// Print hour and minutes
		if (hour < 10) {
			System.out.println("0");
		}
		System.out.println(hour + " : ");
		if (minute < 10) {
			System.out.println("0");
		}
		System.out.println(minute);

		sc.close();
	}

}
