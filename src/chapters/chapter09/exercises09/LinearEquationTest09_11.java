package chapters.chapter09.exercises09;

import java.util.Scanner;

public class LinearEquationTest09_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a,b,c,d,e,f  : ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        double d = input.nextDouble();
        double e = input.nextDouble();
        double f = input.nextDouble();
    LinearEquation i = new LinearEquation(a,b,c,d,e,f);
    if(i.isSolvable()){
        System.out.println("a is " + i.getX() + " and y is " + i.getY());
    }else{
        System.out.println("The equation can not solve ! ");
    }

    }
}
