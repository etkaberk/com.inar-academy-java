package chapters.Chapter10.Exercises10;

public class Exercise10_28_TestMyStringBuilder2 {
    public static void main(String[] args) {
        MyStringBuilder2 stringBuilder = new MyStringBuilder2("EtkaSenaGokselZaynep123");
        MyStringBuilder2 stringBuilder2 = new MyStringBuilder2("EtkaBerkOrman");
        System.out.println(stringBuilder);
        System.out.println(stringBuilder2);
        stringBuilder.insert(4,stringBuilder2.substring(6));
        System.out.println(stringBuilder);
        stringBuilder2.reverse();
        System.out.println(stringBuilder2);
    }
}
