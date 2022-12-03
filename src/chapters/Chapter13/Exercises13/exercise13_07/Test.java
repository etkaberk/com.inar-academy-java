package chapters.Chapter13.Exercises13.exercise13_07;

import chapters.Chapter13.Exercises13.exercise13_05.Circle;
import chapters.Chapter13.Exercises13.exercise13_05.GeometricObjectClass;
import chapters.Chapter13.Exercises13.exercise13_05.Rectangle;

public class Test {
    public static void main(String[] args) {
        GeometricObjectClass[] array = new GeometricObjectClass[5];
        array[0] = new Circle(13);
        array[1] = new Rectangle(6,9);
        array[2] = new Circle();
        array[3] = new Square();
        array[4] = new Square(9);

        for (int i = 0; i < array.length; i++) {
            System.out.println("Area of geometric object(index - " + i + ")" + " is : "  + array[i].getArea()  );

            if(array[i] instanceof Colorable){
                ((Colorable)array[i]).howToColor();

            }
            System.out.println("_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-");
        }


    }
}
