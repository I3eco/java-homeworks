package hwk14;

public class DevideArrays {
	public static int[] devideArrays(int[] a1, int[] a2) {
		int length;
		if (a1.length >= a2.length) {
			length = a2.length;
		} else {
			length = a1.length;
		}
		int[] a3 = new int[length];

		for (int i = 0; i < a1.length; i++) {
			try {
				a3[i] = a1[i] / a2[i];
			} catch (ArithmeticException ae) {
				a3[i] = 43;
			} catch (IndexOutOfBoundsException iob) {

			}
		}
		return a3;
	}
}
