package hwk01;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int tmp = c;
		
		c = b;
		b = a;
		a = tmp;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		sc.close();

//		int a1 = 1;
//		int a2 = 2;
//		int a3 = 3;
//		
//		System.out.println("Before: " + "a1 = " + a1 + "; a2 = " + a2 + "; a3 = " + a3 + ";");
//		
//		System.out.println(""
//				+ "");
//		
//		a2 = a2 + a3;
//		a3 = a2 - a3;
//		a2 = a2 - a3;
//		a1 = a1 + a3;
//		a3 = a1 - a3;
//		a1 = a1 - a3;
//		
//		// зползвайки логиката, която открих в интернет за Задача 2, Метод 2
//		
//		System.out.println("After:  " + "a1 = " + a1 + "; a2 = " + a2 + "; a3 = " + a3 + ";");
		
	}

}
