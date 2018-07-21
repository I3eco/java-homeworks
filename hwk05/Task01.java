package hwk05;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int value = 1;

		int[][] matrix = new int[rows][cols];

		for (int i = 0; i < cols; i++) {
			for (int j = 0; j < rows; j++) {
				matrix[j][i] = value;
				value++;
			}
		}
		
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println();
		}

	}

}
