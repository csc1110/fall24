package wk13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int weight = -1;
        do {
            try {
                System.out.println("Please enter your weight in lbs");
                weight = in.nextInt();
                weight = weight / 0;
                System.out.println("Thank you for entering an integer value");
            } catch(InputMismatchException exception) {
                in.nextLine();
                System.out.print("To the nearest integer value... ");
            } catch(IndexOutOfBoundsException exception) {
                System.err.println("Not going to see this");
            } finally {
                System.out.println("always run");
            }
        } while(weight < 0);
        try {
            method();
        } catch (Exception e) { // This is BAD practice.
            e.printStackTrace(); // This is BAD practice.
        }
    }

    public static void method() throws Exception {
        throw new RuntimeException();
    }
}
