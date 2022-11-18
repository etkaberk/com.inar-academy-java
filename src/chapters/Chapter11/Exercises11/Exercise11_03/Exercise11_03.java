package chapters.Chapter11.Exercises11.Exercise11_03;


import chapters.chapter09.exercises09.Account;

public class Exercise11_03 {
    public static void main(String[] args) {
        Account account = new Account(458,670,6);
        CheckingAccount account1 = new CheckingAccount(300,999.0,10);
        SavingsAccount account2 = new SavingsAccount(450,290.0,8);
        account2.withdraw(1000);
        display(account2);
        display(account);
        display(account1);

    }

    public static void display(Account account) {
        System.out.println(account.toString() );
    }
}
