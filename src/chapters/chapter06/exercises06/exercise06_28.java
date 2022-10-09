package chapters.chapter06.exercises06;

public class exercise06_28 {
    public static void main(String[] args) {
        System.out.printf("%-7s%7s", "P", "2^p-1\n");
        System.out.println("--------------");

        for (int p = 2; p <= 31; p++) {
            if (isMersennePrime(p)) {
                System.out.printf("%-8d %-5d\n", p, mersennePrime(p));
            }
        }
    }
    public static int mersennePrime(int p) {
        return (int) Math.pow(2, p) - 1;
    }
    public static boolean isMersennePrime(int p) {
        return isPrime(p) && isPrime(mersennePrime(p));
    }

    public static boolean isPrime(int number) {
        for (int d = 2; d <= number / 2; d++) {
            if (number % d == 0) {
                return false;
            }
        }
        return true;
    }
}