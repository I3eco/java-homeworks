package hwk04;

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter an array length:");
		int size = sc.nextInt();

		int[] firstArr = new int[size];
		int[] secondArr = new int[size];

		System.out.println("Please enter the array elements:");

		for (int i = 0; i < firstArr.length; i++) {
			firstArr[i] = sc.nextInt();
		}

		if (size >= 2) {
			System.out.print("The new array is: {");

			for (int i = 0; i < secondArr.length; i++) {
				if (i == 0) {
					secondArr[i] = firstArr[i + 1];
					System.out.print(secondArr[i] + ", ");
				} else if (i == secondArr.length - 1) {
					secondArr[i] = firstArr[i - 1];
					System.out.print(secondArr[i] + "}");
				} else {
					secondArr[i] = firstArr[i - 1] + firstArr[i + 1];
					System.out.print(secondArr[i] + ", ");
				}
			}
		} else {
			System.out.println("Invalid array size:");
		}

	}

}
