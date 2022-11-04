package chapters.chapter09.exercises09;

import java.util.Scanner;

public class QuadraticEquationTest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a,b,c : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

    QuadraticEquation s = new QuadraticEquation(a,b,c);
        System.out.println("the equatin has  ");
        if (s.getDiscriminant() < 0 ){
            System.out.println(" no real roots ");
        } else if (s.getDiscriminant() > 0) {
            System.out.printf(" 2 roots " + s.getRoot1() + " , " +  s.getRoot2());

        }else{
            System.out.println("1 root " +( s.getRoot1() > 0 ? s.getRoot1() : s.getRoot2()));
        }

    }

}
