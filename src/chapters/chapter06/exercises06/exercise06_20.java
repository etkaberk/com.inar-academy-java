package chapters.chapter06.exercises06;

import java.util.Scanner;

public class exercise06_20 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = input.nextLine();
        System.out.println("String "+ str + " has " + countLetters(str) + " letters");

    }
public static int countLetters(String str){
    int count = 0;

    for (int i = 0; i < str.length(); i++) {
        if (Character.isLetter(str.charAt(i))) {
            count++;
        }
    }
    return count;


}

}
