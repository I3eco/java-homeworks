package hwk07;

import java.util.Scanner;

public class Computer {
	int year;
	double price;
	boolean isNotebook;
	double hardDiskMemory;
	double freeMemory;
	String operationSystem;

	Computer() {
		this.isNotebook = false;
		this.operationSystem = "Win XP";
	}

	Computer(int year, double price, double hardDiskMemory, double freeMemory) {
		this();
		this.year = year;
		this.price = price;
		this.hardDiskMemory = hardDiskMemory;
		this.freeMemory = freeMemory;
	}

	Computer(int year, double price, boolean isNotebook, double hardDiskMemory, double freeMemory,
			String operationSystem) {
		this(year, price, hardDiskMemory, freeMemory);
		this.isNotebook = isNotebook;
		this.operationSystem = operationSystem;
	}

	int comparePrice (Computer c) {
		if (this.price > c.price) {
			return -1;
		} else if (this.price == c.price) {
			return 0;
		} else {
			return 1;
		}
	}

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
