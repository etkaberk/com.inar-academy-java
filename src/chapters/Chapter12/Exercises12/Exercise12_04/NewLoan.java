package chapters.Chapter12.Exercises12.Exercise12_04;

import java.util.Date;

public class NewLoan {
    private double annualInterestRate;
    private int numberOfYears;
    private double loanAmount;
    private Date loanDate;


    public NewLoan(){
        this(2.5,1,1000);
    }
public NewLoan(double annualInterestRate,int numberOfYears,double loanAmount){
        if(loanAmount <= 0 || numberOfYears <= 0 || annualInterestRate <= 0){
            throw new java.lang.IllegalArgumentException("Check your entry !!!");
        }
this.annualInterestRate = annualInterestRate;
        this.loanAmount = loanAmount;
        this.loanDate = new Date();
        this.numberOfYears = numberOfYears;
    }
    public Date getLoanDate() {
        return loanDate;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }


    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return loanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = loanAmount * monthlyInterestRate / (1 -
                (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        return getMonthlyPayment() * numberOfYears * 12;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "annualInterestRate=" + annualInterestRate +
                ", numberOfYears=" + numberOfYears +
                ", loanAmount=" + loanAmount +
                ", loanDate=" + loanDate +
                '}';
    }
}