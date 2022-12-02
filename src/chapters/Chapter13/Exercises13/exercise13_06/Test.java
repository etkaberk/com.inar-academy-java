package chapters.Chapter13.Exercises13.exercise13_06;

public class Test {
    public static void main(String[] args) {
        CircleWithComparable circle1 = new CircleWithComparable(5);
        CircleWithComparable circle2 = new CircleWithComparable(10);
        int compareToResult = circle1.compareTo(circle2);
        if (compareToResult == 1) {
            System.out.println(circle1);
        } else if (compareToResult == -1) {
            System.out.println(circle2);
        }
        else {
            System.out.println("Circles are equal");
        }
    }
}
