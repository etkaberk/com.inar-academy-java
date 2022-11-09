package chapters.Chapter10.Checkpoints10;

public class Checkpoint10_18 {
    public static void main(String[] args) {
        String s1 = "Welcome";
        System.out.println("s1  = " + s1);
        String s2 = "Welcome";
        System.out.println("s2  = " + s2);

        s2 = s1.replaceAll("e" , "E");
        String[] arr = "Welcome to Java and HTML".split(" ");
        s1 = arr[0];
        System.out.println("s1 = " + s1);
        s2= arr[1];
        System.out.println("s2 = " + s2);
    }
}
