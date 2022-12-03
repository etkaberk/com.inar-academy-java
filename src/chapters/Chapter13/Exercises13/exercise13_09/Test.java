package chapters.Chapter13.Exercises13.exercise13_09;

public class Test {
    public static void main(String[] args) {
        CircleComparable c1 = new CircleComparable(9);
        CircleComparable c2 = new CircleComparable(6);

        System.out.println(c1.equals(c2)+ " c1 =? c2" );
        System.out.println(c1.compareTo(c2) + " c1 compare to c2 " );

        System.out.println("------------------------------");
        CircleComparable d1 = new CircleComparable(10);
        CircleComparable d2 = new CircleComparable(10);

        System.out.println(d1.equals(d2));
        System.out.println(d1.compareTo(d2));

    }
}
