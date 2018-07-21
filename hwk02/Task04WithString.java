package hwk02;

import java.util.Scanner;

public class Task04WithString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String yes = "YES";
		String no = "NO";

		System.out.println("Are you sick? Please answer with YES or NO:");
		String sick = sc.next();

		System.out.println("How much money do you have?:");
		double sum = sc.nextDouble();

		if (sick.equals(yes)) {
			if (sum > 0) {
				System.out.println("I will go out to buy some medicines and go back to stay at home.");
			} else {
				System.out.println("I will stay at home and drink some tea.");
			}
		} else if (sick.equals(yes)) { // Ако от тук продължа само с "else" кода работи, но в този случай винаги изкарва последния резултат. Мога ли да получа обяснение защо?
			if (sum <= 0) {
				System.out.println("I will go to a park with some friends.");
			} else if (sum > 0 && sum <= 10) {
				System.out.println("I will go out to drink a coffee.");
			} else {
				System.out.println("I will take my girlfriend to a restaurant!");
			}
		} else {
			System.out.println("You've entered incorrect answer.");
		}

	}

}
