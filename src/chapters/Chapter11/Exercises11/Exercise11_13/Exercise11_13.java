package chapters.Chapter11.Exercises11.Exercise11_13;


import java.util.ArrayList;
import java.util.Scanner;

public class Exercise11_13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getTenNumbers();
        removeDuplicates(list);
        System.out.println("distincts are : ");
        System.out.println(list);
        System.out.println();
    }

    public static void removeDuplicates(ArrayList<Integer> list) {
    ArrayList<Integer> removed = new ArrayList<>();
    while (!list.isEmpty()){
        int n = list.remove(list.size() - 1);
        if(!removed.contains(n)){
            removed.add(n);
        }
    }
    list.addAll(removed);
    }

    public static ArrayList<Integer> getTenNumbers() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.print("Enter 10 numbers :  ");
        for (int i = 0; i < 10; i++) {
            int number = input.nextInt();
            list.add(number);

        }
     return  list;
    }
}
