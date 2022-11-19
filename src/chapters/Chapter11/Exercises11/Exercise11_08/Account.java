package chapters.Chapter11.Exercises11.Exercise11_08;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    private ArrayList<Transaction> transactions;

    public Account(){
    }
    public Account(int id , double balance){
        this(null,id,balance);
        dateCreated = new Date();
    }
    public Account(String name,int id,double balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
        dateCreated = new Date();
        transactions = new ArrayList<>();
    }
    public void setId(int newId) {
        this.id = newId;
    }

    public void setAnnualInterestRate(double newAnnualInterestRate) {
        annualInterestRate = newAnnualInterestRate;
    }

    public void setBalance(double newBalance) {
        balance = newBalance;
    }



}
