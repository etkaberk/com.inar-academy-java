package chapters.chapter07.exercises07;
import java.util.Scanner;
public class exercise07_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter ten numbers :  ");
        double[] numbers = new double[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextDouble();
        }
        double average = average(numbers);
        System.out.println("the average is " + average);
    }

    public static int average(int[] array) {
        int average;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;
        return average;
    }

    public static double average(double[] array) {
        double average;
        double sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        average = sum / array.length;
        return average;
    }
}


