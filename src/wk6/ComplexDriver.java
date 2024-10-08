package wk6;

import java.util.Scanner;

public class ComplexDriver {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Get first number
        System.out.println("Enter a complex number in the form: 3.0 + 4.3i");
        // Read line of text entered by user
        String line = in.nextLine();
        // Create a scanner object of what the user entered, but don't include
        // the "i" at the end
        Scanner parser = new Scanner(line.substring(0, line.length()-1));
        // Convert the real part to a double
        double realOne = parser.nextDouble();
        // Read in and ignore the plus symbol
        parser.next();
        // Convert the imaginary part to a double
        double imagOne = parser.nextDouble();

        // Get second number
        System.out.println("Enter a complex number in the form: 3.0 + 4.3i");
        line = in.nextLine();
        parser = new Scanner(line.substring(0, line.length()-1));
        double realTwo = parser.nextDouble();
        parser.next();
        double imagTwo = parser.nextDouble();

        // Calculate result of multiplying two numbers
        double realAnswer = realOne * realTwo - imagOne * imagTwo;
        double imagAnswer = realOne * imagTwo + imagOne * realTwo;

        System.out.println("(" + realOne + " + " + imagOne + "i) * ("
                + realTwo + " + " + imagTwo + "i) = ("
                + realAnswer + " + " + imagAnswer + "i)");
    }
}
