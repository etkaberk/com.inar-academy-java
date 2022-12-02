package chapters.Chapter13.Exercises13.exercise13_06;

public class Circle {
    String color;
    double radius;
    private double area;
    private double perimeter;
    boolean isFilled;
    public Circle() {
        color = "RED";
        radius = 2;
        isFilled = false;

    }

    public Circle(double r) {
        this();
        radius = r;
    }

    public double getArea() {
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    public double getPerimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }

    public void fillTheCircle() {
        isFilled = true;
    }

    public void cleanTheCircle() {
        isFilled = false;
    }

    public void paint(String c) {
        color = c;
    }

    public String toString() {
        return "radius :" + radius + "\nperimeter :" + getPerimeter() + "\narea :" + getArea() + "\nisFilled :" + isFilled + "\ncolor :" + color ;

    }
}