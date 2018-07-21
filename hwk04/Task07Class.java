package hwk04;

import java.util.Scanner;

public class Task07Class {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		int current = arr[0];
		int next;
		int currentCnt = 1;
		int maxCnt = 0;
		int maxValue = 0;

		for (int i = 1; i < arr.length; i++) {
			next = arr[i];
			if (next == current) {
				currentCnt++;
			} else {
				if (maxCnt < currentCnt) {
					maxCnt = currentCnt;
					maxValue = current;
				}
				currentCnt = 1;
				current = next;
			}
		}
		
		if (maxCnt < currentCnt) {
			maxCnt = currentCnt;
			maxValue = current;
		}
		
		for (int i = 0; i < maxCnt; i++) {
			System.out.print(maxValue + " ");
		}

	}

}
