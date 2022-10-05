package chapters.chapter05.exercises05;

import java.util.Scanner;

public class Chapter05_16 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = input.nextInt();
		int d = 2 ;
		System.out.println("The smallest factors are : ");

		while(number != 1) {
			if(number % d == 0) {
				System.out.print(d + ", ");
				number /= d ;
			}else
				d++;

		}
	}

}
