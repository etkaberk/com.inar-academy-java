package chapters.chapter07.exercises07;

public class exercise07_07 {
    public static void main(String[] args) {

        int[] numbers =arrayWithRandomNumbers();
        int[] numberOfSingleDigits = countSingleDigits(numbers);
        displayArray(numberOfSingleDigits);
    }

    public static int[] arrayWithRandomNumbers() {
        int[] array = new int[100];

        for (int i = 0; i < array.length ; i++) {
            array[i] = (int)(Math.random() * 10);
        }
        return array;
    }

    public static void displayArray(int[] numberOfSingleDigits) {
        for (int i = 0; i < numberOfSingleDigits.length; i++) {
            System.out.println("Occurrences of " + i + "'s: " + numberOfSingleDigits[i]);

        }
    }

    public static int[] countSingleDigits(int[] numbers) {
        int[] countOccurrences = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            countOccurrences[numbers[i]]++;
        }
        return countOccurrences;

    }
}
