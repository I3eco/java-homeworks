package hwk02;

import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a number:");
		int n = sc.nextInt();
		// int sum = 0;

		// int i = 1;
		//
		// while (i <= n) {
		// if (n % i == 0) {
		// sum++;
		// }
		// i++;
		// }

		// for (int i = 1; i <= n; i++) {
		// if (n % i == 0) {
		// sum++;
		// }
		// }
		//
		// if (sum == 2) {
		// System.out.println("Your number is simple.");
		// } else {
		// System.out.println("Your number in NOT simple.");
		// }
		boolean isPrime = true;
		for (int i = 2; i < n / 2; i++) {  // Math.sqrt(n) - koren kvadraten na n
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime) {
			System.out.println("Number is prime");
		} else {
			System.out.println("Number is not prime");
		}

	}
}
