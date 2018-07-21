package hwk02;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("You are sick:");
		boolean sick = sc.nextBoolean();

		System.out.println("How much money do you have?:");
		double sum = sc.nextDouble();

//		if (sick == true) e ekvivalentno na if (sick) 
//		if (sick == false) e ekvivalentno na if (!sick) 
			
		if (sick == true) {
			if (sum > 0) {
				System.out.println("I will go out to buy some medicines and go back to stay at home.");
			} else {
				System.out.println("I will stay at home and drink some tea.");
			}
		} else {
			if (sum <= 0) {
				System.out.println("I will go to a park with some friends.");
			} else if (sum > 0 && sum <= 10) {
				System.out.println("I will go out to drink a coffee.");
			} else {
				System.out.println("I will take my girlfriend to a restaurant!");
			}
		}
		
	}
	
}
