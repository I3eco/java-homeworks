package hwk02;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter A:");
		int a = sc.nextInt();

		System.out.println("Please enter B:");
		int b = sc.nextInt();

		int sum = 0;

		for (int i = a; (i <= b) && (sum <= 200); i++) {
			if (i % 3 == 0) {
				System.out.print("skip " + i + ", ");
			} else {
				sum += i * i;
				System.out.print(i * i + ", ");
			}
		}

		// int i = a;
		//
		// do {
		// if (i % 3 == 0) {
		// System.out.print("skip " + i + ", ");
		// } else {
		// sum += i * i;
		// System.out.print(i * i + ", ");
		// }
		// i++;
		// } while ((i < b) && (sum <= 200));

	}

}
