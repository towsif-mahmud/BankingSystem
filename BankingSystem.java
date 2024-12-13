import java.util.ArrayList;
import java.util.Scanner;

public class BankingSystem {
    private ArrayList<Account> accounts;
    private Scanner scanner;

    public BankingSystem() {
        accounts = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void start() {
        boolean running = true;
        CreateAccountFeature createAccountFeature = new CreateAccountFeature(accounts, scanner);
        DepositFeature depositFeature = new DepositFeature(accounts, scanner);
        WithdrawFeature withdrawFeature = new WithdrawFeature(accounts, scanner);
        CheckBalanceFeature checkBalanceFeature = new CheckBalanceFeature(accounts, scanner);

        while (running) {
            System.out.println("\nWelcome to the Banking Management System!");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1 -> createAccountFeature.createAccount();
                case 2 -> depositFeature.depositMoney();
                case 3 -> withdrawFeature.withdrawMoney();
                case 4 -> checkBalanceFeature.checkBalance();
                case 5 -> {
                    running = false;
                    System.out.println("Thank you for using the Banking Management System!");
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}