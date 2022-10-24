package chapters.chapter08.exercises08;

import java.util.Scanner;

public class exercise08_11 {
    public static void main(String[] args) {
        int number = getNumberFromUser();

        int[][] binaryNumber = getNumberBinary(number);
        displayAsHeadsAndTails(binaryNumber);

    }
public static void displayAsHeadsAndTails(int[][] binaryNumber){
    for (int i = 0; i < binaryNumber.length; i++) {
        for (int j = 0; j < binaryNumber[i].length; j++) {
            if(binaryNumber[i][j] == 0){
                System.out.print("H ");
            }else{
                System.out.print("T ");
            }

        }
        System.out.println();
    }
}
public static int[][] getNumberBinary(int number) {
    int[][] binary = new int[3][3];
    String binaryValue = "";
    while (number != 0) {
        binaryValue = ((number % 2) + binaryValue);
        number /= 2;
    }
    int binaryValuesLength = binaryValue.length() - 1;
    for (int i = 2; i >= 0; i--) {
        for (int j = 2; j >= 0; j--) {
            binary[i][j] = binaryValue.charAt(binaryValuesLength);
            binaryValuesLength--;
        }
        if (binaryValuesLength < 0) {
            break;
        }
    }
    return binary;
}
public static int getNumberFromUser(){
    Scanner input = new Scanner(System.in);
    while (true){
        System.out.println("Enter a number between 0 - 511  :  " );
        int number = input.nextInt();
        if(0 <= number && number < 512){
            return number;
        }
    }
}


}