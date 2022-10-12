package chapters.chapter07.exercises07;

import java.util.Scanner;

public class exercise07_03 {
    public static void main(String[] args){
        int[] array = new int[100];
        System.out.println("enter the integers between 1 and 100 : ");
        count(array);
        displayResults(array);
    }
public static void count(int[] array){
        Scanner input = new Scanner(System.in);
        int number ;
        do{
            number = input.nextInt();
            if(number > 0 && number <= 100){
                array[number-1]++;
            }

        }while (number != 0);

}
public static void displayResults(int[] array){
        for(int i = 0 ; i < array.length; i++){
            if (array[i] > 0 ){
                System.out.println((i+1) + " occurs " + array[i] + " time" + (array[i] > 1 ? "s" : ""));
            }
        }
    }
}


