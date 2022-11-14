package chapters.Chapter10.Exercises10;

import java.math.BigInteger;

public class Exercise10_17 {
    public static void main(String[] args) {
        long number = findMaxSquare();
        for (int i = 0; i < 10; i++) {
            BigInteger squareNumber = new BigInteger(++number + "");
            System.out.print(squareNumber + " :  " );
            squareNumber = squareNumber.multiply(squareNumber);
            System.out.println(squareNumber);


        }
    }

    public static long findMaxSquare() {
long result = 2;
while ((long)Math.pow(result,2) < Long.MAX_VALUE){
    result++;
}
   return --result;
    }


}
