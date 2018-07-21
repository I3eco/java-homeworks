package hwk14;

public class DemoDevideArrays {
	public static void main(String[] args) {
		int[] b1 = {8, 3, 10, 24, 0, 4, 7, 14};
		int[] b2 = {4, 0, 5, 3, 9, 4};
		int[] b3 = {28, 33, 120, 245, 0, 4};
		int[] b4 = {14, 0, 55, 33, 9, 24, 17, 114};
		
		int[] b5 = DevideArrays.devideArrays(b1, b2);
		int[] b6 = DevideArrays.devideArrays(b3, b4);
		
		for (int i = 0; i < b5.length; i++) {
			System.out.print(b5[i] + "\t");
		}
		System.out.println();
		System.out.println("-----------------------------------------");
		for (int i = 0; i < b6.length; i++) {
			System.out.print(b6[i] + "\t");
		}
	}
}
