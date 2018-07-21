package hwk04;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		boolean checkLength = false;
		boolean checkSame = true;

		System.out.println("Please enter first array length:");
		int fSize = sc.nextInt();

		int[] fArray = new int[fSize];

		System.out.println("Please enter first array elements:");

		for (int i = 0; i < fArray.length; i++) {
			fArray[i] = sc.nextInt();
		}

		System.out.println("Please enter second array length:");
		int sSize = sc.nextInt();

		int[] sArray = new int[sSize];

		System.out.println("Please enter second array elements:");

		for (int i = 0; i < sArray.length; i++) {
			sArray[i] = sc.nextInt();
		}

		if (fArray.length == sArray.length) {
			checkLength = true;
			for (int i = 0; i < fArray.length; i++) {
				if (fArray[i] != sArray[i]) {
					checkSame = false;
				}
			}
		} else {
			checkSame = false;
		}

		if (checkSame == true) {
			System.out.println("The arrays are the same.");
		} else {
			System.out.println("The arrays are not the same.");
		}
		if (checkLength == true) {
			System.out.println("The arrays are with the same length.");
		} else {
			System.out.println("The arrays are not with the same length.");
		}

	}

}
