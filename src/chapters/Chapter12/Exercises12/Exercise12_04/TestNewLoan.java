package chapters.Chapter12.Exercises12.Exercise12_04;

import java.util.Scanner;

public class TestNewLoan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (true){
            System.out.println("Enter annual interest rate: ");
            double interestRate = input.nextDouble();

            System.out.println("Enter numbers of years: ");
            int numberOfYears = input.nextInt();

            System.out.println("Enter loan amount: ");
            double loanAmount = input.nextDouble();
            try{
                NewLoan loan1 = new NewLoan(interestRate, numberOfYears,loanAmount);
                System.out.println(loan1.getTotalPayment());
                break;
            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
