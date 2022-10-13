package chapters.chapter07.exercises07;

public class exercise07_06 {
    public static void main(String[] args) {
        int[] primeNumbers = new int[50];
        fillArray(primeNumbers);
        displayArray(primeNumbers);
    }

    public static void displayArray(int[] primeNumbers) {
        for (int i = 0; i < primeNumbers.length; i++) {
            if (i % 10 == 0)
                System.out.println();
            System.out.print(primeNumbers[i]);
        }
    }

    public static void fillArray(int[] primeNumbers) {
        int count = 0;
        int number = 2;
        while (count < primeNumbers.length) {
            if (isPrime(number, count, primeNumbers)) {
                primeNumbers[count] = number;
                count++;
            }
            number++;
        }
    }

    public static boolean isPrime(int number, int count, int[] primeNumbers) {
        for (int i = 0; i < count; i++) {
            if (primeNumbers[i] <= Math.sqrt(number)) {
                if (number % primeNumbers[i] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
