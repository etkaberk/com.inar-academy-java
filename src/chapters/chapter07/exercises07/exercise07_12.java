package chapters.chapter07.exercises07;

import java.util.Scanner;

public class exercise07_12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers : ");
        int[] numbers = new int[10];
        for(int i = 0 ; i < numbers.length;i++){
            numbers[i] = input.nextInt();
        }
    reverse(numbers);
        printReverse(numbers);

    }
public static void reverse(int[] numbers){
        int temp;
        for(int i = 0,j = numbers.length - 1; i < numbers.length/2;i++,j--){
            temp = numbers[i];
            numbers[i]=numbers[j];
            numbers[j]=temp;
        }
}

    public static void printReverse(int[] array){
        for(int a : array){
            System.out.print(a + " ");
        }

    }
}
