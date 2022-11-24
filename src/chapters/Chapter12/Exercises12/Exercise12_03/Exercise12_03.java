package chapters.Chapter12.Exercises12.Exercise12_03;

import java.util.Scanner;

public class Exercise12_03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = new int[100];
        fillTheArray(arr);
        System.out.print("Enter the index of the array : ");
        int i;
        try {
            i = input.nextInt();
            System.out.println("Array element in the index of " + i + " is " + arr[i]);
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            System.out.println("Ouf of boundry ...");
        }
    }

    public static void fillTheArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 200);
        }
    }


}
