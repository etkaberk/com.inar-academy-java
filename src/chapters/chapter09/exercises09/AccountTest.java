package chapters.chapter09.exercises09;

public class AccountTest {

    public static void main(String[] args) {
        Account account = new Account(1122, 20000, 4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Balance : " + account.getBalance());
        System.out.println("MonthlyInterest : " + account.getMonthlyInterestedRate());
        System.out.println("DateCreated :" + account.getDateCreated().toString());

    }
}