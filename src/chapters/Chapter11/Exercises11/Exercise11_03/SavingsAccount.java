package chapters.Chapter11.Exercises11.Exercise11_03;

import chapters.chapter09.exercises09.Account;


public class SavingsAccount extends Account{
    public SavingsAccount(){
    }
public SavingsAccount(int id ,double balance,double annualInterestRate){
        super(id,balance,annualInterestRate);
}
@Override
    public void withdraw(double amount){
        if(amount > super.getBalance()){
            System.out.println("your balance is " + super.getBalance() + " $ " + "\n" +
            "you can withdraw only " + super.getBalance() + " $ ");
            return;
        }
super.setBalance(super.getBalance() - amount);

    }

@Override
public String toString(){
    return "this is a checking account " +
            "\nId : " + super.getId() +
            "\nBalance : " + super.getBalance() + "\nDate created : " + getDateCreated();
}

}
