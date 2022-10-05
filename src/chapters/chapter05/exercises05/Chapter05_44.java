package chapters.chapter05.exercises05;
import java.util.Scanner;
public class Chapter05_44 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Prompt the user to enter a short integer
        System.out.print("Enter an integer: ");
        short number = input.nextShort();

        StringBuilder bits = new StringBuilder();

        for (int i = 0; i < 16; i++) {
            bits.insert(0, (number & 1));
            number >>= 1;
        }


        System.out.println("The bits are " + bits);
    }
}
