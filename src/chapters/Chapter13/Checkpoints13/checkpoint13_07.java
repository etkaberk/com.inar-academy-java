package chapters.Chapter13.Checkpoints13;
// Integer x doesn't have any compareTo method because of that we can't do this

public class checkpoint13_07 {
    public static void main(String[] args) {
        Number x = new Integer(3);
        System.out.println(x.intValue());
        //System.out.println(x.compareTo(new Integer(4)));
    }
}
