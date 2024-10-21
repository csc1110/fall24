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
                case "2" -> System.out.println("Broken");//deposit();
                case "3" -> System.out.println("Broken");//withdraw();
                case "4" -> System.out.println("Broken");//closeAccount();
                case "5" -> quit = true;
            }
        } while (!quit);
        

    }

    private static BankAccount getCustomer(String name) {
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
        System.out.println("What is your name?");
        String name = in.nextLine();
        BankAccount customer = getCustomer(name);
        if (customer != null) {
            System.out.println("Hi " + name + ", your balance is: " + customer.getBalance());
        } else {
            System.out.println(name + " is not a customer here.");
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
