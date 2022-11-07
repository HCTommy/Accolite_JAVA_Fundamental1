package Q1;

public class Account {
    int accountNo;
    String accountType;
    int accountBalance;

    public Account() {
    }

    public Account(int accountNo, String accountType, int accountBalance) {
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public void setAccountDetails(int accountNo, String accountType, int accountBalance){
        this.accountNo = accountNo;
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    public void withdraw(int amount){
        this.accountBalance-=amount;
    }

    public void deposit(int amount){
        this.accountBalance+=amount;
    }

    public void dispAccountDetails(){
        System.out.println(
                "accountNo=" + accountNo +
                "\naccountType=" + accountType +
                "\naccountBalance=" + accountBalance
        );
    }
}
