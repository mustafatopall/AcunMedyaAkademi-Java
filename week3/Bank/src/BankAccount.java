public class BankAccount {
    private String accounHolder;
    private double balance;

    public BankAccount(String accountHolder, double balance) {
        this.accounHolder = accountHolder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void CalculateInterest(){}
}
