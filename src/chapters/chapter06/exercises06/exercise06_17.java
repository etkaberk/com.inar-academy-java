package chapters.chapter06.exercises06;

import java.util.Scanner;

public class exercise06_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 'n' of matrix ; ");
        int n = input.nextInt();
        makeMatrix(n);
    }

    public static void makeMatrix(int n) {
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                System.out.println((int) (Math.random() * 2) + " ");
        System.out.println();
    }
}