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

    public static void main(String[] args) {
        in = new Scanner(System.in);
        customer1 = getBankAccount("first");
        customer2 = getBankAccount("second");
        customer3 = getBankAccount("third");
        boolean quit = false;
        do {
            displayMenu();
            String userChoice = in.next();
            switch (userChoice) {
                case "1":
                    checkBalance();
                    break;
                case "2":
                    deposit();
                    break;
                case "3":
                    withdraw();
                    break;
                case "4":
                    closeAccount();
                    break;
                case "5":
                    quit = true;
                    break;
            }
        } while (!quit);
        

    }

    /**
     * Displays the balance to the user
     */
    private static void checkBalance() {
        System.out.println("What is your name?");
        String name = in.next();

    }

    /**
     * Displays the menu options for the user.
     */
    private static void displayMenu() {
        // left as exercise for the student
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
        return new BankAccount(in.nextLine(), in.nextInt(), in.next());
    }
}
