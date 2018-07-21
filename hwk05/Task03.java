package hwk05;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int rows = sc.nextInt();
		int cols = sc.nextInt();

		int[][] matrix = new int[rows][cols];

		int value = 1;

		for (int startIdxX = rows - 1, startIdxY = 0; startIdxX >= 0 && startIdxY < cols; ) { // v poleto za inkrementaciqta moje da  e prazno

			for (int i = startIdxX, j = startIdxY; i < rows && j < cols; i++, j++) {
				matrix[i][j] = value;
				value++;
			}
			if (startIdxX > 0) { // i samata inkrementaciq da se izvyrshva tuk s uslovie
				startIdxX--;
			} else {
				startIdxY++;
			}
		}

		//my option (too long)
		// if (rows > cols) {
		// for (int i = rows - 1; i >= 0; i--) {
		// for (int j = 0; j < rows - i; j++) {
		// matrix[i + j][j] = value;
		// value++;
		// if (j >= cols - 1) {
		// break;
		// }
		// }
		// }
		// } else {
		// for (int i = cols - 1; i >= 0; i--) {
		// for (int j = 0; j < rows - i; j++) {
		// matrix[i + j][j] = value;
		// value++;
		// if (j >= cols - 1) {
		// break;
		// }
		// }
		// }
		// }
		//
		// if (rows > cols) {
		// for (int i = 1; i < rows; i++) {
		// for (int j = 0; j < cols - i; j++) {
		// matrix[j][i + j] = value;
		// value++;
		// if (j >= rows - 1) {
		// break;
		// }
		// }
		// }
		// } else {
		// for (int i = 1; i < cols; i++) {
		// for (int j = 0; j < cols - i; j++) {
		// matrix[j][i + j] = value;
		// value++;
		// if (j >= rows - 1) {
		// break;
		// }
		// }
		// }
		// }
		//
		for (int k = 0; k < rows; k++) {
			for (int l = 0; l < cols; l++) {
				System.out.print(matrix[k][l] + "\t");
			}
			System.out.println("\n");
		}

	}

}
