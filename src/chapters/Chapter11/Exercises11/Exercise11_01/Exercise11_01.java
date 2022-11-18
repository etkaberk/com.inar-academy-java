package chapters.Chapter11.Exercises11.Exercise11_01 ;

import java.util.Scanner;
public class Exercise11_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter 3 sides of triangle ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.println("Enter a color ; ");
        String color = input.next();

        System.out.print("Is triangle filled (true / false) ?");
        boolean filled = input.nextBoolean();
        Triangle triangle = new Triangle(side1,side2,side3);
        triangle.setColor(color);
        triangle.setFilled(filled);


        System.out.println(triangle.toString());
        System.out.println("area of the triangle is : "+ triangle.getArea());
        System.out.println("perimeter is : " + triangle.getPerimeter());
        System.out.println("color is " + triangle.getColor());
        System.out.println("triangle is filled??" + triangle.isFilled());
    }
}
