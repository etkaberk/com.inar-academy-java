package chapters.Chapter10.Exercises10;

public class Triangle2D {
    public MyPoint p1;
    public MyPoint p2;
    public MyPoint p3;

    public Triangle2D(MyPoint p1, MyPoint p2, MyPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public Triangle2D(double p1X, double p1Y, double p2X, double p2Y, double p3X, double p3Y) {
        this(new MyPoint(p1X, p1Y), new MyPoint(p2X, p2Y), new MyPoint(p3X, p3Y));
    }

    public Triangle2D() {
        this(0, 0, 1, 1, 2, 5);
    }

    public MyPoint getP1() {
        return p1;
    }

    public void setP1(MyPoint p1) {
        this.p1 = p1;
    }

    public MyPoint getP2() {
        return p2;
    }

    public void setP2(MyPoint p2) {
        this.p2 = p2;
    }

    public MyPoint getP3() {
        return p3;
    }

    public void setP3(MyPoint p3) {
        this.p3 = p3;
    }

    public double getArea() {
        double s1 = Math.pow((p2.getX() - p1.getX()), 2);
        double s2 = Math.pow((p3.getX() - p1.getX()), 2);
        double s3 = Math.pow((p3.getX() - p2.getX()), 2);

        double s = (s1 + s2 + s3) / 3;

        double area = Math.pow(s * (s - s1) * (s - s2) - (s - s3), 0.5);
        return area;

    }

    public double getPerimeter() {
        double s1 = Math.pow((p2.getX() - p1.getX()), 2);
        double s2 = Math.pow((p3.getX() - p1.getX()), 2);
        double s3 = Math.pow((p3.getX() - p2.getX()), 2);
        return s1 + s2 + s3;
    }

    private double loc(MyPoint p1, MyPoint p2, MyPoint p3) {
        double x1 = p1.getX();
        double y1 = p1.getY();
        double x2 = p2.getX();
        double y2 = p2.getY();
        double x3 = p3.getX();
        double y3 = p3.getY();


        return

    }


}
