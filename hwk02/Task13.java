package hwk02;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number:");
		int n = sc.nextInt();
		int t = n - 1;
		
		for (int j = 0; j < n; j++) {
			for (int i = 0; i < n; i++) {
				System.out.print(t);
			}
			System.out.println();
			t += 2;
		}

	}

}
