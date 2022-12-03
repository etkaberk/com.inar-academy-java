package chapters.Chapter13.Exercises13.exercise13_12;

import chapters.Chapter13.Exercises13.exercise13_05.Circle;
import chapters.Chapter13.Exercises13.exercise13_05.GeometricObjectClass;
import chapters.Chapter13.Exercises13.exercise13_05.Rectangle;

public class Exercise13_12 {
    public static void main(String[] args) {
        GeometricObjectClass[] array = { new Circle(2) , new Circle(5),
                new Rectangle(2,5) , new Rectangle(5,2)} ;
        System.out.println("Sum of Geometric Objects Areas': " + sumArea(array));
    }

    private static double sumArea(GeometricObjectClass[] array) {
        double sum = 0 ;
        for (int i = 0; i < array.length; i++) {
            sum += array[i].getArea();
        }
        return sum ;
    }
}