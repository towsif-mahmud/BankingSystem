import java.util.ArrayList;
import java.util.Scanner;

public class CreateAccountFeature {
    private ArrayList<Account> accounts;
    private Scanner scanner;

    public CreateAccountFeature(ArrayList<Account> accounts, Scanner scanner) {
        this.accounts = accounts;
        this.scanner = scanner;
    }

    public void createAccount() {
        System.out.print("Enter account holder's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter initial deposit amount: ");
        double initialDeposit = scanner.nextDouble();
        scanner.nextLine();

        Account account = new SavingsAccount(name, initialDeposit);
        accounts.add(account);

        System.out.println("Account created successfully! Your account number is: " + account.getAccountNumber());
    }
}