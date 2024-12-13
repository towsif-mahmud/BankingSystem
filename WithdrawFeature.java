import java.util.ArrayList;
import java.util.Scanner;

public class WithdrawFeature {
    private ArrayList<Account> accounts;
    private Scanner scanner;

    public WithdrawFeature(ArrayList<Account> accounts, Scanner scanner) {
        this.accounts = accounts;
        this.scanner = scanner;
    }

    public void withdrawMoney() {
        System.out.print("Enter account number: ");
        int accountNumber = scanner.nextInt();
        System.out.print("Enter withdrawal amount: ");
        double amount = scanner.nextDouble();
        scanner.nextLine();

        Account account = findAccount(accountNumber);
        if (account != null) {
            if (account.withdraw(amount)) {
                System.out.println("Amount withdrawn successfully!");
            } else {
                System.out.println("Insufficient balance.");
            }
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