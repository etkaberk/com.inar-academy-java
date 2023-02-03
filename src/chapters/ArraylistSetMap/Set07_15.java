package chapters.ArraylistSetMap;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;



public class Set07_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] list = new int[10];
        System.out.println("Enter ten numbers :  ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.nextInt();
        }
    int[] eliminatedArray = eliminateDuplicates(list);
        displayArray(eliminatedArray);
    }

    public static int[] eliminateDuplicates(int[] list) {
    Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < list.length; i++) {
         numbers.add(list[i]);
        }
    int[] eliminatedArray = new int[numbers.size()];
        int count = 0;
        for(int number: numbers){
            eliminatedArray[count]= number;
            count++;
        }
    return eliminatedArray;

    }

    public static void displayArray(int[] eliminatedArray) {
        System.out.println("distinc nubers are : ");
        for (int i = 0; i < eliminatedArray.length; i++) {
            System.out.print(eliminatedArray[i] + " ");
        }
    }


}
