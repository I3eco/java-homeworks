package hwk01;

import java.util.Scanner;

public class ScreenTryMoreWords {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter your names:");
		String inputText = sc.nextLine();
		
		System.out.println("Please enter your age:");
		int age = sc.nextInt();
		
		System.out.println("Names: " + inputText);		
		System.out.println("Age: " + age);
		
		sc.close();
		
	}

}
