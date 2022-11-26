package chapters.Chapter12.Exercises12.Exercise12_11;
import java.io.PrintWriter;
import java.io.File;

public class John {
    public static void main(String[] args)throws Exception{
         File file = new File("abc.txt");

         PrintWriter output = new PrintWriter(file);
         output.print("ahmet nergksd john john ali");

    }
}
