package chapters.Chapter13.Exercises13.exercise13_06;



public class CircleWithComparable extends Circle implements Comparable<CircleWithComparable>{
    public CircleWithComparable() {
        this(0);
    }

    public CircleWithComparable(double r) {
        super(r);
    }

    @Override
    public int compareTo(CircleWithComparable o) {
        if (getArea() > o.getArea()){
            return 1;
        } else if (getArea() < o.getArea()) {
            return -1;
        }
        else {
            return 0;
        }
    }
    @Override
    public String toString(){
        return "Comparable Circle : "+ super.toString() ;
    }
}


