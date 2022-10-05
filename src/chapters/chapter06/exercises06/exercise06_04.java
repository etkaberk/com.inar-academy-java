package chapters.chapter06.exercises06;
import java.util.Scanner;
public class exercise06_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer  : ");
        int number = input.nextInt();
        reverse(number);
    }
public static void reverse(int n){
        String reversed = "";
    while (n != 0){
        reversed += n % 10;
        n /= 10;
    }
    System.out.println("reverse is " + reversed);
}
}

