// import java.util.*;

class NegativeException {
	public static void main(String args[]) {
		int n, i;
		float sum = 0, avg;

		try {
			n = Integer.parseInt(args[0]);
			if (n <= 0) {
				throw new IllegalArgumentException();
			} else {
				for (i = 1; i <= n; i++) {
					sum = sum + i;
				}
				avg = sum / n;
				System.out.println("Average is: " + avg);
			}
		} catch (IllegalArgumentException e) {
			System.out.println("InvalidNumberException");
		}
	}
}