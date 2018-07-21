package hwk02;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter A:");
		double a = sc.nextDouble();

		System.out.println("Please enter B:");
		double b = sc.nextDouble();

		System.out.println("Please enter C:");
		double c = sc.nextDouble();

		if ((a < c && b > c) || (a > c && b < c)) {
			System.out.println("C is between A and B.");
		} else {
			System.out.println("C isn't between A and B.");
		}

		// syso - sled koeto enter e za byrzo vyvejdane na System.out.println();
	}

}
