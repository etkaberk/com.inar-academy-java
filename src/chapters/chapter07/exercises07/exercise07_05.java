package chapters.chapter07.exercises07;

import java.util.Scanner;

public class exercise07_05 {
    public static void main(String[] args) {
        int[] number = getAnArrayFromUser();
        int[] distinctNumbers = new int[10];
        int countOfDistinct = 0;
        for (int i = 0; i < number.length; i++) {
            if (contains(distinctNumbers, number[i], countOfDistinct)) {
                distinctNumbers[countOfDistinct] = number[i];
                countOfDistinct++;
            }
        }
        displayArray(distinctNumbers, countOfDistinct);
    }

    public static int[] getAnArrayFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers : ");
        int[] number = new int[10];
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();
        }
        return number;

    }

    public static void displayArray(int[] numbers, int count) {
        System.out.println("the number of distinct number is  " + count);
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
    }

    public static boolean contains(int[] numbers, int number, int countOfDistinctNumbers) {
        for (int i = 0; i < countOfDistinctNumbers; i++) {
            if (numbers[i] == number)
                return false;
        }
        return true;
    }
}
