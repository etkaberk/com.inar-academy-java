package chapters.Chapter10.Exercises10;

public class Exercise10_12_TestTriangle2D {
    public static void main(String[] args) {
        Triangle2D myTr = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));
        System.out.print("the area of triangle is : " + myTr.getArea() + "\nthe perimeter of the triangle is : " + myTr.getPerimeter());
        System.out.println("contains point(3,3) " + myTr.contains(new MyPoint(3, 3)));
        System.out.println("Contains triangle(2.9, 2), (4. 1), (1, 3.4)" +
                myTr.contains(new Triangle2D(new MyPoint(2.9, 2), new MyPoint(4, 1), new MyPoint(1, 3.4))));
        System.out.println("OverLaps triange(2, 5.5), (4. -3), (2, 6.5)" +
                myTr.overLaps(new Triangle2D(new MyPoint(2, 5.5), new MyPoint(4, -3), new MyPoint(2, 6.5))));
    }


}
