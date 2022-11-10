package chapters.Chapter10.Exercises10;

public class Exercise10_03_TestMyInteger {
    public static void main(String[] args) {
        MyInteger number = new MyInteger(1234567);
        System.out.println(number.getValue());
        System.out.println("isEven : " + number.isEven());
        System.out.println("isOdd  : " + number.isOdd());
        System.out.println("isPrime: " + number.isPrime());
        System.out.println("equals to 2345 : " + number.equals(2345));
        System.out.println("equals to 1234567 :: " + number.equals(new MyInteger(1234567)));


    }
}
