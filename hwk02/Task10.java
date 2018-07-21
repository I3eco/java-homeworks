package hwk02;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Please enter a number:");
		int a = sc.nextInt();
		int sum = 0;

//		for (int i = 0; i <= a; i++) {
//			sum += i;
//		}
		
//		int i = 0;
//		
//		while (i <= a) {
//			sum += i;
//			i++;
//		}
//
//		System.out.println(sum);
		
		if (a < 1) {
			for (int i = a; i <= 1; i++) {
				sum +=i;
			}
		} else {
			for (int i = 1; i <= a; i++) {
				sum +=i;
			}
		}
		
		System.out.println(sum);
		
	}

}
