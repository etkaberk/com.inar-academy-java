package chapters.chapter07.exercises07;
import java.util.Scanner;
public class exercise07_02 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter ten integers : ");
        for(int i = 0; i<numbers.length;i++){
            numbers[i]=input.nextInt();
        }
        System.out.println( "initial array is : ");
        for(int i = 0 ; i < numbers.length;i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println("second reversed array is : ");
        for(int i = numbers.length -1 ; i >= 0 ;i--){
            System.out.print(numbers[i] + " ");
        }

    }
}
