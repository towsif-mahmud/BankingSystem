public abstract class Account {
    private static int accountCounter = 1000;
    private int accountNumber;
    private String accountHolder;
    private double balance;

    public Account(String accountHolder, double initialDeposit) {
        this.accountNumber = accountCounter++;
        this.accountHolder = accountHolder;
        this.balance = initialDeposit;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public abstract void displayAccountType();
}