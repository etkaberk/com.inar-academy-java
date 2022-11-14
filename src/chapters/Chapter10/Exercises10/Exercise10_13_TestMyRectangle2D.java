package chapters.Chapter10.Exercises10;

public class Exercise10_13_TestMyRectangle2D {
    public static void main(String[] args) {
        MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
        System.out.printf("Aree for rectangle is %.3f\nPerimeter of r1 %.3f\n ", r1.getArea(), r1.getPerimeter());
        System.out.println("Rectangle r1 " + ((r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2))) ? "" : " does not ") + "contains that rectangle");
        System.out.println("Rectangle r1 " + (r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)) ?
                "" : "doesn't ") + "overlaps that rectangle.");

    }
}
