package hwk01;

import java.util.Scanner;

public class Task5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a Fahrenheit degree:");
		
		int a = sc.nextInt();
		float b = (a - 32)*5.f/9;
		
		System.out.println("The converted value in Celsius is: " + b);
		
		sc.close();

	}

}
