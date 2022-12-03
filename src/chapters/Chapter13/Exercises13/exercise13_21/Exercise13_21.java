package chapters.Chapter13.Exercises13.exercise13_21;

import chapters.Chapter13.Listings13.Rational;

import java.util.Scanner;

public class Exercise13_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a , b, c : ");
        long a = input.nextLong();
        long b = input.nextLong();
        long c = input.nextLong();
        Rational h = new Rational(-b,2 * a);
        Rational k = new Rational((long) (4 * a * c - Math.pow(b , 2)), 4 * a);
        System.out.println("h is " + h + " and k is " + k );
    }
}
