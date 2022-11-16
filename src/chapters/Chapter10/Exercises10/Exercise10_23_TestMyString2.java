package chapters.Chapter10.Exercises10;

public class Exercise10_23_TestMyString2 {
    public static void main(String[] args) {
        MyString2 myString2 = new MyString2("Etka Berk ORMAN");
        MyString2 s = new MyString2("Sena ORman");
        MyString2 s1 = new MyString2("Isiklar4120");
        MyString2 s2 = new MyString2("Selamun Aleykum");

        myString2.toUpperCase();
        System.out.println(s1);
        char[] chars = s.toChars();
        System.out.println(chars[0]);
        System.out.println(myString2.compare(s2.toString()));
        System.out.println(myString2.compare(s1.toString()));
        MyString2 s3 = s2.substring(9);


    }

}
