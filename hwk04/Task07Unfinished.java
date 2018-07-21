package hwk04;

import java.util.Scanner;

public class Task07Unfinished {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter an array length:");
		int size = sc.nextInt();

		int[] array = new int[size];
		int[] memo = new int[size];
		int sum1 = 0;
		int sum2 = 0;
		int a = 0;

		System.out.println("Please enter the array elements:");

		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}

		for (int i = 1; i < array.length; i++) {
			if (i == 0) {
				if (array[i] == array[i + 1]) {
					memo[a] = array[i];
					a++;
					sum1++;
				}
			} else if (i == array.length - 1) {
				if (array[i] == array[i - 1]) {
					memo[a] = array[i];
					a++;
					sum1++;
				}
			} else {
				if (array[i] == array[i + 1] || array[i] == array[i - 1]) {
					memo[a] = array[i];
					a++;
					sum1++;
				}
			}
			if (sum1 >= sum2) {
				sum2 = sum1;
				sum1 = 0;
			} else {
				a = 0;
				sum1 = 0;
			}
		}

		System.out.println("The maximum row is:");

		for (int i = 0; i < sum2; i++) {
			System.out.print(memo[i] + " ");
		}

	}

}
