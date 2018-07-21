package hwk04;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter the array length:");
		int size = sc.nextInt();
		int[] array = new int[size];
		boolean mirror = true;

		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter element " + (i + 1) + ":");
			array[i] = sc.nextInt();
		}

		for (int i = 0; i < array.length / 2; i++) {
			if (array[i] != array[array.length - 1 - i]) {
				mirror = false;
				break;
			}
		}

		if (mirror) {
			System.out.println("The array is mirrored");
		} else {
			System.out.println("The array is not mirrored");
		}

	}

}
