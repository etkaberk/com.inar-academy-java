package chapters.chapter05.exercises05;

import java.util.Scanner;

public class Chapter05_49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String a =input.nextLine();
        int vowels=0,consonants=0;

        char output;

        for(int i=0;i<a.length();i++) {

            output = (a.charAt(i));

            if (Character.toUpperCase(output) == 'A' ||
                    Character.toUpperCase(output) == 'E' ||
                    Character.toUpperCase(output) == 'I' ||
                    Character.toUpperCase(output) == 'U' ||
                    Character.toUpperCase(output) == 'O') {
                vowels++;
            } else {
                consonants++;
            }
        }
        System.out.println("The number of vowels is " + vowels);
        System.out.println("The number of consonants is " + consonants);


    }
}
