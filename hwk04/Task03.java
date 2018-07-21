package hwk04;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a number:");
		int a = sc.nextInt();
		int b = a;
		int c;

		int[] array = new int[10];
		array[0] = a;
		array[1] = array[0];

		System.out.print(array[0] + " " + array[1] + " ");

		for (int i = 0; i < 8; i++) {
			c = a + b;
			a = b;
			b = c;
			array[i + 2] = c;
			System.out.print(array[i + 2] + " ");
		}

	}

}
