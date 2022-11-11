package chapters.Chapter10.Exercises10;

public class Exercise10_11_TestCircle2D {
    public static void main(String[] args) {
        Circle2D c = new Circle2D(2,2,5.5);

        System.out.println("Area of the circle c is :" +c.getArea() + "\nand perimeter for it is : " + c.getPerimeter()  );
        System.out.println("Circle c " + (c.contains(3,3) ? "" : "does not ") + " contain that point.");
        System.out.println("Circle c " + ((c.contains(new Circle2D(4,5,10.5)) ? "" : " does not ") )+ " contains that circle.");
        System.out.println("Circle c " + ((c.overlaps(new Circle2D(3,5,2.3))) ? "" : " does not ") + " overlaps that new circle");
    }
}
