package chapters.chapter05.exercises05;

public class Chapter05_19 {

	public static void main(String[] args) {
		
		int n = 8;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= (n - i) * 4; j++) {
				System.out.print(" ");
			}

			for (int k = 0; k < i; k++) {
				System.out.printf("%4d", (int) Math.pow(2, k));
			}
			for (int m = 1; m <= i - 1; m++) {
				System.out.printf("%4d", (int) Math.pow(2, i - m - 1));

			}

			System.out.println();
		}
		
		
	}

}
