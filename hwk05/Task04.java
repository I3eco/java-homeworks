package hwk05;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();
		int value = 1;
		int[][] matrix = new int[rows][cols];
		int maxCol = cols;
		int minCol = 0;
		int maxRow = rows;
		int minRow = 0;

		while (cols*rows > value) {
			for (int i = minCol; i < maxCol && cols*rows >= value; i++) {
				matrix[minRow][i] = value;
				value++;
			}
			minRow++;

			for (int i = minRow; i < maxRow && cols*rows >= value; i++) {
				matrix[i][maxCol - 1] = value;
				value++;
			}
			maxCol--;

			for (int i = maxCol - 1; i >= minCol && cols*rows >= value; i--) {
				matrix[maxRow - 1][i] = value;
				value++;
			}
			maxRow--;

			for (int i = maxRow - 1; i >= minRow && cols*rows >= value; i--) {
				matrix[i][minCol] = value;
				value++;
			}
			minCol++;
		}

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				System.out.print(matrix[i][j] + "\t");
			}
			System.out.println("\n");
		}

	}
}
