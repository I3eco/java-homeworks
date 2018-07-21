package hwk02;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter first integer:");
		int a = sc.nextInt();

		System.out.println("Please enter second integer:");
		int b = sc.nextInt();

		if (a <= b) {
			for (int c = a; c <= b; c++) {
				System.out.print(c + " ");
			}
		} else {
			for (int c = b; c <= a; c++) {
				System.out.print(c + " ");
			}
		}

//		if (b > a) {
//			int tmp = a;
//			a = b;
//			b = tmp;
//		}
//
//		for (int c = a; c <= b; c++) {
//			System.out.print(c + " ");
//
//		}
	}
}
