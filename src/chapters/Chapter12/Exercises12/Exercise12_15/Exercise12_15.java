package chapters.Chapter12.Exercises12.Exercise12_15;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise12_15 {
    public static void main(String[] args)throws Exception {
        ArrayList<Integer> list = new ArrayList<>();
        File file = new File("Exercise12_15.txt");
        if(file.exists()){
            System.out.println("there is a file with the same name !!!");
            System.exit(1);
        }
fillTheFileWithRandomNumbers(file);
        sortTheNumbers(list,file);
        displaySortedNumbers(list);

    }
public static void displaySortedNumbers(ArrayList<Integer> list){
    for (int i = 0; i < list.size(); i++) {
        System.out.print(list.get(i) + " ");

    }
}
public static void sortTheNumbers(ArrayList<Integer> list,File file) throws Exception{
        try(
                Scanner input = new Scanner(file);
                ){
            while (input.hasNext()){
                list.add(input.nextInt());
            }
        }
java.util.Collections.sort(list);

    }
public static void fillTheFileWithRandomNumbers(File file) throws  Exception{
        try(
                PrintWriter output = new PrintWriter(file);
                ){
            for (int i = 0; i < 101; i++) {
                output.print((int) (Math.random() * 100) + " ");

            }
        }
}
}
