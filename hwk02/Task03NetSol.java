package hwk02;

import java.util.Scanner;

public class Task03NetSol {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter three integers: ");

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}

		if (b < c) {
			int temp = b;
			b = c;
			c = temp;
		}

		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}

		System.out.println(a + " " + b + " " + c);
	}

}
