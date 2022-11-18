package chapters.Chapter11.Exercises11.Exercise11_04;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getFromUser();
        Integer number = findTheLargestElement(list);
        System.out.println("the largest one is : " + number);
    }
public static Integer findTheLargestElement(ArrayList<Integer> list){
        if(list == null || list.isEmpty())
            return  null;
    int maxNumber = list.get(0);
    for (int i = 0; i < list.size() - 1 ; i++) {
        if (list.get(i) > maxNumber){
            maxNumber = list.get(i);
    }
    }
return maxNumber;

}
public static ArrayList<Integer> getFromUser(){
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();
    System.out.println("enter integers (input ends with '0' ) : ");
    int n = input.nextInt();


    while(n != 0){
        list.add(n);
        n = input.nextInt();
    }
return list;
    }
}
