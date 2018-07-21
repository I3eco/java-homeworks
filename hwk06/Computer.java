package hwk06;

import java.util.Scanner;

public class Computer {
	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;

	void changeOperationSystem(String newOperationSystem) {
		operationSystem = newOperationSystem;
	}

	void useMemory(double memory) {
		Scanner sc = new Scanner(System.in);
		if (memory < 0) {
			System.out.println("Please enter a positive number:");
			memory = sc.nextDouble();
		}
		if (memory > freeMemory) {
			System.out.println("Not enought memory!");
		} else {
			freeMemory -= memory;
		}
		sc.close();
	}
}
