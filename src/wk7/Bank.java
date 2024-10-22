package wk7;

import java.util.Scanner;

/**
 * Program for a bank to keep track of its customers' bank accounts.
 * <p></p>
 * Program begins by asking for info for three customers (it's a small bank).
 * Once set up, the following options are available:
 * 1. Check balance
 * 2. Deposit
 * 3. Withdraw
 * 4. Close bank account, get new customer set up
 * 5. Quit
 */
public class Bank {
    private static Scanner in;
    private BankAccount[] customers;
    /* Input
    Chris Taylor
    54
    88wsjs
    J J
    23
    9876
    Ed
    3
    kakkssi
     */

    public Bank() {
        customers = new BankAccount[3];
        for (int i = 0; i < customers.length; i++) {
            customers[i] = getBankAccount("first");
        }
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        Bank aBank = new Bank();
        Bank zBank = new Bank();
        boolean quit = false;
        do {
            displayMenu();
            String userChoice = in.nextLine();
            switch (userChoice) {
                case "1" -> aBank.checkBalance();
                case "2" -> aBank.deposit();
                case "3" -> aBank.withdraw();
                case "4" -> aBank.closeAccount();
                case "5" -> quit = true;
            }
        } while (!quit);
    }

    private void closeAccount() {
        BankAccount customer = getCustomer();
        if (customer == customers[0]) {
            System.out.println("You have been removed, ready for a new customer");
            customers[0] = getBankAccount("new");
        } else if (customers[1] == customer) {
            System.out.println("You have been removed, ready for a new customer");
            customers[1] = getBankAccount("new");
        } else if (customers[2] == customer) {
            System.out.println("You have been removed, ready for a new customer");
            customers[2] = getBankAccount("new");
        } else {
            System.out.println("It does not appear that you bank with us.");
        }

    }

    private void withdraw() {
        BankAccount customer = getCustomer();
        if (customer != null) {
            System.out.println("How much would you like to withdraw?");
            double amount = Double.parseDouble(in.nextLine());
            System.out.println("Please enter your pin");
            String pin = in.nextLine();
            int status = customer.withdraw(pin, amount);
            if (status == 1) {
                System.out.println("Successfully withdrew $" + amount);
            } else {
                System.out.println("Unable to withdraw $" + amount);
            }
        }
    }

    private void deposit() {
        BankAccount customer = getCustomer();
        if (customer != null) {
            System.out.println("How much would you like to deposit?");
            double amount = Double.parseDouble(in.nextLine());
            int status = customer.deposit(amount);
            if (status == 1) {
                System.out.println("Successful deposit");
            } else {
                System.out.println("Unable to deposit $" + amount);
            }
        }
    }

    private BankAccount getCustomer() {
        System.out.println("What is your name?");
        String name = in.nextLine();
        BankAccount customer = null;
        if (customers[0].getName().equals(name)) {
            customer = customers[0];
        } else if (customers[1].getName().equals(name)) {
            customer = customers[1];
        } else if (customers[2].getName().equals(name)) {
            customer = customers[2];
        }
        return customer;
    }
    /**
     * Displays the balance to the user
     */
    private void checkBalance() {
        BankAccount customer = getCustomer();
        if (customer != null) {
            System.out.println("Hi " + customer.getName() + ", your balance is: "
                    + customer.getBalance());
        } else {
            System.out.println("You are not a customer here.");
        }
    }

    /**
     * Displays the menu options for the user.
     */
    private static void displayMenu() {
        System.out.println("""
                Please select one of the following options by typing the corresponding number
                 1. Check balance
                 2. Deposit
                 3. Withdraw
                 4. Close bank account, get new customer set up
                 5. Quit""");
    }

    /**
     * Asks user for their info and creates and returns a bank account object with that info
     * <p></p>
     * Here are the details for how this is actually implemented, or gotchas that the user may
     * need to be aware of.
     * @param customerOrder String representing the order (first, second, third)
     * @return The desired bank account
     */
    private static BankAccount getBankAccount(String customerOrder) {
        System.out.println("Hi " + customerOrder
                + " customer, please enter your name, age, and pin on separate lines");
        String name = in.nextLine();
        int age = Integer.parseInt(in.nextLine());
        String pin = in.nextLine();
        return new BankAccount(name, age, pin);
    }
}
