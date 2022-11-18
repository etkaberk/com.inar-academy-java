package chapters.Chapter11.Exercises11.Exercise11_03;
import chapters.chapter09.exercises09.Account;



public class CheckingAccount extends Account{
    public static final double OVERDRAFT_LIMIT = -3000;
    public CheckingAccount(){}
    public CheckingAccount(int id,double balance,double annualInterestRate){
        super(id,balance,annualInterestRate);
    }
    @Override
    public void withdraw(double amount){
        if(super.getBalance() - amount < CheckingAccount.OVERDRAFT_LIMIT){
            System.out.println("your balance is : " + super.getBalance() + " $ " + "\n" +
                    "you can withdraw only " +(super.getBalance() - CheckingAccount.OVERDRAFT_LIMIT) + " $");
        return;
        }
super.setBalance(super.getBalance()- amount);
    }
@Override
    public String toString(){
        return "this is a checking account " +
                "\nId : " + super.getId() +
                "\nBalance : " + super.getBalance() + "\nDate created : " + getDateCreated();
}

}
