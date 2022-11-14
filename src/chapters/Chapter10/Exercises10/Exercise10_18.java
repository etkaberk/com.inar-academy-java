package chapters.Chapter10.Exercises10;



import java.math.BigInteger;

public class Exercise10_18 {
    public static void main(String[] args) {
        int count = 0 ;
        BigInteger number = new BigInteger(Long.MAX_VALUE + "").add(BigInteger.ONE);

        while(count < 5){
            if(isPrime(number)){
                System.out.println(number);
                count++;
            }
        number = number.add(BigInteger.ONE);
        }
    }

public static boolean isPrime(BigInteger bigInteger){
        if(bigInteger.equals(BigInteger.ONE) || bigInteger.equals(BigInteger.ZERO))
            return false;
        if (bigInteger.equals(new BigInteger(2 + "")))
            return true;
        if(bigInteger.divide(new BigInteger(2 + "")).equals(BigInteger.ZERO))
            return false;

    BigInteger divisor = new BigInteger("3");
    while(divisor.compareTo(bigInteger.divide(new BigInteger(2 + ""))) <= 0){
        if(bigInteger.remainder(divisor).equals(BigInteger.ZERO)){
            return false;
        }
    divisor = divisor.add(BigInteger.ONE);

    }
    return true;
    }
}
