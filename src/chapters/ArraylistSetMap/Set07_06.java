package chapters.ArraylistSetMap;
import java.util.HashSet;
import java.util.Set;
public class Set07_06 {
    public static void main(String[] args) {
        Set<Integer> primes = new HashSet<>();
        final int NUMBER_OF_PRIMES = 50;
        final int NUMBER_PER_LINE = 10;


        int number = 2;
        while(primes.size() < NUMBER_OF_PRIMES){
            if(isPrime(number,primes)){
            primes.add(number);
        }
    number++;
    }
displayPrimes(primes,NUMBER_PER_LINE);


}

    public static boolean isPrime(int number, Set<Integer> primes) {
        for (int divisor : primes) {
            if(divisor <= Math.sqrt(number) && number % divisor == 0){
                return false;
            }

        }
    return true;

    }

    public static void displayPrimes(Set<Integer> primes, int NUMBER_PER_LINE) {
        int count = 0;
        for (int number : primes
        ) {
            if (count % NUMBER_PER_LINE == 0) {
                System.out.println();
            }
            System.out.printf("%4d ", number);
            count++;
        }
    }


}