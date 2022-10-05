package chapters.chapter05.exercises05;

import java.util.Scanner;

public class Chapter05_45 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        double sum = 0;
        double n, deviation, mean;
        deviation = 0;

        for (int i = 0; i < 10; i++) {
            n = input.nextDouble();
            sum += n;
            deviation += Math.pow(n, 2);
        }

        mean = sum / 10;
        deviation = Math.sqrt((deviation - (Math.pow(sum, 2) / 10)) / 9);

        System.out.printf(" mean is %1.2f\n standard deviation is %1.5f", mean, deviation);
    }
}
