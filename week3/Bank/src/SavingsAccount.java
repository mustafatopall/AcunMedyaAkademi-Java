public class SavingsAccount extends BankAccount{

    public SavingsAccount(String accountHolder, double balance) {
        super(accountHolder, balance);
    }

    @Override
    public void CalculateInterest() {
        System.out.println("Güncel Faiz Miktarı : " + getBalance()*0.05 + " TL");
    }
}
