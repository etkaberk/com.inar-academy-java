package chapters.chapter07.exercises07;

import java.util.Scanner;

public class exercise07_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers for learn gcd :");
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int gcd = gcd(numbers);
        System.out.println("gcd is : "+ gcd);
    }

    public static int gcd(int... numbers){
        int gcd = 1 ;
        int divisor = 2;
        boolean isDivideAll;
        java.util.Arrays.sort(numbers);
        int min = numbers[0];
        while(divisor <= min){
            isDivideAll = true;
            for(int i = 0 ; i< numbers.length;i++){
                if((numbers[i] & divisor) !=0){
                    isDivideAll = false;break;

                }
            }
        if (isDivideAll){
            gcd = divisor;
        }
        divisor++;
        }
    return gcd;
    }
}