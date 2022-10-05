package chapters.chapter05.exercises05;
import java.util.Scanner;

public class Chapter05_32 {
    public static void main(String[] args) {
        int lottery = (int) (Math.random() * 10);
        while (true) {
            int n = (int) (Math.random() * 10);
            if (n != lottery) {
                lottery += n * 10;
                break;
            }
        }

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();


        int lotteryDigit1 = lottery / 10;
        int lotteryDigit2 = lottery % 10;


        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery number is " + lottery);


        if (guess == lottery)
            System.out.println("Exact match: you win $10,000");
        else if (guessDigit2 == lotteryDigit1 && guessDigit1 == lotteryDigit2)
            System.out.println("Match all digits: you win $3,000");
        else if (guessDigit1 == lotteryDigit1 || guessDigit1 == lotteryDigit2 || guessDigit2 == lotteryDigit1 || guessDigit2 == lotteryDigit2)
            System.out.println("Match one digit: you win $1,000");
        else
            System.out.println("Sorry, no match");
    }
}
