package chapters.Chapter10.Exercises10;

public class Exercise10_22_TestMyString1 {
    public static void main(String[] args) {
        MyString1 myString1 = new MyString1(new char[]{'H','E','L','L','O'});
        System.out.println(myString1);
        MyString1 a = myString1.toLowerCase();
        System.out.println(a);
        MyString1 b = a.substring(0,3);
        System.out.println(b);
        System.out.println(myString1.equals(a));
        MyString1 c = new MyString1(new char[]{'H','E','L','L','O'});
        System.out.println(myString1.equals(c));
        MyString1 m = MyString1.valueOf(71367);
        System.out.println(m);
    }
}
