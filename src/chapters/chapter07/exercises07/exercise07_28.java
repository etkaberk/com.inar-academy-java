package chapters.chapter07.exercises07;

import java.util.Scanner;

public class exercise07_28 {
    public static void main(String[] args) {
        int[] numbers = getFromUser();
        displayCombinations(numbers);
    }
public static void displayCombinations(int[] numbers){
        for(int i = 0;i < numbers.length - 1 ; i++){
            for (int j = i; j < numbers.length ; j++) {
                System.out.println("("+ numbers[i] + " , "+ numbers[j] + ")");
            }
        }
}
public static int[] getFromUser(){
    Scanner input = new Scanner(System.in);
    int[] n = new int[10];
    System.out.println("Enter 10 integers : ");
    for (int i = 0; i < n.length; i++) {
      n[i] =input.nextInt();
    }
return n;
    }
}
