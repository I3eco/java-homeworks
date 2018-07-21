package hwk02;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a number:");
		int n = sc.nextInt();

//		for (int i = 3; i <= n * 3; i++) {
//			if (i % 3 == 0) {
//				System.out.print(i + ", ");
//			}
//		}
		
		for (int i = 3; i <= n; i++) {
			System.out.print(i*3 + ", ");
		}

	}

}
