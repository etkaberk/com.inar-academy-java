package chapters.Chapter13.Checkpoints13;
// here there is  error cause access operator (.) executed before the casting operator
public class checkpoint13_08 {
    public static void main(String[] args) {
        Number x = new Integer(3);
        System.out.println(x.intValue());
        //System.out.println((Integer)x.compareTo(new Integer(4)));
    }
}
