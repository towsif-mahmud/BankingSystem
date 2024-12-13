public class CurrentAccount extends Account {
    public CurrentAccount(String accountHolder, double initialDeposit) {
        super(accountHolder, initialDeposit);
    }

    @Override
    public void displayAccountType() {
        System.out.println("This is a Current Account.");
    }
}