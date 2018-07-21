package hwk04;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		// int i = 0;
		int size = 0;

		// while (i < 1) {
		// System.out.println("Please enter a length for the array which can be divided
		// by 2: ");
		// size = sc.nextInt();
		// if (size % 2 == 0) {
		// i++;
		// }
		// }

		do {
			System.out.println("Please enter even number!:");
			size = sc.nextInt();
		} while (size % 2 != 0 || size <= 0);

		System.out.println("Entered size is: " + size);

		int[] array = new int[size];

		for (int i = 0; i < array.length / 2; i++) {
			System.out.println("Please enter element " + (i + 1) + ":");
			array[i] = sc.nextInt();
			array[array.length / 2 + i] = array[i];
		}

		System.out.println("Result:");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}

	}

}
