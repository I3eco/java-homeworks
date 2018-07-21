package hwk04;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the array length:");
		int size = sc.nextInt();

		int[] array = new int[size];
		int sum = array[0];

		for (int i = 0; i < array.length; i++) {
			System.out.println("Please enter element " + (i + 1) + ":");
			array[i] = sc.nextInt();

			if (array[i] % 3 == 0 && sum > array[i]) {
				sum = array[i];
			}
		}

		System.out.println("The smallest number divided by 3 is:" + sum);

	}

}
