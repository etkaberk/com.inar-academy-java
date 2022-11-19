package chapters.Chapter11.Exercises11.Exercise11_12;
import java.util.ArrayList;
import java.util.Scanner;
public class Exercise11_12 {
    public static void main(String[] args) {
    ArrayList<Double> list = getFiveNumbersFromUser(5);
    double sumOfList = sum(list);
        System.out.println("sum of the list is : " + sumOfList);

    }

    public static double sum(ArrayList<Double> list) {
    double sum = 0;
    while (!list.isEmpty()){
        sum += list.remove(list.size() - 1);
    }
    return sum;
    }

    public static ArrayList<Double> getFiveNumbersFromUser(int i) {
        Scanner input = new Scanner(System.in);
        ArrayList<Double> list = new ArrayList<>();

        System.out.println("enter 5 numbers : ");
        for (int j = 0; j < i; j++) {
            list.add(input.nextDouble());

        }
    return list;
    }
}
