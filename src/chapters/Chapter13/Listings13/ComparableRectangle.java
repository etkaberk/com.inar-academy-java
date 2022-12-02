package chapters.Chapter13.Listings13;

public class ComparableRectangle extends Rectangle
        implements Comparable<ComparableRectangle> {
    // Construct a ComparableRectangle with specified properties
    public ComparableRectangle(double witdh, double height) {
        super(witdh, height);
    }

    @Override
    // Implement the compareTo method defined in Comparable
    public int compareTo(ComparableRectangle o) {
        if (getArea() > o.getArea())
            return 1;
        else if (getArea() < o.getArea())
            return -1;
        else
            return 0;
    }

    @Override
    // Implement the toString method in GeometricObject
    public String toString() {
        return super.toString() + " Area: " + getArea();
    }
}