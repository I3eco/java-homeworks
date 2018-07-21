package hwk01;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int tmp;
		tmp = a;
		a = b;
		b = tmp;
		
		System.out.println("A value: " + a);
		System.out.println("B value: " + b);
		
		sc.close();
		
//		int a = 9;
//		int b = 3;
//		
//		System.out.println("Method 1:");		
//		System.out.println("Before: " + "a = " + a + " and " + "b = " + b);
//		
//		int c;
//		
//		c = a;
//		a = b;
//		b = c;
//		
//		// Това е начина до който достигнах сам.
//		
//		System.out.println("After: " + "a = " + a + " and " + "b = " + b);
//		
//		System.out.println(""
//				+ "");
//		
//		System.out.println("Method 2:");
//		System.out.println("Before: " + "a = " + a + " and " + "b = " + b);
//		
//		a = a + b;
//		b = a - b;
//		a = a - b;
//		
//		// Този го открих в интернет, след като прочетох задача номер 3 и предположих, че трябва да има начин без да се използва 3-та променлива.
//		
//		System.out.println("After: " + "a = " + a + " and " + "b = " + b);
		
	}

}
