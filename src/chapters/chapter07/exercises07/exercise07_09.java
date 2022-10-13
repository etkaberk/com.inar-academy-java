package chapters.chapter07.exercises07;

import java.util.Scanner;

public class exercise07_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        double[] numbers = new double[10];

        System.out.println("Enter ten numbers: ");

        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }
        double min = getMinNumber(numbers);
        System.out.println("The minimum number is " + min);
    }

    public static double getMinNumber(double[] numbers) {
        double min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i])
                min = numbers[i];
        }
        return min;
    }
}