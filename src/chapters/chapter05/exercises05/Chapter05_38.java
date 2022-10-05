package chapters.chapter05.exercises05;

import java.util.Scanner;

public class Chapter05_38 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal value: ");
        int decimal = input.nextInt();

        String octalValue = "";
        System.out.print(decimal + " corresponding octal value is ");

        while(decimal != 0){
            octalValue = (decimal % 8) + octalValue;
            decimal /= 8;
        }

        System.out.print(octalValue);

    }
}
