package chapters.Chapter11.Exercises11.Exercise11_11;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_11 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getFiveNumbersFromUser(5);
        System.out.println(list);
        System.out.println("-_-_-_-__-_--___---_-");
        sortListIncreasingOrder(list);
    }
public static void sortListIncreasingOrder(ArrayList<Integer> list){
    java.util.Collections.sort(list);
    System.out.println(list);
}
public static ArrayList<Integer> getFiveNumbersFromUser(int n){
    Scanner input = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();

    System.out.print("Enter 5 numbers : ");
    for (int i = 0; i < n; i++) {
        list.add(input.nextInt());
    }
return list;
    }
}
