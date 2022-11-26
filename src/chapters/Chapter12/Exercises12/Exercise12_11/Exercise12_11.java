package chapters.Chapter12.Exercises12.Exercise12_11;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercise12_11 {
    public static void main(String[] args) throws Exception{
        if(args.length != 2){
            System.out.println("Usage : java Exercise12_11 word / filename");
            System.exit(0);
        }
    File file = new File(args[1]);
        String nuovo = "";
        String s = "";
        Scanner input = new Scanner(file);
        PrintWriter output = new PrintWriter(file);

        while(input.hasNext()){
            s = input.nextLine();
            nuovo += s.replaceAll(args[0] + "" , "")+ "\n";
        }
    output.print(nuovo);
        input.close();
        output.close();
    }
}
