package bank;
import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String customerName, bankName, accountType;

    // Method to display account details
    void displayDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
    }
}

class Bank {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Scanner scanner = new Scanner(System.in);

        // Getting customer name
        System.out.print("Enter customer name: ");
        account.customerName = scanner.nextLine();

        // Getting account number
        System.out.print("Enter account number: ");
        account.accountNumber = scanner.nextInt();

        // Clearing the scanner buffer
        scanner.nextLine();

        // Getting bank name
        System.out.print("Enter bank name: ");
        account.bankName = scanner.nextLine();

        // Getting account type
        System.out.print("Enter account type: ");
        account.accountType = scanner.nextLine();

        scanner.close();

        // Displaying account details
        System.out.println("\nDisplaying Details:");
        account.displayDetails();
    }
}
