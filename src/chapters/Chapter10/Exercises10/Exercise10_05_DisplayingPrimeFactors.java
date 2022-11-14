package chapters.Chapter10.Exercises10;
import chapters.Chapter10.Listings10.StackOfIntegers;

import java.util.Scanner;
public class Exercise10_05_DisplayingPrimeFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive integer  :");
        int n = input.nextInt();

        StackOfIntegers factors = getFactors(n);
        displayFactorsInReversedWay(factors);

    }

    public static void displayFactorsInReversedWay(StackOfIntegers factors) {
    StackOfIntegers factorsReversed = new StackOfIntegers();
    while(!factors.empty()){
        System.out.print(factors.peek() + " " );
        factorsReversed.push(factors.pop());
    }
        System.out.println();
    }

    public static StackOfIntegers getFactors(int n) {
    StackOfIntegers factors = new StackOfIntegers();
    int d = 2 ;
    while (n != 1){
        if(n % d == 0){
            factors.push(d);
            n /= d ;
        }else{
            d++;
        }
    }
    return factors;
    }


}
