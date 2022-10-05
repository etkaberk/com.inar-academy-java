package chapters.chapter06.exercises06;


public class exercise06_10 {
    public static void main(String[] args) {

        final int NUMBER_PER_LINE = 10;
        int count = 0;

        for (int i = 1; i < 10000; i++) {
            if (isPrime(i)) {
                count++;
                if (count % NUMBER_PER_LINE == 0)
                    System.out.println(i);
                else
                    System.out.printf("%-6d", i);
            }
        }

    }
    public static boolean isPrime(int number){
        for (int divisor = 2; divisor <= number / 2; divisor++){
            if (number % divisor == 0)// If true, number isn't prime
                return false;// Number isn't prime
        }
        return true;// Number is prime
    }
}