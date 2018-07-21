package hwk01;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int sum = a + b;
		int diff = a - b;
		int mul = a*b;
		int mod = a%b;
		int div = a/b;
		
		System.out.println(sum);
		System.out.println(diff);
		System.out.println(mul);
		System.out.println(mod);
		System.out.println(div);
		
		sc.close();
		
//		int a = 4;
//		int b = a - 1;
//				
//		int c = a + b;
//		int d = a - b;
//		int e = a * b;
//		int f = a % b;
//		int j = a / b;
//		
//		System.out.println("Aritmetic operations with integers:");
//		System.out.println(c);
//		System.out.println(d);
//		System.out.println(e);
//		System.out.println(f);
//		System.out.println(j);
//
//		System.out.println(""
//				+ "");
//		
//		float x = 7.89F;
//		float y = 1.23F;
//		
//		float z = x + y;
//		float t = x - y;
//		float u = x * y;
//		float v = x / y;
//		
//		System.out.println("Aritmetic operations with floats:");
//		System.out.println(z);
//		System.out.println(t);
//		System.out.println(u);
//		System.out.println(v);
		
	}

}
