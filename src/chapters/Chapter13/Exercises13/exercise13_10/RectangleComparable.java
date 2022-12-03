package chapters.Chapter13.Exercises13.exercise13_10;

import chapters.Chapter13.Listings13.GeometricObject;

public class RectangleComparable extends GeometricObject implements Comparable<RectangleComparable>{
    private double width;
    private double height;

    public RectangleComparable() {
    }

    public RectangleComparable(
            double width, double height) {
        this.width = width;
        this.height = height;
    }

    public RectangleComparable(
            double width, double height, String color, boolean filled) {
        this.width = width;
        this.height = height;
        setColor();
        setFilled(filled);
    }


    public double getWidth() {
        return width;
    }


    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }


    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }


    public double getPerimeter() {
        return 2 * (width + height);
    }

    @Override
    public boolean equals (Object o) {
        return getArea() == ((RectangleComparable)o).getArea() ;
    }

    @Override
    public int compareTo(RectangleComparable o) {
        if (this.getArea() > o.getArea()){
            return 1 ;
        } else if (this.getArea() < o.getArea()) {
            return -1 ;
        }
        else {
            return 0 ;
        }
    }
}