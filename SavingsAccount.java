public class SavingsAccount extends Account {
    public SavingsAccount(String accountHolder, double initialDeposit) {
        super(accountHolder, initialDeposit);
    }

    @Override
    public void displayAccountType() {
        System.out.println("This is a Savings Account.");
    }
}
