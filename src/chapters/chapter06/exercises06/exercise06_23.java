package chapters.chapter06.exercises06;
import java.util.Scanner;
public class exercise06_23 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter a string and a  char :  ");
        String str = input.nextLine();
        char a = input.nextLine().charAt(0);
        System.out.println("In " +" ' "+ str +" ' " + " there is/are " + count(str, a) + "  " + a + " ('s)");

    }
    public static int count(String str , char a ){
        int count = 0;
        for(int i = 0; i < str.length();i++){
            if(str.charAt(i) == a){
                count++;
            }
        }
   return count;
    }

}
