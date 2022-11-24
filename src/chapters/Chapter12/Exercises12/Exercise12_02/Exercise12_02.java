package chapters.Chapter12.Exercises12.Exercise12_02;
import java.util.Scanner;
public class Exercise12_02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        while(true){
            try{
                System.out.println("Enter two integers : ");
                num1 = input.nextInt();
                num2 = input.nextInt();
                break;
            }catch (java.util.InputMismatchException inputMismatchException){
                System.out.println("Wrong input. Please enter just integers!!!");
                input.next();
            }
        }
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));

    }
}
