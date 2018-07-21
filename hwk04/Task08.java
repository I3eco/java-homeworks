package hwk04;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter an array length:");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		
		System.out.println("Please enter the array elements:");
		
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		
		for (int i = 0; i < array.length / 2; i++) {
			int a = array[i];
			array[i] = array[array.length - 1 -i];
			array[array.length - 1 - i] = a;
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		

	}

}
