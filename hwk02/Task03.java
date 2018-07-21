package hwk02;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter three numbers:");

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		if (a > b && b > c) {
			System.out.print(a + "  " + b + "  " + c);
		} else if (c > b && b > a) {
			System.out.print(c + "  " + b + "  " + a);
		} else if (a > c && c > b) {
			System.out.print(a + "  " + c + "  " + b);
		} else if (c > a && a > b) {
			System.out.print(c + "  " + a + "  " + b);
		} else if (b > a && a > c) {
			System.out.print(b + "  " + a + "  " + c);
		} else {
			System.out.print(b + "  " + c + "  " + a);
		}

	}
}
