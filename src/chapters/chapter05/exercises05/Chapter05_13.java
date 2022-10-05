package chapters.chapter05.exercises05;

public class Chapter05_13 {

	public static void main(String[] args) {
		int n = 100  ;

		while (Math.pow(n, 3) > 12000) {
			n--;


		}		System.out.println("The " + n + " is the largest integer such that n^3 < 12,000 ");



	}

}
