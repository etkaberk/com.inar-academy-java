package chapters.Chapter12.Exercises12.Exercise12_05;

import chapters.Chapter11.Exercises11.Exercise11_01.GeometricObject;

public class Triangle extends GeometricObject {
    private double side1;
    private double side2;
    private double side3;

public Triangle() throws IllegalTriangleException{
    this(1,1,1);
}
    public Triangle(double side1, double side2, double side3) throws IllegalTriangleException {
        if (side1 + side2 <= side3 || side2 + side3 <= side1 || side1 + side3 <= side2) {
            throw new IllegalTriangleException("Wrong side lengths.");
        }
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
    public double getArea(){
        double s = ( getSide1()+getSide2()+getSide3() ) / 2 ;
        return Math.sqrt(s * ( s - getSide1()) * ( s - getSide2()) * ( s - getSide3()));
    }
    public double getPerimeter(){
        return getSide1() + getSide2() + getSide3() ;
    }
public String toString(){
    return "The area of the triangle is : "+ getArea() + "\nThe perimeter is : " + getPerimeter() + "\nTriangle: side1 = " + side1 + " side2 = " + side2 +
            " side3 = " + side3;
}


}
