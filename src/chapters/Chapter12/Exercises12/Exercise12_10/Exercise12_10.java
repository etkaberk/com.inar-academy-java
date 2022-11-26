package chapters.Chapter12.Exercises12.Exercise12_10;

public class Exercise12_10 {
    public static void main(String[] args) {


        try {
            byte[] array = new byte[100000000];
        }
        catch (OutOfMemoryError ex) {
            System.out.println(ex.getMessage());
        }

        System.out.println("Error handled program continues... ");
    }
}