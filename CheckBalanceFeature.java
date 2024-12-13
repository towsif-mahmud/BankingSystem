import java.util.ArrayList;
import java.util.Scanner;

public class CheckBalanceFeature {
    private ArrayList<Account> accounts;
    private Scanner scanner;

    public CheckBalanceFeature(ArrayList<Account> accounts, Scanner scanner) {
        this.accounts = accounts;
        this.scanner = scanner;
    }

    public void checkBalance() {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        scanner.nextLine();

        Account account = findAccount(accountNumber);
        if (account != null) {
            System.out.println("Current balance: " + account.getBalance());
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
