package wk6;

import java.util.Scanner;

public class ClassDriver {
    public static void main(String[] args) {
        new Complex(3.13);
    }

    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get first number
        System.out.println("Enter a complex number in the form: 3.0 + 4.3i");
        Complex c1 = new Complex(in.nextLine());

        // Get second number
        System.out.println("Enter a complex number in the form: 3.0 + 4.3i");
        Complex c2 = new Complex(in.nextLine());

        // Calculate result of multiplying two numbers
        Complex answer = c1.times(c2);

        System.out.println(c1 + " * " + c2 + " = " + answer);
    }
}
