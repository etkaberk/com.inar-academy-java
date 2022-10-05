package chapters.chapter05.exercises05;

public class Chapter05_07 {

	public static void main(String[] args) {
		int year = 1;
		int tuition = 10000;
		int total = 0;

		while (year <= 10) {

			tuition += (tuition * 0.05);
			year++;
		}

		System.out.println("Tuition in 10 years: $" + tuition);
		while (year <= 14) {
			tuition += (tuition * 0.05);
			total += tuition;
			year++;
		}
		System.out.println("Total cost for 4 years' tuition  $" + total);
		
		
		
		
	}

}
