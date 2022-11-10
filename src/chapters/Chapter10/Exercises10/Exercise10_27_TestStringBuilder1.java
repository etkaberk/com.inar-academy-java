package chapters.Chapter10.Exercises10;

public class Exercise10_27_TestStringBuilder1 {
    public static void main(String[] args) {
        MyStringBuilder1 str1 = new MyStringBuilder1("Te Amo");
        System.out.println(str1);
        String student = "Mahmut";
        MyStringBuilder1 str2 = new MyStringBuilder1(student);
        str1.append(str2);
        System.out.println(str1);
        str1.charAt(3);
        System.out.println(str1);

    }
}
