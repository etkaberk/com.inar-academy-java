package chapters.chapter05.exercises05;

public class Chapter05_25 {

	public static void main(String[] args) {
		double pi = 0;
		for (int i = 1; i < 11; i++) {
			for (int j = 1; j <= 10000 * i; j++) {
				pi += Math.pow(-1, j + 1) / (2 * j - 1);
			}
			System.out.println("for 'i = " + (10000 * i) + "'" + " PI is " + (pi * 4));
			pi = 0;
			System.out.printf("\n");
		}
	}

}
