package chapters.Chapter10.Exercises10;

import java.math.BigInteger;

public class Exercise10_21 {
    public static void main(String[] args) {
        BigInteger number = new BigInteger(Long.MAX_VALUE + "").add(BigInteger.ONE);
        int count = 0;

        while (count < 10) {
            if (isDividable(number)) {
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }

    public static boolean isDividable(BigInteger number) {
        return number.remainder(new BigInteger("5")).equals(BigInteger.ZERO) || number.remainder(new BigInteger("6")).equals(BigInteger.ZERO);
    }


}
