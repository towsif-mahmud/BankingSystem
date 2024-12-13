import java.util.ArrayList;
import java.util.Scanner;

public class DepositFeature {
    private ArrayList<Account> accounts;
    private Scanner scanner;

    public DepositFeature(ArrayList<Account> accounts, Scanner scanner) {
        this.accounts = accounts;
        this.scanner = scanner;
    }

    public void depositMoney() {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter deposit amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        Account account = findAccount(accountNumber);
        if (account != null) {
            account.deposit(amount);
            System.out.println("Amount deposited successfully!");
        } else {
            System.out.println("Account not found.");
        }
    }

    private Account findAccount(int accountNumber) {
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                return account;
            }
        }
        return null;
    }
}