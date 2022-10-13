package chapters.chapter07.exercises07;

import java.util.Scanner;

public class exercise07_10 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[10];
        System.out.println("enter ten numbers : ");
        for(int i = 0;i < numbers.length;i++ ){
            numbers[i] = input.nextDouble();
        }
        System.out.println("the index of smallest element : " + indexOfSmallestElement(numbers));
    }
public static int indexOfSmallestElement(double[] numbers){
        if(numbers.length <= 1){
            return 0;
        }
double min = numbers[0];
        int smallestIndex = 0;
        for(int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
                smallestIndex = i;
            }
        }
    return smallestIndex;
    }
}
