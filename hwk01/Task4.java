package hwk01;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a Celsius degree:");
		
		int a = sc.nextInt();
		float b = a*9.f/5 + 32; // .f - слага се за да се конвертне правилно формулата
		
		System.out.println("The converted value in Fahrenheit is: " + b);
		
		sc.close();

	}

}
