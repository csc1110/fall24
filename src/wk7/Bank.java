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
    private static BankAccount customer1;
    private static BankAccount customer2;
    private static BankAccount customer3;
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

    public static void main(String[] args) {
        in = new Scanner(System.in);
        customer1 = getBankAccount("first");
        customer2 = getBankAccount("second");
        customer3 = getBankAccount("third");
        boolean quit = false;
        do {
            displayMenu();
            String userChoice = in.nextLine();
            switch (userChoice) {
                case "1" -> checkBalance();
                case "2" -> deposit();
                case "3" -> withdraw();
                case "4" -> closeAccount();
                case "5" -> quit = true;
            }
        } while (!quit);
    }

    private static void closeAccount() {
        BankAccount customer = getCustomer();
        if (customer == customer1) {
            System.out.println("You have been removed, ready for a new customer");
            customer1 = getBankAccount("new");
        } else if (customer2 == customer) {
            System.out.println("You have been removed, ready for a new customer");
            customer2 = getBankAccount("new");
        } else if (customer3 == customer) {
            System.out.println("You have been removed, ready for a new customer");
            customer3 = getBankAccount("new");
        } else {
            System.out.println("It does not appear that you bank with us.");
        }

    }

    private static void withdraw() {
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

    private static void deposit() {
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

    private static BankAccount getCustomer() {
        System.out.println("What is your name?");
        String name = in.nextLine();
        BankAccount customer = null;
        if (customer1.getName().equals(name)) {
            customer = customer1;
        } else if (customer2.getName().equals(name)) {
            customer = customer2;
        } else if (customer3.getName().equals(name)) {
            customer = customer3;
        }
        return customer;
    }
    /**
     * Displays the balance to the user
     */
    private static void checkBalance() {
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
