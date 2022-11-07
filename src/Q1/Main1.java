package Q1;

public class Main1 {
    public static void main(String[] args) {
        Account account = new Account();
        account.setAccountDetails(1,"debit",200);
        account.dispAccountDetails();
        System.out.println("---------------------");
        account.withdraw(100);
        account.dispAccountDetails();
        System.out.println("---------------------");
        account.deposit(50);
        account.dispAccountDetails();
    }

}
