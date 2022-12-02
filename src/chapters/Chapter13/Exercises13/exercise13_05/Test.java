package chapters.Chapter13.Exercises13.exercise13_05;

public class Test {
    public static void main(String[] args) {
        GeometricObjectClass circle1 = new Circle(1);
        GeometricObjectClass circle2 = new Circle(3);

        GeometricObjectClass rectangle1 = new Rectangle(5,5);
        GeometricObjectClass rectangle2 = new Rectangle(3,3);


        System.out.println("Max of two circles  : " + GeometricObjectClass.max(circle1,circle2));
        System.out.println("Max of two rectangles  : " + GeometricObjectClass.max(rectangle1,rectangle2));
    }
}
