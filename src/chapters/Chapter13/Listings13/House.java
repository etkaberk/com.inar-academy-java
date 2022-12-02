package chapters.Chapter13.Listings13;

import java.util.Date;

public class House implements Cloneable, Comparable<House> {
    private int id;
    private double area;
    private java.util.Date whenBuilt;

    public House(int id, double area) {
        this.id = id;
        this.area = area;
        whenBuilt = new java.util.Date();
    }

    public int getId() {
        return id;
    }

    public double getArea() {
        return area;
    }

    public Date getWhenBuilt() {
        return whenBuilt;
    }

    @Override
    // Override the protected clone method defined in
    // the Object class, and strengthen its accessibility
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }


    @Override
    // Implement the compareTo method defined in Comparable
    public int compareTo(House o){
        if (area > o.getArea())
            return 1;
        else if (area < o.getArea())
            return -1;
        else
            return 0;
    }
}