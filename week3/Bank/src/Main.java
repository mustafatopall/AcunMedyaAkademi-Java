//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SavingsAccount hesap1 = new SavingsAccount("Hesap 1", 100.00);
        CheckingAccount hesap2 = new CheckingAccount("Hesap 2", 100.00);

        hesap1.CalculateInterest();
        hesap2.CalculateInterest();

    }
}