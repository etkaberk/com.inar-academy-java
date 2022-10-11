package chapters.chapter07.listings07;

public class listing07_05 {


    public static void main(String[] args) {
        printMax(34, 3, 3, 2, 56.5);
        printMax(1, 2, 3);
    }

    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("no argument passed");
            return;
        }
        double result = numbers[0];
        for (int i = 1; i < numbers.length; i++)
            result = numbers[i];
        System.out.println("the max value is " + result);
    }
}
