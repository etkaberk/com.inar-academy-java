package chapters.chapter05.exercises05;
import java.util.Scanner;

public class Chapter05_48 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s1 = input.nextLine();
        String s2 = "";

        for (int i = 0; i < s1.length(); i++) {
            if (i % 2 == 0) {// Finding the odd positions
                s2 += s1.charAt(i);
            }
        }

        System.out.println(s2);
    }
}
