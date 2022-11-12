package chapters.Chapter10.Exercises10;

import chapters.Chapter10.Listings10.StackOfIntegers;



import static chapters.chapter06.exercises06.exercise06_10.isPrime;

public class Exercise10_06_DisplayingPrimeNumbers {
    public static void main(String[] args) {
        StackOfIntegers primeNumbers = findPrimeNumbers(120);
        display(primeNumbers);

    }

    public static void display(StackOfIntegers list) {
        while (!list.empty()) {
            System.out.println(list.pop());
        }
    }

    public static StackOfIntegers findPrimeNumbers(int i) {
        int number = 2;
        StackOfIntegers primeNumbers = new StackOfIntegers();
        while (number <= i) {
            if (isPrime(number)) {
                primeNumbers.push(number);
            }
            number++;
        }
        return primeNumbers;


    }
}