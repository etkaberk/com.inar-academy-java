package chapters.chapter07.exercises07;

import java.util.Scanner;

public class exercise07_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers :");
        double[] numbers = new double[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        double mean = getMean(numbers);
        double deviation = getDeviation(numbers);
        System.out.println("the mean is :  " + mean);
        System.out.println("the deviation is :  " + deviation);
    }

    public static double getDeviation(double[] numbers) {
        double mean = getMean(numbers);
        double deviation;
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Math.pow(numbers[i] - mean, 2);
        }

        deviation = Math.sqrt(sum / (numbers.length - 1));
        return deviation;
    }

    public static double getMean(double[] numbers) {
        double sum = 0;
        double mean;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        mean = sum / numbers.length;
        return mean;
    }
}

