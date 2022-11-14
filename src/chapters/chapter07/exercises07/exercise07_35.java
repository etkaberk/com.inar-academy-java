package chapters.chapter07.exercises07;

import java.util.Scanner;

public class exercise07_35 {
    public static void main(String[] args) {

        String[] words = {"github", "gitbash", "java", "programming", "inaracademy", "america", "europa"};
        playHangman(words);

    }

    public static void playHangman(String[] words) {
        Scanner input = new Scanner(System.in);
        String word ;

        do {
            word = words[(int) (Math.random() * words.length)];
            char[] answer = new char[word.length()];
            askToUser(word, answer);

            System.out.print("Do you want to guess another word? Enter y or n>");
        } while (input.next().toLowerCase().charAt(0) == 'y');
    }

    public static void askToUser(String word, char[] answer) {
        Scanner input = new Scanner(System.in);
        fill(answer, '*');
        int missTime = 0;

        while (true) {
            System.out.print("(Guess) Enter a letter in word ");
            printTheWordInAsterisk(answer);

            char ch = input.next().toLowerCase().charAt(0);// for case-sensitive
            missTime += checkLetter(word, answer, ch);

            if (checkAnswer(word, answer)) {
                break;
            }
        }
        System.out.println("The word is " + word);
        if (missTime == 0) {
            System.out.println("You didn't miss");
        } else if (missTime == 1) {
            System.out.println("You missed " + missTime + " time");
        } else {
            System.out.println("You missed " + missTime + " times");
        }
    }


    public static int checkLetter(String word, char[] answer, char ch) {
        for (int i = 0; i < word.length(); i++) {
            if (word.toLowerCase().charAt(i) == ch) {
                answer[i] = word.charAt(i);
            }
        }

        return contains(answer, ch) ? 1 : 0;

    }


    public static boolean contains(char[] answer, char ch) {
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == ch) {
                return true;
            }
        }
        return false;
    }


    // Checks whether the user has find the word
    private static boolean checkAnswer(String word, char[] answer) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != answer[i]) {
                return false;
            }
        }
        return true;
    }


    private static void printTheWordInAsterisk(char[] answer) {
        for (int i = 0; i < answer.length; i++) {
            System.out.print(answer[i]);
        }
        System.out.print(" > ");
    }


    public static void fill(char[] answer, char ch) {
        for (int i = 0; i < answer.length; i++) {
            answer[i] = ch;
        }
    }
}

